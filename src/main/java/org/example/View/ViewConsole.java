package org.example.View;

import org.example.Data.ComplexNumber;

import java.util.Scanner;

public class ViewConsole implements View {
    @Override
    public ComplexNumber getComplexNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter real part of a number.");
        String value1 = scanner.next();
        System.out.println("Enter imaginary part of a number.");
        String value2 = scanner.next();
        return ComplexNumber.create(value1, value2);
    }

    @Override
    public String getMathAction() {
        System.out.println("Enter math action (+,*,/). ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    @Override
    public void showResult(ComplexNumber finalResult) {
        System.out.println("Result is: " + finalResult.toString());
    }
}
