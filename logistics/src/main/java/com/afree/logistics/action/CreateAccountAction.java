/**
 * 
 */
package com.afree.logistics.action;

import com.afree.core.common.Constants;

/**
 * @author ToiNT
 * @since Sep 25, 2015, 12:26:24 AM
 */
public class CreateAccountAction {

	private String crEmail;
	private String crPassword1;
	private String crPassword2;
	private String crLastName;
	private String crFirstName;
	private String crAddress;
	private String crBirthDay;
	private String crPhone;
	private String crFax;
	private String crWebsite;

	/**
	 * register a account
	 * 
	 * @author ToiNT
	 * @since Sep 25, 2015, 11:57:53 PM
	 * 
	 * @return status
	 */
	public String create() {

		return Constants.SUCCESS;
	}

	public String getCrEmail() {
		return crEmail;
	}

	public void setCrEmail(String crEmail) {
		this.crEmail = crEmail;
	}

	public String getCrPassword1() {
		return crPassword1;
	}

	public void setCrPassword1(String crPassword1) {
		this.crPassword1 = crPassword1;
	}

	public String getCrPassword2() {
		return crPassword2;
	}

	public void setCrPassword2(String crPassword2) {
		this.crPassword2 = crPassword2;
	}

	public String getCrLastName() {
		return crLastName;
	}

	public void setCrLastName(String crLastName) {
		this.crLastName = crLastName;
	}

	public String getCrFirstName() {
		return crFirstName;
	}

	public void setCrFirstName(String crFirstName) {
		this.crFirstName = crFirstName;
	}

	public String getCrAddress() {
		return crAddress;
	}

	public void setCrAddress(String crAddress) {
		this.crAddress = crAddress;
	}

	public String getCrBirthDay() {
		return crBirthDay;
	}

	public void setCrBirthDay(String crBirthDay) {
		this.crBirthDay = crBirthDay;
	}

	public String getCrPhone() {
		return crPhone;
	}

	public void setCrPhone(String crPhone) {
		this.crPhone = crPhone;
	}

	public String getCrFax() {
		return crFax;
	}

	public void setCrFax(String crFax) {
		this.crFax = crFax;
	}

	public String getCrWebsite() {
		return crWebsite;
	}

	public void setCrWebsite(String crWebsite) {
		this.crWebsite = crWebsite;
	}

}
