package employeeSalary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SalaryTest {
	 @Test
	    void testDA() {
	        Salary s = new Salary(100000);
	        assertEquals(73000.0, s.getDA());
	       

	      
	    }
	    @Test
	    void testHRA() {
	        Salary s = new Salary(100000);
	        assertEquals(10000.0, s.getHRA());
	       
	      
	    }
	    @Test
	    void testGrossSalary() {
	        Salary s = new Salary(100000);  
	        assertEquals(183000.0, s.getGrossSalary());
	        
	      
	    }
	    @Test
	    void testIncomeTex() {
	        Salary s = new Salary(100000);
	        assertEquals(54900.0, s.getIncomeTax());
	       

	      
	    }
	    @Test
	    void testNetSalary() {
	        Salary s = new Salary(100000);
	        assertEquals(128100.0, s.getNetSalary());

	}
	}


