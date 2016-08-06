package datastructure;

import java.util.Random;

/**
 * Created by rinko on 8/6/2016.
 */
public class MultiDimensionalArray {


    public static void main(String[] args) {
        int rows=30;
        int column = 30;

        Random random = new Random();

        int [][] multiArray = new int [rows][column];
        for (int i=0;i<rows;i++)
        {
            for(int j=0;j<column;j++)
            {
                multiArray[i][j]=random.nextInt(100);
            }
        }

        // for Print array

        for (int i=0;i<rows;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(multiArray[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


}
