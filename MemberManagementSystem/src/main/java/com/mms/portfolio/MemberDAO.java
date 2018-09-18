package com.mms.portfolio;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<MemberDTO> selectAll() throws Exception {
		String sql = "select * from member";
		return jdbcTemplate.query(sql, new MemberRowMapper());
	}

	public MemberDTO select(MemberDTO dto) throws Exception {
		String sql = "select * from member where id = ?";
		Object[] object = {dto.getId()};
		return jdbcTemplate.queryForObject(sql, object, new MemberRowMapper());
	}
	
	public void update(MemberDTO dto) throws Exception {
		String sql = "update member set tel = ? where id = ?";
		jdbcTemplate.update(sql, dto.getTel(), dto.getId());
		System.out.println("update() ok..=======");
	}

	public void updateAll(MemberDTO dto) throws Exception {
		String sql = "update member set pw = ?, name = ?, tel = ? where id = ?";
		jdbcTemplate.update(sql, dto.getPw(), dto.getName(), dto.getTel(), dto.getId());
		System.out.println("updateAll() ok..=======");
	}
	
	public void delete(MemberDTO dto) throws Exception {
		String sql = "delete from member where id = ?";
		jdbcTemplate.update(sql, dto.getId());
		System.out.println("delete() ok..=======");
	}

	public void insert(MemberDTO dto) throws Exception {
		String sql = "insert into member values (?,?,?,?)";
		jdbcTemplate.update(sql, dto.getId(), dto.getPw(), dto.getName(), dto.getTel());
		System.out.println("insert() ok..=======");
	}

}
