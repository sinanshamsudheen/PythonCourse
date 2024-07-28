public class casting {
    public static void main(String[] args) {
        double price = 100.00;
        double finalPrice = price + 18; //Implicit casting
        System.out.println(finalPrice); //118.0

        int p = 100;
        int fp = p + (int)18.00; //explicit casting
        System.out.println(fp); //118

        final float PI = 3.14;
        System.out.println(PI);

    }
}
