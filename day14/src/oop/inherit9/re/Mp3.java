package oop.inherit9.re;
	
public class Mp3 extends Media{

	public Mp3(String filename) {
		super(filename);
	}
	

	@Override
	public void forward() {
		System.out.println("음악을 빨리감기");
		
	}

	@Override
	public void rewind() {
		System.out.println("음악을 되감기");		
	}

	@Override
	public void execute() {
		System.out.println("음악을 재생");		
		
	}

}
