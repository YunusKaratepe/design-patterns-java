package structural.adapter;

public class Volt {
    private int volts;

    public Volt(int v) {
        this.volts=v;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }

    public String toString() {
        return "This is using " + this.volts + "V.";
    }
}
