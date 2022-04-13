/**
 * 
 */
package baitap_java_core_from1_to22;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author lâm yên 
 *Viết chương trình in ra các thông tin sau đây:
● Java version
● Java Runtime Version
● Java Home
● Java Vendor
● Java Vendor URL
● Java Class Path
 */
public class BaiTap_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String version=System.getProperty("java.version");
        String vendor=System.getProperty("java.vendor");
        String javaHomeString = System.getProperty("java.home");
        String javaClassPath=System.getProperty("java.class.path");
        String javaRunTimeVersion=System.getProperty("java.runtime.version");
        String javaVendor=System.getProperty("java.vendor.url");
        
        System.out.println("Java Version: "+version);
        System.out.println("Java Run Time Version: "+javaRunTimeVersion);
        System.out.println("Java Home: "+javaHomeString);
        System.out.println("Java Vendor: "+vendor);
        System.out.println("Java Vendor Url: "+javaVendor);
        System.out.println("Java Class Path: "+javaClassPath);
        
       
    
        
	}
	 
	/*
	 * private static String getVersion() throws IOException { URLClassLoader cl =
	 * (URLClassLoader) BaiTap_03.class.getClassLoader(); URL url =
	 * cl.findResource("META-INF/MANIFEST.MF"); Manifest manifest = new
	 * Manifest(url.openStream()); Attributes attr = manif
	 * ol30poest.getMainAttributes();
	 * 
	 * return attr.getValue("Implementation-Version"); }
	 */

	

}
