package org.example.App;

import org.example.Controller.Controller;
import org.example.Controller.ControllerImp;
import org.example.Service.MathService;
import org.example.Service.MathServiceImp;
import org.example.View.View;
import org.example.View.ViewConsole;

public class Main {
    public static void main(String[] args) {
        View view = new ViewConsole();
        MathService mathService = new MathServiceImp();
        Controller controller = new ControllerImp(mathService, view);
        controller.calculate();
    }
}