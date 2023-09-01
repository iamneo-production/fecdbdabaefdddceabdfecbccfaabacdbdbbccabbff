package stepdefination;

import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 
@RunWith(Cucumber.class) 
@Cucumber.Options(format= {"pretty", "html:target/cucumber"}) 
public class run {

public static void main(String[] args){
    System.out.println("Hello world");
}}