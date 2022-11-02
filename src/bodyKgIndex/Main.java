package bodyKgIndex;

import java.util.Scanner;

public class Main {
	static float boy,kilo;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen boyunuzu (m) giriniz : ");
		boy = scan.nextFloat();
		System.out.println("Lütfen kilonuzu (kg) giriniz : ");
		kilo = scan.nextFloat();
		float sonucIndeks = kilo / (boy*boy);
		System.out.println("Vücut kitle indeksiniz : " + sonucIndeks);
	scan.close();
	}

}
