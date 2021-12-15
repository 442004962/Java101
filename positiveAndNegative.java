import java.util.Scanner;
public class positiveAndNegative.java {
    public static void main(String[] args) {
        Scanner sacn = new Scanner(System.in);
        float num;
        System.out.println("Enter the number");
        num = sacn.nextFloat();
        if(num < 0) {
            System.out.println("the number negative");
        }
        else {
            System.out.println("the number postive");
        }
    }
}
