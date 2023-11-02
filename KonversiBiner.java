import java.util.*;
public class KonversiBiner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Pilih menu : ");
		System.out.println("===========================");
		System.out.println("1. Biner ke Desimal.");
		System.out.println("2. Desimal ke Biner.");
		System.out.println("3. Biner ke Heksadesimal.");
		System.out.println("4. Heksadesimal ke Biner.");
		System.out.println("5. Desimal ke Heksadesimal.");
		System.out.println("6. Heksadesimal ke Desimal.");
		System.out.println("===========================");
		int angka = scanner.nextInt();
		scanner.nextLine();
		
		switch(angka) {
		case 1 : System.out.print("Masukkan angka biner : ");
				 String biner = scanner.nextLine();
				 int desimal = Integer.parseInt(biner, 2);
				 System.out.println("Bilangan desimalnya : "+desimal);
				 break;
		case 2 : System.out.print("Masukkan angka desimal :");
				 desimal = scanner.nextInt();
				 biner = Integer.toBinaryString(desimal);
				 System.out.println("Bilangan binernya :" +biner);
				 break;
		case 3 : System.out.print("Masukkan bilangan biner : ");
				 biner = scanner.nextLine();
				 desimal = Integer.parseInt(biner,2);
				 String heksa = Integer.toHexString(desimal);
				 heksa = heksa.toUpperCase();
				 System.out.println("Bilangan heksadesimalnya : "+heksa);
				 break;
		case 4 : System.out.print("Masukkan bilangan heksadesimal : ");
				 heksa = scanner.nextLine();
				 desimal = Integer.parseInt(heksa,16);
				 biner = Integer.toBinaryString(desimal);
				 System.out.println("Bilangan binernya : "+biner);
				 break;
		case 5 : System.out.print("Masukkan angka desimal : ");
				 desimal = scanner.nextInt();
				 heksa = Integer.toHexString(desimal);
				 heksa = heksa.toUpperCase();
				 System.out.println("Bilangan heksadesimalnya : "+heksa);
				 break;
		case 6 : System.out.print("Masukkan bilangan heksadesimal : ");
				 heksa = scanner.nextLine();
				 desimal = Integer.parseInt(heksa,16);
				 System.out.println("Bilangan desimalnya : "+desimal);
				 break;
		}
		
		
	}

}
