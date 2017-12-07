public class Y23080966 extends ExpressionTree {

   public static void main(String args[]) {
      Y23080966 y = new Y23080966("5 + 6 * 7");
      Utility.print(y);
      y = new Y23080966(Utility.getInput());
      Utility.print(y);
   }
   
   public String fullyParenthesised() {
	   String ans = "";
	   ArrayList<BNode<String>> answer = new ArrayList<BNode<String>>();
	   fullyParenthesised((BNode<String>) root(), answer);
	   
	   for(BNode<String> i:answer) ans += i.getData() + " ";
	   return ans;
   }
	   
	   public void fullyParenthesised(BNode<String> n, ArrayList<BNode<String>> arr) {
		   if (n == null) return;
		   fullyParenthesised(n.getLeft(), arr);
		   BNode<String> parent = (BNode<String>) n.getParent();
		   if(parent != null){
			   
			   if( isLeaf(parent.getLeft()) && parent.getLeft() == n) {			   
				   //add Left side brackets
				   int a = leftBracketCount((BNode<String>) n.parent,n);
				   for(int i = a;i>0;i--) arr.add(new BNode<String>("(",null,null,null));
				   arr.add(n);
			   }else if( isLeaf(parent.getRight()) && parent.getRight() == n ) {
				   //add Right side brackets
				   int a = rightBracketCount((BNode<String>) n.parent,n);
				   arr.add(n);
				   for(int i = a;i>0;i--) arr.add(new BNode<String>(")",null,null,null));
			   }else {arr.add(n);}
			   
		   }else{
			   arr.add(n); //add root
		   }	   
		   fullyParenthesised(n.getRight(), arr);   
	   }
	   
	   public int leftBracketCount(BNode<String> pr,BNode<String> ch) {
		   if (isRoot(pr)) {
			   if(pr.getLeft() != ch) return 0;
			   else return 1;
		   }
		   if(pr.getLeft() != ch) return 0;
		   return 1 + leftBracketCount((BNode<String>) parent(pr), pr);
	   }
	   
	   
	   public int rightBracketCount(BNode<String> pr,BNode<String> ch) {
		   if (isRoot(pr)) {
			   if(pr.getRight() != ch) return 0;
			   else return 1;
		   }
		   if(pr.getRight() != ch) return 0;
		   return 1 + rightBracketCount((BNode<String>) parent(pr),pr);
	   }


   public Y23080966(String s) {
      super();
      // add implementation here
      Stack<BNode<String>> treeStack = new Stack<BNode<String>>();
      BNode<String> tempNode;
      //call infix to post fix method
      s = s.replaceAll("\\s+","");
      String inPost = inToPost(s);  
      String split[] = inPost.split("(?<=op)|(?=op)|\\s+".replace("op", "[-+*/()\\s+]"));
      for(String operator: split){
    	  if(operator.matches("[0-9a-zA-Z]+")){
    		  tempNode = new BNode<String>(operator, null,null,null);
    		  treeStack.push(tempNode);
    	  }
    	  else if(isOperator(operator.charAt(0))){
    		  BNode<String> first = treeStack.pop();
    		  BNode<String> second = treeStack.pop();
    		  tempNode = new BNode<String>(operator, null,null,null);
    		  first.setParent(tempNode);
    		  second.setParent(tempNode);
    		  tempNode.setRight(first);
    		  tempNode.setLeft(second);
    		  treeStack.push(tempNode);
    	  }
      }
      root = treeStack.pop();
   }
   
   public String inToPost(String s){
	   Stack<Character> stack = new Stack<Character>();
	   String result = new String("");
	   
	   for(int i=0; i<s.length(); i++){
		   char c = s.charAt(i);
		   
		   if(c == '('){
			   result += " ";
			   stack.push(c);
		   }
		   else if(c == ')'){
			   result += " ";
			   while(!stack.isEmpty() && stack.peek() != '(') result += stack.pop();
			   if (!stack.isEmpty() && stack.peek() != '(')
                   return "Invalid Expression";                
               else
                   stack.pop();
		   }
		   else if( isOperator(c) ){
			  result += " ";
               while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) result += stack.pop();
               stack.push(c);
           }else{
        	   result += c ;
           }
	   }
	   while (!stack.isEmpty())result += " " +stack.pop();
       return result;   
   }
   
   // A utility function to return precedence of a given operator
   // Higher returned value means higher precedence
   public static int Prec(char ch){
       switch (ch){
       case '+':
       case '-':
           return 1;
     
       case '*':
       case '/':
           return 2;
     
       case '^':
           return 3;
       }
       return -1;
   }//end of Prec
   
   //to check if the given value is an operator
   boolean isOperator(char c) {
       if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
           return true;
       }
       return false;
   }
   
}
