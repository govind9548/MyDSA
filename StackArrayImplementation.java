import java.util.*;

public class StackArrayImplementation {
    int top;
    int length;
    int[] stack;

    public StackArrayImplementation() {
        top = -1;
        length = 10;
        stack = new int[length];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == length - 1;
    }

    // push method
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full, cannot push " + data);
            return;
        }
        stack[++top] = data;
    }

    // pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot pop");
            return -1; // Error value
        }
        return stack[top--];
    }

    // peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty, no top element");
            return -1; // Error value
        }
        return stack[top];
    }

    // display
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements:");
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        StackArrayImplementation st = new StackArrayImplementation();
        st.push(34);
        st.push(24);
        st.push(44);
        st.push(14);
        st.push(54);

        st.display();

        System.out.println("Top element: " + st.peek());

        System.out.println("Popped element: " + st.pop());

        st.display();
    }
}
