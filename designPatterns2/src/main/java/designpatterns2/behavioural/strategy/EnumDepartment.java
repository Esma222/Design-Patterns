package main.java.designpatterns2.behavioural.strategy;

public enum EnumDepartment {

    STEM("STEM"),SocialScience("SocialScience"),Humanity("Humanity");

    private String department;

    EnumDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "EnumDepartment{" +
                "department='" + department + '\'' +
                '}';
    }
}
