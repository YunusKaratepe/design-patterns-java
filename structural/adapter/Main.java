package structural.adapter;

public class Main {
    public static void main(String[] args) {
        testObjectAdapter();
        testClassAdapter();
    }

    private static void testObjectAdapter() {
        SocketAdapter socketAdapter = new SocketObjectAdapter();
        Volt v3 = socketAdapter.get3Volt();
        Volt v12 = socketAdapter.get12Volt();
        Volt v120 = socketAdapter.get120Volt();

        System.out.println(v3);
        System.out.println(v12);
        System.out.println(v120);
    }

    private static void testClassAdapter() {
        SocketAdapter socketAdapter = new SocketClassAdapter();
        Volt v3 = socketAdapter.get3Volt();
        Volt v12 = socketAdapter.get12Volt();
        Volt v120 = socketAdapter.get120Volt();

        System.out.println(v3);
        System.out.println(v12);
        System.out.println(v120);
    }

}
