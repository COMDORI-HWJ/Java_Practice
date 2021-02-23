package HW6;

class Coin{
    String face;

    public Coin(){
        int x = (int) (Math.random() * 2) + 1; //동전의 앞뒷면 랜덤 설정
        if(x == 1){
            face = "앞면";
        }
        else if(x == 2){
            face = "뒷면";
        }
    }

    public String getCoin(){
        return face;
    }
}

class CoinDriver{
    public static void main(String[] args) {
        Coin coin = new Coin();

        System.out.println("현재면은 " + coin.getCoin()+"입니다.");
    }
}