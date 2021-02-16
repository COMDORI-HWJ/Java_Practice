package HW5;

public class SavingAccountDriver {

    public static void main(String[] args) {
        SavingAccount sa1, sa2;
        sa1= new SavingAccount(0.05, 10000);
        sa2= new SavingAccount(0.05, 20000);

        System.out.println("연이율이 5% 일때 입니다.");
        System.out.println("계좌 1의 첫 달 이자: "+sa1.getMonth());
        System.out.println("계좌 2의 첫 달 이자: "+sa2.getMonth());

        sa1.setRate(0.06);
        sa2.setRate(0.06);

        System.out.println("연이율 6% 일때 입니다.");
        System.out.println("계좌 1의 첫 달 이자: "+sa1.getMonth());
        System.out.println("계좌 2의 첫 달 이자: "+sa2.getMonth());
    }

}
