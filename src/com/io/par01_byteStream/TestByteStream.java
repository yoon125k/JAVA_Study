package com.io.par01_byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStream {

	public void fileSave() {
		FileOutputStream fout = null;

		try {
			fout = new FileOutputStream("sample.txt");

			fout.write(97);
			byte[] bar = {10, 98, 99, 100, 101, 102 };
			fout.write(bar);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void fileOpen() {
		FileInputStream fin = null;
		try {

			fin = new FileInputStream("sample.txt"); // 스트림에 연결
			/*
			 * int fileSize = (int) new File("sample.txt").length(); byte[] bar = new
			 * byte[fileSize]; fin.read(bar);
			 * 
			 * for (int i = 0; i < bar.length; i++) { System.out.println(bar[i] + " "); }
			 */
			// 하나씩 읽어오기
			/*
			 * for(int i=0; i<30; i++) { System.out.print(fin.read()+" "); }
			 */

			int va;
			while ((va = fin.read()) != -1) {
					System.out.print((char)va + " ");
				}
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
