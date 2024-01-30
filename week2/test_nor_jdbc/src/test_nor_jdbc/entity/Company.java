package test_nor_jdbc.entity;

public class Company {

	private String company_name;
	private String company_product;
	private int company_pid;
	public Company() {
		super();
	}
	public Company(String company_name, String company_product, int company_pid) {
		super();
		this.company_name = company_name;
		this.company_product = company_product;
		this.company_pid = company_pid;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getCompany_product() {
		return company_product;
	}
	public void setCompany_product(String company_product) {
		this.company_product = company_product;
	}
	public int getCompany_pid() {
		return company_pid;
	}
	public void setCompany_pid(int company_pid) {
		this.company_pid = company_pid;
	}
	@Override
	public String toString() {
		return "Company [company_name=" + company_name + ", company_product=" + company_product + ", company_pid="
				+ company_pid + "]";
	}
	
	
}
