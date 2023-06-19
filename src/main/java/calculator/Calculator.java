package calculator;

public class Calculator {
    private float num1;
    private float num2;


    // PUBLIC METHODS
    public float add(float num1, float num2) {
        return num1 + num2;
    }

    public float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public float divide(float num1, float num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return num1 / num2;
    }

    public float multiply(float num1, float num2) {
        return num1 * num2;
    }

}
