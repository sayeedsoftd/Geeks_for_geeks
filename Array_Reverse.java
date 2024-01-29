package MyJavaProject.Geeksforgeeks;

import java.util.Scanner;

public class Array_Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int i,temp=0;
        while (number!=0)
        {

                int reverse=number%10;
                temp=temp*10+reverse;
                number/=10;

        }
        System.out.println(temp);

    }
}
