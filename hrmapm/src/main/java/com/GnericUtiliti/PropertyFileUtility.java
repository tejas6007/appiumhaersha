package com.GnericUtiliti;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {
	public String readDataFrompropertyFile(String key) throws IOException
	{
		FileInputStream fis =new FileInputStream(I_pathconstant.filepathapm);
		Properties porti = new Properties();
		porti.load(fis);
		String value = porti.getProperty(key);
		return value;
	}

}
