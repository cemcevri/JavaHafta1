package sayıAsalMı;



public class sayıAsalMı {

	public static void main(String[] args) {

		
		

		int say = 25;
		
		if(say == 1) {
			System.out.println("Asal Değildir..");
			return;
		}
		if(say < 2) {
			System.out.println("Geçersiz sayı..");
		}
		
		
		int number = 25;
		int remainder = number % 2;
		System.out.println(remainder);

		boolean isPrime = true;

		for (int i = 2; i < say; i++) {

			if (say % i == 0) {

				isPrime = false;

			}

		}
		if (isPrime) {
			System.out.println("Sayı asaldır..");
		} else {

			System.out.println("Sayı asal değildir..");

		}
	}
}
