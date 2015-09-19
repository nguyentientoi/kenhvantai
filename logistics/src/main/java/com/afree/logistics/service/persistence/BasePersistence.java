/**
 * 
 */
package com.afree.logistics.service.persistence;

import com.afree.logistics.model.BaseModel;

/**
 * @author ToiNT
 * @since Sep 18, 2015, 10:20:30 PM
 */
public interface BasePersistence<T extends BaseModel<T>> {

	public T update(T model) throws Exception;

	public T remove(T model) throws Exception;
}
