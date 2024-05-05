public class UjiStrukturStack {
	public static void main(String[] args) {
        StrukturStack stack = new StrukturStack(3);

        System.out.println("#Sebelum push");
        cetakStatusStack(stack);

        System.out.println("#Melakukan push 3x:");
        stack.push(2);
        stack.push(4);
        stack.push(1);

        cetakStatusStack(stack);
    }

    public static void cetakStatusStack(StrukturStack stack) {
        System.out.println("Size : " + stack.size());
        System.out.println("Empty : " + stack.isEmpty());
        System.out.println("Full : " + stack.isFull());
        System.out.println("Top : " + stack.peek());

        System.out.print("Elemen from TOP : ");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.getElementAt(i) + " ");
        }
        System.out.println();
    }
}
