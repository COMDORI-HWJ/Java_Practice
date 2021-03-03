package HW6;

class Die{
    int die1;
    int die2;
    int sum;

    //난수 생성
    public Die(){
        int fir=(int) (Math.random() *6)+1;
        int sec=(int) (Math.random() *6)+1;
        die1=fir;
        die2=sec;
    }
    public int setSum(){
        sum=die1+die2;
        return sum;
    }
}

public class DieDriver {

    public static void main(String[] args) {

        int count=0, c7=0, c11=0;

        for(int i=0;i<100;i++){
            Die D=new Die();
            int rou=D.setSum();
            if(rou==7||rou==11){
                count++;
            }
            if(rou==7){
                c7++;
            } else if(rou==11){
                c11++;
            }
        }
        System.out.println("주사위의 같은면 횟수: "+count);
        System.out.println("합이 7일때 횟수: "+c7);
        System.out.println("합이 11일때 횟수: "+c11);
    }


}
