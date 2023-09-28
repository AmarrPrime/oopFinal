package org.example.Service;

import org.example.Data.ComplexNumber;

public class MathServiceImp implements MathService {
    @Override
    public ComplexNumber add(ComplexNumber number1, ComplexNumber number2) {
        double resultReal = number1.getRealPart() + number2.getRealPart();
        double resultImaginary = number1.getImaginaryPart() + number2.getImaginaryPart();
        return new ComplexNumber(resultReal, resultImaginary);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber number1, ComplexNumber number2) {
        double resultReal = number1.getRealPart() * number2.getRealPart() - number1.getImaginaryPart() * number2.getImaginaryPart();
        double resultImaginary = number1.getImaginaryPart() * number2.getRealPart() + number1.getRealPart() * number2.getImaginaryPart();
        return new ComplexNumber(resultReal, resultImaginary);
    }

    @Override
    public ComplexNumber divide(ComplexNumber number1, ComplexNumber number2) {
        double divider = number2.getRealPart() * number2.getRealPart() + number2.getImaginaryPart() * number2.getImaginaryPart();
        double resultReal = number1.getRealPart() * number2.getRealPart() + number1.getImaginaryPart() * number2.getImaginaryPart();
        double resultImaginary = number1.getImaginaryPart() * number2.getRealPart() - number1.getRealPart() * number2.getImaginaryPart();
        return new ComplexNumber(resultReal / divider, resultImaginary / divider);
    }
}
