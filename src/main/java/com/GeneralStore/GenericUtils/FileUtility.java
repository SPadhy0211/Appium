package com.GeneralStore.GenericUtils;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	
	public String readDataFromPropertyFile(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IPathConstants.FILE_PATH);
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(key);
	}

}
