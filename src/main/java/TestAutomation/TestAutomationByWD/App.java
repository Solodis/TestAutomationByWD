package TestAutomation.TestAutomationByWD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws IOException
    {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	String t = reader.readLine();
    	String s = reader.readLine();
    	int i = Integer.parseInt(s);
    	int i2 = 1;

    	while (i2 <= i) {
    		System.out.println(t);
    		i2++;
    	}
		
    }
}
