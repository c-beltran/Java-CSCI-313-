
public class Projet_X extends Polynomial {
   public static void main(String args[]) throws Exception {
      Polynomial p = new Projet_X("- X"), 
            q = new Projet_X("X^2 - 2X + 1");
      Utility.run(p, q);
   }
   
   public Projet_X(String s) throws Exception {
      // complete this code
	   super();
	   String num = s.replace("-", "+-");//putting + in front of -
	   num = num.replaceAll("\\s+",""); // removing all white spaces
	   //testing the replace method
	   System.out.println("this is s-->" + s);
	   System.out.println("this is num-->"+ num);
	   if(num.charAt(0) == '+'){
		   num = num.substring(1);
	   }
	   String split[] = num.split("\\+");
   
	   for (int i=0; i<split.length; i++ ) {
		   double cparse = 0;
		   int dparse = 0;
		   
		   String element = split[i];
		   System.out.println("this is element:"+ element);//GOOD SO FAR
		   int index = element.indexOf('X');
		   
		   String coefficient = "";
		   
		   System.out.println("CHECKING "+element);
		   if(index == 0){
			   coefficient = "1";
			   cparse = Double.parseDouble(coefficient); 
			   System.out.println("THIS IS COEFFICIENT "+ cparse);//GOOD SO FAR need to FIX
		   }
		   else if( element.length() > 1 && element.substring(0,2).equals("-X")){
			   coefficient = "-1";
			   cparse = Double.parseDouble(coefficient);   
			   System.out.println("THIS IS COEFFICIENT "+ cparse);//GOOD SO FAR need to FIX

		   }
		   
		   else{
			   if(index == -1){
				   coefficient = element;
			   }
			   else{
				   coefficient = element.substring(0, index);
			   }
			   cparse = Double.parseDouble(coefficient); 
			   System.out.println("THIS IS COEFFICIENT "+ cparse);//GOOD SO FAR need to FIX
		   }
		   		   
		   String degree = "";
		   if(element.contains("^")){
			  degree = String.valueOf((element.charAt(i+2)));
			   dparse = Integer.parseInt(degree); 
			  System.out.println("THIS IS DEGREE-- "+ dparse);//GOOD SO FAR
		   }
		   else if(element.contains("X")){
			   degree = "1";
			   dparse = Integer.parseInt(degree); 

				  System.out.println("THIS IS DEGREE "+ degree);//GOOD SO FAR
		   }
		   else{ degree = "0"; 
		   dparse = Integer.parseInt(degree); 
		   System.out.println("THIS IS DEGREE "+ degree);//GOOD SO FAR
		   }
		   Term t = new Term(cparse, dparse);
		   data.addLast(t);
		   System.out.println(data);
		   System.out.println(data.getLast().getData().getCoefficient()); //OK so far
		   System.out.println(data.getLast().getData().getDegree());
	    }

   }

   public Projet_X() {
      super();
   }

   public Polynomial add(Polynomial p) {
      Polynomial ans = new Projet_X();
//    
//      Term t; 
//      DList<Term> listA = this.data;
//      DList<Term> listB = p.data;
//      DList<Term> newList = new DList<Term>();
//      DNode<Term> nodeA = null;
//      DNode<Term> nodeB = null;
//
//      try {
//    	  nodeA = listA.getFirst();
//    	  nodeB = listB.getFirst();
//      } catch (Exception e) {	}
//    		  
//      Term a = nodeA.getData();
//      Term b = nodeB.getData();      
//      
//      while(a != null || b != null){
//
//	      if(b == null){
//	    	  t = new Term(a.getCoefficient(), a.getDegree());
//	    	  newList.addLast(t);
//	    	  nodeA = nodeA.getNext();
//	    	  a = nodeA.getData();
//	      }
//	      else if(a == null){
//	    	  t = new Term(b.getCoefficient(), b.getDegree());
//	    	  newList.addLast(t);
//	    	  nodeB = nodeB.getNext();
//			  b = nodeB.getData();
//	      }
//	      else if(a.getDegree() > b.getDegree()){
//	    	  t = new Term(a.getCoefficient(), a.getDegree());
//	    	  newList.addLast(t);
//	    	  nodeA = nodeA.getNext();
//	    	  a = nodeA.getData();
//	      }
//	      else if(a.getDegree() < b.getDegree()){
//	    	  t = new Term(b.getCoefficient(), b.getDegree());
//	    	  newList.addLast(t);
//	    	  nodeB = nodeB.getNext();
//	    	  b = nodeB.getData();
//	      }
//	      else{
//	    	  double coef = a.getCoefficient() + b.getCoefficient();
//	    	  int exp = a.getDegree();
//	    	  nodeA = nodeA.getNext();
//	    	  a = nodeA.getData();
//	    	  nodeB = nodeB.getNext();
//	    	  b = nodeB.getData();
//	    	  if(coef == 0) continue;
//	    	  t = new Term(coef, exp);
//	    	  newList.addLast(t);
//	      }
//      }
//      ans.data = newList;
      return ans;
   }

   public Polynomial subtract(Polynomial p) {
      Polynomial ans = new Projet_X();
      // complete this code
//      
//      Term t; 
//      DList<Term> listA = this.data;
//      DList<Term> listB = p.data;
//      DList<Term> newList = new DList<Term>();
//      DNode<Term> nodeA = null;
//      DNode<Term> nodeB = null;
//
//      try {
//    	  nodeA = listA.getFirst();
//    	  nodeB = listB.getFirst();
//      } catch (Exception e) {	}
//    		  
//      Term a = nodeA.getData();
//      Term b = nodeB.getData();
//      
//      while(a != null || b != null){
//
//	      if(b == null){
//	    	  t = new Term(a.getCoefficient(), a.getDegree());
//	    	  newList.addLast(t);
//	    	  nodeA = nodeA.getNext();
//	    	  a = nodeA.getData();
//	      }
//	      else if(a == null){
//	    	  t = new Term((-1)*b.getCoefficient(), b.getDegree());
//	    	  newList.addLast(t);
//	    	  nodeB = nodeB.getNext();
//			  b = nodeB.getData();
//	      }
//	      else if(a.getDegree() > b.getDegree()){
//	    	  t = new Term(a.getCoefficient(), a.getDegree());
//	    	  newList.addLast(t);
//	    	  nodeA = nodeA.getNext();
//	    	  a = nodeA.getData();
//	      }
//	      else if(a.getDegree() < b.getDegree()){
//	    	  t = new Term((-1)*b.getCoefficient(), b.getDegree());
//	    	  newList.addLast(t);
//	    	  nodeB = nodeB.getNext();
//	    	  b = nodeB.getData();
//	      }
//	      else{
//	    	  double coef = a.getCoefficient() + (-1)*b.getCoefficient();
//	    	  int exp = a.getDegree();
//	    	  nodeA = nodeA.getNext();
//	    	  a = nodeA.getData();
//	    	  nodeB = nodeB.getNext();
//	    	  b = nodeB.getData();
//	    	  if(coef == 0) continue;
//	    	  t = new Term(coef, exp);
//	    	  newList.addLast(t);
//	      }
//      }
//      ans.data = newList;
      return ans;
   }

   public Polynomial multiply(Polynomial p) {
      Polynomial ans = new Projet_X();
      // complete this code
      return ans;
   }

   public Polynomial divide(Polynomial p) throws Exception {
      Polynomial ans = new Projet_X();
      // complete this code
      return ans;
   }

   public Polynomial remainder(Polynomial p) throws Exception {
      Polynomial ans = new Projet_X();
      // complete this code
      return ans;
   }
}

//-------  cut here.  Place your new code above this line and submit only the ------
//-------  code above this line as your homework.  Do not make any code changes ----
//-------  below this line.                                                ---------

abstract class Polynomial {
   DList<Term> data = null;
   public Polynomial() {
      data = new DList<>();
   }
   public final String toString() {
      String ans = "";
      boolean starting = true;
      try {
         DNode<Term> n = data.getFirst();
         while (n != null) {
            if (!starting && n.getData().isPositive()) ans += " +";
            starting = false;
            ans += " " + n.getData().toString();
            n = data.getNext(n);
         }
      } catch (Exception e) {
         if (starting) return "0";
      }
      return ans;
   }
   abstract public Polynomial add(Polynomial p);
   abstract public Polynomial subtract(Polynomial p);
   abstract public Polynomial multiply(Polynomial p);
   abstract public Polynomial divide(Polynomial p) throws Exception;
   abstract public Polynomial remainder(Polynomial p) throws Exception;
}


class Utility {
   public static void run(Polynomial p, Polynomial q) throws Exception {
      System.out.println("Polynomials\np = " + p + "\nq = " + q);
      System.out.println("Sum " + p.add(q));
      System.out.println("Difference " + p.subtract(q));
      System.out.println("Product " + p.multiply(q));
      System.out.println("Quotient " + p.divide(q));
      System.out.println("Remainder " + p.remainder(q));
   }
}

class Term {
   
   Double coefficient;
   int degree;
   
   public Term() {
      this(null, 0);
   }
   public boolean isPositive() {
      return coefficient > 0;
   }
   public Term(Double coefficient, int degree) {
      this.coefficient = coefficient;
      this.degree = degree;
   }
   public Double getCoefficient() {
      return coefficient;
   }
   public void setCoefficient(Double coefficient) {
      this.coefficient = coefficient;
   }
   public int getDegree() {
      return degree;
   }
   public void setDegree(int degree) {
      this.degree = degree;
   }
   public String toString() {
      String ans = "";
      if (coefficient.doubleValue() == 0) return "";
      if (degree == 0) return coefficient.toString();
      if (coefficient != 1) {
         if (coefficient == -1) ans += "-";
         else ans += coefficient + " ";
      }
      ans = ans + "X";
      if (degree == 1) return ans;
      return ans + "^" + degree;
   }
}

class DList<T> {
   private DNode<T> header, trailer;
   private int size;

   public DList() {
      size = 0;
      header = new DNode<T>(null, null, null);
      trailer = new DNode<T>(null, header, null);
      header.setNext(trailer);
   }

   // utility methods

   public int size() {
      return size;
   }

   public boolean isEmpty() {
      return size == 0;
   }

   // give clients access to nodes, but not to the header or trailer

   public DNode<T> getFirst() throws Exception {
      if (isEmpty())
         throw new Exception("Empty");
      return header.getNext();
   }

   public DNode<T> getLast() throws Exception {
      if (isEmpty())
         throw new Exception("Empty");
      return trailer.getPrev();
   }

   public DNode<T> getNext(DNode<T> v) throws Exception {
      DNode<T> ans = v.getNext();
      if (ans == null || ans == trailer)
         throw new Exception("No such node");
      return ans;
   }

   public DNode<T> getPrev(DNode<T> v) throws Exception {
      DNode<T> ans = v.getPrev();
      if (ans == null || ans == header)
         throw new Exception("No such node");
      return ans;
   }

   // methods to change the list

   public void addBefore(T d, DNode<T> v) {
      DNode<T> u = v.getPrev();
      DNode<T> x = new DNode<T>(d, u, v);
      u.setNext(x);
      v.setPrev(x);
      size++;
   }

   public void addAfter(T d, DNode<T> v) {
      DNode<T> w = v.getNext();
      DNode<T> x = new DNode<T>(d, v, w);
      v.setNext(x);
      w.setPrev(x);
      size++;
   }

   public void addFirst(T d) {
      addAfter(d, header);
   }

   public void addLast(T d) {
      addBefore(d, trailer);
   }

   public T remove(DNode<T> v) throws Exception {
      if (v == header || v == trailer)
         throw new Exception("Sentinel");
      DNode<T> u = v.getPrev();
      DNode<T> w = v.getNext();
      w.setPrev(u);
      u.setNext(w);
      size--;
      return v.getData();
   }

   // LinkedList testing methods:

   public String toString() {
      String ans = "";
      DNode<T> n = header;
      ans += "(H)<-->";
      do {
         n = n.getNext();
         if (n == trailer)
            ans += "(T)";
         else
            ans += (n.getData() + "<-->");
      } while (n != trailer);
      return ans;
   }
}

class DNode<T> {
   private T data;
   private DNode<T> prev, next;

   public DNode(T d, DNode<T> p, DNode<T> n) {
      data = d;
      next = n;
      prev = p;
   }

   public T getData() {
      return data;
   }

   public DNode<T> getNext() {
      return next;
   }

   public DNode<T> getPrev() {
      return prev;
   }

   public void setData(T d) {
      data = d;
   }

   public void setNext(DNode<T> n) {
      next = n;
   }

   public void setPrev(DNode<T> p) {
      prev = p;
   }
}