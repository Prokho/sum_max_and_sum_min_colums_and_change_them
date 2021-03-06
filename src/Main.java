// найти столбец с наибольшей и наименьшей суммой и поменять их местами



import java.util.Arrays;
import java.util.Random;


public class Main {

    public static void main(String[] args) {

        Random rnd = new Random();
        int [][] arr = new int [3][3];

        for (int i = 0; i < arr.length; i++ ){
            for (int j = 0; j < arr.length; j++){
                arr[i][j] = rnd.nextInt(10);
            }
        }

       for (int [] a: arr ){
           System.out.println(Arrays.toString(a));
       }

        int min = 0;
        int max = 0;
        int sumMin = 0;
        int sumMax = 0;

        for(int i=0; i<arr.length;i++){
            sumMin += arr[i][0];
        }
            sumMax=sumMin;

        System.out.println(sumMin);

        for (int j=0; j< arr.length; j++){
            int sum =0;
            for(int i=0; i< arr.length;i++){
            sum += arr[i][j];
            }

            if(sum>sumMax){
                sumMax = sum;
                max = j;
            }

            if (sum<sumMin){
                sumMin = sum;
                min =j;
            }

            System.out.println(sumMax);
            System.out.println(sumMin);
        }





    }
}
