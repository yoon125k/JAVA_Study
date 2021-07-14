package com.io.part03_addStream_chap04_object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObject {
//객체 단위로 불러서 저장

	public void fileSave() {
		Member m = new Member("user01", "1234", "홍길동", 21, 'M');

		// 객체를 저장 할 수 있는 오브젝트 아웃풋 스트림
		ObjectOutputStream objOut = null;

		try {
			objOut = new ObjectOutputStream(new FileOutputStream("member.txt"));

			objOut.writeObject(m);
			objOut.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				objOut.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void fileOpen() {

		try {
			ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("member.txt"));
			Member m = (Member) objIn.readObject();
			
			System.out.println(m);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
