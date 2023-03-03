package oopsconcepts;

public class Employee{
	private String name;
	private char gender;
	private double yearsofexperience;
	private String designation;
	private double basicsalary;
	private String status;
	public Employee(String name, char gender, int yearofexperience){
		this.name=name;
		this.gender=gender;

		this.yearsofexperience=yearofexperience;
		if(this.yearsofexperience>=3) {
			this.designation="ITA";
			this.basicsalary=15000;
		}else
		{
			this.designation="ASE";
			this.basicsalary=10000;

		}
		this.status="active";
	}

	public double promoteEmp(){
		if(designation =="ASE"){
			designation="ITA";
			basicsalary=(basicsalary*0.05)+basicsalary;}
		else if(designation =="ITA"){
			designation="AST";
			basicsalary=(basicsalary*0.08)+basicsalary;
		}else 
			if(designation =="AST"){
				designation="ASC";
				basicsalary=(basicsalary*0.1)+basicsalary;
			}

		return basicsalary;				
	}
	public void applyForLWP() {
		status="inactive";
		basicsalary=0;
	}
}