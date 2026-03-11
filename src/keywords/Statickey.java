package keywords;

public class Statickey
{
	public static void main(String[] args) 
	{
		Emp e = new Emp(20, "Avi");
		Emp f = new Emp(21, "Abhi");
		Emp g = new Emp(27, "Avni");
		e.display();
		f.display();
		g.display();
	}
}

class Emp
{
	private String name;
	private int age;
	static String company = "Amazon";
	
	public Emp(int a,String n)
	{
		age = a;
		name = n;
	}
	
	public void display()
	{
		System.out.println("age= "+age+" name= "+name+" company= "+company);
	}
}

//look ab yaha static key ka function ye hua ki jo company name hai vo sare employees ke liye common hai jo humne 
//use static keyword laga diya jiise vo baar baar ram memory me repeate nhi hora vo method area me jake store hua 

