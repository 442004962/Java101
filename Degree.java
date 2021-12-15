import java.util.Scanner;
class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        float  d ;
        System.out.println("Enter a number");
        d = scan.nextFloat();
        if(d >= 90 && d <= 100){
            System.out.println("A");

        }
        else if(d >= 80 && d < 90){
            System.out.println("B");
        }
        else if(d >= 70 && d < 80){
            System.out.println("C");
        }
        else if(d >= 60 && d < 70){
            System.out.println("D");
        }
        else if(d >= 0 && d < 60){
            System.out.println("F");
        }
    }
}
