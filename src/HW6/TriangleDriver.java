package HW6;

class Triangle{
    int a,b,c;
    public Triangle(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    //피타고라스 확인
    public void okTri(){
        if(a*a+b*b == c*c){
            System.out.print("직각삼각형 입니다."); }
        else if(a==b || a==c || b==c){
            System.out.print("이등변삼각형 입니다.");}
        else
            System.out.print("직각도 이등변도 아닙니다.");
    }
}
public class TriangleDriver {

    public static void main(String[] args){
        // TODO Auto-generated method stub
        Triangle t1 = new Triangle(3, 5, 7);
        Triangle t2 = new Triangle(3, 4, 5);
        Triangle t3 = new Triangle(7, 10, 7);

        System.out.print("첫번째 삼각형은"); t1.okTri();

        System.out.print("\n");

        System.out.print("두번째 삼각형은 ");
        t2.okTri();

        System.out.println();
        System.out.print("세번째 삼각형은 ");
        t3.okTri();
    }

}