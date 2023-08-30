package org.sp.mybatisjoin.domain;

import java.util.List;

public class Dept {
	private int deptno;
	private String dname;
	private String loc;
	private List<Emp> empList; // 부모 중심으로 데이터를 가져올 때
	
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public List<Emp> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Emp> empList) {
		this.empList = empList;
	}
	
	
	
	
	
}
