public class HW2_3 {
    public static void main(String[] args) {
        int[] number = new int[15];
        int n = 0;
        for(int i=0; i<number.length; i++){
            number[i] = (int)(Math.random()*100);
        }
        for(int i=0; i<number.length; i++) {
            if(number[i]%2==0) {
                n++;
            }
            System.out.print(number[i]+" ");
        }
        System.out.println();
        System.out.println(n);
    }
}

