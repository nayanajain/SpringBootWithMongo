package com.example.springbootwithmongodb.model;

public class ClinicalDetails {

	private String bloodtestreport;
	private String scanreport;
	private String urinetestreport;
	public ClinicalDetails(String bloodtestreport, String scanreport, String urinetestreport) {
		super();
		this.bloodtestreport = bloodtestreport;
		this.scanreport = scanreport;
		this.urinetestreport = urinetestreport;
	}
	public ClinicalDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBloodtestreport() {
		return bloodtestreport;
	}
	public void setBloodtestreport(String bloodtestreport) {
		this.bloodtestreport = bloodtestreport;
	}
	public String getScanreport() {
		return scanreport;
	}
	public void setScanreport(String scanreport) {
		this.scanreport = scanreport;
	}
	public String getUrinetestreport() {
		return urinetestreport;
	}
	public void setUrinetestreport(String urinetestreport) {
		this.urinetestreport = urinetestreport;
	}
	
	
}
