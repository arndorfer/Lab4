
public class Lab4 
{
	public static int[] sortArray(int[] a)
	{
		int[] b = a;
		if(a == null)
		{
			throw new IllegalArgumentException("there is no array");
		}
		for(int i = 0; i < a.length;i++)
		{
			int temp = a[i];
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] < a[j])
				{
					temp = a[j];
				}
			}
			b[i] = temp;
		}
		return b;
	}
	public static void main(String[] args) 
	{
		int[] test1 = {37,12, 17, 59};
		int[] test2 = null;
		int[] test3 = {45, 10, 2, 5};
		int[] test4 = {81, 1, 42};
		int[] test5 = {20, 2, 138, 11};
		int[] sorted1 = sortArray(test1);
		int[] sorted2 = sortArray(test2);
		int[] sorted3 = sortArray(test3);
		int[] sorted4 = sortArray(test4);
		int[] sorted5 = sortArray(test5);

	}

}
