package com.commons.manager.objectmanagers;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

public interface ObjectManagerContext {
	public void persist(Object o);
	public void merge(Object o);
	
	<E extends Object> E getSingleResult(Class<E> entityClass,
			String sql, Object... args);
	
	<E extends Object> List<E> getResultList(Class<E> entityClass,
			String sql, Object... args);
	
	<E extends Object> TypedQuery<E> createQuery(String sql, Class<E> entityClass);
	<E extends Object> TypedQuery<E> createQuery(String sql);
	
	public void executeQuery(Query query);
	
	public void executeUpdate(String sql, Object... args);
}
