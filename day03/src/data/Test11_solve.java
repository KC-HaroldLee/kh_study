package data;
	import java.lang.*;
public class Test11_solve {
	public static void main (String[]args) {	
		//BMI계산
			//체질량지수, 계산은 체중(kg) / 키(m)^2 / 로 구합니다. 
			//키 180cm, 체중 80kg인 사람의 지수를 구하세요.
		
		//입력
		int height = 180;
		int weight = 80;
		
		
		//계산	
		
		//float heightM = height / 100.0f;
		float heightM = (float)height / 100;
		 
		float bmi = weight / (heightM * heightM); //난 이게 좋다.
		//float bmi = weight / height / height;
		
		//출력
		System.out.println	("BMI 수치는" + bmi + "입니다.");
	}
}
