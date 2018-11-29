public final class Calculator {

    private int a;
    private int b;

    public Calculator() {
    }

    public Calculator(int a, int b) {
        if(b == 0)
           throw new IllegalArgumentException("Деление на ноль невозможно!");
        this.a = a;
        this.b = b;
    }
    // если здесь появляется ошибка - удалите эту аннотацию везде
    public int divide(int a, int b) {
        if(b == 0)
            throw new IllegalArgumentException("На ноль делить нельзя!");
        return a / b;
    }

    public int divide() {
        return this.a / this.b;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum() {
        return this.a + this.b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int subtract() {
        return this.a - this.b;
    }

    public int multiple(int a, int b) {
        return a * b;
    }

    public int multiple() {
        return this.a * this.b;
    }

    // getters and setters

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
