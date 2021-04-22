package beans;

import java.sql.Date;

public class MemberDto {
	
//안써도 만들자
	private 	int memberNo; // 이건 시퀀스가 있더라
	private String memberId;
	private String memberPw;
	private String memberNick;
	private String memberBirth;
	private String memberPhone; //어차피 조건은 오라클에서 해준다.
	private Date memberJoin; 
	private String memberEmail;
	private int memberPoint; // 기본 0
	private String memberGrade; //기본 '일반'

	
	
	public MemberDto() {
		super();
	}



	public int getMemberNo() {
		return memberNo;
	}



	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}



	public String getMemberId() {
		return memberId;
	}



	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}



	public String getMemberPw() {
		return memberPw;
	}



	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}



	public String getMemberNick() {
		return memberNick;
	}



	public void setMemberNick(String memberNick) {
		this.memberNick = memberNick;
	}



	public String getMemberBirth() {
		return memberBirth;
	}



	public void setMemberBirth(String memberBirth) {
		this.memberBirth = memberBirth;
	}



	public String getMemberPhone() {
		return memberPhone;
	}



	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}



	public Date getMemberJoin() {
		return memberJoin;
	}



	public void setMemberJoin(Date memberJoin) {
		this.memberJoin = memberJoin;
	}



	public String getMemberEmail() {
		return memberEmail;
	}



	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}



	public int getMemberPoint() {
		return memberPoint;
	}



	public void setMemberPoint(int memberPoint) {
		this.memberPoint = memberPoint;
	}



	public String getMemberGrade() {
		return memberGrade;
	}



	public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}
}
