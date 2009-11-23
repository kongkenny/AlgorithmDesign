

public class MaxOverlapInterval
{
	public int maxOverlap(double[] a, double[] b)
	{
		int result = 0;
		
		int count = 0;
		int i = 0;
		int j = 0;
		while (i < a.length && j < b.length)
		{
			if (a[i] <= b[j])
			{
				i++;
				count++;
			}
			else
			{
				j++;
				count--;
			}
			
			if (count > result)
			{
				result = count;
			}
		}
		
		return result;
	}
	
	public static void main(final String[] the_args)
	{
		MaxOverlapInterval moi = new MaxOverlapInterval();
		
		{
			double[] a = {-1.5, 0, 1, 3.6};
			double[] b = {2, 3, 4, 5}; // 3
			System.out.println(moi.maxOverlap(a, b));
		}
		
		{
			double[] a = {1, 4, 6};
			double[] b = {3, 5, 9}; // 1
			System.out.println(moi.maxOverlap(a, b));
		}

		{
			double[] a = {1, 2, 6};
			double[] b = {3, 5, 9}; // 2
			System.out.println(moi.maxOverlap(a, b));
		}

		{
			double[] a = {1, 2, 4};
			double[] b = {5, 5, 9}; // 3
			System.out.println(moi.maxOverlap(a, b));
		}
		
		{
			double[] a = {-3.5, -3, -2, -1.5, 0};
			double[] b = {-1, 3, 1, 3, 5}; // 4
			System.out.println(moi.maxOverlap(a, b));
		}
		
		{
			double[] a = {-3.5, -3, -2, -1.5, 0, 0.5};
			double[] b = {-1, 3, 1, 3, 5, 4}; // 5
			System.out.println(moi.maxOverlap(a, b));
		}
	}
}
