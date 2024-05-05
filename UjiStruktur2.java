public class UjiStruktur2 {
	public static void main(String[] args) {
        // Buat stack dengan kapasitas 3
        StrukturStack stack = new StrukturStack(3);

        // Cetak status stack sebelum melakukan operasi apapun
        System.out.println("#Status awal stack");
        cetakStatusStack(stack);

        // Lakukan push 3 kali
        System.out.println("#Melakukan push 3x:");
        stack.push(2);
        stack.push(4);
        stack.push(1);

        // Cetak status stack setelah push 3x
        System.out.println("#Status stack setelah push 3x");
        cetakStatusStack(stack);

        // Lakukan operasi pop
        System.out.println("#Melakukan pop 1x:");
        stack.pop();

        // Cetak status stack setelah pop 1x
        System.out.println("#Status stack setelah pop 1x");
        cetakStatusStack(stack);

        // Lakukan pop lagi untuk mengosongkan stack
        System.out.println("#Melakukan pop 2x:");
        stack.pop();
        stack.pop();

        // Cetak status stack setelah semua pop
        System.out.println("#Status stack setelah semua pop");
        cetakStatusStack(stack);
    }

    // Metode untuk mencetak status stack
    public static void cetakStatusStack(StrukturStack stack) {
        System.out.println("Size : " + stack.size());
        System.out.println("Empty : " + stack.isEmpty());
        System.out.println("Full : " + stack.isFull());
        System.out.println("Top : " + (stack.isEmpty() ? -1 : stack.peek()));

        System.out.print("Elemen from TOP : ");
        if (stack.isEmpty()) {
            System.out.print("-");
        } else {
            for (int i = stack.size() - 1; i >= 0; i--) {
                System.out.print(stack.getElementAt(i) + " ");
            }
        }
        System.out.println();
    }
}
