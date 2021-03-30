package api.io.file;

import java.io.File;

import javax.xml.stream.events.Namespace;

public class Test02 {
	public static void main(String[] args) {
		//File 클래스를 이용해서 디렉터리 제어
		// 파일 이름을 구분지을 수 있는 이름을 
		File dir = new File("kh");
		
		System.out.println(dir.exists());
		System.out.println(dir.length()); // 폴더 크기가 없거나 내장된 기본크기를 차지한다
		System.out.println(dir.isDirectory());
		System.out.println(dir.isFile());
		
		//디렉터리는 내부 구성요소에 대한 정보를 확인 할 수 있는 명령이 있어야한다.
		//1. 이름만 확인 ---> .list() ---> String[] 또는 List<String>
		//2. 파일 정보를 확인 ---> .listFiles() ----> File[] 또는 List[File]
		for(String name : dir.list()) {
			System.out.println("name = " + name);
		}
		
		String[]names = dir.list();
		
		for(int i = 0; i<names.length; i++) {
			System.out.println("name = " + names[i]);
		}
		
		File[] files = dir.listFiles();
		for(File file : files) {
			// 안씀
		}
		
		//다른 정보도 낼 수 있다.
		for(int i =0; i<files.length; i++) {
			System.out.println(dir.isFile());
		}
		
		
	}
}
