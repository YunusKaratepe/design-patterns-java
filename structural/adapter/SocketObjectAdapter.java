package structural.adapter;

public class SocketObjectAdapter implements SocketAdapter{

    private Socket sock = new Socket();

    @Override
    public Volt get120Volt() {
        return sock.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = sock.getVolt();
        return convertVolt(v, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = sock.getVolt();
        return convertVolt(v, 40);
    }

    private Volt convertVolt(Volt v, int div) {
        return new Volt(v.getVolts() / div);
    }
    
}
