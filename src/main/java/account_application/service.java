package account_application;
import java.util.HashMap;
import java.util.Map;

public class service 
{
	
		
		public static void main(String[] args) 
		{	
	
			
			Accounts a = new Accounts ("jo", "mario");
			HashMap <Integer,Accounts> hashmap = new HashMap <Integer,Accounts>();
			hashmap.put(1, new Accounts(a.getFname(),a.getLname()) );
			System.out.println(hashmap.values());

		}


	

}
