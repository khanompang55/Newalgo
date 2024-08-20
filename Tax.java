import java.utill.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner salaryScan = new Scanner(System.in);

        System.out.print("Enter your salary :");
        float salaryEnter = salary.nextFloat();
        float tax = (salaryEnter * 10) / 100;
        System.out.print("You tax =" + tax);
        salaryScan.close();
    }

}
