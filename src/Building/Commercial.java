package Building;

public class Commercial extends Site {
	private String type = "Commercial";
	public Commercial(long length,long width) {
		super(length, width);
	}
	@Override
	public String getType() {
		return type;
	}
}
