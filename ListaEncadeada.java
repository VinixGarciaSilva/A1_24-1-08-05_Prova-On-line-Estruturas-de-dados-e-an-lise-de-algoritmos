package JAVA;

public class ListaEncadeada {
    Node head; // cabeça da lista

    // Classe Node
    static class Node {
        int data;
        Node next;

        // Construtor
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static ListaEncadeada intercalar(ListaEncadeada a, ListaEncadeada b, int z, int y) {
        ListaEncadeada c = new ListaEncadeada();
        Node aTemp = a.head;
        Node bTemp = b.head;
        boolean isA = true;

        while (aTemp != null || bTemp != null) {
            if (isA) {
                while (aTemp != null && aTemp.data != z) {
                    c.append(aTemp.data);
                    aTemp = aTemp.next;
                }
                if (aTemp != null) {
                    c.append(aTemp.data);
                    aTemp = aTemp.next;
                }
                isA = false;
            } else {
                while (bTemp != null && bTemp.data != y) {
                    c.append(bTemp.data);
                    bTemp = bTemp.next;
                }
                if (bTemp != null) {
                    c.append(bTemp.data);
                    bTemp = bTemp.next;
                }
                isA = true;
            }
        }

        // Adiciona os elementos restantes da lista A ou B
        while (aTemp != null) {
            c.append(aTemp.data);
            aTemp = aTemp.next;
        }
        while (bTemp != null) {
            c.append(bTemp.data);
            bTemp = bTemp.next;
        }

        return c;
    }

    public void append(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new Node(new_data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = new_node;
        return;
    }
}
