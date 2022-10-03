package logic;

public class Janitor extends Employee{
	private String area;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	public Janitor(String name,int id, String area) {
		super(name,id,15);
		this.setArea(area);
	}

	@Override
	public int computeSalary() {
		// TODO Auto-generated method stub
		return calculateMonthlySalary(this.getBaseSalary(),this.getBonus(),30);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return getJanitorDescription(this.getId(),this.getName(),this.getArea(),this.getBonus());
	}

}
