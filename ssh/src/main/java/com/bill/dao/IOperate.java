package com.bill.dao;

import java.util.List;

public interface IOperate<T> {
	public int save(T obj);
	public List<T> ListByExpress(String str);
}
