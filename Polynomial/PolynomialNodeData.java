package Polynomial;

public class PolynomialNodeData {
    private int coefficient;
    private int exponent;

    public PolynomialNodeData(int coefficient, int exponent) {
        this.coefficient = coefficient;
        this.exponent = exponent;
    }

    public int getCoefficient() {
        return coefficient;
    }
    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }
    public int getExponent() {
        return exponent;
    }
    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

}
