package customer.sort;

import java.util.Arrays;

public class Main {
	public static void main(String args[])
	{
		Order[] list= {new Order(1,"Dilip",50000),new Order(2,"Ajay",2300),
				new Order(3,"Parthiban",3500), new Order(4,"Arjun",10000), 
				new Order(5,"Sakthi",7800)};
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.Sort(list, 5);
		   for (Order order : list) {
	            System.out.println(order);
		   }
		
		
	  }
	}
		
	


