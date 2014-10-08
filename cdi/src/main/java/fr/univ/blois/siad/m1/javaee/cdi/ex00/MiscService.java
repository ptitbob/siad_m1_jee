package fr.univ.blois.siad.m1.javaee.cdi.ex00;

/**
 * @author : François Robert
 */
public class MiscService {

	private String testSentence;

	public MiscService() {
		testSentence = "";
	}

	public String getTestSentence() {
		return testSentence;
	}

	public void setTestSentence(String testSentence) {
		this.testSentence = testSentence;
	}
}
