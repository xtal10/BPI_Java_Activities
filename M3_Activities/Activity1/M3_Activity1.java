package Activity.M3_Activities.Activity1;
import java.util.ArrayList;
import java.util.Scanner;

public class M3_Activity1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> product = new ArrayList<String>();
		
		Scanner input = new Scanner(System.in);
		
		

		product.add("Laptop");
		product.add("Mouse");
		product.add("Keyboard");
		product.add("Monitor");
		product.add("Printer");
		
		System.out.println("All product :");
		for (int i=0 ; i<=product.size()-1;i++)
		{
		
			System.out.println(i+1+". "+product.get(i));
		}
		
		
		System.out.println("\nAfter Adding and Removing product");
		product.add("Webcam");
		product.remove(1);
		
		System.out.println("All product :");
		for (int i=0 ; i<=product.size()-1;i++)
		{
		
			System.out.println(i+1+". "+product.get(i));
		}
		
		System.out.print("Enter product to search:");
		String prod=input.next();
		
			
			if(product.contains(prod)){
			System.out.println("Product found:"+prod);
		} else {
			
			System.out.println("Product not found:");
		}
		
		
		
		

	}

}
