import java.util.Scanner;

public class leader
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i =0 ; i < n ; i++)
        {
            arr[i] = scn.nextInt();
        }

        int j = n-2;
        int max = arr[n-1];
        System.out.println("Leaders : ");
        System.out.println(arr[n-1]);
        while(j>=0)
        {
            if(arr[j] > max)
            {
                System.out.println(arr[j]);
                max = arr[j];
            }

            j--;
        }


    }
}