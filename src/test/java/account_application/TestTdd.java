package account_application;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class TestTdd {
	
	service S = new service();
	Accounts A = new Accounts();
	
	
	@Before
	public void test2() 
	{
		service thisservice = new service();
		
		
		
		
	}

	@Test
	public void test() {
		Accounts a1 = new Accounts ("jo", "mario", 2);
		Accounts a2 = new Accounts ("jo", "smith", 2);
		Accounts a3 = new Accounts ("phil", "smith", 2);
		service thisservice = new service();
		thisservice.add_user(a1);
		thisservice.add_user(a2);
		thisservice.add_user(a3);
		

        assertEquals (2,thisservice.get_firstname_counter("jo"));
	}
	
	
	@Test
	public void test1() {
		Accounts a1 = new Accounts ("jo", "mario", 2);
		Accounts a2 = new Accounts ("jo", "smith", 2);
		Accounts a3 = new Accounts ("phil", "smith", 2);
		service thisservice = new service();
		thisservice.add_user(a1);
		thisservice.add_user(a2);
		thisservice.add_user(a3);
		

        assertEquals (2,thisservice.countNameByStream("jo"));
	}

}
