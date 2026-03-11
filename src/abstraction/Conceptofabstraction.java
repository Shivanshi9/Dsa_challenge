package abstraction;

//abstract means tukda aya adhura agar koi method complete nhi h to vo jis class me bni h vo bhi cmplt nhi kehlaegi
//and us class ko koi aur access nhi kar paega untill and unless us method ko vo apni class me cmplt kre
//syntax us method ke age and class ke age abstract keyword lag jaega
//class keyword ke pehle and return type ke pehle asbstract likhna hai




public abstract class Conceptofabstraction 
{
	public abstract void hello();  //adhuri method/ abstract method
	
	public static void main(String[] args) 
	{
		
	}
}

//now if koi is abstract class ko access krna chahta h to
//class emp extends Conceptofabstraction
//{
//	//error show krega but if
//}

class emp2 extends Conceptofabstraction
{
	public void hello()
	{
		//dusri class is method ko cmplt krde to vo us class ko access kr skta hai
	}
}



//rules for abstract 
//1. agar koi abstract class ko access kr raha hai to use usi abstract method ko use krna hi hoga and use cmplt krna hoga
//2. agar koi method abstract hai to uski class bhi abstract kehlaegi
