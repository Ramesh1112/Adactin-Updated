package com.adactin_helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;

	public Configuration_Reader() throws Throwable {
		File f = new File(
				"C:\\Users\\rames\\eclipse-workspace\\Adactin_MainProject\\src\\test\\java\\com\\adactin_propeties\\Adactin.properties");
		FileInputStream f1 = new FileInputStream(f);
		p = new Properties();
		p.load(f1);
	}

	public String getbrowser() {
		String property = p.getProperty("browser");
		return property;
	}

	public String geturl() {
		String property1 = p.getProperty("url");
		return property1;

	}
}
