package Activity.M3_Activities.Activity3;
import java.util.Scanner;
import java.util.HashMap;

public class M3_Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initializing Hashmap
		HashMap<String, Integer> product = new HashMap<>();
		Scanner input=new Scanner(System.in);
		
		int opt=0;
		// Adding value to hashmap
		product.put("Laptop",20000);
		product.put("Mouse",500);
		product.put("Keyboard",500);
		product.put("Monitor",1500);
		product.put("Printer",3500);
		while (opt !=5) {

			System.out.println("1. Search a product:");
			System.out.println("2. Add a product ");
			System.out.println("3. Print all product and count");
			System.out.println("4. Find the Cheapest product");
			System.out.println("5. Exit");
			 opt = input.nextInt();
		
		//seach a product inside the hashmap
		if (opt==1) 
			{
			System.out.print("Enter product name to search:");
			String prod=input.next();
			boolean valueExists = product.containsKey(prod);
			if( valueExists==true)
				{
				System.out.println("Product found! Price:"+product.get(prod));
				System.out.println("=======================");
				}
			else 
				{
				System.out.println("Product not found");
				System.out.println("=======================");
				}
			}
		//Adding product in Hashmap
		else if (opt==2)
			{
				System.out.println("Enter product to add:");
				String addProd= input.next();
				System.out.print("Enter price:");
				Integer price =input.nextInt();
				product.put(addProd, price);
				System.out.println("Product added:"+addProd);
			}
		//display all product inside hashmap
		else if (opt==3)
			{
			for (String displayProd :product.keySet()) 
		 		{
					System.out.println(displayProd+" - "+product.get(displayProd));
		 		}
			}
		//Searching the lowest value inside the hashmap
		else if (opt==4)
			{
				int cheapestPrice =9999;
				String cheapestprod="";
				
				for (String displayProd :product.keySet()) 
		 		{
					if (cheapestPrice>product.get(displayProd))
						{
							cheapestPrice=product.get(displayProd);
							cheapestprod=displayProd;
						}
					
		 		}
				System.out.println("the Cheapest product is: "+cheapestprod+" - "+cheapestPrice);
				//for (int i)
				//System.out.println("The cheapest product is:"+product.);
				
			}
		else if (opt==5)
			{
				System.out.println("Exiting .....");
			}
		else 
			{
				System.out.println("Invalid option");
			}
	} 

}
}