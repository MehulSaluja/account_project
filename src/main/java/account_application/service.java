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
	static HashMap <Integer,Accounts> hashmap = new HashMap <Integer,Accounts>();
	Accounts a = new Accounts ("jo", "mario", 2);

	int count = 0;
	
		
		public static void main(String[] args) 
		{	
			
			Accounts a = new Accounts ("jo", "mario", 2);
			
			
			
			
			
			hashmap.put(1, new Accounts(a.getFname(),a.getLname(),a.getAccountnumber()) );
			System.out.println(hashmap.keySet() + ""+hashmap.values());
			
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
		
		public void add_user(Accounts name1) 
		{
			this.hashmap.put(count, name1);
			count++;
			
		}

				public int get_firstname_counter (String name) 
				{
					int counter = 0;
					for (Accounts check : hashmap.values() ) 
					{
						if (check.getFname().equals(name)) 
						{
							counter++;
						}
					}
					return counter;
				}
				
				
		public int countNameByStream(String FName) 
		{
		return (int) hashmap.values().stream().filter(a -> a.getFname().equals(FName)).count();
		}

	

}
