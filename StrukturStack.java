public class StrukturStack {
    private int capacity;
    private int[] array;
    private int TOP;

    public StrukturStack(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.TOP = -1;
    }

    public boolean isEmpty() {
        return TOP == -1;
    }

    public boolean isFull() {
        return TOP == capacity - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh, tidak bisa menambah elemen");
        } else {
            TOP++;
            array[TOP] = data;
            System.out.println("Data " + data + " ditambahkan ke Stack");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong, tidak bisa menghapus elemen");
            return -1;
        } else {
            int popped = array[TOP];
            TOP--;
            return popped;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong, tidak ada elemen teratas");
            return -1;
        } else {
            return array[TOP];
        }
    }

    public int size() {
        return TOP + 1;
    }

    public int getElementAt(int index) {
        if (index >= 0 && index <= TOP) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Indeks di luar jangkauan");
        }
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
        } else {
            System.out.print("Isi Stack: ");
            for (int i = 0; i <= TOP; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
