public class HW2_5 {
    public static void main(String[] args) {
        int[] numbers1 = new int[5];
        int [] numbers2 = new int[5];
        int a=0;
        int b=0;
        int a1, b1;
        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = (int) (Math.random() * 16);
            numbers2[i] = (int) (Math.random() * 16);
        }
        for (int i = 0; i < numbers1.length; i++) {
            System.out.print(numbers1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i] + " ");
        }
        for (int i = 0; i < numbers1.length; i++) {
            a = a + numbers1[i];
        }
        for (int i = 0; i < numbers2.length; i++) {
            b =b + numbers2[i];
        }
        System.out.println();
        a1 =  a / 5;
        b1 =  b / 5;
        if (a < b) {
            System.out.println("Среднее арифметическое первого массива меньше среднего арифметического второго массива ");
        } else if (b< a) {
            System.out.println("Среднее арифметическое второго массива меньше среднего арифметического первого массива");
        } else {
            System.out.println("Средние арифместические двух массивов равны друг другу");
        }
    }
}
