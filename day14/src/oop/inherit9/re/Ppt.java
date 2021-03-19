package oop.inherit9.re;

public class Ppt extends Format{
	int size;
	
	
	public Ppt(String filename) {
		super(filename);
	}

	@Override
	public void execute() {
		System.out.println("파포 실행");
	}
	
	public void infomation(){
		System.out.println(filename + filesize + size);
	}
}
