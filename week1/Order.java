package customer.sort;

public class Order {
	private int orderId;
	private String CustomerName;
	private int totalPrice;
	
	public Order(int ID, String Name, int Price)
	{
		this.orderId=ID;
		this.CustomerName=Name;
		this.totalPrice=Price;
	}
	public int getID()
	{
		return this.orderId;
	}
	public int getPrice()
	{
		return this.totalPrice;
	}
	   public String toString() {
	        return "Order [orderId=" + orderId + ", customerName=" + CustomerName + ", totalPrice=" + totalPrice + "]";

}
	   }
