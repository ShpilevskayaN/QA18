public class HW1_4 {
    public static void main(String[] args) {
        int letterA = 10;
        int letterB = 5;

        int result;
        for(result = 0; letterB > 0; --letterB) {
            result += letterA;
        }

        System.out.println("A * B= " + result);
    }
}
