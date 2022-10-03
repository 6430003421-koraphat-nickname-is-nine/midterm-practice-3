package logic;

public class OfficeWorker extends Employee{
	private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public OfficeWorker(String name,int id,String department) {
		super(name,id,30);
		this.setDepartment(department);
	}

	@Override
	public int computeSalary() {
		// TODO Auto-generated method stub
		return calculateMonthlySalary(this.getBaseSalary(),this.getBonus(), 20);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return getOfficeWorkerDescription(this.getId(),this.getName(),this.getDepartment(),this.getBonus());
		
	}

}
