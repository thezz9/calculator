package level3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator <T extends Number> {

    private List<Double> results = new ArrayList<>();

    public double calculate(T firstNum, T secondNum, OperatorType operator) {

        double result = 0;
        // 계산 구간
        result = switch (operator) {
            case SUM -> firstNum.doubleValue() + secondNum.doubleValue();
            case SUB -> firstNum.doubleValue() - secondNum.doubleValue();
            case MUL -> firstNum.doubleValue() * secondNum.doubleValue();
            case DIV -> firstNum.doubleValue() / secondNum.doubleValue();
        };

        result = Math.round(result * 1000) / 1000.0;
        results.add(result);
        return result;
    }

    public List<Double> getResults() {
        return results;
    }

    public void setResults(List<Double> results) {
        this.results = results;
    }

    public void removeResult() {
        results.remove(0);
    }

    public List<Double> filteredResult(double value) {
        return getResults().stream()
                .filter(result -> result > value)
                .collect(Collectors.toList());
    }
}
