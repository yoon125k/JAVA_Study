package com.io.part02_charStream;

import java.io.FileWriter;
import java.io.IOException;

public class TestCharStream {

	public void fileSave() {

		FileWriter fw = null;

		try {
			fw = new FileWriter("sample2.txt");

			fw.write("우리나라 대한민국");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void fileOpen() {

	}
}
