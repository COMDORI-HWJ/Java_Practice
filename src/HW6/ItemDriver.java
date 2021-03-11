package HW6;


class Item{
    String item;
    int num;
    int price;

    public Item(String item, int n, int p){
        this.item=item;
        this.num=n;
        this.price=p;
    }
    //변경 메소드.
    public void setItem(String item){
        this.item=item;
    }
    public void setnum(int num){
        this.num=num;
    }
    public void setprice(int price){
        this.price=price;
    }
    //반환 메소드
    public String getItem(){
        return item;
    }
    public int getnum(){
        return num;
    }
    public int getprice(){
        return price;
    }
    public String Ad(){
        return "상품 이름: "+item+"\t|수량: "+price+"|\t가격: "+num;
    }
}

public class ItemDriver {

    public static void main(String[] args) {
        Item Item = new Item("노트북", 700000,6);

        System.out.println(Item.Ad());
    }

}
