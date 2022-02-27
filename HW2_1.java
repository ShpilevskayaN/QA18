public class HW2_1 {
    public static void main(String[] args) {
        int[] number = new int[10];
        int i = 0;
        int m = 2;
        while (i < 10) {
            number[i] = m;
            m += 2;
            i++;
        }
        for (i = 0; i < 10; i++) //вывод эллементов массива в строку
            System.out.print(number[i] + " ");
        System.out.println ();
        System.out.println ();
        for (i = 0; i < 10; i++)//вывод эллементов массива в столбик
            System.out.println(number[i]);
    }
}

