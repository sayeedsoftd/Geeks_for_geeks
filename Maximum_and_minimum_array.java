package MyJavaProject.Geeksforgeeks;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_and_minimum_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int[] arr=new int[number];
        int i;
        //int max=arr[0],min=arr[0];
        for (i=0;i<number;i++)
        {
            arr[i]=sc.nextInt();

        }
        /*for (i=0;i<number;i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }*/
        /*for (i=0;i<number;i++)
        {
            if (arr[i]<min)
            {
                min = arr[i];

            }
        }*/
        int max=Arrays.stream(arr).max().orElseThrow();

        int min= Arrays.stream(arr).min().orElseThrow();


        System.out.println("max value : "+ max);
        System.out.println("min value :" + min);




    }
}
