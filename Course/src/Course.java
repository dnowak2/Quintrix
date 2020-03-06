
public class Course 
{	
	public String courseName;
	int i;
	float f;
	boolean b;
	
	public Course()
	{
		b = false;
		f = 100.12f;
		i = Integer.MAX_VALUE;
	}
	
	public String getter()
	{
		return courseName;
	}
	
	public void setter(String s)
	{
		courseName = s;
	}
}
