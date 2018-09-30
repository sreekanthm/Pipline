package com.apple.mop.test;

//@Document(indexName = "person", type = "person")
public class Person {

	// @Id
	private String dsPrsId;
	// @Field(analyzer = "keyword", store = true, index = FieldIndex.analyzed,
	// searchAnalyzer = "keyword")
	private String prsFirstNm;
	// @Field(analyzer = "keyword", store = true, index = FieldIndex.analyzed,
	// searchAnalyzer = "keyword")
	private String prsLastNm;
	// @Field(analyzer = "keyword", store = true, index = FieldIndex.analyzed,
	// searchAnalyzer = "keyword")
	private String locNm;
	/**
	 * @return the dsPrsId
	 */
	public String getDsPrsId() {
		return dsPrsId;
	}
	/**
	 * @param dsPrsId
	 *            the dsPrsId to set
	 */
	public void setDsPrsId(String dsPrsId) {
		this.dsPrsId = dsPrsId;

	}
	/**
	 * @return the prsFirstNm
	 */
	public String getPrsFirstNm() {
		return prsFirstNm;
	}
	/**
	 * @param prsFirstNm
	 *            the prsFirstNm to set
	 */
	public void setPrsFirstNm(String prsFirstNm) {
		this.prsFirstNm = prsFirstNm;
	}
	/**
	 * @return the prsLastNm
	 */
	public String getPrsLastNm() {
		return prsLastNm;
	}
	/**
	 * @param prsLastNm
	 *            the prsLastNm to set
	 */
	public void setPrsLastNm(String prsLastNm) {
		this.prsLastNm = prsLastNm;
	}
	/**
	 * @return the locNm
	 */
	public String getLocNm() {
		return locNm;
	}
	/**
	 * @param locNm
	 *            the locNm to set
	 */
	public void setLocNm(String locNm) {
		this.locNm = locNm;
	}

}
