public class TestMyStack
{
    public static String pass(boolean b) {
        if(b) { return "pass"; }
        else { return "fail"; }
    }
    
    public static void main(String[] args) {
        MyStack s = new MyStack();
        
        // s is an empty stack (size should be zero)
        System.out.println("Stack is empty          : " + pass(s.isEmpty()) );
        System.out.println("Stack size is 0         : " + pass(s.size() == 0 ));
        
        s.push( new Person("1",1) );
        
        // s has one Person in it (should not be empty, size should be 1)
        System.out.println("Stack is not empty      : " + pass(!s.isEmpty()) );
        System.out.println("Stack size is 1         : " + pass(s.size()==1) );
        s.push( new Person("2",2) );
        s.push( new Person("3",3) );
        s.push( new Person("4",4) );
        
        // s should have size 4
        System.out.println("Stack size is 4         : " + pass(s.size()==4) );
        Person tmp = s.pop();
        
        // s should have size 3, tmp should be person with name "4" and age 4
        System.out.println("popped person is 4      : " + pass(tmp.getAge() == 4) );
        System.out.println("Stack size is 3         : " + pass(s.size()==3) );
        
        
        s.push( new Person("4",4) );
        s.push( new Person("5",5) );
        s.push( new Person("6",6) );
        s.push( new Person("7",7) );
        s.push( new Person("8",8) );
        s.push( new Person("9",9) );
        s.push( new Person("10",10) );
        s.push( new Person("11",11) );
        s.push( new Person("12",12) );
        
        for(int i=13; i<100+13; i++) {
            s.push(new Person("" + i, i));
        }
        
        // s should have size STACK_SIZE 
        System.out.println("stack size is " + MyStack.STACK_CAPACITY + "        : " + 
                           pass(s.size()== MyStack.STACK_CAPACITY) );
        tmp = s.pop();
        // tmp should be person with name "10" and age 10
        // size should not be 9
        System.out.println("popped person is not 13 : " + pass(tmp.getAge() != 13) );
        System.out.println("popped person is 10     : " + pass(tmp.getAge() == 10) );
        System.out.println("stack size is 9         : " + pass(s.size() ==9));
    }  
}
