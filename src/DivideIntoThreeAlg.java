public class DivideIntoThreeAlg
{
	public int scale(int[] coin, int llow, int lhigh, int rlow, int rhigh)
	{
		int result = 0;
		int left_weigh = 0;
		int right_weigh = 0;
		
		for (int i = llow; i <= lhigh; i++)
		{
			left_weigh += coin[i];
		}
		
		for (int i = rlow; i <= rhigh; i++)
		{
			right_weigh += coin[i];
		}
		
		if (left_weigh < right_weigh)
		{
			result = 1;// left lighter
		}
		else if (right_weigh < left_weigh)
		{
			result = 2;// right lighter
		}
		
		return result;
	}
	
	public int divideIntoThree(int[] coin, int low, int high, int standard_weigh)
	{
		if (low == high)
		{
			if (coin[low] < standard_weigh)
				return low;
			else
				return -1;
		}
		
		System.out.println(low + " " + high);
		int m1 = (high - low) / 3;
		int m2 = low + m1 + m1 + 1;
		m1 += low;
		//int m1 = low + (high - low) / 3;
		//int m2 = low + 2 * ((high - low) / 3) + 1;
		System.out.println(low + " " + m1 + " " + m2 + " " + high);
		int scale_result = scale(coin, low, m1, m1 + 1, m2);
		
		if (scale_result == 1)
		{
			return divideIntoThree(coin, low, m1, standard_weigh);
		}
		else if (scale_result == 2)
		{
			return divideIntoThree(coin, m1 + 1, m2, standard_weigh);
		}
		else
		{
			return divideIntoThree(coin, m2 + 1, high, standard_weigh);
		}
	}
	
	public static void main(final String[] the_args)
	{
		int[] coin = new int[20];
		int standard_weigh = 5;
		
		// Assign all coins to have the same weight.
		for (int i = 0; i < coin.length; i++)
		{
			coin[i] = standard_weigh;
		}
		
		coin[5] = 3;// Assign the lighter fake coin.
		
		DivideIntoThreeAlg dita = new DivideIntoThreeAlg();
		System.out.println(dita.divideIntoThree(coin, 0, coin.length - 1, standard_weigh));
	}
}
