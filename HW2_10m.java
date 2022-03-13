// Одномерные массивы 2.10
import java.util.Scanner;
public class HW2_10m {
        public static void main(String[] args){
            int n=0;//значение первого массива
            int z=0;//значение второго массива
            do{
                Scanner scn = new Scanner(System.in);
                System.out.println("Введите число большее 3");
                if(scn.hasNextInt()){
                    n=scn.nextInt();
                }
                else System.out.println("Ошибка. Введите соответствующее соответсвующее число");
            }
            while (n<4);
            int[] Mas1 = new int[n];
            for(int i=0;i<Mas1.length;i++){
                Mas1[i]=(int)(Math.random()*(n+1));
                System.out.print(Mas1[i]+" ");
                if(Mas1[i]%2==0&Mas1[i]!=0)z++;
            }
            System.out.println("");
            if(z>0){
                int[] Mas2 = new int[z];
                for(int i=0,b=0;i<Mas1.length;i++){
                    if (Mas1[i]%2==0&Mas1[i]!=0){
                        Mas2[b]=Mas1[i];
                        System.out.print(Mas2[b]+" ");
                    }
                }
            }
        }
    }
