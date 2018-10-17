/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;



import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
/**
 * Abstract class BaseDAO
 */
public abstract class BaseDAO {
	private DataSource dataSource = null;
	private NamedParameterJdbcTemplate namedParamJdbcTemplate = null;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(final DataSource dataSource) {
		this.dataSource = dataSource;
		if(namedParamJdbcTemplate == null) {
			namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
		}
	}

	public NamedParameterJdbcTemplate getNamedParamJdbcTemplate() {
		return namedParamJdbcTemplate;
	}


}