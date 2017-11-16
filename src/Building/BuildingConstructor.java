package Building;

import java.util.ArrayList;
import java.util.Iterator;

public class BuildingConstructor {
	public static final int COMMERCIAL = 0;
	public static final int FACTORY = 1;
	public static final int RESIDENTIAL = 2;
	private static int siteCount = 0;
	private static ArrayList<Site> sites = new ArrayList<>();
	public static Site getSite(int type,long length,long width) {
		Site ret;
		if(type == COMMERCIAL)
			ret = new Commercial(siteCount++,length ,width);
		else if(type == FACTORY)
			ret = new Factory(siteCount++,length ,width);
		else if(type == RESIDENTIAL)
			ret = new Residential(siteCount++,length ,width);
		else 
			return null;
		sites.add(ret);
		return ret;
	}
	public static Iterator<Site> getAllSites() {
		return sites.iterator();
	}
}
