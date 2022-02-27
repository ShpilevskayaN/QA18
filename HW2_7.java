public class HW2_7 {
        public static void main(String[] args) {
            int[] number = new int[12];
            int n = 0;
            int max=0;
            for(int i=0; i<number.length; i++){
                number[i] = (int)(Math.random()*16);
            }
            for(int i=0; i<number.length; i++) {
                if(number[i]>= max) {
                    max = number[i];
                    n = i;
                }
            }
            System.out.println("Максимальный эллемент в массиве: "+ number[n]);
            System.out.println("Индекс последнего вхождения в массив: "+ n);
        }
    }
