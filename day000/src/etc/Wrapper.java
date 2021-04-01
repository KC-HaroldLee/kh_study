package etc;

public class Wrapper {
	public static void main(String[] args) {
		int a = 1; //이런게 기본인데
		
		//int b = new int(); // 이런건 안 된다. (Syntax error on token "int", invalid ClassType)
		
		//그래서 Wrapper Class를 활용한다.
		Integer c = new Integer(20); // 박싱
		int d = c.intValue();//언박싱
		
		//변수이름만 가지고도 가능은 하다. 하지만 위에가 기본인것을 기억하자.
		Integer e = 17; // 자동 박싱
        int f = e; //자동 언박싱
        
        //참고로 int는 null이 되지 않는다.
        Integer g = null; //당연 0도 된다.
        //int h = null;
        
		Integer i = null; //
        //int j = i; // '0'으로도 받을 수 없다. null과 0 은 같은 값은 아니다.
        System.out.println(i);
		
        Integer k = 5;
        Integer l = 6;
        Integer m = k+l;
        System.out.println(m);
	}
}
