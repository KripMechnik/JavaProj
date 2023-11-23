package Pr20;

public class Matrix<T> {
    private final T[][] elements;
    private final int rowCount;
    private final int columnCount;

    public Matrix(int rowCount, int columnCount) {
        if (rowCount <= 0 || columnCount <= 0) {
            throw new IllegalArgumentException("Invalid matrix dimensions.");
        }
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.elements = (T[][]) new Object[rowCount][columnCount];
    }

    public void setElement(int row, int column, T value) {
        if (!isValidIndex(row, column)) {
            throw new IndexOutOfBoundsException("Invalid matrix indices.");
        }
        elements[row][column] = value;
    }

    public T getElement(int row, int column) {
        if (!isValidIndex(row, column)) {
            throw new IndexOutOfBoundsException("Invalid matrix indices.");
        }
        return elements[row][column];
    }

    public int getRowCount() {
        return rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public Matrix<T> add(Matrix<T> anotherMatrix) {
        if (rowCount != anotherMatrix.getRowCount() || columnCount != anotherMatrix.getColumnCount()) {
            throw new IllegalArgumentException("Matrix dimensions do not match.");
        }

        Matrix<T> result = new Matrix<>(rowCount, columnCount);
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                T value = addElements(elements[i][j], anotherMatrix.getElement(i, j));
                result.setElement(i, j, value);
            }
        }

        return result;
    }



    private T addElements(T element1, T element2) {
        if (element1 instanceof Integer && element2 instanceof Integer) {
            return (T) Integer.valueOf(((Integer) element1).intValue() + ((Integer) element2).intValue());
        } else if (element1 instanceof Double && element2 instanceof Double) {
            return (T) Double.valueOf(((Double) element1).doubleValue() + ((Double) element2).doubleValue());
        } else {
            throw new UnsupportedOperationException("Addition operation not supported for type T.");
        }

    }

    private boolean isValidIndex(int row, int column) {
        return row >= 0 && row < rowCount && column >= 0 && column < columnCount;
    }
    private static void printMatrix(Matrix<Integer> matrix) {
        int rowCount = matrix.getRowCount();
        int columnCount = matrix.getColumnCount();
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                System.out.print(matrix.getElement(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix<Integer> matrix1 = new Matrix<>(2, 2);
        matrix1.setElement(0, 0, 1);
        matrix1.setElement(0, 1, 2);
        matrix1.setElement(1, 0, 3);
        matrix1.setElement(1, 1, 4);

        Matrix<Integer> matrix2 = new Matrix<>(2, 2);
        matrix2.setElement(0, 0, 5);
        matrix2.setElement(0, 1, 6);
        matrix2.setElement(1, 0, 7);
        matrix2.setElement(1, 1, 8);

        Matrix<Integer> sum = matrix1.add(matrix2);
        System.out.println("Sum:");
        printMatrix(sum);
    }
}
