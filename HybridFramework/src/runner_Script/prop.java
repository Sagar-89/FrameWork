package runner_Script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class prop 
{
@Test
public void testing() throws FileNotFoundException, IOException
{
Properties p = new Properties();
p.load(new FileInputStream("./p.properties"));        
String s = p.getProperty("class");
System.out.println(s);
}}

