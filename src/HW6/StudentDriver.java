package HW6;

class Student {

    long StudentNumber;
    String name;
    int test1;
    int test2;
    int test3;
    double avr;

    Long getStudentNumber()
    {
        StudentNumber = 960800;
        return StudentNumber;
    }

    String getName()
    {
        name = "WJ";
        return name;
    }

    int getTest1()
    {
        test1 = 90;
        return test1;
    }
    int getTest2()
    {
        test2 = 100;
        return test2;
    }
    int getTest3()
    {
        test3 = 80;
        return test3;
    }
    double getAvr()
    {
        avr = (test1+test2+test3)/3;
        return avr;
    }

}

public class StudentDriver {
    public static void main(String []args){
        Student a = new Student();

        System.out.println("이름: "+a.getName());
        System.out.println("학번: "+a.getStudentNumber());
        System.out.println("시험1 성적: "+a.getTest1());
        System.out.println("시험2 성적: "+a.getTest2());
        System.out.println("시험3 성적: "+a.getTest3());
        System.out.println("평균: "+a.getAvr());

    }
}
