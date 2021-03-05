// 쿠폰 적용 도전이다.
package night;
	import java.lang.*; //  쓰는 연습을 하자
	import java.util.Scanner;// 음... 언젠가 자세히 배우겠지
	import java.io.IOException; // 문자열 입력때문에 넣나...?
	
public class aa_hw03 {
	public static void main(String [] args) throws IOException {
	
		//메뉴판
		int jjmEa= 5000; // 짜장면 하나 가격 (each)
		int chpEa= 6000; // 짬뽕 하나 가격
		
		//쿠폰 변수
		int dcCouponCode; // 일단 이렇게 해두고
		int dcPrc =0; // 아 어떤 값이든 일단 선언을 하니까 된다..
		// A는 2000, B는 3000 
		
		//?? 주문 개수 변수??
		int jjmAmt, chpAmt;
		
		// 주문서 입력, "계산" 앞에 두기!
		Scanner s = new Scanner(System.in);
		System.out.print("자장면 몇 그릇을 주문하시겠습니까?");
		jjmAmt =  s.nextInt(); // 여기 인트는 대문자로 시작한다.

		System.out.print("짬뽕 몇 그릇을 주문하시겠습니까?");
		chpAmt = s.nextInt(); // 짬뽕 개수

		System.out.print("할인쿠폰의 코드를 적어주세요 A or B");
		dcCouponCode = (char) System.in.read(); // 5,8행 확인
			if(dcCouponCode=='A') {// 따옴표... 있어야했지 참 
				dcPrc=2000;
				System.out.println(dcPrc+"짜리 할인 쿠폰입니다");
			}
			if(dcCouponCode=='B') {// 따옴표... 있어야했지 참 
				dcPrc=5000;
				System.out.println(dcPrc+"짜리 할인 쿠폰입니다");
			}

	//계산
	int jjmPrc=jjmEa*jjmAmt; // 짜장면 총금액 (Price)
	int chpPrc=chpEa*chpAmt; // 짬뽕 총금액
	int totalPrc=jjmEa+jjmEa;
	int payPrc=totalPrc-dcPrc; 
	/*여기서부터 계속 에러가 발생했다.
	 * 이유 : 일단 어떤값이든 할당해줘야하나보다.
	 *16행  int dcPrc; 이었는데
	 *16행 int dcPrc =0;로 바꾸니 해결
	 *처음에는 if안에서 할당된 값을 따로 빼야하나 싶어서
	 *이것저것 찾아봤는데 안되었다. 흑 아무튼 간단하게 해결 
	 */
	

	//결과
	System.out.print("자장면 ");
	System.out.print(jjmAmt +"그릇"); 
	System.out.println(jjmPrc);
	
	System.out.print("짬뽕 ");
	System.out.print(chpAmt +"그릇"); 
	System.out.println(chpPrc); 
	
	System.out.print("총금액 ");
	System.out.println(totalPrc + "원");
	
	System.out.print("사용쿠폰 ");
	System.out.println(dcPrc+ "원 할인");
	
	System.out.print("지불금액 ");
	System.out.println(payPrc + "원");
}
}