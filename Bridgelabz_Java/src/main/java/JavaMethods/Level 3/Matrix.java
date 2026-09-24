/*

Write a program to perform matrix manipulation operations like addition, subtraction, multiplication, and transpose. Also finding the determinant and inverse of a matrix. The program should take random matrices as input and display the result of the operations.
Hint => 
Write a Method to create a random matrix taking rows and columns as parameters
Write a Method to add two matrices
Write a Method to subtract two matrices
Write a Method to multiply two matrices

Write a Method to find the transpose of a matrix
           
Write a Method to find the determinant of a 2x2 matrix
Write a Method to find the determinant of a 3x3 matrix
 
Write a Method to find the inverse of a 2x2 matrix
Write a Method to find the inverse of a 3x3 matrix
Write a Method to display a matrix

Name: <Utakarsh Jain>
* Date : 24-09-2026
*/

class Matrix {

    public static double[][] createRandomMatrix(int rows, int columns) {
        double matrix[][] = new double[rows][columns]; //Taking random matrices as input

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 10); //Taking random numbers between 0 and 9
            }
        }
        return matrix;
    }
    public static double[][] addMatrices(double matrix1[][], double matrix2[][]) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        double result[][] = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j]; //Calculating the sum of the elements
            }
        }
        return result;
    }
    public static double[][] subtractMatrices(double matrix1[][], double matrix2[][]) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        double result[][] = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j]; //Calculating the difference of the elements
            }
        }
        return result;
    }

    public static double[][] multiplyMatrices(double matrix1[][], double matrix2[][]) {
        int rows = matrix1.length;
        int columns = matrix2[0].length;
        int common = matrix2.length;
        double result[][] = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                } //Calculating the product of the elements
            }
        }
        return result;
    }
    public static double[][] transposeMatrix(double matrix[][]) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        double transpose[][] = new double[columns][rows]; //Finding the transpose of the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j]; //Calculating the transpose of the elements
            }
        }

        return transpose;
    }

    public static double findDeterminant2x2(double[][] matrix) {
        return matrix[0][0] * matrix[1][1]
                - matrix[0][1] * matrix[1][0]; //Calculating the determinant of a 2x2 matrix
    }

    public static double findDeterminant3x3(double[][] matrix) {
        return matrix[0][0] *
                (matrix[1][1] * matrix[2][2]
                        - matrix[1][2] * matrix[2][1])
                - matrix[0][1] *
                (matrix[1][0] * matrix[2][2]
                        - matrix[1][2] * matrix[2][0])
                + matrix[0][2] *
                (matrix[1][0] * matrix[2][1]
                        - matrix[1][1] * matrix[2][0]); //Calculating the determinant of a 3x3 matrix
    }

    public static double[][] findInverse2x2(double[][] matrix) {
        double determinant = findDeterminant2x2(matrix); //Finding the inverse of a 2x2 matrix

        if (determinant == 0) {
            return new double[][]{};
        }

        double inverse[][] = new double[2][2]; //Creating a new matrix to store the inverse

        inverse[0][0] = matrix[1][1] / determinant; //Calculating the inverse of the elements
        inverse[0][1] = -matrix[0][1] / determinant;
        inverse[1][0] = -matrix[1][0] / determinant;
        inverse[1][1] = matrix[0][0] / determinant;

        return inverse;
    }

    public static double[][] findInverse3x3(double[][] matrix) {
        double determinant = findDeterminant3x3(matrix);

        if (determinant == 0) {
            return new double[][]{};
        }

        double inverse[][] = new double[3][3]; //Creating a new matrix to store the inverse

        inverse[0][0] =
                (matrix[1][1] * matrix[2][2]
                        - matrix[1][2] * matrix[2][1]) / determinant; //Calculating the inverse of the elements

        inverse[0][1] =
                (matrix[0][2] * matrix[2][1]
                        - matrix[0][1] * matrix[2][2]) / determinant;

        inverse[0][2] =
                (matrix[0][1] * matrix[1][2]
                        - matrix[0][2] * matrix[1][1]) / determinant;

        inverse[1][0] =
                (matrix[1][2] * matrix[2][0]
                        - matrix[1][0] * matrix[2][2]) / determinant;

        inverse[1][1] =
                (matrix[0][0] * matrix[2][2]
                        - matrix[0][2] * matrix[2][0]) / determinant;

        inverse[1][2] =
                (matrix[0][2] * matrix[1][0]
                        - matrix[0][0] * matrix[1][2]) / determinant;

        inverse[2][0] =
                (matrix[1][0] * matrix[2][1]
                        - matrix[1][1] * matrix[2][0]) / determinant;

        inverse[2][1] =
                (matrix[0][1] * matrix[2][0]
                        - matrix[0][0] * matrix[2][1]) / determinant;

        inverse[2][2] =
                (matrix[0][0] * matrix[1][1]
                        - matrix[0][1] * matrix[1][0]) / determinant;

        return inverse;
    }

    public static void displayMatrix(double[][] matrix) {
        if (matrix.length == 0) {
            System.out.println("Inverse does not exist.");
            return;
        }

        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%8.2f", value);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        double[][] matrix1 = createRandomMatrix(3, 3);
        double[][] matrix2 = createRandomMatrix(3, 3);

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);

        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);

        System.out.println("\nAddition:");
        displayMatrix(addMatrices(matrix1, matrix2));

        System.out.println("\nSubtraction:");
        displayMatrix(subtractMatrices(matrix1, matrix2));

        System.out.println("\nMultiplication:");
        displayMatrix(multiplyMatrices(matrix1, matrix2));

        System.out.println("\nTranspose of Matrix 1:");
        displayMatrix(transposeMatrix(matrix1));

        double determinant3x3 = findDeterminant3x3(matrix1);

        System.out.println("\nDeterminant of Matrix 1: "
                + determinant3x3);

        System.out.println("\nInverse of Matrix 1:");
        displayMatrix(findInverse3x3(matrix1));

        double[][] matrix2x2 = createRandomMatrix(2, 2);

        System.out.println("\n2 x 2 Matrix:");
        displayMatrix(matrix2x2);

        System.out.println("\nDeterminant of 2 x 2 Matrix: "
                + findDeterminant2x2(matrix2x2));

        System.out.println("\nInverse of 2 x 2 Matrix:");
        displayMatrix(findInverse2x2(matrix2x2));
    }
}