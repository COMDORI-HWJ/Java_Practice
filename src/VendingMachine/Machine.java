package VendingMachine;

import javax.swing.JOptionPane;


public class Machine
{
    public static final int Sel=8; // 8가지 음료수 선택에 대한 배열 크기를 지정해줍니다.
    public static final int amount=4; // 음료수의 수량을 나타냄. 각각 4개씩 있음.
    int money = 0;
    int cost, cost1, cost2;
    int cokeamount = 4, coffeeamount = 4, sikhyeamount = 4;

    Beverage[] bev = new Beverage[Sel];

    public String getName(int choice) // 각각의 음료수 이름 메소드입니다.
    {
        return bev[choice].name;
    }

   public Machine() // 음료가격 표기와 관련된 M 메소드입니다.
    {
        this.cost = 600; // 음료수들의 가격을 나타내는 cost 입니다.
        this.cost1 = 400; // 콜라 음료의 값
        this.cost2 = 500; // 커피 음료의 값
    }

    public void Bev (int choice, Beverage option) // 선택한 음료수 정보입니다.
    {												// 선택한 choice 번호는 7개의 음료 배열에서 각 음료수의 위치를 나태 내면서
        bev[choice] = option;						//  option에서는 각 Beverage의 버튼에 표시된 명칭과 현재 수량이 표시됩니다.
    }

    public void getMoney(int choice)
    {
        if(money < cost ){

        } // 가지고 있는 돈이 음료수값보다 작을때
        else if(bev[choice].amount<=0){ // 선택한 음료 수량이 0 일때
            JOptionPane.showMessageDialog(null, "선택하신 " + getName(choice) + " 음료가 매진되었습니다. \n 죄송합니다.", "매진", JOptionPane.ERROR_MESSAGE ); // 매진 안내 메시지
        }

        else {
            bev[choice].amount--; // 음료수를 구입할 때마다 하나씩 그 음료수를 줄어듭니다.
            money = money - cost; // 가지고 있는 돈은 음료수를 선택할 때마다 음료수의 값만큼 빼줍니다.
        }
    }
    public void Cokecost(){ // 콜라가 매진 되었을때
        if (money<cost){
        }
        else if(cokeamount<=0){ JOptionPane.showMessageDialog(null, "콜라가 매진 되었습니다 \n 죄송합니다.", "매진", JOptionPane.ERROR_MESSAGE);}

        else {
            cokeamount--;
            money=money-cost1;
        }
    }

    public void Sikhyecost(){ // 식혜가 매진 되었을때
        if(money<cost){

        }

        else if(sikhyeamount<=0){
            JOptionPane.showMessageDialog(null, "식혜 음료가 매진되었습니다. \n 죄송합니다.", "매진", JOptionPane.ERROR_MESSAGE );
        }
        else{
            sikhyeamount--;
            money=money-800;
        }
    }

    public void Coffeecost(){ // 커피가 매진 되었을때
        if (money<cost){
        }
        else if(coffeeamount<=0){
            JOptionPane.showMessageDialog(null, "커피가 매진 되었습니다. \n 죄송합니다.", "매진", JOptionPane.ERROR_MESSAGE);
        }
        else{
            coffeeamount--;
            money=money-cost2;
        }
    }
    public void refund() // 반환에 관한 메소드입니다.
    {
        money = 0; // 현재 가지고 있는 돈을 반환(0원으로) 합니다.
    }

}