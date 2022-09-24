package week_1;
public class soru_3 {
	public static void main(String[] agrs) {
		int değer = 0;
		for(int i =200; i<=500; i++) {
			if(!(i % 3 == 0)) {
				değer = değer + i;
			}
		}
	System.out.println(değer);
	}

}
