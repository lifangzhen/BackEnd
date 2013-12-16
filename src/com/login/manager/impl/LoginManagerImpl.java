package com.login.manager.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.login.manager.LoginManager;

public class LoginManagerImpl extends SqlMapClientDaoSupport implements LoginManager {

	@Override
	public void getName(String id) {
		String ss = "abc";
		System.out.println(ss);
		Map<String,Object> param = new HashMap<String, Object>();
		param.put("merchantId", "10010200016");
		Integer aa = (Integer)getSqlMapClientTemplate().queryForObject("login.getCouponAmount",param);
		System.out.println("aa:"+aa);
	}

}
