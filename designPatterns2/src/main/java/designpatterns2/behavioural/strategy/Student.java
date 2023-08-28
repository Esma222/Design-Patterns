package main.java.designpatterns2.behavioural.strategy;

public class Student {

    private EnumDepartment department;
    private ExamStrategy examStrategy;

    public Student(EnumDepartment department) {
        this.department = department;
        if(department==null){
            throw  new NullPointerException("department cannot null");
        }

        switch (department) {
            case STEM:
                examStrategy = new STEMStrategy();
                break;
            case SocialScience:
                examStrategy = new SocialScienceLessonStrategy();
                break;
            case Humanity:
                examStrategy = new HumanityLessonStrategy();
                break;

            default:
                break;

        }


    }

    public  void getpriority(){
        System.out.println("Strategy for "+department+" : ");
        System.out.println(" first "+ examStrategy.getFirst()+
                " , second "+ examStrategy.getSecond()+
                " , third "+ examStrategy.getThird()+" , fourth ,"+ examStrategy.getFourth());
    }
}
