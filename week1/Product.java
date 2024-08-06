package Ecommerceapp;

public class Product {
		private String ProductName;
		private String ProductID;
		private String  Cattegory;
		
		public Product(String ProductID, String ProductName, String Cattegory)
		{
			this.ProductID=ProductID;
			this.ProductName=ProductName;
			this.Cattegory=Cattegory;
		}
		public String getProductId() {
	        return ProductID;
	    }

	    public String getProductName() {
	        return ProductName;
	    }

	    public String getCategory() {
	        return Cattegory;
	    }
	    @Override
	   public String toString() {
	        return "productId=" + ProductID + ", productName=" + ProductName + ", category=" + Cattegory;
	    }
}
