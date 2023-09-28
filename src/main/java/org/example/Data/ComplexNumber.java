package org.example.Data;

import javax.imageio.plugins.tiff.TIFFImageReadParam;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public static ComplexNumber create(String value1, String value2) {
        double number1 = Double.parseDouble(value1);
        double number2 = Double.parseDouble(value2);
        return new ComplexNumber(number1, number2);
    }

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public String toString() {
        if (imaginaryPart >= 0)
            return realPart + " + " + imaginaryPart + "*i";
        else return realPart + " " + imaginaryPart + "*i";
    }
}
