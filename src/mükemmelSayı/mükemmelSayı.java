package mükemmelSayı;

public class mükemmelSayı {

	public static void main(String[] args) {
		
			int number = 100 ;
			int total = 0;
			for (int i = 1 ; i < number ; i++) {
				
				if(number % i == 0) {
					
					total += i ;
					
				}
		
			}
			if(total == number) {
				
				System.out.println(number +  " mükemmel sayıdır .. ");
				
			}
			else {
				System.out.println(number + " mükemmel sayı değildir .. ");
			}

	}

}
