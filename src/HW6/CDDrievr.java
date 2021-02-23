package HW6;

class CD {

    String title;
    String name;
    int money;

    public CD()
    {
        title = "즐겁게 춤";
        name = "김중익";
        money = 15000;
    }

    String getTitle()
    {
        return title;
    }
    String getName()
    {
        return name;
    }
    int getMoney()
    {
        return money;
    }
    void setTitle( String newT )
    {
        title = newT;
    }
    void setName( String newN)
    {
        name = newN;
    }
    void setMoney( int newM)
    {
        money = newM;
    }
}

public class CDDrievr {
    public static void main(String []args){

        CD a = new CD();

        System.out.print("제목: "+a.getTitle());
        System.out.print("\t 연주자: "+a.getName());
        System.out.print("\t 구입가격: "+a.getMoney());

        a.setTitle("내나이가어때서");
        a.setName("오승근");
        a.setMoney(30000);

        System.out.println();
        System.out.print("제목: "+a.getTitle());
        System.out.print("\t 연주자: "+a.getName());
        System.out.print("\t 구입가격: "+a.getMoney());
    }
}
