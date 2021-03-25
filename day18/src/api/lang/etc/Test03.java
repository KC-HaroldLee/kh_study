package api.lang.etc;

import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException {
		//런타임
		//얘도 생성자가 없다.
		//하지만 멤버는 존재한다.
		//미리 만들어 놓고 만들어진 객체만 이용할 수 있도록 제한을 걸어둔 형태(생성제한)
		
		//Runtime r = new Runtime(); //직접 생성한다.
		Runtime r = Runtime.getRuntime(); //생성을 부탁한다.
		
		//exec()를 이용하면 외부 커맨드를 사용할 수 있다. ->cmd
		
		r.exec("notepad");
		//r.exec("ipconfig");
	}
}
