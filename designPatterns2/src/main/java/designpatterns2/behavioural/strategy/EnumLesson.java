package main.java.designpatterns2.behavioural.strategy;

public enum EnumLesson  {
    TURKISH("Turkish"),MATH("Mathematics"),SCIENCE("Science"),SOCIAL("Social");

    private String lesson;

    EnumLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "EnumLesson{" +
                "lesson='" + lesson + '\'' +
                '}';
    }
}
