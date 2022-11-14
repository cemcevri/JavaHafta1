package switchDemo;

public class Switch {

	public static void main(String[] args) {
		
			char grade = 'A';
			
			switch(grade) {
			
			case 'A' : System.out.println("A en iyi not : geçtiniz");
			break;
			case 'B' : System.out.println("B çok güzel : geçtiniz");
			break;
			case 'C' : System.out.println("C iyi : geçtiniz");
			break;
			case 'D' : System.out.println("D fena değil : geçtiniz");
			break;
			case 'F' : System.out.println("F malesef : kaldınız");
			break;
			default : System.out.println("Geçersiz not girdiniz");
			}

	}

}
