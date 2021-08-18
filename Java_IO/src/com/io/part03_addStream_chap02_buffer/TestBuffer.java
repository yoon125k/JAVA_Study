package com.io.part03_addStream_chap02_buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBuffer {

	public void input() {
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("sample3.txt"));
			
			String tmp = null; // 한줄 씩은 String
			
			while((tmp = br.readLine()) != null) { // -1 이 아닌 null이 들어간다.
				System.out.println(tmp); // 읽어올 값이 있을 경우 출력
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void output() {

		BufferedWriter bw = null;

		try {
			bw = new BufferedWriter(new FileWriter("sample3.txt"));

			bw.write("안녕하세요.\n");
			bw.write("하이.\n");
			bw.write("안녕.\n");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
