package org.example.Service;

import org.example.Data.ComplexNumber;

public interface MathService {

    ComplexNumber add(ComplexNumber number1, ComplexNumber number2);

    ComplexNumber multiply(ComplexNumber number1, ComplexNumber number2);

    ComplexNumber divide(ComplexNumber number1, ComplexNumber number2);
}
