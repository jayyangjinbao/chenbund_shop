package com.unbank.platform.dao.impl;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import com.unbank.platform.dao.BaseDao;

public class BaseDaoImpl implements BaseDao{

	// v1.6.7.1 注解方式进行对象依赖注入 xx 2013-11-28 start
	@Resource
	protected JdbcTemplate jdbcTemplate;
	@Resource
	protected NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Resource
	protected JdbcTemplate jdbcTemplateShop;
	@Resource
	protected NamedParameterJdbcTemplate namedParameterJdbcTemplateShop;
	
	public void setDataSource(DataSource dataSource) {
        //this.jdbcTemplate = new JdbcTemplate(dataSource);
    	//this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }
    
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}
	// v1.6.7.1 注解方式进行对象依赖注入 xx 2013-11-28 end
	
	
	public void setDataSource2(DataSource dataSource2) {
        //this.jdbcTemplate = new JdbcTemplate(dataSource);
    	//this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }
    
	public JdbcTemplate getJdbcTemplateShop() {
		return jdbcTemplateShop;
	}

	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplateShop() {
		return namedParameterJdbcTemplateShop;
	}
	
}
