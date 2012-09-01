package cn.edu.fjnu.cse.lab107.cxs;

//Message
public class Message {


//int main(){
//	Thing a;
//	String s = a.getClass().getName();
//    Class s = Class.forName(a);
//}
	
 
   private int operation;
   public Message(int operation, String classType) {
	super();
	this.operation = operation;
	this.classType = classType;
}
   
public int getOperation() {
	return operation;
}

public void setOperation(int operation) {
	this.operation = operation;
}

public String getClassType() {
	return classType;
}

public void setClassType(String classType) {
	this.classType = classType;
}

private String classType;

   private final static int CREATE = 1;
   private final static int RETRIEVE = 2;
   private final static int UPDATE = 3;
   private final static int DELETE = 4;
   
}


