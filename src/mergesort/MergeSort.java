package mergesort;
import java.util.Arrays;


public class MergeSort
{
	public void mergeSort(int[] arr, int left, int right)
	{
		if (left < right)
		{
			int mid = (left + right) / 2;
		
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}
	
	public void merge(int[] a, int l, int m, int r)
	{
		int n1 = m - l;
		int n2 = r - m;
		
		int[] leftArr = new int[n1+ 1];
		int[] rightArr = new int[n2 + 1];
		
		for (int i = 0; i <= n1; i++)
		{
			leftArr[i] = a[l + i];
		}
		
		for (int j = 0; j <= n2; j++)
		{
			rightArr[j] = a[m + j];
		}
		
		leftArr[n1] = Integer.MAX_VALUE;
		rightArr[n2] = Integer.MAX_VALUE;
		
		int i = 0, j = 0;
		
		for (int k = l; k < r; k++)
		{
			if (leftArr[i] <= rightArr[j])
			{
				a[k] = leftArr[i];
				i++;
			}
			else
			{
				a[k] = rightArr[j];
				j++;
			}
		}
	}
	
	public static void main(final String[] the_args)
	{
		int[] data = {5, 12, 9, 3, 1, 10, 20};
		
		MergeSort ms = new MergeSort();
		System.out.println("Before sort: " + Arrays.toString(data));
		ms.mergeSort(data, 0, data.length - 1);
		System.out.println("After sort: " + Arrays.toString(data));
	}
}
