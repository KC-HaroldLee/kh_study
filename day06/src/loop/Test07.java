package loop;
import java.lang.*;
public class Test07 {
	public static void main(String[] args)  {
        // 저는 욕심이 별로 없으니까 30일동안 첫날은 1원만 주시고
        // 그 다음날부터는 전날의 2배를 주시면 됩니다.
        // 노인이 받게될 일자별 금액과 마지막 잔고를 출력하세요.
        // (40일 동안 받으면 얼마인지도 계산해보세요)
        
        int money = 1;
        int total = 0;
        
        for(int i = 1; i <= 30; i++) {
            System.out.println(i + " 일차 : " + money + "원");
            money *= 2;
            total += money;
        }
        System.out.println("총 금액 : " + total + "원");
        
        long money1 = 1;
        long total1 = 0;
        
        for(int i = 1; i <= 40; i++) {
            System.out.println(i + " 일차 : " + money1 + "원");
            money1 *= 2;
            total1 += money1;
        }
        System.out.println("총 금액 : " + total1 + "원");
    }
}