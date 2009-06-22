
public class MergeSort
{
	public void mergeSort(int[] arr, int left, int right)
	{
		if (left <= right)
		{
			int mid = (right - left) / 2;
		
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
		}
	}
	
	public static void main(final String[] the_args)
	{
		int[] data = {5, 12, 9, 3, 1, 10, 20};
		
		MergeSort ms = new MergeSort();
		ms.mergeSort(data, 0, data.length - 1);
	}
}
