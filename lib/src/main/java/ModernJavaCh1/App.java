/* DAs ist die 1. Änderung, die ich in GitHub erfasse */
package ModernJavaCh1;

import java.io.File;

import Helpers.showHelps;

public class App {

	showHelps showHelp = new showHelps() ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First Gradlke try");
		
		Library lib = new Library();
		lib.someLibraryMethod();
		
		new App().aMethod();
		
		File path = new File(".");
		
		File[] hiddenFiles = path.listFiles(File::isFile);
		
		System.out.println(hiddenFiles);
		
	}
	
	
	public void aMethod() {
		System.out.println("a Mtehod");
		
		showHelp.doShow();
		
	}

}
