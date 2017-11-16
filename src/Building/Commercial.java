package Building;

public class Commercial extends Site {
	private String type = "Commercial";
	protected Commercial(int id,long length,long width) {
		super(id, length, width);
	}
	@Override
	public String getType() {
		return type;
	}
}
