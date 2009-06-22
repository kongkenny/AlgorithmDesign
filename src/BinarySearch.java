
public class BinarySearch
{
	public int binarySearch(int[] data, int low, int high, int key)
	{
		if (low > high)
		{
			return -1;
		}
		else
		{
			int mid = (high + low) / 2;
			if (key == data[mid])
			{
				return mid;
			}
			else if (key < data[mid])
			{
				return binarySearch(data, 0, mid - 1, key);
			}
			else
			{
				return binarySearch(data, mid + 1, high, key);
			}
		}
	}
	
	public static void main(final String[] the_args)
	{
		int[] data = {5, 7, 3, 8, 32, 4, 46, 37, 43, 9, 5};
		
		BinarySearch bs = new BinarySearch();
		System.out.println(bs.binarySearch(data, 0, data.length - 1, 4));
	}
}
