package com.bill.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.bill.dao.IOperate;
import com.bill.entity.User;



public class UserOperateImpl extends HibernateDaoSupport implements IOperate<User> {

	
	@Override
	
	public List<User> ListByExpress(String str) {
		return (List<User>) this.getHibernateTemplate().find("from User where age=?", 1);
	}
	public int save(User obj) {
		return (int) this.getHibernateTemplate().save(obj);
	}
	

}
