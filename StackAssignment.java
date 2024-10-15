package first;
import java.util.Scanner;

class TwoStacks {
    private int[] array;
    private int capacity;
    private int top1;
    private int top2;

    public TwoStacks(int size) {
        this.capacity = size;
        array = new int[capacity];
        top1 = -1; // Stack 1 starts from the beginning
        top2 = capacity; // Stack 2 starts from the end
    }

    // Push to Stack 1
    public void push1(int value) {
        if (top1 + 1 < top2) {
            array[++top1] = value;
        } else {
            System.out.println("Stack 1 is full");
        }
    }

    // Pop from Stack 1
    public Integer pop1() {
        if (top1 >= 0) {
            return array[top1--];
        } else {
            System.out.println("Stack 1 is empty");
            return null;
        }
    }

    // Peek at Stack 1
    public Integer peek1() {
        if (top1 >= 0) {
            return array[top1];
        } else {
            System.out.println("Stack 1 is empty");
            return null;
        }
    }

    // Check if Stack 1 is empty
    public boolean isEmpty1() {
        return top1 == -1;
    }

    // Push to Stack 2
    public void push2(int value) {
        if (top2 - 1 > top1) {
            array[--top2] = value;
        } else {
            System.out.println("Stack 2 is full");
        }
    }

    // Pop from Stack 2
    public Integer pop2() {
        if (top2 < capacity) {
            return array[top2++];
        } else {
            System.out.println("Stack 2 is empty");
            return null;
        }
    }

    // Peek at Stack 2
    public Integer peek2() {
        if (top2 < capacity) {
            return array[top2];
        } else {
            System.out.println("Stack 2 is empty");
            return null;
        }
    }

    // Check if Stack 2 is empty
    public boolean isEmpty2() {
        return top2 == capacity;
    }
}

public class StackAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the array: ");
        int capacity = scanner.nextInt();
        
        TwoStacks stacks = new TwoStacks(capacity);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Push to Stack 1");
            System.out.println("2. Pop from Stack 1");
            System.out.println("3. Peek at Stack 1");
            System.out.println("4. Check if Stack 1 is empty");
            System.out.println("5. Push to Stack 2");
            System.out.println("6. Pop from Stack 2");
            System.out.println("7. Peek at Stack 2");
            System.out.println("8. Check if Stack 2 is empty");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push to Stack 1: ");
                    stacks.push1(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Popped from Stack 1: " + stacks.pop1());
                    break;
                case 3:
                    System.out.println("Top of Stack 1: " + stacks.peek1());
                    break;
                case 4:
                    System.out.println("Stack 1 is empty: " + stacks.isEmpty1());
                    break;
                case 5:
                    System.out.print("Enter value to push to Stack 2: ");
                    stacks.push2(scanner.nextInt());
                    break;
                case 6:
                    System.out.println("Popped from Stack 2: " + stacks.pop2());
                    break;
                case 7:
                    System.out.println("Top of Stack 2: " + stacks.peek2());
                    break;
                case 8:
                    System.out.println("Stack 2 is empty: " + stacks.isEmpty2());
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 9);

        scanner.close();
    }
}
