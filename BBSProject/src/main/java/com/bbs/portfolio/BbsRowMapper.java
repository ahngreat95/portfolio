package com.bbs.portfolio;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BbsRowMapper implements RowMapper<BbsDTO> {
	
	public BbsDTO mapRow(ResultSet rs, int arg1) throws SQLException{
		BbsDTO dto = new BbsDTO();
		dto.setId(rs.getString(1));
		dto.setTitle(rs.getString(2));
		dto.setContent(rs.getString(3));
		dto.setDate(rs.getString(4));
		
		return dto;
	}
	
}
