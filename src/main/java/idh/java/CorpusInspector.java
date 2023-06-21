package idh.java;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;

public class CorpusInspector {
	
	public static String readin(File f) {
		try {
			return FileUtils.readFileToString(f, "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
	
	public static void main(String[] args) {
		File directory = new File("src/main/resources");
		ArrayList<File> files = new ArrayList<File>();
		
		for (File f : directory.listFiles()) {
			files.add(f);
		}
		
		System.out.println(files.size());
		

	}
}
