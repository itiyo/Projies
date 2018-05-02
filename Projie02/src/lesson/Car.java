package lesson;
public class Car
{
	public static void main(String[] args)
	{
		
		int vanPrice = 100;
		int vmpg = 10;
		int carPrice = 50;
		int cmpg = 50;
		int petrolPrice = 2;
		int miles = 50000;
		int vgasCost = (miles/vmpg) * petrolPrice;
		int cgasCost = (miles/cmpg) * petrolPrice;
		int vtotalCost = vanPrice + vgasCost;
		int ctotalCost = carPrice + cgasCost;
		
		if (ctotalCost < vtotalCost) {
			
			System.out.println("Buy car");
		}	
		
		else
			System.out.print("Buy van");
			
		}	
}