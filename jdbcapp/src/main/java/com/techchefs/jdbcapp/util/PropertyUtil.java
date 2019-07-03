package com.techchefs.jdbcapp.util;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtil {

	private static PropertyUtil util = null;
	Properties properties = null;

	private PropertyUtil() throws Exception {
		properties = new Properties();
		properties.load(new FileInputStream("credentials.properties"));
	}

	public static PropertyUtil getProertyUtil() throws Exception {
		if (util == null) {
			return new PropertyUtil();
		}
		return util;
	}

	public String getProperty(String key) {
		return properties.getProperty(key);
	}

}
