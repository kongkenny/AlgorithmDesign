import java.util.LinkedList;


public class Test
{
	public String printParantClass(final Class c)
	{
		if (c == null)
		{
			return "";
		}
		else
		{
			return printParantClass(c.getSuperclass()) + c.getName() + "\n";
		}
	}
	
	public void printParantClass(final String c)
	{
		if (c.equals("java.lang.Object"))
		{
			System.out.println("java.lang.Object");
		}
		else
		{
			try
			{
				printParantClass(Class.forName(c).getSuperclass().getName());
				System.out.println(Class.forName(c).getName());
			} catch (ClassNotFoundException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(final String[] the_args)
	{
		Test t = new Test();
		
		System.out.println(t.printParantClass((new LinkedList()).getClass()));
		t.printParantClass("java.util.LinkedList");
		System.out.println();
	}
}
