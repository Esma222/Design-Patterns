package main.java.designpattern.builder;

public class EstateAgentVersion2 {

    public static void main(String[] args) {

         Home home = HomeBuilder.startBuild("istanbul", "Kadıköy","yunus emre",2020,18)
                 .setHasPark(true)
                 .setHasCarPark(true)
                 .build();

        Home home2 = HomeBuilder.startHomeWPoolBuild("istanbul", "Başakşehir","tepecik",2020,18)
                .setNumberOfBalconies(3)
                .setHasCarPark(true)
                .build();

        printHome(home);
        printHome(home2);

    }



    private  static void printHome(Home home){
        System.out.println(" ");

        System.out.println("Home added-->"+home);
    }


}
