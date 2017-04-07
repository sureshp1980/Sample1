package com.cts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class SampleProject {

	void bar() throws IOException{
		
		String zzz1 = "bhuviiii";
		String fileName = null;
	//	baz(fileName);
	//	secondMethod();
		if (zzz1 != null) {
			fileName = zzz1;
		}
	}

	void bazzz(String fileName) throws IOException{
		// Read the file and write some text into the file.
					File file = new File(fileName);
					OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file));
					writer.write("Hello World");
					writer.close();
				//	secondMethod();
	}

	public static void main(String[] args) throws  Throwable {
		String fileName = null;

		if (args != null && args.length > 0) {
			fileName = args[0];
		}
			// Read the file and write some text into the file.
			File file = new File(fileName);
			OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file));
			writer.write("Hello World");
			writer.close();
	}
	
	void secondMethod() {
		throw new ArrayIndexOutOfBoundsException ("zdgff");
	}



}