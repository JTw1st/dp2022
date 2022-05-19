package servlet;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import jakarta.servlet.http.HttpServletRequest;
import danimals.danimals;

public class Helpers {

	public static JsonElement bodyParse(HttpServletRequest request) {
		JsonElement jsonElement=null;	
		
		try {
			jsonElement = JsonParser.parseReader(request.getReader());
		} catch (JsonIOException | JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jsonElement;
	}
	
	public static danimals danimalsParse(HttpServletRequest request) {
		danimals danimals = new danimals();
		JsonElement jsonElement = bodyParse(request);
		danimals.setId(jsonElement.getAsJsonObject().get("id").getAsInt());
		danimals.setTitle(jsonElement.getAsJsonObject().get("title").getAsString());
		danimals.setAge(jsonElement.getAsJsonObject().get("age").getAsInt());
		danimals.setHeight(jsonElement.getAsJsonObject().get("height").getAsFloat());
		danimals.setLength(jsonElement.getAsJsonObject().get("length").getAsFloat());
		return danimals;
	}
	
	
	public static int getNextId(List<danimals> list) {
		int maxId = 0;
		Iterator<danimals> iterator = list.iterator();
		while(iterator.hasNext()) {
			int currentId = iterator.next().getId();
			if(currentId>maxId) maxId=currentId;
		}
		return maxId+1;
	}
	
	public static int getIndexBydanimalsId(int id,List<danimals> list) {
		int listId = id;
		
		Iterator<danimals> iterator = list.iterator();
		while(iterator.hasNext()) {
			danimals temp =iterator.next();
			if(temp.getId()==listId) { 
				listId=list.indexOf(temp);
				break;
			}
		}
		return listId;
	}
	
}
