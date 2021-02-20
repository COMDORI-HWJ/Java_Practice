package HW6;

class Book {

    String title;
    String name;
    int money;

    public Book()
    {
        title = "이건 책 입니다";
        name = "중식킴";
        money = 10000;
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
    void setTitle(String newS)
    {
        title = newS;
    }
    void setName(String newN)
    {
        name = newN;
    }
    void setMoney(int newM)
    {
        money = newM;
    }
}

public class BookDriver {
    public static void main(String []args){

        Book a = new Book();
        Book b = new Book();

        System.out.println("제목: "+a.getTitle());
        System.out.println("저자명: "+a.getName());
        System.out.println("구입가격: "+a.getMoney());

        a.setTitle("이건 책 시리즈2");
        a.setName("중식킴");
        a.setMoney(30000);

        b.setTitle("책 시리즈 3");
        b.setName("COMDORI");
        b.setMoney(5000000);

        System.out.println();
        System.out.println("제목: "+a.getTitle());
        System.out.println("저자명: "+a.getName());
        System.out.println("구입가격: "+a.getMoney());

        System.out.println();
        System.out.println("제목: "+b.getTitle());
        System.out.println("저자명: "+b.getName());
        System.out.println("구입가격: "+b.getMoney());

    }
}
