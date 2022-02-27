public class HW1_3 {
    public static void main(String[] args) {
        int a = 0;

        int sum;
        for(sum = 1; sum < 256; sum += 2) {
            sum += sum * 2;
        }

        System.out.println("Сумма чисел равна: " + sum);
    }
}
