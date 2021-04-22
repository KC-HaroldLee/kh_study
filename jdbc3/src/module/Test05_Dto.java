package module;

import java.sql.Date;
import java.sql.SQLException;

import beans.ProductDao;
import beans.ProductDto;

public class Test05_Dto {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Q. product에 상품정보를 등록하는 코드를 구현
		ProductDto productDto = new ProductDto();
		productDto.setNo(11); //아 시퀀스 만들걸
		productDto.setName("빨래비누");
		productDto.setType("생활");
		productDto.setPrice(5000); 
		productDto.setMade("2020-05-05"); 
		productDto.setExpire("2021-06-06"); 
		
		
		//출력
		System.out.println("완료");
	}
}
