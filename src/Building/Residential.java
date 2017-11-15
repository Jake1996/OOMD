package Building;

public class Residential extends Site {
	private String type = "residential";
	public Residential(long length, long width) {
		super(length, width);
	}

	@Override
	public String getType() {
		return type;
	}

}
