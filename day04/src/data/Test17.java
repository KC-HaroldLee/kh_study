package data;
	import java.lang.*;
public class Test17 {
	public static void main(String[]args) {
	
	//NCS에서는 한과목에 2개의 평가를 보도록 되어 있으며
	//특정요건을 만족해야 해당과목을 이수했다고 인정해줍니다.
	//이수기준 : 각각 과목이 40점 이상이면서, 평균 60점이상 
	//1과목이 40점, 2과목이 80점인 학생이 있을 때

	int test1 = 35;
	int test2 = 100;
	
	//일단 길게 써보자. 아니 섞어 쓰자
	//40점 이상 
	boolean minScorePass = test1 >= 40 && test2 >=40;
	
	//평균 60점 이상
	double avgSroce = (test1 + test2) /2;
	boolean avgSrocePass = avgSroce >=60;
	
	//결과
	boolean passFanal = minScorePass && avgSrocePass;
	
	System.out.println(passFanal);

	}
}
