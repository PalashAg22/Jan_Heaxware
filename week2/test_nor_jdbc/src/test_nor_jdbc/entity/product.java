package test_nor_jdbc.entity;

public class product {

	private String product_name;
	private int price;
	private int company_pid;
	public product() {
		super();
	}
	public product(String product_name, int price, int company_pid) {
		super();
		this.product_name = product_name;
		this.price = price;
		this.company_pid = company_pid;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCompany_pid() {
		return company_pid;
	}
	public void setCompany_pid(int company_pid) {
		this.company_pid = company_pid;
	}
	@Override
	public String toString() {
		return "product [product_name=" + product_name + ", price=" + price + ", company_pid=" + company_pid + "]";
	}
	
	
}
