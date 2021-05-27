package serlizationanddeserlizaton;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Serlization {
public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
	Project p=new Project("java","David",456);
	ObjectMapper mapper=new ObjectMapper();
	mapper.writeValue(new File("./project.json"),p);
	
}

}
