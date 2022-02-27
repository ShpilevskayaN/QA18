public class HW2_2 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) a++;
        }
        int[] number = new int[a];
        for (int i = 1, b = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                number[b] = i;
                System.out.print(number[b] + " ");
                b++;
            }
        }
        System.out.println(" ");
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.println(number[i]);
        }
    }
}

