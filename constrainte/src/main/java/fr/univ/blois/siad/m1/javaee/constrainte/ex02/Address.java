package fr.univ.blois.siad.m1.javaee.constrainte.ex02;

/**
 * @author: François Robert
 */
public class Address {

	private String street1;

	private String street2;

	/**
	 * Code postal français
	 */
	private String zipcode;

	private String city;

	public Address() {
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
