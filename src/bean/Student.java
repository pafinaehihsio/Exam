package bean;

import java.io.Serializable;

public class Student implements Serializable{

	private String no;
	private String name;
	private String entYear;
	private String classNum;
	private String isAttend;
	private String school;

	public String getNo(){
		return no;
	}
	public void setNo(String no){
		this.no = no;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getEntYear(){
		return entYear;
	}
	public void settEntYear(String entYear){
		this.entYear = entYear;
	}
	public String getClassNum(){
		return classNum;
	}
	public void setClassNum(String classNum){
		this.classNum = classNum;
	}
	public String getIsAttend(){
		return isAttend;
	}
	public void setIsAttend(String isAttend){
		this.isAttend = isAttend;
	}
	public String getSchool(){
		return school;
	}
	public void setSchool(String school){
		this.school = school;
	}

}