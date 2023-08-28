package main.java.designpatterns2.behavioural.strategy;

public class App {
    public static void main(String[] args) {
        Student studentSTEM= new Student(EnumDepartment.STEM);
        studentSTEM.getpriority();
    }
}
