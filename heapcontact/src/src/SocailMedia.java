package src;
import java.util.HashMap;
import java.util.HashSet;

public class SocailMedia {

	private HashMap<String, HashSet<String>> socialMedia = new HashMap<String, HashSet<String>>();

	public HashMap<String, HashSet<String>> getProfiles() {
		return socialMedia;
	}

	public void setSocialMediaProfiles(String group, String social) {
		HashSet<String> hs = socialMedia.get(group);
		if (hs == null) {
			hs = new HashSet<String>();
			hs.add(social);
		} else {
			hs.add(social);
		}

		socialMedia.put(group, hs);
	}
}