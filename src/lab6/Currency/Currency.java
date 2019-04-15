package lab6.Currency;

public class Currency {

    private int code;
    private float amount;

    public Currency(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }

    public int getCode() {
        return code;
    }

    protected void setCode(int code) {
        this.code = code;
    }
}
