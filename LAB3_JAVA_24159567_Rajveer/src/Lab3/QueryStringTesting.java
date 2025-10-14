package Lab3;

import org.junit.Test;
import static org.junit.Assert.*;


public class QueryStringTesting {

    @Test
    public void testGetParameters(){
        QueryString QT = new QueryString("name=Alice&age=19&country=UK"); //Query Parameter
        assertEquals("Alice", QT.getParameter("name"));
        assertEquals("19", QT.getParameter("age"));
        assertEquals("UK", QT.getParameter("country"));
        assertNull(QT.getParameter("occupation"));
        assertNull(QT.getParameter("Alice"));
        assertNull(QT.getParameter("&"));

    }

    @Test
    public void testHasParameters(){
        QueryString QT = new QueryString("name=Alice&age=19&country=UK");
        assertTrue(QT.hasParameter("name"));
        assertTrue(QT.hasParameter("age"));
        assertTrue(QT.hasParameter("country"));
        assertFalse(QT.hasParameter("occupation"));
        assertFalse(QT.hasParameter("Alice"));
        assertFalse(QT.hasParameter("&"));

    }

    @Test
    public void testGetParameterOffset(){
        QueryString QT = new QueryString("name=Alice&age=19&country=UK");

        assertEquals(0, QT.getParameterOffset("name"));
        assertEquals(11,QT.getParameterOffset("age"));
        assertEquals(18,QT.getParameterOffset("country"));
        assertEquals(-1, QT.getParameterOffset("occupations"));
        assertEquals(-1,QT.getParameterOffset("Alice"));
        assertEquals(-1,QT.getParameterOffset("&"));
        assertTrue(QT.getParameterOffset("age") > 0);

    }

    @Test
    public void testStringDecoder(){

        assertEquals("Hello, world!", QueryString.decode("Hello%2C+world%21")); //URL Encoded String
        assertEquals("I'll be a CEO!", QueryString.decode("I'll+be+a+CEO%21"));


    }

    @Test
    public void testEmptyQuery() {
        QueryString qs = new QueryString("");
        assertFalse(qs.hasParameter("name"));
        assertNull(qs.getParameter("name"));
        assertEquals(-1, qs.getParameterOffset("name"));
    }


}
