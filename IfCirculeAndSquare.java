import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        
        System.out.print("Enter 1 to calculate the circle and 2 for the square");
        num1 = scan.nextInt();
        
        if (num1==1){
            System.out.print("Enter the radius");
            float R;
        R = scan.nextFloat();
            System.out.print(3.14*R*R);
        }
        else if (num1==2){
            System.out.print("Enter the height and width");
            float R;
        R = scan.nextFloat();
        float A;
        A = scan.nextFloat();
        System.out.print(R*A);
        }
        else {
            System.out.print("error");
        }
            
    }
}
