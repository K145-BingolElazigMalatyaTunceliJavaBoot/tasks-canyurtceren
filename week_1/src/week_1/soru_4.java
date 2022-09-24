package week_1;
public class soru_4 {
	public static void main(String[] agrs) {
		int sayaç = 0; int a = 1;
		while(a<=10){
			int değer = (int)(Math.floor(Math.random() * (500 - 0 + 1)) + 0);
			System.out.println(değer);
			sayaç = sayaç +1;
			if (değer>=50 && değer<=100) {
				System.out.println("50 ile 100 arasındaki değer "+ sayaç + ". seçimde bulundu.");
				break;
			}
		}
	}
}
