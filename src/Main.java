// найти столбец с наибольшей и наименьшей суммой и поменять их местами



import java.util.Arrays;
import java.util.Random;


public class Main {

    public static void main(String[] args) {

        Random rnd = new Random();
        int [][] arr = new int [10][10];

        for (int i = 0; i < arr.length; i++ ){
            for (int j = 0; j < arr.length; j++){
                arr[i][j] = rnd.nextInt(10);
            }
        }

       for (int [] a: arr ){
           System.out.println(Arrays.toString(a));
       }





    }
}
