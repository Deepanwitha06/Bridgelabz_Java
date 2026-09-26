package javaMethods.level3;
import java.util.Scanner;
/*Create a class to perform matrix operations.
Methods:
- Create a random matrix
- Add two matrices
- Subtract two matrices
- Multiply two matrices
- Find transpose
- Find determinant of 2x2 matrix
- Find determinant of 3x3 matrix
- Find inverse of 2x2 matrix
- Find inverse of 3x3 matrix
- Display matrix
*/

public class MatrixManipulation {
    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix2[0].length;
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to find transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transpose = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to find determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        int determinant = (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
        return determinant;
    }

    // Method to find determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        int determinant = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                        - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                        + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        return determinant;
    }

    // Method to find inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        int determinant = determinant2x2(matrix);
        if (determinant == 0) {
            return null;
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) determinant;
        inverse[0][1] = -matrix[0][1] / (double) determinant;
        inverse[1][0] = -matrix[1][0] / (double) determinant;
        inverse[1][1] = matrix[0][0] / (double) determinant;
        return inverse;
    }

    // Method to find inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) {
        int determinant = determinant3x3(matrix);
        if (determinant == 0) {
            return null;
        }
        double[][] inverse = new double[3][3];
        // Cofactor matrix
        double[][] cofactor = new double[3][3];
        cofactor[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
        cofactor[0][1] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        cofactor[0][2] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];
        cofactor[1][0] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]);
        cofactor[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
        cofactor[1][2] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]);
        cofactor[2][0] = matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1];
        cofactor[2][1] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]);
        cofactor[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

        // Transpose the cofactor matrix and divide by determinant
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = cofactor[j][i] / determinant;
            }
        }
        return inverse;
    }

    // Method to display an integer matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to display a double matrix
    public static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%.2f\t", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //create a scanner object
        Scanner input = new Scanner(System.in);

        // Take rows and columns
        System.out.println("Enter the number of rows and columns:");
        int rows = input.nextInt();
        int columns = input.nextInt();

        // Generate two random matrices
        int[][] matrix1 = createRandomMatrix(rows, columns);
        int[][] matrix2 = createRandomMatrix(rows, columns);
        System.out.println("\nMatrix 1:");
        displayMatrix(matrix1);
        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);

        // Addition
        int[][] addition = addMatrices(matrix1, matrix2);
        System.out.println("\nAddition of matrices:");
        displayMatrix(addition);

        // Subtraction
        int[][] subtraction = subtractMatrices(matrix1, matrix2);
        System.out.println("\nSubtraction of matrices:");
        displayMatrix(subtraction);

        // Multiplication
        int[][] multiplication = multiplyMatrices(matrix1, matrix2);
        System.out.println("\nMultiplication of matrices:");
        displayMatrix(multiplication);

        // Transpose of Matrix 1
        int[][] transpose = transposeMatrix(matrix1);
        System.out.println("\nTranspose of Matrix 1:");
        displayMatrix(transpose);

        // Determinant and inverse
        if (rows == 2 && columns == 2) {
            int determinant = determinant2x2(matrix1);
            System.out.println("\nDeterminant of Matrix 1 = " + determinant);
            double[][] inverse = inverse2x2(matrix1);
            if (inverse == null) {
                System.out.println("Inverse does not exist because determinant is 0.");
            } else {
                System.out.println("\nInverse of Matrix 1:");
                displayMatrix(inverse);
            }
        } else if (rows == 3 && columns == 3) {
            int determinant = determinant3x3(matrix1);
            System.out.println("\nDeterminant of Matrix 1 = " + determinant);
            double[][] inverse = inverse3x3(matrix1);
            if (inverse == null) {
                System.out.println("Inverse does not exist because determinant is 0.");
            } else {
                System.out.println("\nInverse of Matrix 1:");
                displayMatrix(inverse);
            }

        } else {
            System.out.println("\nDeterminant and inverse are available only for 2x2 or 3x3 matrices.");
        }

        input.close();
    }
}