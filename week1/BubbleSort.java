package customer.sort;

public class BubbleSort {
	public void Sort(Order[] list,int length)
	{
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				if(list[i].getPrice()>list[j].getPrice())
				{
					Order temp=list[i];
					list[i]=list[j];
					list[j]=temp;
				}
			}
		}
	}

}
