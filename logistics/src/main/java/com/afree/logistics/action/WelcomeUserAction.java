/**
 * 
 */
package com.afree.logistics.action;

import java.util.logging.Logger;

/**
 * @author ToiNT
 * @since Sep 18, 2015, 9:56:19 AM
 */
public class WelcomeUserAction {
	public String execute() {
		_log.info("--------------- oki -------------------");
		return "SUCCESS";
	}

	/**
	 * log server
	 */
	private static final Logger _log = Logger.getLogger(WelcomeUserAction.class
			.getName());
}
