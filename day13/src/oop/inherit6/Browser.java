package oop.inherit6;

public class Browser {
	//멤버변수
	protected String url;
	protected String version;

	//필요한 기능(공통)
	public void move() {
		System.out.println("다른 페이지로 이동합니다.");
	}

	public void refresh() {
		System.out.println("새로고침을 시도합니다.");
	}	
	
	//setter 메소드 url version 둘다 반드시 설정되어야함.
	public void set(String url, String version) {
		this.url = url;
		this.version = version;
	}
	
	}
	
