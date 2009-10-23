
public class BinaryRepresentation
{
	private int counter = 0;
	public static void main(final String[] the_args)
	{
		int[] string = binaryConverter(20);
		for (int i = string.length - 1; i >= 0; i--)
		{
			System.out.print(string[i]);
		}
		System.out.println();
	}
	
	private int[] stringRec;
	
	public static int[] binaryConverter(int seed)
	{
		int[] string = new int[seed];
		int i = 0;
		while (seed > 0)
		{
			if ((seed % 2) == 0)
			{
				string[i] = 0;
			}
			else
			{
				string[i] = 1;
			}
			seed = seed / 2;
			i++;
		}
		return string;
	}
}
