package data;
	import java.lang.*;
public class Test06 {
	public static void main(String[]args) {
	//편의점에서 삼각김밥을 개당 900원에 팔고 있습니다.
	//잘 안팔려서 1+1행사를 하고 진행하고 있습니다.
	//5개를 사면 얼마일지 계산하여 출력해보세요.
	//점원은 더 가져오라는 말을 하지 않습니다.

	int priceSg=900;
	int boughtSg = 6;

	//이건 버림이다 올림을 해야한다.
	//int totalPrice=(boughtSg/2)*priceSgEvent;
	//System.out.println("구매가격 = " + totalPrice +"원"); 
	
	int totalPrice=((boughtSg+1)/2)*priceSg;
	System.out.println("구매가격 = " + totalPrice +"원"); 
	 
		
	}
}
