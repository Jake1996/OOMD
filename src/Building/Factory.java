package Building;

public class Factory extends Site {
	private String type = "Factory";
	public Factory(int id, long length, long width) {
		super(id,length, width);
	}

	@Override
	public String getType() {
		return type;
	}
	
}
