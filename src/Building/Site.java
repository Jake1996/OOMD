package Building;

public abstract class Site {
	private static int siteCount = 0;
	private long length,width;
	private int id;
	
	public Site(long length,long width) {
		this.length = length;
		this.width = width;
		id = ++siteCount;
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
