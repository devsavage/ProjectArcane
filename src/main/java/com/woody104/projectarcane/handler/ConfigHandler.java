package com.woody104.projectarcane.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	
	public static int test;
	
	public static void init(File configFile) {
		
		Configuration config = new Configuration(configFile);
		
		config.load();
		
		test = config.get("general", "Test Output", 1).getInt();
		
		config.save();
		
	}

}
