import java.util.Scanner;

public class SwitichCirculeAndSquare.java {
        public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
           System.out.println("Enter number 1 or 2");

             int num1= scan.nextInt();
               switch (num1){
                    case 1:
                       System.out.println("Enter semicircle");

                       float R;
                       R = scan.nextFloat();
                       System.out.println(3.14*R*R);
                            break;

                        case 2:
                                System.out.println("Enter  height");

                                float height;
                                height = scan.nextFloat();
                                System.out.println("Enter The offer");

                                float offer;
                                offer = scan.nextFloat();
                                System.out.println(height * offer);
                                break;

                        default:
                                System.out.println("Error enter either 1 or 2");
                }
        }
}
