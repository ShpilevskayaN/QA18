public class HW2_6 {
    public static void main(String[] args) {
        int[] number = new int[4];
        int a = 0;
        for(int i=0; i<number.length; i++){
            number[i] = (int)(Math.random()*11);
        }
        for(int i=0; i<number.length; i++) {
            System.out.print(number[i]+" ");
        }
        System.out.println();
        for(int i=0; i<number.length-1; i++) {
            if(number[i]>number[i+1]) {
                a = 1;
                break;
            }
        }
        if(a==1) {
            System.out.println("массив чисел не является строго возрастающим");
        } else {
            System.out.println("массив чисел является строго возрастающим");
        }
    }
}


