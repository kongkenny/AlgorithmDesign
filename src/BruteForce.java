import java.util.HashMap;
import java.util.Map;


public class BruteForce
{
	public int[][] generateWordsMatrix(Map<String, Integer> words, char[] alphabet)
	{
		int[][] result = new int[words.size()][words.size()];
		
		for (String word : words.keySet())
		{
			int current = words.get(word);
			for (int i = 0; i < word.length(); i++)
			{
				// Change a single character at this position.
				for (int j = 0; j < alphabet.length; j++)
				{
					char[] replace = word.toCharArray();
					replace[i] = alphabet[j];
					String transformed = new String(replace);
					
					if (words.containsKey(transformed) && !transformed.equals(word))
					{
						result[current][words.get(transformed)] = 1;
						result[words.get(transformed)][current] = 1;
					}
				}
				
				//Delete a single character at this position.
				StringBuilder delete = new StringBuilder(word);
				delete.deleteCharAt(i);
				if (words.containsKey(delete.toString()))
				{
					result[current][words.get(delete.toString())] = 1;
					result[words.get(delete.toString())][current] = 1;
				}
			}
			
			// Add a single character to individual position.
			for (int i = 0; i <= word.length(); i++)
			{
				for (int j = 0; j < alphabet.length; j++)
				{
					StringBuilder add = new StringBuilder(word);
					add.insert(i, alphabet[j]);
					
					if (words.containsKey(add.toString()) && !add.toString().equals(word))
					{
						result[current][words.get(add.toString())] = 1;
						result[words.get(add.toString())][current] = 1;
					}
				}
			}
		}
		
		return result;
	}

	public int numMultiples(int[] data)
	{
		int numMult = 0;
		
		for (int i = 0; i < data.length; i++)
		{
			for (int j = i + 1; j < data.length; j++)
			{
				if ((data[i] % data[j]) == 0 || (data[j] % data[i]) == 0)
				{
					numMult++;
				}
			}
		}
		
		return numMult;
	}
	
	public static void main(final String[] the_args)
	{
		BruteForce bf = new BruteForce();
		
		int[] data = {2, 5, 12, 3, 11, 16};
		System.out.println(bf.numMultiples(data) + "\n");
		
		// change, add or subtract one character so that the word will connect to other word
		// and generate a matrix out of it.
		String[] words = {"cat", "dog", "her", "yes", "car", "yep", "cap", "door", "do", "don",
				"con", "can", "yap", "hear", "ear", "smear", "shear", "shore", "share",
				"maid", "well", "and", "add", "aid", "yell", "mellow", "yellow", "hello",
				"mallow", "allow", "hallow", "bell", "sell", "seal", "sea", "mad",
				"ad", "at"};
		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
							'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
							'w', 'x', 'y', 'z'};

		HashMap<String, Integer> words_map = new HashMap<String, Integer>();

		// put the words set into a map structure.
		for (int i = 0; i < words.length; i++)
		{
			words_map.put(words[i], i);
		}

		int[][] word_matrix = bf.generateWordsMatrix(words_map, alphabet);

		System.out.println("The words set matrix:\n");
		for (int i = 0; i < word_matrix.length; i++)
		{
			for (int j = 0; j < word_matrix[i].length; j++)
			{
				System.out.print(word_matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
