public class HW1_5 {
    public static void main(String[] args) {
        int counter = 1;

        for(int inch = 1; inch <= 20; ++inch) {
            double sm = (double)inch * 2.54D;
            System.out.println(inch + " дюймам соответствует " + sm + " сантиметоров ");
        }
    }
}
