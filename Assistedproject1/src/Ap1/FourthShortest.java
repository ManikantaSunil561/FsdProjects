package Ap1;
import java.util.Arrays;
public class FourthShortest
{
	public static int FourthSmallest(Integer[] arr,int k)
	{
		Arrays.sort(arr);
		return arr[3];
	}
	public static void main(String[] args)
	{
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
		System.out.print("Fourth smallest element is " + FourthSmallest(arr, 4));
	}
}