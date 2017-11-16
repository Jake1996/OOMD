package Building;

public abstract class Site {
	private long length,width;
	private int id;
	private int electricity = 0;
	private int interent = 0;
	private int water = 0;
	
	protected Site(int id,long length,long width) {
		this.length = length;
		this.width = width;
		this.id = id;
	}
	public int getElectricity() {
		return electricity;
	}
	public void setElectricity(int electricity) {
		this.electricity = electricity;
	}
	public int getInterent() {
		return interent;
	}
	public void setInterent(int interent) {
		this.interent = interent;
	}
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	public long getLength() {
		return length;
	}
	public void setLength(long length) {
		this.length = length;
	}
	public long getWidth() {
		return width;
	}
	public void setWidth(long width) {
		this.width = width;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getArea() {
		return length*width;
	}
	public abstract String getType();
}
