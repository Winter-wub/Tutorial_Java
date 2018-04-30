
public class twenty {

	public twenty (double base,double high) {
		System.out.println("Trigle area = "+getTrigle(base,high));
	}
	
	public twenty (int d1,int d2) {
		System.out.println("Squad Area/Plain Squad = "+getSquad(d1,d2));
	}
	
	public twenty (double r) {
		System.out.println("Cycle area = "+Cycle(r));
	}
	
	private double Cycle (double r) {
		return 3.14*(r*r);
	}
	
	private double getSquad(int d1,int d2) {
		return d1*d2;
	}
	
	private double getTrigle(double base,double high) {
		return 0.5*base*high;
	}
}
