package main.java.designpattern.builder;

public class Home {

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

    public Home() {
    }

    public Home(String city, String town, String neighbourhood, int buildingYear, int numberOfBalconies, int numberOfRooms, int numberOfToilets, int numberOfBathrooms, Boolean isDuplex, Boolean hasCarPark, Boolean hasAirConditioner, Boolean isFurnished, Boolean hasPark, Boolean hasPool) {
        this.city = city;
        this.town = town;
        this.neighbourhood = neighbourhood;
        this.buildingYear = buildingYear;
        this.numberOfBalconies = numberOfBalconies;
        this.numberOfRooms = numberOfRooms;
        this.numberOfToilets = numberOfToilets;
        this.numberOfBathrooms = numberOfBathrooms;
        this.isDuplex = isDuplex;
        this.hasCarPark = hasCarPark;
        this.hasAirConditioner = hasAirConditioner;
        this.isFurnished = isFurnished;
        this.hasPark = hasPark;
        this.hasPool = hasPool;
    }

    //obligation
    public Home(String city, String town, String neighbourhood, int buildingYear, int numberOfRooms) {
        this.city = city;
        this.town = town;
        this.neighbourhood = neighbourhood;
        this.buildingYear = buildingYear;
        this.numberOfRooms = numberOfRooms;
    }

    public Home(String city, String town, String neighbourhood, int buildingYear, int numberOfRooms, int numberOfBathrooms) {
        this.city = city;
        this.town = town;
        this.neighbourhood = neighbourhood;
        this.buildingYear = buildingYear;
        this.numberOfRooms = numberOfRooms;
        this.numberOfBathrooms = numberOfBathrooms;
    }



    @Override
    public String toString() {
        return "Home{" +
                "city='" + city + '\'' +
                ", town='" + town + '\'' +
                ", neighbourhood='" + neighbourhood + '\'' +
                ", buildingYear=" + buildingYear +
                ", numberOfBalconies=" + numberOfBalconies +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfToilets=" + numberOfToilets +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", isDuplex=" + isDuplex +
                ", hasCarPark=" + hasCarPark +
                ", hasAirConditioner=" + hasAirConditioner +
                ", isFurnished=" + isFurnished +
                ", hasPark=" + hasPark +
                ", hasPool=" + hasPool +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public int getBuildingYear() {
        return buildingYear;
    }

    public void setBuildingYear(int buildingYear) {
        this.buildingYear = buildingYear;
    }

    public int getNumberOfBalconies() {
        return numberOfBalconies;
    }

    public void setNumberOfBalconies(int numberOfBalconies) {
        this.numberOfBalconies = numberOfBalconies;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfToilets() {
        return numberOfToilets;
    }

    public void setNumberOfToilets(int numberOfToilets) {
        this.numberOfToilets = numberOfToilets;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public Boolean getDuplex() {
        return isDuplex;
    }

    public void setDuplex(Boolean duplex) {
        isDuplex = duplex;
    }

    public Boolean getHasCarPark() {
        return hasCarPark;
    }

    public void setHasCarPark(Boolean hasCarPark) {
        this.hasCarPark = hasCarPark;
    }

    public Boolean getHasAirConditioner() {
        return hasAirConditioner;
    }

    public void setHasAirConditioner(Boolean hasAirConditioner) {
        this.hasAirConditioner = hasAirConditioner;
    }

    public Boolean getFurnished() {
        return isFurnished;
    }

    public void setFurnished(Boolean furnished) {
        isFurnished = furnished;
    }

    public Boolean getHasPark() {
        return hasPark;
    }

    public void setHasPark(Boolean hasPark) {
        this.hasPark = hasPark;
    }

    public Boolean getHasPool() {
        return hasPool;
    }

    public void setHasPool(Boolean hasPool) {
        this.hasPool = hasPool;
    }
}
