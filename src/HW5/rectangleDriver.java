package HW5;

public class rectangleDriver {

    public static void main(String[] args) {
        rectangle data = new rectangle();
        int circumference, area;
        data.setWidth(21);
        data.setHeight(5);
        circumference=data.getHeight();
        area=data.getArea();

        System.out.println("가로: "+data.getWidth());;
        System.out.println("세로 : "+data.getHeight());
        System.out.println("면적: "+data.getArea());
        System.out.println("둘레: "+data.circumference());

    }

}
