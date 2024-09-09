import java.util.Scanner;
public class math {
    public static void main(String[] args) {
        int a=3,b=7;
        System.out.println(Math.max(a,b));
        System.out.println((int)(Math.random()*1000));

        //How to take input?
        Scanner sc =new Scanner(System.in);

        System.out.print("Input ur name: ");
        String name=sc.next(); //inputs a word
        System.out.println(name);
        
        System.out.print("Input your age: ");
        int age=sc.nextInt();
        System.out.println(age);
        
        System.out.println("Enter ur motto: ");
        String motto = sc.nextLine(); //inputs a sentence
        System.out.println(motto);

        System.out.print("Enter your salary: ");
        float salary = sc.nextFloat();
        System.out.println(salary);

    }
}
