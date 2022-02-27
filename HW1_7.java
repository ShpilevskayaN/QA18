public class HW1_7 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 0; i < 100; ++i) {
            if (i % 2 != 0) {
                ++i;
                sum += i;
            }

            System.out.println("Сумма нечетных чисел от 1 до 99 равна: " + sum);
        }

    }
}
