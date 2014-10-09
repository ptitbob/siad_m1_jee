package fr.univ.blois.siad.m1.javaee.constrainte.ex01;

import java.util.Calendar;
import java.util.Date;

/**
 * @author: François Robert
 */
public class Person {

	private String name;

	private String surname;

	private String login;

	private Date dateOfBirth;

	private int activityCount;

	private Date memberShipBegin;

	private Date memberShipEnd;

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getActivityCount() {
		return activityCount;
	}

	public void setActivityCount(int activityCount) {
		this.activityCount = activityCount;
	}

	public Date getMemberShipBegin() {
		return memberShipBegin;
	}

	public void setMemberShipBegin(Date memberShipBegin) {
		this.memberShipBegin = memberShipBegin;
	}

	public Date getMemberShipEnd() {
		return memberShipEnd;
	}

	public void setMemberShipEnd(Date memberShipEnd) {
		this.memberShipEnd = memberShipEnd;
	}
}
