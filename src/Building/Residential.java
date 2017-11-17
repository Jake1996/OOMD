package Building;

public class Residential extends Site {
	private String type = "Residential";
	protected Residential(int id,long length, long width) {
		super(id,length, width);
	}

	@Override
	public String getType() {
		return type;
	}

}
