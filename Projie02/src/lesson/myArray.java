package lesson;


public class myArray{
	public static void main(String[] args){
		String[] fruit = {"Apples", "Bananas", "Grapes", "Avocados"};
		
		//for(int i = 0; i < 4; i++) {
			//System.out.println(fruit[i]);
		int i = 0;
		
		boolean favFound = false;
		while (!favFound) {
			String fav = fruit[i];
			System.out.println(fav);
			if (fav == "Grapes") {
			System.out.println("fav is found!!");
			favFound = true;				
			
		}
		i++;
		
		
	}
		}
	
}

