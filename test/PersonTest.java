package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
	
	@Test
    public void shouldReturnHelloWorld(){

        Person jack = new Person();

        assertEquals("Hello World", jack.helloWorld());
    }
}