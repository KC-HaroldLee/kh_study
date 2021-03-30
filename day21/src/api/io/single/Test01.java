package api.io.single;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws Exception {
		//목표: kh라는 폴더안에 single.gp라는 이름의 파일을 만들고 원하는 내용을 byte단위로 출력.
		//그래서 유니코드는 불가능하다.
		//준비물. : 파일 객체와, (만드는거니까) 출력통로
		
		//파일 객체
		File target = new File("kh", "single.gp");
		
		//스트림
		FileOutputStream out = new FileOutputStream(target, true);
		
		//프로그램 ----> out ----> target---->[single.gp]
		//덮어쓰기다.
		out.write(65);//out 으로 65라는 byte 데이터를 출력하라!
		out.write('B'); // 작은 따옴표
		out.write(9); // \t
		out.write('h'); 
		out.write('e'); 
		out.write('l'); 
		out.write('l');
		out.write('o');
		out.write(10); //enter
		
		out.write(30000); //byte 벗어난 값 int를 넣어도 byte로 캐스팅 된다.
		out.write(29999);
		out.write(29998);
		
		
		
		//통로는 close해야한다.
		out.close();
	}
}
