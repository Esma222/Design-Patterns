package main.java.designpatterns2.behavioural.strategy;

public class SocialScienceLessonStrategy implements ExamStrategy{
    @Override
    public EnumLesson getFirst() {
        return EnumLesson.TURKISH;
    }

    @Override
    public EnumLesson getSecond() {
        return EnumLesson.MATH;
    }

    @Override
    public EnumLesson getThird() {
        return EnumLesson.SOCIAL;
    }

    @Override
    public EnumLesson getFourth() {
        return EnumLesson.SCIENCE;
    }
}
