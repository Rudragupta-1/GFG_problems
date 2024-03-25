
class MyStack {
  // Inner class to represent a node in the stack.
  class StackNode {
      int data;
      StackNode next;

      StackNode(int a) {
          data = a;
          next = null;
      }
  }

  StackNode top;

  // Function to push an integer into the stack.
  void push(int a) {
      StackNode newNode = new StackNode(a);
      newNode.next = top;
      top = newNode;
  }

  // Function to remove an item from the top of the stack.
  int pop() {
      if (top == null) {
          // Stack is empty, handle this case appropriately.
          return -1; // Assuming -1 represents an empty stack in this example.
      }

      int poppedValue = top.data;
      top = top.next;
      return poppedValue;
  }
}

