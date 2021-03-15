package oop.basic1;

//이 클래스는, 자바에게 "메시지가 어던 모양인지 알려주기 위해"만든다.
//메시지 = 보낸사람 + 내용 + 시간 + 안 읽은 사람 수
//메지지 = String + String + String + int
public class Message {
	
	//멤버 변수 : 객체의 내부에서 데이터를 저장하기 위한 공간.
	String sender;
	String content;
	String time;
	int remain;
}
