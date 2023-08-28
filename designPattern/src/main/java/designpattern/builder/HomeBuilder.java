package main.java.designpattern.builder;

import java.util.StringTokenizer;

public class HomeBuilder {

    private String city;
    private String town;
    private String neighbourhood;
    private int buildingYear;
    private int numberOfBalconies;
    private int numberOfRooms;
    private int numberOfToilets;
    private int numberOfBathrooms;
    private Boolean isDuplex;
    private Boolean hasCarPark;
    private Boolean hasAirConditioner;
    private Boolean isFurnished;
    private Boolean hasPark;
    private Boolean hasPool;


    public static HomeBuilder startBuild(String  city, String town, String neighbourhood, int buildingYear, int numberOfRooms){

        HomeBuilder homeBuilder = new HomeBuilder();
        homeBuilder.city = city;
        homeBuilder.town = town;
        homeBuilder.neighbourhood = neighbourhood;
        homeBuilder.buildingYear = buildingYear;
        homeBuilder.numberOfRooms = numberOfRooms;
        
        return homeBuilder;
    }

    public static HomeBuilder startHomeWPoolBuild(String  city, String town, String neighbourhood, int buildingYear, int numberOfRooms){

        HomeBuilder homeBuilder = new HomeBuilder();
        homeBuilder.city = city;
        homeBuilder.town = town;
        homeBuilder.neighbourhood = neighbourhood;
        homeBuilder.buildingYear = buildingYear;
        homeBuilder.numberOfRooms = numberOfRooms;
        homeBuilder.hasPool= true;

        return homeBuilder;
    }

    public Home build(){

        Home home = new Home();
        home.setCity(city);
        home.setTown(town);
        home.setNeighbourhood(neighbourhood);
        home.setBuildingYear(buildingYear);
        home.setNumberOfRooms(numberOfRooms);
        home.setNumberOfBalconies(numberOfBalconies);
        home.setNumberOfToilets(numberOfToilets);
        home.setNumberOfBathrooms(numberOfBathrooms);
        home.setDuplex(isDuplex);
        home.setHasAirConditioner(hasAirConditioner);
        home.setFurnished(isFurnished);
        home.setHasPark(hasPark);
        home.setHasCarPark(hasCarPark);
        home.setHasPool(hasPool);
        return home;
    }



    public HomeBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public HomeBuilder setTown(String town) {
        this.town = town;
        return this;
    }

    public HomeBuilder setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
        return this;
    }

    public HomeBuilder setBuildingYear(int buildingYear) {
        this.buildingYear = buildingYear;
        return this;
    }

    public HomeBuilder setNumberOfBalconies(int numberOfBalconies) {
        this.numberOfBalconies = numberOfBalconies;
        return this;
    }

    public HomeBuilder setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
        return this;
    }

    public HomeBuilder setNumberOfToilets(int numberOfToilets) {
        this.numberOfToilets = numberOfToilets;
        return this;
    }

    public HomeBuilder setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
        return this;
    }

    public HomeBuilder setDuplex(Boolean duplex) {
        isDuplex = duplex;
        return this;
    }

    public HomeBuilder setHasCarPark(Boolean hasCarPark) {
        this.hasCarPark = hasCarPark;
        return this;
    }

    public HomeBuilder setHasAirConditioner(Boolean hasAirConditioner) {
        this.hasAirConditioner = hasAirConditioner;
        return this;
    }

    public HomeBuilder setFurnished(Boolean furnished) {
        isFurnished = furnished;
        return this;
    }

    public HomeBuilder setHasPark(Boolean hasPark) {
        this.hasPark = hasPark;
        return this;
    }

    public HomeBuilder setHasPool(Boolean hasPool) {
        this.hasPool = hasPool;
        return this;
    }
}
