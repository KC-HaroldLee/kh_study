package connect;

public class Test01 {
	public static void main(String[] args) throws ClassNotFoundException {
		//JDBC Java Database Connectivity
		//=자바에서 정보를 파일 대신 데이터베이스에 저장하기 위한 활동
		//=데이터베이스에는 "구조화된 중요 정보"를 보관한다.

		//class.forName("실행할 클래스 경로")
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("연결 성공");
	}
}
