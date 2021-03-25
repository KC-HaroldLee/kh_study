package api.lang.etc;

public class Test01 {
	public static void main(String[] args) {
		//시스템의 통로를 이용할 수 있다.
		//-표준 출력 스트림 System.out
		//-표준 에러스트림 System.err
		//-표준 입력스트림 System.in
		
		//시스템은 시간을 불러올 수 있다.
		//기준시 :1970-01-01;
		//currentTimeMillis()는 밀리초
		
		System.out.println(System.getProperty(null));
		
		//프로그램 종료
		System.exit(0);
	}
}
