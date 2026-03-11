package constructorTypes;

public class CreateObject 
{

	public static void q()  // method use stack memory to store data
	{
		int x=9;//local variable of q
	}
	
	public static void r()
	{
		int z=4; //local variable of r
	}
	

	public static void main(String[] args)
	{
		int x=3;
		int y=5;//local variables of main method

		new CreateObject(); /*new is an operator used to call the default constructor/method jo backend me bani thi jab createobject class bnai thi 
		now ye method call to ho gya but iska address store karna hoga so*/
		
		CreateObject s = new CreateObject(); //constructor use heap memory to store objects
		
		/*now ab yha kya hua basically jo constructor hote hai vo heap memory me data ko store krte hai object ko so object 
		ban to gaya by using operator new but now use store krna hoga and use access krna hoga so object ka kabhi koi naam nhi 
		hota hai uska address hota hai 
		createobject jo datatyoe ki jagah likha h iska matln h is class ka object ,jiska address s me store hai/reference variable use call karo thats it*/
		
		CreateObject lucky = new CreateObject();
		lucky.equals(null);
		
		
	}

}

	
