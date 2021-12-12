package dsa;
 
// Array implementation of stack
public class StackArray<T> {
  private int size;
  private static int MAX_SIZE = 100;
  private T[] items;
 
  public StackArray() {
    size = 0;
    items = (T[])new Object[MAX_SIZE];
  }
 
  public int size() {
    return size;
  }
 
  public boolean isEmpty() {
    return size == 0;
  }
 
  public boolean push(T item) {
    // make sure the stack still have empty slot
    if (size < MAX_SIZE) {
      items[size] = item;
      size++;
      return true;
    }
    return false;
  }
 
  public boolean pop() {
    // make sure the stack is not empty
    if (isEmpty()) {
      return false;
    }
    items[size - 1] = null;
    size--;
    return true;
  }
 
  public T peek() {
    // make sure the stack is not empty
    if (isEmpty()) {
      return null;
    }
    return items[size - 1];
  }
 
  public static void main(String[] args) {
    StackArray<String> stack = new StackArray<String>();
    stack.push("hello");
    stack.push("world");
    stack.push("from");
    stack.push("RMIT");
    while (!stack.isEmpty()) {
      System.out.println(stack.peek());
      stack.pop();
    }
  }
}
