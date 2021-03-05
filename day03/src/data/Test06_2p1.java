package data;
	import java.lang.*;
public class Test06_2p1 {
	public static void main(String[]args) {
	//편의점에서 삼각김밥을 개당 900원에 팔고 있습니다.
	//잘 안팔려서 2+1행사를 하고 진행하고 있습니다.
	// 1 : 900
	// 2~3 : 1800
	// 4~6 : 2700
	// 7~9 : 3600

	int priceSg=900;
	int boughtSg = 2;

	//이건 버림이다 올림을 해야한다.
	//int totalPrice=(boughtSg/2)*priceSgEvent;
	//System.out.println("구매가격 = " + totalPrice +"원"); 
	
	int totalPrice=((boughtSg+2)/2)*priceSg;
	System.out.println("구매가격 = " + totalPrice +"원"); 
	 
		
	}
}
