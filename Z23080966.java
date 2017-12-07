import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//the Utility method did not have a print line for getCount. I tested my method by adding a print line to the 
//utility method and i was able to print the count. I wasn't sure if i should add to the return in the get method
//but i added anyways.

public class Z23080966<X extends Comparable<X>, Y> implements Counter<X, Y> {

      public static void main(String args[]) throws FileNotFoundException {
         Counter<String, String> x = new Z23080966<String, String>();
         Utility.run(x);
      }
	  
      public HashSet<Helper> setWords = new HashSet<>(); 
      
	  
      public String get(X word) {
    	 String listString = "";
    	 int count =0;
    	  Set<String> list = new TreeSet<>();
    	  for(Helper h : setWords){  
    		  if(word.equals(h.key)){
    			  count++;
    			  if(!list.contains(h.value)){
    				  list.add(h.value.toString());
    			  }
    		  }
    	  }
    	  for(String giveWord : list){
    		  listString += giveWord + ",\t";
    	  }
    	  
		return "total count " + count +", " + listString;
      }

      public int getCount(X word) {
    	  int counter = 0;
    	 for(Helper h : setWords){
    		 if(word.equals(h.key)){
    			counter++; 
    		 }
    	 }
         return counter;
      }

      public Set<X> keySet(){
    	  Set<X> setT = new TreeSet<>();
    	  for(Helper h : setWords){
    		  setT.add(h.key);
    	  }
         return setT;
      }

      public void put(X keyWord, Y word) {
    	  Helper palabra = new Helper(keyWord, word);
    	  setWords.add(palabra);
      }

      // declare any required instance variables or helpful auxiliary types and methods here
      class Helper{
    	  X key;
    	  Y value;
    	  public Helper(X keyWord, Y word){
    		  this.key = keyWord;
    		  this.value = word;
    	  }
      }

}
