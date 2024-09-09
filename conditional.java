
import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        int n= 3;
        while(n!=0){
            System.out.println(n);
            n--;
        }

        if(n==0){
            System.out.println("final n value is zero.");
        }
        else{
            System.out.println("final n value is not zero.");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m value(switch): ");
        int m=sc.nextInt();

        switch(m){
            case 1 : System.out.println("hello world");
                    break;
            case 2 : System.out.println("hello ladies");
                    break;
            default: System.out.println("googoo gaagaa!!");
                    break;
        }

        int[] arr = new int[100];
        System.out.print("enter the limit: ");
        int val=sc.nextInt();
        
        System.out.print("enter the elements: ");
        for(int i=0;i<val;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<val;i++){
            System.out.println(arr[i]);
        }
    }
}
