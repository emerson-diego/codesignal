package codeSignal;

public class reverseLinkedList {

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 3, 4, 5 };

        var initialList = createInitialList(nodes);

        println(initialList);

        var resultList = reverseLinkedList(initialList);

        println(resultList);

    }

    static ListNode<Integer> reverseLinkedList(ListNode<Integer> l) {

        if (l == null)
            return null;

        return createReverseLinkedList(l, null);

    }

    static ListNode<Integer> createReverseLinkedList(ListNode<Integer> l, ListNode<Integer> resultL) {

        if (l.next == null) {
            if (resultL == null) {
                resultL = new ListNode(l.value);

            } else {

                var lNodePointer = resultL;
                while (lNodePointer.next != null) {
                    lNodePointer = lNodePointer.next;
                }

                var lNode = new ListNode(l.value);
                lNodePointer.next = lNode;

            }

            return resultL;
        }

        else {
            resultL = createReverseLinkedList(l.next, resultL);

            l.next = null;
            createReverseLinkedList(l, resultL);

        }
        return resultL;

    }

    static void println(ListNode<Integer> l) {

        while (l != null) {
            System.out.println(l.value);
            println(l.next);
            return;

        }

        return;
    }

    static ListNode<Integer> createInitialList(int[] nodes) {
        ListNode<Integer> initialList = new ListNode(nodes[0]);

        ListNode<Integer> lNodesPonteiro = initialList;

        for (int i = 1; i < nodes.length; i++) {

            ListNode lNode = new ListNode(nodes[i]);

            lNodesPonteiro.next = lNode;

            lNodesPonteiro = lNode;

        }
        return initialList;
    }
}

class ListNode<T> {
    ListNode(T x) {
        value = x;
    }

    T value;
    ListNode<T> next;
}