package recap2Demo;

public class recap2 {

	public static void main(String[] args) {
		
			double[] myList	= {1.2,1.3,4.2,6.4};
			double total = 0;
			double max = myList[0];
			for(double number:myList) {
				if(max < number) {
					
					max = number;
					
				}
				System.out.println(number);
				total += number;
				
			}
			System.out.println("En büyük değer = " + max);
			System.out.println("Toplam = " + total);
	}

}
