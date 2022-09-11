import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int a = scan.nextInt();
            int flag = 0;
            int c = 2;
            if(a==1){
                System.out.println("Given number is not prime");
            }
            else{
                while(c*c <= a){
                    if(a%c==0){
                        flag = 1;
                        break;
                    }
                    c++;
                }
            }
            if(flag == 1){
                System.out.println("Given number is not prime number");
            }
            else{
                System.out.println("Given number is prime number");
            }
        }
    }
}
