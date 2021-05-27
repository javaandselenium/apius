package serlizationanddeserlizaton;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Deserlization {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
ObjectMapper mapper =new ObjectMapper();
Project pobj = mapper.readValue(new File("./project.json"),Project.class);
System.out.println(pobj.author);
System.out.println(pobj.title);
System.out.println(pobj.id);

	}

}
