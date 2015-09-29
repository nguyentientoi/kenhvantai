/**
 * 
 */
package com.afree.logistics.service;

import java.util.List;

import com.afree.core.exception.SystemException;
import com.afree.logistics.model.Users;

/**
 * @author ToiNT
 * @since Sep 18, 2015, 10:07:06 PM
 */
public interface UsersService extends BaseService {

	public Users addNew(Users users) throws SystemException;

	public Users update(Users users) throws SystemException;

	public void delete(long id) throws SystemException;

	public void delete(Users users) throws SystemException;

	public List<Users> findAll() throws SystemException;

}
