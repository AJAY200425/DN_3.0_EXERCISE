package Ecommerceapp;

public class Main {

	public static void main(String[] args) {
		Product[] products = {
                new Product("E1", "MOBILE", "ELECTRONICS"),
                new Product("E2", "PC", "ELECTRONICS"),
                new Product("E3", "CHARGER", "ELECTRONICS"),
                new Product("A1", "EAR BUDS", "ACCESSORIES"),
                new Product("A2", "SPEAKER", "ACCESSORIES")
        };

        
        Product linearResult = LinearSearch.linearSearch(products, "E1");
        System.out.println("Linear Search Result: " + (linearResult != null ? linearResult : "Product not available"));

       
        
	}

}
