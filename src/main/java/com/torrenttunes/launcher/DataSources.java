package com.torrenttunes.launcher;

public class DataSources {
	
	// The path to the torrenttunes dir
	public static String HOME_DIR() {
		String userHome = System.getProperty( "user.home" ) + "/." + APP_NAME;
		return userHome;
	}

	public static String APP_NAME = "torrenttunes-client";

	public static final String SOURCE_CODE_HOME() {return HOME_DIR() + "/src";}

	public static final String FETCH_LATEST_RELEASE_URL() {
		return "https://github.com/tchoulihan/torrenttunes-client/releases/latest";
	}

	public static String TEMP_JAR_PATH() {return System.getProperty("user.home") + "/" + APP_NAME + ".jar";}

	public static String INSTALLED_VERSION_FILE() {return SOURCE_CODE_HOME() + "/version";}

	
	
	
	public static final String JAR_FILE() {return HOME_DIR() + "/" + APP_NAME + ".jar";}
	
	

}