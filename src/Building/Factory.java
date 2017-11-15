package Building;

public class Factory extends Site {
	private String type = "factory";
	public Factory(long length, long width) {
		super(length, width);
	}

	@Override
	public String getType() {
		return type;
	}
	
}
