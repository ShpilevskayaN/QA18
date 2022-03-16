//многомерный массив
import java.util.Random;
import java.util.Scanner;

    public class HW2_2mas {
        public static void main(String[] args) {
            //Entering array size
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter matrix size: ");
            int arraySize = scanner.nextInt();
            scanner.close();

            //creating and viewing array values in one step
            int[][] array = new int[arraySize][arraySize];
            Random random = new Random();
            System.out.println();
            for (int i = 0; i < arraySize; i++) {
                for (int j = 0; j < arraySize; j++) {
                    array[i][j] = random.nextInt(51);
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();

            //task 1
            System.out.println("Task 1");
            int sumOfDiagonalEvenValues = 0;
            for (int i = 0; i < arraySize; i++) {
                if (array[i][i] % 2 == 0) {
                    sumOfDiagonalEvenValues += array[i][i];
                }
            }
            System.out.print("Sum of main diagonal even values = ");
            System.out.println(sumOfDiagonalEvenValues);
            System.out.println();

            //task 2
            System.out.println("Task 2");
            System.out.print("Odd values under array main diagonal: ");
            for (int i = 0; i < arraySize; i++) {
                for (int j = 0; j < arraySize; j++) {
                    if (j > i) {
                        continue;
                    }
                    if (array[i][j] % 2 != 0) {
                        System.out.print(array[i][j] + " ");
                    }
                }
            }
            System.out.println();
            System.out.println();

            //task 3
            System.out.println("Task 3");
            int multiplyingValuesOfMainDiagonal = 1;
            int multiplyingValuesOfNonMainDiagonal = 1;
            for (int i = 0; i < arraySize; i++) {
                multiplyingValuesOfMainDiagonal *= array[i][i];
            }
            for (int i = 0, j=arraySize-1; i < arraySize; i++,j--) {
                multiplyingValuesOfNonMainDiagonal *= array[i][j];
            }
            System.out.println("Multiplying main diagonal: "+multiplyingValuesOfMainDiagonal);
            System.out.println("Multiplying non main diagonal: "+multiplyingValuesOfNonMainDiagonal);
            System.out.println();

            //task 4
            System.out.println("Task 4");
            int sumOfEvenValuesAboveMainDiagonal = 0;
            for (int i = 0; i < arraySize; i++) {
                for (int j = 0; j < arraySize; j++) {
                    if (j <= i) {
                        continue;
                    }
                    if(array[i][j] % 2 == 0){
                        sumOfEvenValuesAboveMainDiagonal +=array[i][j];
                    }
                }
            }
            System.out.println("Sum of even values above main diagonal = "+sumOfEvenValuesAboveMainDiagonal);

            //task 5
            int[][] tempArray = new int[arraySize][arraySize];
            for(int i=0; i<arraySize;i++){
                for(int j=0; j<arraySize;j++){
                    tempArray[i][j] = array[j][i];
                }
            }
            array = tempArray;
        }
    }

