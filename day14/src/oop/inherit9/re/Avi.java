package oop.inherit9.re;

public class Avi extends Media{
	protected int speed;
	
	//getter
	public int getSpeed() {
		return speed;
	}
	//setter
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Avi(String filename) {
		super(filename);
	}

	@Override
	public void forward() {
		System.out.println("영상 빨리감기");
		
	}

	@Override
	public void rewind() {
		System.out.println("영상 되감기");
		
	}

	@Override
	public void execute() {
		System.out.println("영상을 " + speed + "배속으로 재생합니다.");
		
	}

	
}
