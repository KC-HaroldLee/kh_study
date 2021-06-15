package com.kh.spring05.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring05.entity.ItemDto;

@Repository // 왜 나 안했었지?
public class ItemDaoImpl implements ItemDao {

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	@Override
	public void insert(ItemDto itemDto) {
		String sql = "insert into item values(item_seq.nextVal, ?, ?)";
		Object[]param = {itemDto.getItemName(), itemDto.getItemPrice()};
		jdbctemplate.update(sql, param);
	}

}
