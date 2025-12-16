package Activity.M3_Activities.Activity2;
import java.util.HashSet;
import java.util.Scanner;

public class M3_Activity2 {
	
	static void myMethod() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int opt=0;
	//initialize the Hashset
		
		HashSet<String> product = new HashSet<String>();
		product.add("Laptop");
		product.add("Mouse");
		product.add("Keyboard");
		product.add("Monitor");
		product.add("Printer");
		
		while (opt !=4) {

		System.out.println("1. Search a product:");
		System.out.println("2. Add a product ");
		System.out.println("3. Print all product and count");
		System.out.println("4. Exit");
		 opt = input.nextInt();
		
		if (opt==1) 
			{
			//to search a product
			System.out.println("Enter a product to search: ");
				String prod=input.next();
				if(product.contains(prod))
					{
				System.out.println("Product found:"+prod);
					} else {
				
					System.out.println("Product not found:");
					}	
				}
				
		 else if  (opt==2)
			{
			 // to add the product to hashset
			 System.out.println("Enter product to add:");
			 String addProd= input.next();
			 product.add(addProd);
			 System.out.println("Product Successfully added:"+addProd);
			}
		 else if (opt==3) 
		 	{
			 //to print all the product in hashset
			 System.out.println("All product : ");
			 for (String displayProd :product) 
			 	{
				 System.out.println(displayProd);
			 	}
			 
		 	} else if (opt==4) 
		 	{
		 		// exiting the programm
		 		System.out.println("Exiting .....");
		 	}
		 	else {
		 		System.out.println("Invalid option");
		 	}
			}

	}

}


