/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import java.util.*;

public class ProblemOne
{
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("1234",90);
		map.put("3456",100);
		map.put("4567",60);
		map.put("4563",88);
		map.put("87653",40);
		map.put("3563",90);map.put("2367",75);map.put("26734",81);
		System.out.println(getStudents(map));
		
	}
	
	public static HashMap getStudents(HashMap<String,Integer> map){
	    
	    HashMap<String,String> ans = new HashMap<>();
	    
	    
	    for(Map.Entry<String,Integer> s : map.entrySet()){
	        
	        int mark = s.getValue();
	        String name = s.getKey();
	        if(mark >= 90){
	            ans.put(name, "Gold");
	        }else if( mark >= 80 && mark < 90){
	             ans.put( name , "Silver");
	        }else if( mark >= 70 && mark < 80){
	             ans.put( name, "Bronze");
	        }
	    }
	    
	    return ans;
	    
	}
}