package Polynomial;

import java.util.Scanner;

public class Polynomial {
    public static void main(String[] args) throws RuntimeException {
        PolynomialSolver polynomialSolver = new PolynomialSolver();

        int[] terms1D;
        int[][] terms2D;

        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();

        while (operation.equals("set")) {
            char poly = scanner.nextLine().charAt(0);
            String termsAString = scanner.nextLine();

            try {
                if (termsAString.contains("[[")){
                termsAString = termsAString.replaceAll("\\[\\[|\\]\\]", "");
                String[] termsAStrings = termsAString.split("], [");
                terms2D = new int[termsAStrings.length][2];

                for (int i = 0; i < termsAStrings.length; i++) {
                    String[] term = termsAStrings[0].split(", ");
                    if (term.length != 2) throw new RuntimeException("Invalid number of terms");
                        terms2D[i][0] = Integer.parseInt(term[0]);
                        terms2D[i][1] = Integer.parseInt(term[1]);
                }
                }else{
                    termsAString = termsAString.replaceAll("\\[|\\]", "");
                    String[] termsAsStrings = termsAString.split(", ");
                    terms1D = new int[termsAsStrings.length];
                    for (int i = 0; i < terms1D.length; i++) terms1D[i] = Integer.parseInt(termsAsStrings[i]);
                    polynomialSolver.setPolynomial(poly, terms1D);
                }
            } catch(Exception e){
                throw new RuntimeException("Invalid input for term");
            }finally{
                operation = scanner.nextLine();
            }
        }

        System.out.println("Finished");

        switch (operation) {
            case "print":

                break;

            case "add":

                break;

            case "eval":

                break;

            case "clear":

                break;

            case "sub":

                break;

            case "mult":

                break;

            default:
                scanner.close();
                throw new RuntimeException("Invalid input for operation");
        }

        scanner.close();
    }
}
