package main.java.designpattern.abstractfactory;

public class TelephoneStore {

    public static void main(String[] args) {

        S8Factory  s8Factory= new S8Factory();
        Telephone s8= s8Factory.getTelephone("S8","2600mAh",2,3);
        Note8Factory  note8Factory= new Note8Factory();
        Telephone note8= note8Factory.getTelephone("Note8","2600mAh",2,3);

        System.out.println(note8+" note8");
        System.out.println(s8+ " s8");
    }

}
