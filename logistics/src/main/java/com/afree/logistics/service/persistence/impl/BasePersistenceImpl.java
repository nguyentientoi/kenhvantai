/**
 * 
 */
package com.afree.logistics.service.persistence.impl;

import java.sql.Connection;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import javax.naming.NamingException;
import javax.naming.Reference;

import org.hibernate.Cache;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
import org.hibernate.StatelessSessionBuilder;
import org.hibernate.TypeHelper;
import org.hibernate.boot.spi.SessionFactoryOptions;
import org.hibernate.engine.spi.FilterDefinition;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.metadata.CollectionMetadata;
import org.hibernate.stat.Statistics;

import com.afree.logistics.model.BaseModel;
import com.afree.logistics.service.persistence.BasePersistence;

/**
 * @author ToiNT
 * @since Sep 18, 2015, 10:21:05 PM
 */
public class BasePersistenceImpl<T extends BaseModel<T>> implements
		BasePersistence<T>, SessionFactory {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2350403366602641728L;

	public Reference getReference() throws NamingException {
		return _sessionFactory.getReference();
	}

	public SessionFactoryOptions getSessionFactoryOptions() {
		return _sessionFactory.getSessionFactoryOptions();
	}

	public SessionBuilder withOptions() {
		return _sessionFactory.withOptions();
	}

	public Session openSession() throws HibernateException {
		return _sessionFactory.openSession();
	}

	public Session getCurrentSession() throws HibernateException {
		return _sessionFactory.getCurrentSession();
	}

	public StatelessSessionBuilder withStatelessOptions() {
		return _sessionFactory.withStatelessOptions();
	}

	public StatelessSession openStatelessSession() {
		return _sessionFactory.openStatelessSession();
	}

	public StatelessSession openStatelessSession(Connection connection) {
		return _sessionFactory.openStatelessSession();
	}

	public ClassMetadata getClassMetadata(Class entityClass) {
		return _sessionFactory.getClassMetadata(entityClass);
	}

	public ClassMetadata getClassMetadata(String entityName) {
		return _sessionFactory.getClassMetadata(entityName);
	}

	public CollectionMetadata getCollectionMetadata(String roleName) {
		return _sessionFactory.getCollectionMetadata(roleName);
	}

	public Map<String, ClassMetadata> getAllClassMetadata() {
		return _sessionFactory.getAllClassMetadata();
	}

	public Map getAllCollectionMetadata() {
		return _sessionFactory.getAllClassMetadata();
	}

	public Statistics getStatistics() {
		return _sessionFactory.getStatistics();
	}

	public void close() throws HibernateException {
		_sessionFactory.close();
	}

	public boolean isClosed() {
		return _sessionFactory.isClosed();
	}

	public Cache getCache() {
		return _sessionFactory.getCache();
	}

	public Set getDefinedFilterNames() {
		return _sessionFactory.getDefinedFilterNames();
	}

	public FilterDefinition getFilterDefinition(String filterName)
			throws HibernateException {
		return _sessionFactory.getFilterDefinition(filterName);
	}

	public boolean containsFetchProfileDefinition(String name) {
		return _sessionFactory.containsFetchProfileDefinition(name);
	}

	public TypeHelper getTypeHelper() {
		return _sessionFactory.getTypeHelper();
	}

	public T update(T model) throws Exception {
		return null;
	}

	public T remove(T model) throws Exception {
		return null;
	}

	private SessionFactory _sessionFactory;

	private static final Logger _log = Logger
			.getLogger(BasePersistenceImpl.class.getName());

}
