package danimals;

import java.util.ArrayList;
import java.util.List;

public class Mock {
	
	private List<danimals> danimalsList = new ArrayList<>();
	
	public Mock() {
		this.danimalsList.add(new danimals(0, "Dog", 2, 23.1f, 45.1f));
		this.danimalsList.add(new danimals(1, "Raccoon", 3, 24.5f, 46.7f));
		this.danimalsList.add(new danimals(2, "Fox", 2, 21.3f, 38.5f));
	}

	public List<danimals> getDanimalsList() {
		return danimalsList;
	}

	public void setDanimalsList(List<danimals> danimalsList) {
		this.danimalsList = danimalsList;
	}

}
