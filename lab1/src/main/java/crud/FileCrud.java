package crud;

import danimals.danimals;
import fileIO.FileIO;
import fileIO.FileIOInterface;

public class FileCrud implements Lab2CrudInterface {
	
	FileIOInterface fio;
	
	public FileCrud() {
		this.fio = new FileIO();
	}

	@Override
	public danimals readDanimals() {

		return (danimals)fio.loadFromFile();
	}

	@Override
	public void updateDanimals(danimals danimals) {
		fio.saveToFile(danimals);

	}

}
