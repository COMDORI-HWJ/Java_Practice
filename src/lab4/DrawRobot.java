package lab4;

class DrawRobot extends Robot { // 자식 클래스(그림그리는_로봇)

    public DrawRobot(int price) {
        super(price);
    }

    public String toString() { // 기능 출력
        return "그림을 그립니다.";
    }
}
