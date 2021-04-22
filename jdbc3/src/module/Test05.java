package module;

import java.sql.Date;
import java.sql.SQLException;

import beans.ProductDao;

public class Test05 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Q. product에 상품정보를 등록하는 코드를 구현
		int no = 12;
		String name = "홈런볼2";
		String type = "과자";
		int price = 1500;
		//String으로 된다 기억하자.
		Date made = new Date(2020-05-05);
		Date expire =new Date(2021-05-05); //sql? util?
		
		ProductDao productDao = new ProductDao();
		productDao.resistItem(no, name, type, price, made, expire);
		
		
		//출력
		System.out.println("완료");
	}
}
