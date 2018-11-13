package account_application;
import java.util.HashMap;
import java.util.Map;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class service 
{
	
		
		public static void main(String[] args) 
		{	
			
			Accounts a = new Accounts ("jo", "mario");
			
			
			HashMap <Integer,Accounts> hashmap = new HashMap <Integer,Accounts>();
			hashmap.put(1, new Accounts(a.getFname(),a.getLname()) );
			System.out.println(hashmap.values());
			
			ObjectMapper mapper = new ObjectMapper();
			
			
			
			String make_Json;
			try {
				make_Json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(hashmap);
				System.out.println(make_Json);
				
				TypeReference <HashMap<String,Accounts>> change_string = new TypeReference<HashMap<String,Accounts>>() {};
				try {
					Map<String,Accounts> map = mapper.readValue(make_Json, change_string);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} catch (JsonProcessingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		
		
		
			
			

		}


	

}
