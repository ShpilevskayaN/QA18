public class HW2_4 {
    public static void main(String[] args) {
        int[] number = new int[20];
        int n = 0;
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 21);
        }
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                n++;
            }
            System.out.print(number[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < number.length; i++) {
            if (i % 2 == 0) {
                number[i] = 0;
            }
            System.out.print(number[i] + " ");
        }
    }
}

