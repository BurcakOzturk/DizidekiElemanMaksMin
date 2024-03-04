import java.util.Scanner;

import java.util.Arrays;

public class DizidekiElemanMaksMin {

	public static void main(String[] args) {
	
		int[] list = {15,12,788,1,-1,-778,2,0};
		int sayi,buyukSayi=0,kucukSayi=0;
		Scanner input= new Scanner (System.in);
		
		System.out.println(Arrays.toString(list));
		
		System.out.print("sayi giriniz : ");
		
		sayi = input.nextInt();		
		
		Arrays.sort(list);
		
        for (int i=0 ; i<list.length ; i++) {        	 
        	if(sayi>list[i]) {        		 
        		kucukSayi=list[i];        		 
        	}
        }        
 
        for (int j=list.length-1 ; 0<=j ; j--) {
        	if(sayi<list[j]) {
        		buyukSayi=list[j];
        	}
        }
         
        System.out.println(sayi+" sayısından bir adım küçük olan dizi elemanı : "+kucukSayi);
        System.out.println(sayi+" sayısından bir adım büyük olan dizi elemanı : "+buyukSayi);

	}
}
	


