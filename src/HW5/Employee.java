package HW5;

public class Employee {
    String name, jumin, level;
    int timepay;

    public Employee(String name, String jumin, String level, int timepay){
        this.name = name; //이름
        this.jumin = jumin; //주민
        this.level = level; //등급
        this.timepay = timepay; //시간당 일한 금액
    }
    public int getpay(int time){
        int money;
        if(time>40){
            money=(int) (time*timepay*1.5);
        }else{
            money=time*timepay;}
        return money;
    }
    public void TimePay(int money){
        if(money>this.timepay)
            System.out.println("증감액만큼 증액 또는 감액할수 없습니다.");
        else
            this.timepay+=money;
    }
}