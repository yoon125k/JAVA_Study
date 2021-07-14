package com.io.part03_addStream_chap01_byteToChar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestStream {
	public void input() {

		// new 보조스트림 ( new 보조스트림(new 기반스트림("외부자원")));
		// 보조 스트림안에는 다른 스트림 들어 갈 수 있다
		// 기반 스트림안에는 외부자원 만 들어 갈 수 있다

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// System.in 은 InputStream , System.out 은 OuputStream

		try {
			System.out.print("입력: ");
			String value = br.readLine();
			System.out.println("value: " + value);
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

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			bw.write("java oracle jdbc");

//			bw.flush();
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
