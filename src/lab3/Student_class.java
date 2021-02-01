package lab3;

class Student_class { 			////////////간호학//////////////

    private String name;
    private int student_num;
    private int grade;

    Student_class(String Name, int ID, int Grade) {

        name = Name;
        student_num = ID;
        grade = Grade;

    }

    int getStudnet_num(){
        return student_num;
    }
    String getName(){
        return name;
    }

    int getGrade() {
        return grade;
    }

}

class Student_class_2 { ///////컴퓨터 소프트웨어학//////////

    private String name;
    private int student_num;
    private int grade;

    public Student_class_2(String Name, int ID, int Grade) {

        name = Name;
        student_num = ID;
        grade = Grade;
    }

    public int getStudnet_num(){
        return student_num;
    }

    public String getName(){
        return name;
    }

    public int getGrade() {
        return grade;
    }
}
