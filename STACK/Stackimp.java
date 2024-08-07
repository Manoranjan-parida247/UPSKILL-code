class Stackimp {
    static final int size = 10;
    int[] st;
    int top;

    public Stackimp() {
        st = new int[size];
        top = -1;
    }

    // isEmpty
    public boolean isEmpty() {
        return top == -1;
    }

    // isFull
    public boolean isFull() {
        return top == size - 1;
    }

    // push operation
    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full or overflow!");
            return;
        }
        st[++top] = item;
    }

    // pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty or underflow!");
            return -1;
        }
        return st[top--];
    }

    // peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty or underflow!");
            return -1;
        }
        return st[top];
    }

    // display stack
    public void displayStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(st[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stackimp stack = new Stackimp();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.displayStack(); // Output: 3 2 1
        System.out.println(stack.pop()); // Output: 3
        stack.displayStack(); // Output: 2 1
        System.out.println(stack.peek()); // Output: 2
    }
}



