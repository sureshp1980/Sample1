package com.cts;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.logging.Logger;
import java.io.IOException;

public class FileReading {
	

	private static final Logger LOGGER = Logger.getLogger("com.cognizant.ccap.testing.FileReading");

	void bar() throws IOException{
		try{
			String abc = new String();
		SampleProject prj=new SampleProject();
		String zzz1 = "bhuviiii";
		String fileName = null;
		prj.bazzz(fileName);
		secondMethod();
		if (zzz1 != null) {
			fileName = zzz1;
		}		
		
		}
		catch(IOException x){
			LOGGER.info(x.getMessage());
			x.printStackTrace();
		}
	}

	void baz(String fileName) throws IOException{
		try{
		// Read the file and write some text into the file.
					File file = new File(fileName);
					OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file));
					writer.write("Hello World");
					writer.close();
					secondMethod();
		}
		catch(IOException x){
		LOGGER.info(x.getMessage());
			x.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
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
	
	void secondMethod() throws IOException {
		throw new ArrayIndexOutOfBoundsException ("zdgff");
	}
}
