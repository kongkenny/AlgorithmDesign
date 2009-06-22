
public class FindLargest
{
	public int divide(int[] arr, int low, int high)
	{
		if (high == low)
		{
			return low;
		}
		else
		{
			int mid = low + (high - low) / 2;
			int max1 = divide(arr, low, mid);
			int max2 = divide(arr, mid + 1, high);
			
			if (arr[max1] > arr[max2])
			{
				return max1;
			}
			else
			{
				return max2;
			}
		}
	}
	
	public static void main(final String[] the_args)
	{
		int[] integers = {4, 6, 2, 9, 27, 3, 10, 0, 15};
		FindLargest fl = new FindLargest();
		
		int max = fl.divide(integers, 0, integers.length - 1);
		System.out.println(max);
	}
}
