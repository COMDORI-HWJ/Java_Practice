package HW6;

import java.util.Scanner;

class GirlScout{
    String name;
    int box;

    public GirlScout(String name){
        this.name=name;
        this.box=0;
    }
    public String getname(){
        return name;
    }
    public void setbox(int box){
        this.box=box;
    }
    public int getbox() {
        return this.box;
    }
    public String toString(){
        return name+": "+box;
    }

}
public class GirlScoutDriver {

    public static void main(String[] args) {
        final int Girl=3;

        GirlScout[] g=new GirlScout[Girl];
        Scanner sc = new Scanner(System.in)
                ;int week=0;
        for(int i=0; i<Girl; i++){
            System.out.println("걸스카우트 이름을 입력하세요: ");
            String gir=sc.nextLine();
            g[i]=new GirlScout(gir);
        }
        System.out.println("판매 기간을 입력 하세요: ");
        week=sc.nextInt();
        System.out.println();
        for(int i=1; i<=week; i++){
            for(int a=0; a<Girl; a++){
                String name = g[a].getname();

                System.out.print(name+"의 "+i+"번째주 판매 상자수를 입력하세요: ");
                int newBox = sc.nextInt();

                g[a].setbox(g[a].getbox()+newBox);
            }

            System.out.println();
        }


        for(int i=0; i<Girl; i++){

            System.out.println(g[i]);

        }
    }
}
