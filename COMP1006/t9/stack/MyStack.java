public class MyStack {
    // capacity of the stack
    public static final int STACK_CAPACITY = 10;
    private Person[] stack;
    private int len;
    
    public MyStack() {
        this.stack = new Person[this.STACK_CAPACITY];
        this.len = -1;
    }
    
    public boolean push(Person p) {
        // adds Person 'p' to the current MyStack
        // return true if successful
        // return false if unsuccesful
        if (this.len == -1) {
            this.stack[0] = p;
            this.len++;
            return true;
        }
        if (this.len+1 == this.STACK_CAPACITY) {
            return false;
        }
        for (int i = this.len+1; i > 0; i--) {
            this.stack[i] = this.stack[i-1];
        }
        this.stack[0] = p;
        this.len++;
        return true;
    }
    
    public boolean isEmpty() {
        // returns true if the current stack is empty
        // returns false if the current stack is not empty
        if (this.len > -1) {
            return false;
        }
        return true;
    }
    
    public Person pop() {
        // removes and returns the Person on the top of the stack
        // returns the Person that was on the top of the stack
        //     when the method was called 
        // returns the empty peron new Person("empty", -1) if 
        //     the stack was empty
        if (this.len == -1) {
            return new Person("empty", -1);
        }
        Person tmp = this.stack[0];
        for (int i = 0; i < this.len; i++) {
            this.stack[i] = this.stack[i+1];
        }
        this.stack[this.len] = null;
        this.len--;
        return tmp;
    }
    
    public int size() {
        // return the size of the stack
        // (the number of Person objects stored in the stack)
        return this.len+1;
    }
    public int getCapacity() { return STACK_CAPACITY; }
    /*public void print() {
        System.out.print("[");
        for (int i = 0; i < this.STACK_CAPACITY; i++) {
            System.out.print(this.stack[i] + " ");
        }
        System.out.println("]");
    }*/
}
