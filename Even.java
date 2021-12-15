import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int j;
        System.out.print("Enter a Number");
        j = scan.nextInt();
        j %=2;
        if (j==0){
            System.out.print("even");
        }
        else {
            System.out.print("odd");
        }



    }
}
