package main.java.designpatterns2.behavioural.strategy;

public class HumanityLessonStrategy implements  ExamStrategy{
    @Override
    public EnumLesson getFirst() {
        return EnumLesson.TURKISH;
    }

    @Override
    public EnumLesson getSecond() {
        return EnumLesson.SOCIAL;
    }

    @Override
    public EnumLesson getThird() {
        return EnumLesson.MATH;
    }

    @Override
    public EnumLesson getFourth() {
        return EnumLesson.SCIENCE;
    }
}
