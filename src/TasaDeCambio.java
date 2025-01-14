import java.util.Map;

public class TasaDeCambio {
    private String base;
    private String target;
    private double rate;

    public TasaDeCambio() {
    }

    public TasaDeCambio(String base, String target, double rate) {
        this.base = base;
        this.target = target;
        this.rate = rate;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Tasa de cambio de " + base + " a " + target + ": " + rate;
    }
}
