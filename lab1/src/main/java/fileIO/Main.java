package fileIO;

import danimals.danimals;

public class Main {

	public static void main(String[] args) {

		danimals danimals = new danimals("Cat", 3, 20.4f, 45.3f);
		
		FileIOInterface fio = new FileIO();
		
		fio.saveToFile(danimals);
		
		System.out.println((danimals)fio.loadFromFile());
	}

}
