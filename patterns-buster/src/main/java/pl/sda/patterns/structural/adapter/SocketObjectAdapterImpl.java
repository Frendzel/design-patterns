package pl.sda.patterns.structural.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {
    private Socket sock = new Socket();

    @Override
    public Volt get120Volt() {
        return sock.getVolt();
    }

    @Override
    public Volt get12Volt() {
//        Volt copy = sock.getVolt().copy();
//        copy.setVolts(12);
//        return copy;
        return new Volt(sock.getVolt().getVolts() / 10);

    }

    @Override
    public Volt get3Volt() {
        return new Volt(sock.getVolt().getVolts() / 40);
    }

}
