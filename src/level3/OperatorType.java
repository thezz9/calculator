package level3;

public enum OperatorType {
    SUM('+'), SUB('-'), MUL('*'), DIV('/');

    private final char operator;

    OperatorType(char operator) {
        this.operator = operator;
    }

    public char getOperator() {
        return operator;
    }

    public static OperatorType verificationOperator(char operator) {
        for (OperatorType op : values()) {
            if (op.operator == operator) {
                return op;
            }
        }
        throw new IllegalArgumentException();
    }
}
