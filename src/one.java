
public class one {
	private String Name;
	private String Id;
	private String Dream;
	private String Address;
	
	public one () {
		this.Name = "WaveBlur";
		this.Id = "5830209999";
		this.Dream = "ต้องการเป็นคนที่ทำลายกฏทุกอย่างบนโลก ยกเว้นธรรมชาติ";
		this.Address = "แถว westgate";
	}
	
	public void getName() {
		System.out.println(this.Name);
	}
	
	public void getId() {
		System.out.println(this.Id);
	}
	
	public void getAddress() {
		System.out.println(this.Address);
	}
	
	public void getDream() {
		System.out.println(this.Dream);
	}
	
	
}
