package lab4;

class DanceRobot extends Robot { // 자식 클래스(춤_로봇)

    public DanceRobot(int price) {
        super(price);
    }

    public String toString() { // 기능 출력
        return "춤을 춥니다.";
    }
}
