package constructorTypes;


	public class Copyconstructor
	{
		public static void main(String[] args)
		{
			table objTable = new table(5, 40, "brown", "wood");
			table x =  new table(objTable);
			System.out.println("height: "+ x.height +
					"color: "+ x.color +
					"material: "+ x.material + 
					"weight: "+ x.weight);
		}
	}

	class table
	{
		int height;
		int weight;
		String color;
		String material;
		
		//parametrized constructor
			public table(int h,int w, String c,String m)
			{
				height = h;
				weight = w;
				color = c;
				material = m;
			}
			
			
		//copy constructor
			public table(table objTable)
			{
				height = objTable.height;
				color = objTable.color;
				weight= objTable.weight;
				material = objTable.material;
			}
		}
