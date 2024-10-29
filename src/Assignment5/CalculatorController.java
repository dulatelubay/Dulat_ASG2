package Assignment5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        view.addOperationListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = view.getFirstNumber();
                    double num2 = view.getSecondNumber();
                    double result = 0;

                    if (e.getSource() == view.getAddButton()) {
                        result = model.add(num1, num2);
                    } else if (e.getSource() == view.getSubtractButton()) {
                        result = model.subtract(num1, num2);
                    } else if (e.getSource() == view.getMultiplyButton()) {
                        result = model.multiply(num1, num2);
                    } else if (e.getSource() == view.getDivideButton()) {
                        result = model.divide(num1, num2);
                    }
                    view.setResult(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    view.setResult("Ошибка: введите числа");
                } catch (ArithmeticException ex) {
                    view.setResult(ex.getMessage());
                }
            }
        });
    }
}
