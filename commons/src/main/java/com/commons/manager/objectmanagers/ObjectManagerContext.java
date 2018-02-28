package com.commons.manager.objectmanagers;

import java.util.List;

public interface ObjectManagerContext {
	public void persist(Object o);
	public void merge(Object o);
	
	<E extends Object> E getSingleResult(Class<E> entityClass,
			String sql, Object... args);
	
	<E extends Object> List<E> getResultList(Class<E> entityClass,
			String sql, Object... args);
	
	public void executeUpdate(String sql, Object... args);
}
