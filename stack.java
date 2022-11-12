import java.rmi.server.ObjID;
public class stack<T> {
    int size=10 ;
    Object [] stack;

    int top = -1;
    public stack(int size){
        this.size=size;
        stack = new Object[this.size];
        top=-1;
    }
    public void push(Object item){
        if(IsFull()){
            System.out.print ("stack  is Full ");
        }else{
            top++;
            stack[top]=item;
        }

    }
    public boolean IsFull(){
        if(top >= size-1){
            return true;
        }else{
            return false;
        }
    }
    public T pop(){
        if(ISempty()){
            System.out.println("stack is empty");
            return null;
        }
        else{
            T elem = (T) stack[top];
            top--;
            return elem ;
    }

    }
    public T gettop(){
        if(ISempty()){
           
            return null;
        }
        else{
            T elem = (T) stack[top];

            
            return elem ;
    }

    }
    public boolean ISempty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
  
        

     public static void main(String[] args) {
    
       /* stack<Integer>stack=new stack<Integer>(10); 
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("top = "+stack.gettop());*/ 

        stack<String>stack=new stack<String>(3); 
        stack.push("samar");
        stack.push("samar omer");
        stack.push("samar omer mohammed ");

       
         System.out.println("top = "+stack.gettop());
       // System.out.println("top = "+stack.pop());

 }

}
 