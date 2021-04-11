package com.solvd.itcomp.file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

public class StringCount {

	public static void main(String[] args) throws IOException {
		
		String originalText = FileUtils.readFileToString(new File("src/main/resources/fileA.txt"),"UTF-8").toLowerCase();
		Map<String,Integer> result = new HashMap<String,Integer>();
		
		Arrays.stream(StringUtils.split(originalText," .,:;!?/\\\"")).forEach(word ->{
			if(result.containsKey(word)) {
				result.put(word, result.get(word)+1);
			}else {
				result.put(word, 1);
			}	
		});
		
		File f2=new File("src/main/resources/fileResult.txt");
		f2.delete();
		FileUtils.writeStringToFile(new File("src/main/resources/fileResult.txt"), "Number of ocurrences of each word: "+ result.toString(), "UTF-8");
		
	}

}
