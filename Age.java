class Age
{
	public static void main(String[]x)
	{
		int a=50;
		{
		System.out.println("given age="+a);
		}
		if(a<=10)
		{
		System.out.println("the age group is of children");
		}		
		else if(a>20 && a<10) 
		{
		System.out.println("the age group is of  adult");
		}
		else if(a>30 && a<65)
		{
		System.out.println("the age group is of working age");
		}
		else
		{
		System.out.println("the age group is of senior citizen");
		}
	}
}