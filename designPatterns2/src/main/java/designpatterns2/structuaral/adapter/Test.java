package main.java.designpatterns2.structuaral.adapter;

public class Test {
    public static void main(String[] args) {
        Socket socket= new Socket();
        Iron iron =new Iron();
        Refrigerator refrigerator= new Refrigerator();

        socket.electrify(iron);
        socket.electrify(refrigerator);

        SamsungPhone samsungPhone= new SamsungPhone();

        PhoneElectricalHomeHomeDeviceAdapter adapter =
                new PhoneElectricalHomeHomeDeviceAdapter(samsungPhone);

        socket.electrify(adapter);

    }
}
