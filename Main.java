package JAVA;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada a = new ListaEncadeada();
        ListaEncadeada b = new ListaEncadeada();

        // Adiciona elementos à lista A
        a.append(13);
        a.append(7);
        a.append(3);
        a.append(54);
        a.append(7);

        // Adiciona elementos à lista B
        b.append(34);
        b.append(2);
        b.append(89);
        b.append(11);
        b.append(13);

        int z = 54;
        int y = 2;

        ListaEncadeada c = ListaEncadeada.intercalar(a, b, z, y);

        JAVA.ListaEncadeada.Node temp = c.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
