package first;

class TwoQueues {
    private int[] array;
    private int size;
    private int front1, rear1;
    private int front2, rear2;

    public TwoQueues(int size) {
        this.size = size;
        array = new int[size];
        front1 = 0;
        rear1 = 0;
        front2 = size - 1;
        rear2 = size - 1;
    }

    public void enqueue1(int value) {
        if (rear1 <= front2) { // Check for space
            array[rear1] = value;
            rear1++;
        } else {
            System.out.println("Queue 1 is full");
        }
    }

    public void enqueue2(int value) {
        if (rear2 >= rear1) { // Check for space
            array[rear2] = value;
            rear2--;
        } else {
            System.out.println("Queue 2 is full");
        }
    }

    public Integer dequeue1() {
        if (front1 < rear1) { // Check if Queue 1 is not empty
            int value = array[front1];
            front1++;
            return value;
        } else {
            System.out.println("Queue 1 is empty");
            return null;
        }
    }

    public Integer dequeue2() {
        if (front2 < size - 1) { // Check if Queue 2 is not empty
            int value = array[front2 + 1];
            front2++;
            return value;
        } else {
            System.out.println("Queue 2 is empty");
            return null;
        }
    }

    public void printQueue1() {
        if (front1 < rear1) {
            System.out.print("Queue 1: ");
            for (int i = front1; i < rear1; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Queue 1 is empty");
        }
    }

    public void printQueue2() {
        if (front2 < size - 1) {
            System.out.print("Queue 2: ");
            for (int i = rear2 + 1; i <= front2; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Queue 2 is empty");
        }
    }

    
}
