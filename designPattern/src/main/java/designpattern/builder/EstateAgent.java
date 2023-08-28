package main.java.designpattern.builder;

public class EstateAgent {

    public static void main(String[] args) {

        Home home1= new Home();
        home1.setCity("Izmir");
        home1.setTown("Buca");
        home1.setNeighbourhood("Adatepe");
        home1.setBuildingYear(2010);
        home1.setNumberOfRooms(10);
        home1.setNumberOfBalconies(3);
        home1.setNumberOfToilets(3);
        home1.setNumberOfBathrooms(3);
        home1.setDuplex(true);
        home1.setHasAirConditioner(true);
        home1.setFurnished(true);
        home1.setHasPark(true);
        home1.setHasCarPark(true);
        home1.setHasPool(true);


        Home home2 = new Home("Erzincan","Merkez","Yunus Emre",2017,2,5,1,1,false,true,true,true,true,false);

        printHome(home1);
        printHome(home2);

    }

    private  static void printHome(Home home){
        System.out.println(" ");

        System.out.println("Home added-->"+home);
    }

}
