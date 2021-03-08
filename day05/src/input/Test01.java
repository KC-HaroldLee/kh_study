package input;
import java.io.IOException;
import java.lang.*;
public class Test01 {
	public static void main(String[] args) throws IOException {		
	//System.in 을 이용하여 입력한 값을 입력받기
	// - System.in.read()을 이요하면 사용자가 입력한 ASCII 값1개를 불러 들인다.

	//System.in.read(); 하지만 공간이 없으니
	int a = System.in.read();
	int b = System.in.read();
	int c = System.in.read();
	int d = System.in.read();
	int e = System.in.read();
	int f = System.in.read();
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	System.out.println("c = " + c);
	System.out.println("d = " + d);
	System.out.println("e = " + e);
	System.out.println("f = " + f);
	}
}
