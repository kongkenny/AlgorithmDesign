
public class QuickSort
{
	public void quickSort(char[] data, int low, int high)
	{
		if (low < high)
		{
			int mid = partition(data, low, high);
			quickSort(data, low, mid - 1);
			quickSort(data, mid + 1, high);
		}
		System.out.println();
	}
	
	public int partition(char[] data, int low, int high)
	{
		int pivot = data[low];
		int i = low;
		int j = high;
		
		do
		{
			while (data[i] <= pivot && i <= high)
			{
				i++;
			}
			
			while (data[j] >= pivot && j >= low)
			{
				j++;
			}
			
			// Swap
			char temp = data[i];
			data[i] = data[j];
			data[j] = temp;
		} while (i < j);
		
		// Undo the last swap
		char temp = data[i];
		data[i] = data[j];
		data[j] = temp;
		
		temp = data[low];
		data[low] = data[j];
		data[j] = temp;
		
		return j;
	}
	
	public static void main(final String[] the_args)
	{
		char[] data = {'W', 'A', 'S', 'H', 'I', 'N', 'G', 'T', 'O', 'N'};
		
		QuickSort qs = new QuickSort();
		
		qs.quickSort(data, 0, data.length - 1);
		for (int i = 0; i < data.length; i++)
		{
			System.out.print(data[i]);
		}
	}
}
