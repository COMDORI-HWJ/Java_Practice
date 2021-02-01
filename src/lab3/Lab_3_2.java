package lab3;

import java.util.Scanner;

public class Lab_3_2 {

    String Name, Name2; //이름을 입력받는 변수
    int ID, ID2, Grade, Grade2; //학번과, 학년을 입력받는 변수

    public static void main(String[] args) {

        String Menu;		//메뉴선택 변수
        String Major, Major2;		//학과1==간호학, 학과2==컴퓨터소프트웨어학

        Student_class [] SC_Array = new Student_class [4];		//간호학 배열을 이용하여 학생수를 입력 받음
        Student_class_2 [] SC_Array_2 = new Student_class_2 [4];	//컴퓨터소프트웨어학 배열을 이용하여 학생수를 입력 받음

        Scanner scan = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("학번: 2016000000");
        System.out.println("이름: 컴돌이의블로그");
        System.out.println("======================\n");
        System.out.println("학생 정보 입력 시스템");

        while(true){
            System.out.println();
            System.out.println("\t  \t메뉴를 선택하세요.");
            System.out.println("|1. 학과선택 및 학생 정보입력 | |2. 결과| |0. 끝내기|");
            Menu = scan.next();			//메뉴를 입력받음

            if("0".equals(Menu)){			//0번을 입력받았을 경우 시스템이 종료됨.
                System.out.println("시스템이 종료 되었습니다.");
                System.exit(0);
            }

            if("1".equals(Menu)){				//1번을 입력받았을 경우 학과 선택후 바로 학생 정보를 입력
                System.out.println("|1. 간호학 | |2. 컴퓨터소프트웨어학|");
                Major = scan.next();

                if ("1".equals(Major)) {		//간호학과 학생 정보를 입력 받음.
                    ///////////////////간호학///////////////////
                    String name;		//간호학 학생 이름 변수
                    int student_num, grade;	//간호학 학번, 학년 변수

                    for(int i=1; i<4; i++){		//컴퓨터는0 부터 카운트를 시작하므로 1번째 를 입력받으려면 1부터 시작하여 4번까지 해야함.
                        System.out.println(i+"번째 학생의 "+"이름을 입력하세요");
                        System.out.print(">>");
                        name = scan.next();

                        System.out.println(i+"번째 학생의 "+"학번을 입력하세요");
                        System.out.print(">>");
                        student_num = scan.nextInt();

                        System.out.println(i+"번째 학생의 "+"학년을 입력하세요");
                        System.out.print(">>");
                        grade = scan.nextInt();
                        SC_Array[i] = new Student_class(name, student_num, grade); //배열에 차례대로 이름, 학번, 학년을 저장함.

                    }

                    continue; //이어서 계속
                }

                ////////////////컴퓨터 소프트웨어학//////////////
                else if ("2".equals(Major)){				//위의 간호학과 동일 하므로 이하 설명 생략.

                    String name;
                    int student_num, grade;

                    for(int k=1; k<4; k++){
                        System.out.println(k+"번째 학생의 "+"이름을 입력하세요");
                        System.out.print(">>");
                        name = scan.next();

                        System.out.println(k+"번째 학생의 "+"학번을 입력하세요");
                        System.out.print(">>");
                        student_num = scan.nextInt();

                        System.out.println(k+"번째 학생의 "+"학년을 입력하세요");
                        System.out.print(">>");
                        grade = scan.nextInt();
                        SC_Array_2[k] = new Student_class_2(name, student_num, grade);
                    }
                }

                else{
                    System.out.println("잘못입력하셨습니다. 다시 입력하십시오.");
                    continue;
                }
            }

            if("2".equals(Menu)){					//2번을 입력받았을 경우 학과 선택후 바로 학생 정보를 출력.
                try{
                    System.out.println("|1. 간호학 | |2. 컴퓨터소프트웨어학|");
                    Major2 = scan.next();
                    if ("1".equals(Major2)){		//간호학 학생 정보를 출력
                        for(int i=1; i<SC_Array.length; i++){
                            System.out.print("\n"+i+"번째 학생의 이름: "+SC_Array[i].getName());
                            System.out.print("\t학번: "+SC_Array[i].getStudnet_num());
                            System.out.print("\t학년: "+SC_Array[i].getGrade());
                        }
                        continue;
                    }
                    if ("2".equals(Major2)){		//컴퓨터소프트웨어학 학생 정보를 출력
                        for(int k=1; k<SC_Array_2.length; k++){
                            System.out.print("\n"+k+"번째 학생의 이름: "+SC_Array_2[k].getName());
                            System.out.print("\t학번: "+SC_Array_2[k].getStudnet_num());
                            System.out.print("\t학년: "+SC_Array_2[k].getGrade());
                        }
                    }
                    else {			//등록된 정보가 없을때 메시지 출력
                        System.out.println("등록되어 있는 정보가 없습니다. 등록후 다시시도 하십시오.!" );
                        continue;
                    }
                }

                catch(Exception e){		//결과값 출력 메시지
                    e.getMessage();
                    System.out.println("\n결과값이 출력되었습니다.");
                }//catch End.
            } //2 Menu Select End.
        } //while End.
    } //main End.
} //END :)
//Made By 컴돌이//