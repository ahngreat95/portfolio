package com.bbs.portfolio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class BbsDAO  {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	String INSERT = "insert into bbs values (?,?,?,?)";
	String DELETE = "delete from bbs where id = ?";
	String UPDATE = "update bbs set date = ? where id = ?";
	String SELECT = "select * from bbs where id = ?";
	String SELECT_ALL = "select * from bbs";
	

	public void insert(BbsDTO dto) {

		jdbcTemplate.update(INSERT, dto.getId(), dto.getTitle(), dto.getContent(), dto.getDate());
	}


	public void delete(BbsDTO dto) {

		jdbcTemplate.update(DELETE, dto.getId());
	}


	public void update(BbsDTO dto) {

		jdbcTemplate.update(UPDATE, dto.getDate(), dto.getId());
	}


	public BbsDTO select(BbsDTO dto) {

		Object[] args = {dto.getId()};
		return jdbcTemplate.queryForObject(SELECT, args, new BbsRowMapper());
	}


	public List<BbsDTO> selectAll() {

		return jdbcTemplate.query(SELECT_ALL, new BbsRowMapper());
	}

}
