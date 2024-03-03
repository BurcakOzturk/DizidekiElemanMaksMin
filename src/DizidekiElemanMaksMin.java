import java.util.Scanner;
import java.util.Arrays;

public class DizidekiElemanMaksMin {

	public static void main(String[] args) {
	
		int[] list = {15,12,788,1,-1,-778,2,0};
		int [] kck = {1,1,1,1,1,1,1,1};
		int [] byk = {1,1,1,1,1,1,1,1};
		
		int buyukKonum=0,kucukKonum=0;
	
		int sayi;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Dizi : " + Arrays.toString(list));
		
		System.out.println(" n sayı giriniz : ");
		
		sayi = input.nextInt();
		
		for (int i = 0; i<=byk.length-1; i++) {		
			byk[i]= list[i]-sayi;					
		}
		
		for (int i = 0; i<=kck.length-1; i++) {
			kck[i]=sayi-list[i];
		}
		
		System.out.println("Dizi : " + Arrays.toString(byk));
		System.out.println("Dizi : " + Arrays.toString(kck));

		//if(sayi>)
		
		for (int k=1 ; k<=byk.length-1; k++) {			
			if(byk[k]>=0) {				
				if (byk[k]<byk[k-1]) {					
					buyukKonum=k;		
				}				
			}			
		}
		
		for (int m=1 ; m<=kck.length-1; m++) {	
			//System.out.println("deneme");
			if(kck[m]>=0) {	
				//System.out.println("deneme2");

				if (kck[m]<kck[m-1]) {
					//System.out.println("deneme3");

					kucukKonum=m;	
					
					//System.out.println(kucukKonum);
				}				
			}			
		}

		System.out.println("Girilen sayıdan büyük en yakın sayı : "+list[buyukKonum]);
		System.out.println("Girilen sayıdan büyük en yakın sayı : "+buyukKonum);

		System.out.println("Girilen sayıdan küçük en yakın sayı : "+list[kucukKonum]);
		System.out.println("Girilen sayıdan küçük en yakın sayı : "+kucukKonum);

     
        }
	}


