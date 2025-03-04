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

    /**
     * 잘못된 연산자 예외 처리
     */
    public static OperatorType verifyOperator(char operator) {
        for (OperatorType op : values()) {
            if (op.operator == operator) {
                return op;
            }
        }
        throw new IllegalArgumentException();
    }
}
