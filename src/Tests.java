import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Tests {

	    @Test
	    public void testCalculateFactorials_ValidInput() {
	        ArrayList<Long> result = FactorialContainer.getContainer(5);
	        assertEquals(List.of(1L, 2L, 6L, 24L, 120L), result);
	    }

	    @Test
	    public void testCalculateFactorials_One() {
	    	ArrayList<Long> result = FactorialContainer.getContainer(1);
	        assertEquals(List.of(1L), result);
	    }

	    @Test
	    public void testCalculateFactorials_NegativeInput() {
	        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	        	FactorialContainer.getContainer(-1);
	        });
	        assertEquals("Введённое число должно быть больше 0", exception.getMessage());
	    }

	    @Test
	    public void testCalculateFactorials_ZeroInput() {
	        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	        	FactorialContainer.getContainer(0);
	        });
	        assertEquals("Введённое число должно быть больше 0", exception.getMessage());
	    }

}
