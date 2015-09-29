/**
 * 
 */
package com.afree.logistics.service.persistence;

import com.afree.core.exception.SystemException;
import com.afree.logistics.model.BaseModel;

/**
 * @author ToiNT
 * @since Sep 18, 2015, 10:20:30 PM
 */
public interface BasePersistence<T extends BaseModel<T>> {

	public T save(T model) throws SystemException;

	public T update(T model) throws Exception;

	public void delete(T model) throws Exception;
}
