package RepeatTestNg;

import java.io.FileInputStream;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class gevariables {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")+"\\src\\RepeatTestNg\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("browser","FireFox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos = new FileOutputStream(
				System.getProperty("user.dir")+"\\src\\RepeatTestNg\\data.properties");
		
		prop.store(fos, null);
		
		

	}

}
