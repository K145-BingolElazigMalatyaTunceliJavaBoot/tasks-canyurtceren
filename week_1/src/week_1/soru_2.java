package week_1;
public class soru_2 {
	public static void main(String[] args) {
		int sonuç =0;
		for(int i=3; i<=100; i++) {
			int s = 0; 
			for(int y=2; y<=100; y++) {
				if(i%y==0) {
					s++;
				}
			if(s==1) {
				sonuç = sonuç+i;				
			}
			}
		}
		System.out.print("3 ile 100 arasındaki asal sayıların toplamı "+ sonuç);
		
	}

}
