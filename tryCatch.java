public class tryCatch {
    public static void main(String[] args) {
        int[] marks={2,3,4,5};
        try {
            System.out.println(marks[5]);
        } catch (Exception e) {
            //do something after catching
        }
        System.out.println("The name is Don.");
    }
}
