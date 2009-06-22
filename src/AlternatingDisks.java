
public class AlternatingDisks
{
	public void sort(int[] disks)
	{	
		int counter = 0;
		
		for (int i = 0; i < disks.length / 2; i++)
		{
			for (int j = i; j < disks.length - 1 - i; j++)
			{
				int temp = disks[j];
				disks[j] = disks[j + 1];
				disks[j + 1] = temp;
				counter++;
			}
		}
		
		System.out.println("Swapped: " + counter);
		System.out.print("\n" + disks);
		System.out.print("Altered:\t");
		for (int i = 0; i < disks.length; i++)
		{
			System.out.print(disks[i] + " ");
		}
	}
	
	public void mergeSort(int[] disks)
	{
		
	}
	
	public static void main(final String[] the_args)
	{
		int[] disks = new int[50];
		
		for (int i = 0; i < disks.length; i++)
		{
			if ((i % 2) == 0)
			{
				disks[i] = 1;
			}
			else
			{
				disks[i] = 0;
			}
		}
		
		AlternatingDisks ad = new AlternatingDisks();
		
		System.out.print(disks);
		System.out.print("Original:\t");
		for (int i = 0; i < disks.length; i++)
		{
			System.out.print(disks[i] + " ");
		}
		System.out.println();
		ad.sort(disks);
	}
}
