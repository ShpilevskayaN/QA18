public class HW1_2 {
    public static void main(String[] args) {
        int ameba = 1;

        for(int i = 3; i < 23; i += 3) {
            ameba *= 2;
        }

        System.out.println("Количество амеб через 24 часа: " + ameba);
    }
}
