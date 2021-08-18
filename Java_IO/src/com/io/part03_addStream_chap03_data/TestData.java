package com.io.part03_addStream_chap03_data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestData {
	public void test() {
		try (DataInputStream din = new DataInputStream(new FileInputStream("score.txt"));
				DataOutputStream dout = new DataOutputStream(new FileOutputStream("score.txt")) ){
			
			dout.writeUTF("홍길동");
			dout.writeInt(97);
			dout.writeChar('A');
			dout.writeUTF("나무김");
			dout.writeInt(81);
			dout.writeChar('B');
			dout.writeUTF("김대라");
			dout.writeInt(44);
			dout.writeChar('F');
			// 객체로 데이터 입출력 
			
			while(true) {
				System.out.println(din.readUTF() +"," + din.readInt() + "," + din.readChar());
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일 읽기 완료");
		}catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
