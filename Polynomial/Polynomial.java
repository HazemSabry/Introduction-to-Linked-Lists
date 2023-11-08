package Polynomial;

import java.util.Scanner;

public class Polynomial {
    public static void main(String[] args) throws RuntimeException {
        PolynomialSolver polynomialSolver = new PolynomialSolver();

        char poly1;
        char poly2;
        int[] terms1D;
        int[][] terms2D;
        Scanner scanner = new Scanner(System.in);
        String operation;

        do {
            operation = scanner.nextLine();
            if (!operation.equals("set") && !operation.equals("print") && !operation.equals("add") && !operation.equals("eval") && !operation.equals("clear") && !operation.equals("sub") && !operation.equals("mult")) {
                scanner.close();
                throw new RuntimeException("Invalid operation");
            }

            switch (operation) {
                case "set":
                    try {
                        poly1 = scanner.nextLine().charAt(0);
                        String termsAString = scanner.nextLine();
                        if (termsAString.contains("[[")){
                            termsAString = termsAString.replaceAll("\\[\\[|\\]\\]", "");
                            String[] termsAStrings = termsAString.split("],");

                            terms2D = new int[termsAStrings.length][2];
                            for (int i = 0; i < termsAStrings.length; i++) {
                                termsAStrings[i] = termsAStrings[i].replace("[", "");
                                String[] term = termsAStrings[i].split(",");
                                if (term.length != 2) throw new RuntimeException("Invalid number of terms");
                                terms2D[i][0] = Integer.parseInt(term[0]);
                                terms2D[i][1] = Integer.parseInt(term[1]);
                            }

                            for (int i = 0; i < terms2D.length-1; i++) {
                                for (int j = 0; j < termsAStrings.length-1-i; j++) {
                                    if(terms2D[j][1] < terms2D[j+1][1]){
                                        int[] temp = terms2D[j];
                                        terms2D[j] = terms2D[j+1];
                                        terms2D[j+1] = temp;
                                    }
                                }
                            }

                            polynomialSolver.setPolynomial(poly1, terms2D);

                        }else{
                            termsAString = termsAString.replaceAll("\\[|\\]", "");
                            String[] termsAsStrings = termsAString.split(",");
                            terms1D = new int[termsAsStrings.length];
                            for (int i = 0; i < terms1D.length; i++) terms1D[i] = Integer.parseInt(termsAsStrings[i]);
                            polynomialSolver.setPolynomial(poly1, terms1D);
                        }
                    } catch(Exception e){
                        scanner.close();
                        throw new RuntimeException("Invalid input for term");
                    }
                    break;

                case "print":
                    poly1 = scanner.nextLine().charAt(0);
                    System.out.println(polynomialSolver.print(poly1));
                    break;

                default:
                    break;

            }
        } while (scanner.hasNext() && !operation.equals("add") && !operation.equals("eval") && !operation.equals("clear") && !operation.equals("sub") && !operation.equals("mult"));

        switch (operation) {
                case "add":
                    poly1 = scanner.nextLine().charAt(0);
                    poly2 = scanner.nextLine().charAt(0);
                    polynomialSolver.add(poly1, poly2);
                    System.out.println(polynomialSolver.print('R'));
                    break;

                case "eval":
                    poly1 = scanner.nextLine().charAt(0);
                    float value = scanner.nextFloat();
                    float result = polynomialSolver.evaluatePolynomial( poly1, value);
                    System.out.println((int)result);
                    break;

                case "clear":
                    poly1 = scanner.nextLine().charAt(0);
                    polynomialSolver.clearPolynomial(poly1);
                    System.out.println("[]");
                    break;

                case "sub":
                    poly1 = scanner.nextLine().charAt(0);
                    poly2 = scanner.nextLine().charAt(0);
                    polynomialSolver.subtract(poly1, poly2);
                    System.out.println(polynomialSolver.print('R'));
                    break;

                case "mult":
                    poly1 = scanner.nextLine().charAt(0);
                    poly2 = scanner.nextLine().charAt(0);
                    polynomialSolver.multiply(poly1, poly2);
                    System.out.println(polynomialSolver.print('R'));
                    break;

                default:
                    break;
            }

            scanner.close();
    }
}
