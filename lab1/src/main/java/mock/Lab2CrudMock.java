package mock;

import crud.Lab2CrudInterface;
import danimals.danimals;

public class Lab2CrudMock implements Lab2CrudInterface {

	@Override
	public danimals readDanimals() {
		// TODO Auto-generated method stub
		return new danimals("Cat", 3, 20.4f, 45.3f);
	}

	@Override
	public void updateDanimals(danimals danimals) {
		// TODO Auto-generated method stub

	}

}
