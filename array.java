
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0]=9;
        marks[1]=99;
        marks[2]=91;

        System.out.println(marks[1]); //99
        Arrays.sort(marks);
        System.out.println(marks[1]); //91

        String[][] name = {{"sinan","liza"},{"vysh","shankar"}};
        System.out.println(name[0][1]); //liza
        System.out.println(name[1][1]); //shankar
    } 
}
