package night;
	import java.lang.*; //  쓰는 연습을 하자
	import java.util.Scanner;// 음... 언젠가 자세히 배우겠지.
	
public class aa_hw02 {
	public static void main(String [] args) {
	
		//메뉴판
		int jjmEa= 5000; // 짜장면 하나 가격 (each)
		int chpEa= 6000; // 짬뽕 하나 가격
		
		//쿠폰 목록 근데 문자 입력은 어려워 이건 남겨두기 
		//int couponA= 2000; // 
		//int couponB= 3000; // 
		int dc;
		
		//?? 주문 개수 변수??
		int jjmAmt, chpAmt;
		
		// 주문서 입력 이걸 "계산" 뒤에 두니까 안된다.
		// 아마 값이 안들어가있는 상태라 그런가보다
		Scanner s = new Scanner(System.in);
		System.out.print("자장면 몇 그릇을 주문하시겠습니까?");
		jjmAmt =  s.nextInt(); // 여기 인트는 대문자로 시작한다.
		System.out.print("짬뽕 몇 그릇을 주문하시겠습니까?");
		chpAmt = s.nextInt(); // 짬뽕 개수
		System.out.print("할인쿠폰의 금액을 적어주세요");
		dc = s.nextInt(); // 할인금액을 무작위로 할 수있다...
		
		//계산
		int jjmPrc=jjmEa*jjmAmt; // 짜장면 총금액 (Price)
		int chpPrc=chpEa*chpAmt; // 짬뽕 총금액
		int totalPrc=jjmEa+jjmEa;
		int payPrc=totalPrc-dc; // 나중에 쿠폰 개수를 늘릴 수 있도록... 꼭...
		

		//결과
		System.out.print("자장면 "); //어제 자기전에 배운..
		System.out.print(jjmAmt +"그릇"); //더블클릭 된다. 나이스...
		System.out.println(jjmPrc); // 여기서 줄을 바꾸고
		
		System.out.print("짬뽕 ");
		System.out.print(chpAmt +"그릇"); 
		System.out.println(chpPrc); 
		
		System.out.print("총금액 ");
		System.out.println(totalPrc + "원");
		
		System.out.print("사용쿠폰 ");
		System.out.println(dc+ "원 할인"); //여기도 꼭 쿠폰 쓰도록
		
		System.out.print("지불금액 ");
		System.out.println(payPrc + "원");
		
	}
}