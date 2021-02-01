package lab4;

class SingRobot extends Robot { // 자식 클래스(노래_로봇)

    public SingRobot(int price) {
        super(price);

    }

    public String toString() { // 기능 출력
        return "노래를 부릅니다.";
    }
}
