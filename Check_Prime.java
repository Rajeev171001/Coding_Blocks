import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=1){
            System.out.println("Not Prime");
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("Not Prime");
            }
        }
        System.out.println("Prime");

    }
}
