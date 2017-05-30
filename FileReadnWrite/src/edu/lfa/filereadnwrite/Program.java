package edu.lfa.filereadnwrite;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner inputcho = new Scanner(System.in);
		String path="d:/javatest/";
		String fileName = "";
		System.out.println("Enter the file name : ");
		fileName = inputcho.next();
		while(true){
		System.out.println("1. input \r\n"
				+ "2. read \r\n"
				+ "3. exit \r\n"
				+ "1,2,3 : ");
		int cho = inputcho.nextInt();
		switch(cho){
		case 1:
			try {
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				
				FileWriter writer = new FileWriter(path+fileName+".txt");
				writer.write(input.readLine());
				writer.close();
				
		
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		case 2:
			try {
				BufferedReader reader = new BufferedReader(new FileReader(path+fileName+".txt"));
				String line="";
				try {
					while((line=reader.readLine())!= null){
						System.out.println(line);
						
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 3:
			System.exit(0);
		}
		}
		
		
	}

}
