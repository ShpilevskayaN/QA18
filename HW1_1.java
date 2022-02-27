public class HW1_1 {
    public static void main(String[] args) {
        double p = 10.0D;
        double sum = 10.0D;

        for(int count = 0; count < 6; ++count) {
            p *= 1.1D;
            sum += p;
        }

        System.out.println("Суммарный путь спортсмена " + sum);
    }
}


