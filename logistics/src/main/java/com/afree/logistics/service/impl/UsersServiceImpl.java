/**
 * 
 */
package com.afree.logistics.service.impl;

import java.util.List;

import com.afree.core.exception.SystemException;
import com.afree.logistics.model.Users;
import com.afree.logistics.service.UsersService;
import com.afree.logistics.service.persistence.UsersPersistence;

/**
 * @author ToiNT
 * @since Sep 18, 2015, 10:07:41 PM
 */
public class UsersServiceImpl extends BaseServiceImpl implements UsersService {
	private UsersPersistence userPersistence;

	public UsersPersistence getUserPersistence() {
		return userPersistence;
	}

	public void setUserPersistence(UsersPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	@Override
	public Users addNew(Users users) throws SystemException {
		try {
			return userPersistence.update(users);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Users update(Users users) throws SystemException {
		try {
			return userPersistence.update(users);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void delete(long id) {
	}

	@Override
	public void delete(Users users) {
	}

	@Override
	public List<Users> findAll() {
		return null;
	}

}
