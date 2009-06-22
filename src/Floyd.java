
public class Floyd
{
	public void floyd(int[][] w)
	{	
		for (int k = 0; k < w.length; k++)
		{
			for (int i = 0; i < w.length; i++)
			{
				for (int j = 0; j < w[i].length; j++)
				{
					w[i][j] = Math.min(w[i][j], (w[i][k] + w[k][j]));
				}
			}
			printIntermediary(w);
		}
	}
	
	public void printMatrix(final int[][] w)
	{
		for (int i = 0; i < w.length; i++)
		{
			for (int j = 0; j < w[i].length; j++)
			{
				if (w[i][j] == 65535)
				{
					System.out.print(Double.POSITIVE_INFINITY + "\t");
				}
				else
				{
					System.out.print(w[i][j] + "\t\t");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	private void printIntermediary(final int[][] w)
	{
		printMatrix(w);
	}
	
	public static void main(final String[] the_args)
	{
		int test[][] = {{0, 65535, -3, 65535},
						{2, 0, 65535, 65535},
						{65535, 7, 0, -1},
						{-6, 65535, 65535, 0}};
		
		int test1[][] = {{0, 1},
						 {-2, 0}};
		
		
		int w[][] = {{0, 2, 65535, -1, 8},
					 {6, 0, 3, 2, 65535},
					 {65535, 65535, 0, 4, 65535},
					 {65535, 65535, 2, 0, -3},
					 {-3, 65535, 65535, 65535, 0}};
		Floyd f = new Floyd();
		
		f.printMatrix(test);
		f.floyd(test);
		
		//f.printMatrix(w);
		//f.floyd(w);
	}
}
