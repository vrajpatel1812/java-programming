import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int flag = 0;
        if(a==1){
            System.out.println("Given number is not prime");
        }
        else{
            for(int i=2;i<a/2;i++){
                if(a%i==0){
                    flag = 1;
                    break;
                }
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
