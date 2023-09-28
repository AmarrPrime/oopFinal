package org.example.View;

import org.example.Data.ComplexNumber;

public interface View {
    ComplexNumber getComplexNumber();

    String getMathAction();

    void showResult(ComplexNumber finalResult);
}
