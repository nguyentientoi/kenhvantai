/**
 * 
 */
package com.afree.logistics.service.persistence.impl;

import org.hibernate.Session;

import com.afree.logistics.model.Users;
import com.afree.logistics.service.persistence.UsersPersistence;

/**
 * @author ToiNT
 * @since Sep 18, 2015, 10:21:56 PM
 */
public class UsersPersistenceImpl extends BasePersistenceImpl<Users> implements
		UsersPersistence {

	@Override
	public Users update(Users model) throws Exception {
		Session session = openSession();

		return super.update(model);
	}

}
