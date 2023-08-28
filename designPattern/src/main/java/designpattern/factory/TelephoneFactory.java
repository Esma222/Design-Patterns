package main.java.designpattern.factory;

public class TelephoneFactory {

    public static Telephone getTelephone(String model, String battery, int width, int height){
        Telephone telephone;
        if("S8".equalsIgnoreCase(model)){
            telephone =new S8(model,battery,width,height);

        } else if ("Note8".equalsIgnoreCase(model)) {
            telephone =new Note8(model,battery,width,height);
        }
        else {
            throw new RuntimeException("An invalid model attempt was made.");
        }
        return telephone;
    }
}
