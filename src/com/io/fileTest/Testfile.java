package com.io.fileTest;

import java.io.File;
import java.io.IOException;

public class Testfile {

	public static void main(String[] args) {
		// File 클래스
		File file = new File("person.txt");

		try {
			file.createNewFile();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
