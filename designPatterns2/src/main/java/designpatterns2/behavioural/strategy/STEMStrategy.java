package main.java.designpatterns2.behavioural.strategy;

public class STEMStrategy implements  ExamStrategy{
    @Override
    public EnumLesson getFirst() {
        return EnumLesson.MATH;
    }

    @Override
    public EnumLesson getSecond() {
        return EnumLesson.SCIENCE;
    }

    @Override
    public EnumLesson getThird() {
        return EnumLesson.TURKISH;
    }

    @Override
    public EnumLesson getFourth() {
        return EnumLesson.SOCIAL;
    }
}
