package org.example.Controller;

import org.example.Data.ComplexNumber;
import org.example.Service.MathService;
import org.example.View.View;

public class ControllerImp implements Controller {
    MathService mathService;
    View view;

    public ControllerImp(MathService mathService, View view) {
        this.mathService = mathService;
        this.view = view;
    }

    @Override
    public void calculate() {
        ComplexNumber number1 = view.getComplexNumber();
        ComplexNumber number2 = view.getComplexNumber();
        String action = view.getMathAction();
        ComplexNumber result = null;
        switch (action) {
            case "+":
                result = mathService.add(number1, number2);
                break;
            case "*":
                result = mathService.multiply(number1, number2);
                break;
            case "/":
                result = mathService.divide(number1, number2);
                break;
        }
        view.showResult(result);
    }
}
