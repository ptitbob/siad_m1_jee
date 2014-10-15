package fr.univ.blois.siad.m1.javaee.constrainte.ex02;

import java.util.Date;

/**
 * @author: François Robert
 */
public class Customer extends User {

	/**
	 * N° de client
	 */
	private Long id;

	private Date lastPurchaseDate;

	public Customer() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getLastPurchaseDate() {
		return lastPurchaseDate;
	}

	public void setLastPurchaseDate(Date lastPurchaseDate) {
		this.lastPurchaseDate = lastPurchaseDate;
	}
}
