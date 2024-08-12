import java.util.Scanner;
public class NumberAverage{
    public static String FindAverage(int[] arr)
    {
        int n = arr.length;
        if(n == 0)
            return "The Array is Empty";
        int total = 0;
        for(int x : arr)
        {
            if(x < 0)
                return "Give proper positive integer values";
            total += x;
        }
        return String.valueOf((int)(total/n));
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values:");
        for(int i = 0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println(FindAverage(arr));
    }
}