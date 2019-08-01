package config;

public class A {
	private String f1;
	private String f2;

	public A(String f1, String f2) {
		super();
		this.f1 = f1;
		this.f2 = f2;
	}

	public A() {
		super();
	}

	public String getF1() {
		return f1;
	}

	public void setF1(String f1) {
		System.out.println("set-f1");
		this.f1 = f1;
	}

	public String getF2() {
		return f2;
	}

	public void setF2(String f2) {
		System.out.println("set-f2");

		this.f2 = f2;
	}

}
