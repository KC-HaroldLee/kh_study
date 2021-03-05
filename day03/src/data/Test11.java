package data;
	import java.lang.*;
public class Test11 {
	public static void main (String[]args) {	
		//BMI계산
			//체질량지수, 계산은 체중(kg) / 키(m)^2 / 로 구합니다. 
			//키 180cm, 체중 80kg인 사람의 지수를 구하세요.
		
		int height = 180;
		int weight = 80;
		
		double heightM = height/100f; // m로 환산하며 실수로 바꾸기
		double heightSq=heightM*heightM; // 제곱
		
		System.out.println(heightM);
		double bmi = (weight / heightSq);
		
		System.out.println("BMI 수치 : " + bmi);
		
	}
}
