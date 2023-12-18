package homework_18;

import java.io.Serializable;
import java.util.Arrays;

class Animal {}

class SerializableAnimal extends Animal implements Serializable {}

class MyClass<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T variableT;
    private V variableV;
    private K variableK;

    public MyClass(T t, V v, K k) {
        this.variableT = t;
        this.variableV = v;
        this.variableK = k;
    }

    public T getVariableT() {
        return variableT;
    }

    public V getVariableV() {
        return variableV;
    }

    public K getVariableK() {
        return variableK;
    }

    public void printClassNames() {
        System.out.println("Type of variableT: " + variableT.getClass().getName());
        System.out.println("Type of variableV: " + variableV.getClass().getName());
        System.out.println("Type of variableK: " + variableK.getClass().getName());
    }
}

class MinMax<T extends Comparable<T>> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T findMin() {
        return Arrays.stream(array).min(Comparable::compareTo).orElse(null);
    }

    public T findMax() {
        return Arrays.stream(array).max(Comparable::compareTo).orElse(null);
    }
}

public class Calculator {
    public static <T extends Number, U extends Number> double sum(T a, U b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, U extends Number> double multiply(T a, U b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, U extends Number> double divide(T a, U b) {
        if (b.doubleValue() != 0) {
            return a.doubleValue() / b.doubleValue();
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    public static <T extends Number, U extends Number> double subtract(T a, U b) {
        return a.doubleValue() - b.doubleValue();
    }
}

class Matrix<T> {
    private T[][] matrix;

    public Matrix(T[][] matrix) {
        this.matrix = matrix;
    }

    public void printMatrix() {
        for (T[] row : matrix) {
            for (T element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

class Main {
    public static void main(String[] args) {
        MyClass<String, SerializableAnimal, Integer> myObject = new MyClass<>("Hello", new SerializableAnimal(), 2);
        myObject.printClassNames();

        Integer[] intArray = {4, 2, 7, 1, 9};
        MinMax<Integer> minMax = new MinMax<>(intArray);
        System.out.println("Min value: " + minMax.findMin());
        System.out.println("Max value: " + minMax.findMax());

        System.out.println("Sum: " + Calculator.sum(5, 3.5));
        System.out.println("Product: " + Calculator.multiply(4, 2.5));
        System.out.println("Division: " + Calculator.divide(10, 2));
        System.out.println("Subtraction: " + Calculator.subtract(8.5, 3));

        Double[][] doubleMatrix = {{1.5, 2.0}, {3.0, 4.5}};
        Matrix<Double> doubleMatrixObj = new Matrix<>(doubleMatrix);
        System.out.println("Matrix:");
        doubleMatrixObj.printMatrix();
    }
}
