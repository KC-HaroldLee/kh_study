package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test05 {
	public static void main(String[] args) throws IOException {
		//목표 : 싱글바이트 입력을 여러개 묶어서 처리
		//가져올 크기 몇개씩 가져올까? (버퍼크기)
		
		//준비물 : 파일, 스트림, 버퍼
		File target = new File("kh", "single2.kh");
		FileInputStream in = new FileInputStream(target);
		
		byte [] buffer = new byte [5];
		
		in.read(buffer); //buffer에 가능한 모든 데이터를 순서대로 채워라!
		System.out.println(Arrays.toString(buffer));
		
		in.read(buffer);
		System.out.println(Arrays.toString(buffer));
		
		in.read(buffer);
		System.out.println(Arrays.toString(buffer));
		
		
		
		in.close();
	}
}
