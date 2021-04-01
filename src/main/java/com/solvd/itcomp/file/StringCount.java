package com.solvd.itcomp.file;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

public class StringCount {

	public static void main(String[] args) throws IOException {
		
		String originalText = FileUtils.readFileToString(new File("src/main/resources/fileA.txt"),"UTF-8").toLowerCase();
		
		originalText=originalText.replace(",", " ,");
		originalText= originalText.replace(".", " .");
		//dont like this solution
		
		Map<String,Integer> result = new HashMap<String,Integer>();
		
		for(String s: StringUtils.split(originalText)) {
			if(result.containsKey(s)) {
				result.put(s, result.get(s)+1);
			}else {
				result.put(s, 1);
			}
		}
		File f2=new File("src/main/resources/fileResult.txt");
		f2.delete();
		FileUtils.writeStringToFile(new File("src/main/resources/fileResult.txt"), "Number of ocurrences of each word: "+ result.toString(), "UTF-8");
		
	}

}
