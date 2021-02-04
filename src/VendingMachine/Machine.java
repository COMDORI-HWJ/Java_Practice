//package VendingMachine;
//
//import javax.swing.JOptionPane;
//
//class Machine {
//    public static final int Sel=6; //6개의 음료수에 대한 배열 크기 설정.
//    public static final int quantity=3;
//    public int money=0;
//    public int cost;
//
//    Beverage[] Bev= new Beverage[Sel]; //음료 배열 불러오기
//    public Machine(int cost){//음료수 가격을 나타냄.
//        this.cost=cost;
//    }
//    public void Bevop(int choice, Beverage bevop){//선택한 음료정보를 나타냄. choice에서 6개의 항목에서 음료수의 위치를 나타냄
//        Bev[choice]=bevop;}
//
//
//    public void getMoney(int choice){
//        if(money<cost){
//            //투입한 돈이 음료값 500원 보다 작을때
//        }
//        else if(Bev[choice].quantity <= 0){ //선택한 음료의 현재 양이 0값 일때 입니다.
//
//            JOptionPane.showMessageDialog(null, "선택한 음료"+getName(choice)+"가 매진되었네요. \n 죄송합니다.");
//        }
//
//        else{
//            Bev[choice].quantity --;
//            money=money-cost;
//        }
//    }
//
//    public void refund() // 반환에 관한 메소드입니다.
//    {
//        money = 0; // 반환레버를 돌리는 것으로 현재 넣은 돈을 0원으로 바꿔줍니다.
//    }
//
//    public String getName(int choice) // 각 선택한 음료수에 해당하는 이름을 음료수의 배열에 저장된 이름을 통해 반환하는 메소드입니다.
//    {
//        return Bev[choice].name;
//    }
//
//}