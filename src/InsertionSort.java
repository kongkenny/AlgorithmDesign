import java.util.LinkedList;


public class InsertionSort
{
	// Using array as data structure.
	/*public void insertionSortIterative(int[] arr)
	{
		for (int i = 1; i < arr.length; i++)
		{
			int v = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > v)
			{
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = v;
		}
	}*/
	
	// Using linked list as data sturcture.
	public void insertionSortIterative(LinkedList<Integer> list)
	{
		for (int i = 1; i < list.size(); i++)
		{
			int v = list.get(i);
			int j = i - 1;
			list.remove(i);
			while (j >= 0 && list.get(j) > v)
			{
				j--;
			}
			list.add(j + 1, v);
		}
	}
	
	public static void main(final String[] the_args)
	{
		int[] data = {5, 12, 9, 3, 1, 10, 20};
		LinkedList<Integer> data_list = new LinkedList<Integer>();
		
		for (int i = 0; i < data.length; i++)
		{
			data_list.add(data[i]);
		}
		
		InsertionSort is = new InsertionSort();
		is.insertionSortIterative(data_list);
		
		for (int i = 0; i < data.length; i++)
		{
			System.out.print(data[i] + " ");
		}
		System.out.println();
		for (Integer i : data_list)
		{
			System.out.print(i + " ");
		}
	}
}
