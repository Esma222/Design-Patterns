package main.java.designpattern.factory;

public class TelephoneStore {

    public static void main(String[] args) {

        Telephone s8 = TelephoneFactory.getTelephone("S8","2600mAh",7,14);

        Telephone note8 = TelephoneFactory.getTelephone("Note8","3000mAh",10,14);

        System.out.println("phone properties for S8");
        System.out.println(s8);
        System.out.println("phone properties for Note8");
        System.out.println(note8);
    }

}
