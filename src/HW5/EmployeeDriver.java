package HW5;

//9번 문제
import java.util.Scanner;

public class EmployeeDriver {

    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        Employee data = new Employee("이름", "960905-3045907", "사장", 30000);

        System.out.println("주당 일한 시간은?");
        System.out.println("임금: "+data.getpay(scan.nextInt())+"\n");
        System.out.println("시간당 임금 인상액을 입력하시요:");
        data.TimePay(scan.nextInt());
        System.out.println("\n");
        System.out.println("주당 일한 시간을 입력하시요.");
        System.out.println("임금: "+data.getpay(scan.nextInt()));
    }

}
