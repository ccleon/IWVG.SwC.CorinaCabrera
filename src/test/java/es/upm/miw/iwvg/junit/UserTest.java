package es.upm.miw.iwvg.junit;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class UserTest {
	private User u;

	@Before
	public void before(){
		u= new User (3, "Pepe", "Garcia");
	}
	
	@Test
	public void testUser() {
        assertEquals(3, u.getNumber());
        assertEquals("Pepe", u.getName());
        assertEquals("Garcia", u.getFamilyName());
    }
	
    @Test
    public void testFullName() {
    	assertEquals("Pepe Garcia", u.fullName());
    }
    
    @Test
    public void testInitials() {
       assertEquals("P.", u.initials());
    }
}