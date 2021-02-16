package HW5;

public class rectangle {
    int width, height, area, circumference;
    rectangle(){
        width = 5;
        height = 5;
    }
    int circumference(){
        circumference=(width+height)*2;
        return circumference;
    }
    int getArea(){
        area = width*height;
        return area;
    }
    int getWidth(){
        return width;
    }
    int getHeight(){
        return height;
    }
    int setWidth(int width){
        if(width>0 && width<20)
            this.width = width;
        else
            System.out.println("가로 길이 범위는 1~19 사이라네요.\n범위 초과해서 1로 진행됨. \n테스트로 5로 진행");
        return width;}
    int setHeight(int height){
        if(height>0&& height<20)
            this.height = height;
        else
            System.out.println("세로 길이 범위는 1~19 사이라네요. \n 범위 초과해서 1로 진행 됨.");
        return height;
    }
}