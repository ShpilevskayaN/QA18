//одномерные массивы 2.8
public class HW2_8m {
        public static void main(String[] args) {
            int[] number1 = new int[10];
            int[] number2 = new int[10];
            double [] number3 = new double [10];
            int n = 0;
            for(int i=0; i<number1.length; i++){
                number1[i] = (int)(Math.random()*10);
                number2[i] = (int)(Math.random()*10);
                number3[i] = (double) number1[i]/number2[i];
                System.out.print(number1[i]+" ");
            }
            System.out.println();
            for(int i=0; i<number2.length; i++) {
                System.out.print(number2[i]+" ");
            }
            System.out.println();
            for(int i=0; i<number2.length; i++) {
                System.out.print(number3[i]+" ");
                if(number3[i]%1==0) {
                    n++;
                }
            }
            System.out.println();
            System.out.println("Количество целых элементов в третьем массиве: "+n);
        }
}

