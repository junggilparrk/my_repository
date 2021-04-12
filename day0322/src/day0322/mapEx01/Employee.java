package day0322.mapEx01;

public class Employee {
	private String name;
	private int pay;
	private String team;
	private String position;
	public Employee(String name, int pay, String team, String position) {
		super();
		this.name = name;
		this.pay = pay;
		this.team = team;
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", pay=" + pay + ", team=" + team + ", position=" + position + "]";
	}
	
}
