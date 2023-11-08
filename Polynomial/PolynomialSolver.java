package Polynomial;

import MyLinkedList.SinglyLinkedList.SLinkedList;

public class PolynomialSolver  implements IPolynomialSolver{
    private SLinkedList<PolynomialNodeData> A;
    private SLinkedList<PolynomialNodeData> B;
    private SLinkedList<PolynomialNodeData> C;
    private SLinkedList<PolynomialNodeData> R;

    public PolynomialSolver(){
        A = new SLinkedList<PolynomialNodeData>();
        B = new SLinkedList<PolynomialNodeData>();
        C = new SLinkedList<PolynomialNodeData>();
        R = new SLinkedList<PolynomialNodeData>();
    }

    @Override
    public void setPolynomial(char poly, int[][] terms) throws RuntimeException {
        SLinkedList<PolynomialNodeData> p;

        switch (poly){
            case 'A':
                p = this.A;
                break;

            case 'B':
                p = this.B;
                break;

            case 'C':
                p = this.C;
                break;

            default:
                throw new RuntimeException("invalid polynomial name");
        }

        for(int[] termRows : terms){
            PolynomialNodeData newNodeData = new PolynomialNodeData(termRows[0], termRows[1]);
            p.add(newNodeData);
        }
    }

    public void setPolynomial(char poly, int[] terms) throws RuntimeException{
        SLinkedList<PolynomialNodeData> p;

        switch (poly) {
            case 'A':
                p = this.A;
                break;

            case 'B':
                p = this.B;
                break;

            case 'C':
                p = this.C;
                break;

            default:
                throw new RuntimeException("invalid polynomial name");
        }

        for(int i = terms.length-1; i >= 0; i--){
            PolynomialNodeData newNodeData = new PolynomialNodeData(terms[terms.length-1-i],i);
            p.add(newNodeData);
        }
    }

    @Override
    public String print(char poly) throws RuntimeException {
        SLinkedList<PolynomialNodeData> p;

        String result = "";
        switch (poly) {
            case 'A':
                p = this.A;
                break;

            case 'B':
                p = this.B;
                break;

            case 'C':
                p = this.C;
                break;

            default:
                throw new RuntimeException("invalid polynomial name");
        }

        for (int i = 0; i < A.size(); i++) {
            PolynomialNodeData data = p.get(0);
            if (i != 0 && i != p.size()-1) result += " + ";
            result += data.getCoefficient();
            if(data.getExponent() != 0) result += "x^" + data.getExponent();
        }

        return result;
    }

    @Override
    public void clearPolynomial(char poly) throws RuntimeException {
        SLinkedList<PolynomialNodeData> p;

        switch (poly) {
            case 'A':
                p = this.A;
                break;

            case 'B':
                p = this.B;
                break;

            case 'C':
                p = this.C;
                break;

            default:
                throw new RuntimeException("invalid polynomial name");
        }

        p.clear();
    }

    @Override
    public float evaluatePolynomial(char poly, float value) throws RuntimeException {
        SLinkedList<PolynomialNodeData> p;

        switch (poly) {
            case 'A':
                p = this.A;
                break;

            case 'B':
                p = this.B;
                break;

            case 'C':
                p = this.C;
                break;

            default:
                throw new RuntimeException("invalid polynomial name");
        }

        int result = 0;
        for (int i = 0; i < p.size(); i++) {
            PolynomialNodeData data = p.get(i);
            result += data.getCoefficient() * Math.pow(value, data.getExponent());
        }

        return result;
    }

    @Override
    public int[][] add(char poly1, char poly2) throws RuntimeException {
        SLinkedList<PolynomialNodeData> p1;
        SLinkedList<PolynomialNodeData> p2;

        switch (poly1) {
            case 'A':
                p1 = this.A;
                break;

            case 'B':
                p1 = this.B;
                break;

            case 'C':
                p1 = this.C;
                break;

            default:
                throw new RuntimeException("invalid polynomial name");
        }

        switch (poly2) {
            case 'A':
                p2 = this.A;
                break;

            case 'B':
                p2 = this.B;
                break;

            case 'C':
                p2 = this.C;
                break;

            default:
                throw new RuntimeException("invalid polynomial name");
        }

        int i = 0, j = 0;
        while (i < p1.size() && j < p2.size()) {
            PolynomialNodeData poly1Data = p1.get(i);
            PolynomialNodeData poly2Data = p2.get(j);

            if (poly1Data.getExponent() > poly2Data.getExponent()) {
                R.add(poly1Data);
                i++;
            } else if (poly1Data.getExponent() < poly2Data.getExponent()) {
                R.add(poly2Data);
                j++;
            } else {
                int newCoefficient = poly1Data.getCoefficient() + poly2Data.getCoefficient();
                int newExponent = poly1Data.getExponent();
                PolynomialNodeData newPolynomialNodeData = new PolynomialNodeData(newCoefficient, newExponent);
                R.add(newPolynomialNodeData);
                i++;
                j++;
            }
        }

        for (; i < p1.size(); i++) R.add(p1.get(i));
        for (; j < p2.size(); j++) R.add(p2.get(j));

        int[][] result = new int[R.size()][2];
        for (int r = 0; r < R.size(); i++){
            result[r][0] = R.get(i).getCoefficient();
            result[r][1] = R.get(j).getExponent();
        }
        return result;
    }

    @Override
    public int[][] subtract(char poly1, char poly2) throws RuntimeException {
        SLinkedList<PolynomialNodeData> p1;
        SLinkedList<PolynomialNodeData> p2;

        switch (poly1) {
            case 'A':
                p1 = this.A;
                break;

            case 'B':
                p1 = this.B;
                break;

            case 'C':
                p1 = this.C;
                break;

            default:
                throw new RuntimeException("invalid polynomial name");
        }

        switch (poly2) {
            case 'A':
                p2 = this.A;
                break;

            case 'B':
                p2 = this.B;
                break;

            case 'C':
                p2 = this.C;
                break;

            default:
                throw new RuntimeException("invalid polynomial name");
        }

        int i = 0, j = 0;
        while (i < p1.size() && j < p2.size()) {
            PolynomialNodeData poly1Data = p1.get(i);
            PolynomialNodeData poly2Data = new PolynomialNodeData(-p2.get(j).getCoefficient(), p2.get(j).getExponent());

            if (poly1Data.getExponent() > poly2Data.getExponent()) {
                R.add(poly1Data);
                i++;
            } else if (poly1Data.getExponent() < poly2Data.getExponent()) {

                R.add(poly2Data);
                j++;
            } else {
                int newCoefficient = poly1Data.getCoefficient() + poly2Data.getCoefficient();
                int newExponent = poly1Data.getExponent();
                PolynomialNodeData newPolynomialNodeData = new PolynomialNodeData(newCoefficient, newExponent);
                R.add(newPolynomialNodeData);
                i++;
                j++;
            }
        }

        for (; i < p1.size(); i++) R.add(p1.get(i));
        for (; j < p2.size(); j++) R.add(p2.get(j));

        int[][] result = new int[R.size()][2];
        for (int r = 0; r < R.size(); r++){
            result[r][0] = R.get(r).getCoefficient();
            result[r][1] = R.get(r).getExponent();
        }
        return result;
    }

    @Override
    public int[][] multiply(char poly1, char poly2) throws RuntimeException {
        SLinkedList<PolynomialNodeData> p1;
        SLinkedList<PolynomialNodeData> p2;

        switch (poly1) {
            case 'A':
                p1 = this.A;
                break;

            case 'B':
                p1 = this.B;
                break;

            case 'C':
                p1 = this.C;
                break;

            default:
                throw new RuntimeException("invalid polynomial name");
        }

        switch (poly2) {
            case 'A':
                p2 = this.A;
                break;

            case 'B':
                p2 = this.B;
                break;

            case 'C':
                p2 = this.C;
                break;

            default:
                throw new RuntimeException("invalid polynomial name");
        }

        for (int i = 0; i < p1.size(); i++) {
            for (int j = 0; j < p2.size(); j++) {
                int resultCoefficient = p1.get(i).getCoefficient() * p2.get(j).getCoefficient();
                int resultExponent = p1.get(i).getExponent() + p2.get(j).getExponent();

                for (int k = 0; k < R.size(); k++) {
                    int RExponent = R.get(k).getExponent();
                    int RCoefficient = R.get(k).getCoefficient();
                    if(resultExponent == RExponent) {
                        R.get(k).setCoefficient(RCoefficient + resultCoefficient);
                        break;
                    }
                    if(k == R.size()-1) {
                        PolynomialNodeData newData = new PolynomialNodeData(resultCoefficient, resultExponent);
                        R.add(newData);
                    }
                }
            }
        }

        int[][] result = new int[R.size()][2];
        for (int r = 0; r < R.size(); r++){
            result[r][0] = R.get(r).getCoefficient();
            result[r][1] = R.get(r).getExponent();
        }
        return result;
    }

}
