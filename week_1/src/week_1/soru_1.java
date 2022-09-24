package week_1;
import java.util.*;
public class soru_1 {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		System.out.print("Öğrencinin Notunu Giriniz: ");
		String s = girdi.next();
		int not = Integer.parseInt(s);
		if((not >= 0) && (not <= 30)){
		System.out.println( " Öğrencinin harf notu FF");
		}
		else if((not >= 35 ) && (not <= 50)){
		System.out.println(" Öğrencinin harf notu DC");
		}
		else if((not >= 51 ) && (not <= 70)){
		System.out.println(" Öğrencinin harf notu BB");
		}
		else{
		System.out.println(" Öğrencinin harf notu AA");
		}
			
	}
	
}

