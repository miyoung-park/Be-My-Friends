package com.bemyfriend.bmf.member.user.model.vo;

import java.sql.Date;

public class UserResume {
	
	
	private String userId;
	private String school;
	private String schMajor;
	private String schScore;
	private String schStatus;
	private Date schEnroll;
	private Date schGraduate;
	private String carCom;
	private String carDept;
	private String carPosition;
	private String carEnter;
	private String carQuit;
	private String carSalary;
	private String hopeStatus;
	private String hopeWorkPlcae;
	private String hopeSalary;
	private String hoprPosition;
	private String cvlTitleFir;
	private String cvlTitleSec;
	private String cvlTitleThr;
	private String cvlContentFir;
	private String cvlContentSec;
	private String cvlContentThr;
	
	
	
	
	
	public UserResume() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	public UserResume(String userId, String school, String schMajor, String schScore, String schStatus, Date schEnroll,
			Date schGraduate, String carCom, String carDept, String carPosition, String carEnter, String carQuit,
			String carSalary, String hopeStatus, String hopeWorkPlcae, String hopeSalary, String hoprPosition,
			String cvlTitleFir, String cvlTitleSec, String cvlTitleThr, String cvlContentFir, String cvlContentSec,
			String cvlContentThr) {
		super();
		this.userId = userId;
		this.school = school;
		this.schMajor = schMajor;
		this.schScore = schScore;
		this.schStatus = schStatus;
		this.schEnroll = schEnroll;
		this.schGraduate = schGraduate;
		this.carCom = carCom;
		this.carDept = carDept;
		this.carPosition = carPosition;
		this.carEnter = carEnter;
		this.carQuit = carQuit;
		this.carSalary = carSalary;
		this.hopeStatus = hopeStatus;
		this.hopeWorkPlcae = hopeWorkPlcae;
		this.hopeSalary = hopeSalary;
		this.hoprPosition = hoprPosition;
		this.cvlTitleFir = cvlTitleFir;
		this.cvlTitleSec = cvlTitleSec;
		this.cvlTitleThr = cvlTitleThr;
		this.cvlContentFir = cvlContentFir;
		this.cvlContentSec = cvlContentSec;
		this.cvlContentThr = cvlContentThr;
	}






	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getSchMajor() {
		return schMajor;
	}
	public void setSchMajor(String schMajor) {
		this.schMajor = schMajor;
	}
	public String getSchScore() {
		return schScore;
	}
	public void setSchScore(String schScore) {
		this.schScore = schScore;
	}
	public String getSchStatus() {
		return schStatus;
	}
	public void setSchStatus(String schStatus) {
		this.schStatus = schStatus;
	}
	public Date getSchEnroll() {
		return schEnroll;
	}
	public void setSchEnroll(Date schEnroll) {
		this.schEnroll = schEnroll;
	}
	public Date getSchGraduate() {
		return schGraduate;
	}
	public void setSchGraduate(Date schGraduate) {
		this.schGraduate = schGraduate;
	}
	public String getCarCom() {
		return carCom;
	}
	public void setCarCom(String carCom) {
		this.carCom = carCom;
	}
	public String getCarDept() {
		return carDept;
	}
	public void setCarDept(String carDept) {
		this.carDept = carDept;
	}
	public String getCarPosition() {
		return carPosition;
	}
	public void setCarPosition(String carPosition) {
		this.carPosition = carPosition;
	}
	public String getCarEnter() {
		return carEnter;
	}
	public void setCarEnter(String carEnter) {
		this.carEnter = carEnter;
	}
	public String getCarQuit() {
		return carQuit;
	}
	public void setCarQuit(String carQuit) {
		this.carQuit = carQuit;
	}
	public String getCarSalary() {
		return carSalary;
	}
	public void setCarSalary(String carSalary) {
		this.carSalary = carSalary;
	}
	public String getHopeStatus() {
		return hopeStatus;
	}
	public void setHopeStatus(String hopeStatus) {
		this.hopeStatus = hopeStatus;
	}
	public String getHopeWorkPlcae() {
		return hopeWorkPlcae;
	}
	public void setHopeWorkPlcae(String hopeWorkPlcae) {
		this.hopeWorkPlcae = hopeWorkPlcae;
	}
	public String getHopeSalary() {
		return hopeSalary;
	}
	public void setHopeSalary(String hopeSalary) {
		this.hopeSalary = hopeSalary;
	}
	public String getHoprPosition() {
		return hoprPosition;
	}
	public void setHoprPosition(String hoprPosition) {
		this.hoprPosition = hoprPosition;
	}
	public String getCvlTitleFir() {
		return cvlTitleFir;
	}
	public void setCvlTitleFir(String cvlTitleFir) {
		this.cvlTitleFir = cvlTitleFir;
	}
	public String getCvlTitleSec() {
		return cvlTitleSec;
	}
	public void setCvlTitleSec(String cvlTitleSec) {
		this.cvlTitleSec = cvlTitleSec;
	}
	public String getCvlTitleThr() {
		return cvlTitleThr;
	}
	public void setCvlTitleThr(String cvlTitleThr) {
		this.cvlTitleThr = cvlTitleThr;
	}
	public String getCvlContentFir() {
		return cvlContentFir;
	}
	public void setCvlContentFir(String cvlContentFir) {
		this.cvlContentFir = cvlContentFir;
	}
	public String getCvlContentSec() {
		return cvlContentSec;
	}
	public void setCvlContentSec(String cvlContentSec) {
		this.cvlContentSec = cvlContentSec;
	}
	public String getCvlContentThr() {
		return cvlContentThr;
	}
	public void setCvlContentThr(String cvlContentThr) {
		this.cvlContentThr = cvlContentThr;
	}






	@Override
	public String toString() {
		return "UserResume [userId=" + userId + ", school=" + school + ", schMajor=" + schMajor + ", schScore="
				+ schScore + ", schStatus=" + schStatus + ", schEnroll=" + schEnroll + ", schGraduate=" + schGraduate
				+ ", carCom=" + carCom + ", carDept=" + carDept + ", carPosition=" + carPosition
				+ ", carEnter=" + carEnter + ", carQuit=" + carQuit + ", carSalary=" + carSalary + ", hopeStatus="
				+ hopeStatus + ", hopeWorkPlcae=" + hopeWorkPlcae + ", hopeSalary=" + hopeSalary + ", hoprPosition="
				+ hoprPosition + ", cvlTitleFir=" + cvlTitleFir + ", cvlTitleSec=" + cvlTitleSec + ", cvlTitleThr="
				+ cvlTitleThr + ", cvlContentFir=" + cvlContentFir + ", cvlContentSec=" + cvlContentSec
				+ ", cvlContentThr=" + cvlContentThr + "]";
	}
	
	
	
	
	

	
	
	

}
