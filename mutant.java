import java.util.*;
public class mutant{
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int t = scan.nextInt();
            for(int i=0 ; i<t ; i++){
                int n,k;
                n = scan.nextInt();
                k = scan.nextInt();
                int a[] = new int[101];
                for(int j=0 ; j<n ; j++){
                    a[j] = scan.nextInt();
                }
                for(int j=0 ; j<n ; j++){
                    a[j] = a[j] + k ;
                }
                int ans=0;
                for(int j=0 ; j<n ; j++){
                    if(a[j] % 7 == 0){
                        ans++;
                    }
                }
                System.out.println(ans);
            }
        }
    }
}