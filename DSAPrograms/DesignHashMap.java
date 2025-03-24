package DSAPrograms;

class MyHashMap {
    private static final int SIZE = 10000;
    private ListNode[] map;

    public MyHashMap() {
        map = new ListNode[SIZE];
    }

    public void put(int key, int value) {
        int index = getIndex(key);
        if (map[index] == null) {
            map[index] = new ListNode(-1, -1); // Dummy node
        }
        ListNode prev = findNode(map[index], key);
        if (prev.next == null) {
            prev.next = new ListNode(key, value);
        } else {
            prev.next.value = value;
        }
    }

    public int get(int key) {
        int index = getIndex(key);
        if (map[index] == null) {
            return -1;
        }
        ListNode prev = findNode(map[index], key);
        return prev.next == null ? -1 : prev.next.value;
    }

    public void remove(int key) {
        int index = getIndex(key);
        if (map[index] == null) {
            return;
        }
        ListNode prev = findNode(map[index], key);
        if (prev.next != null) {
            prev.next = prev.next.next;
        }
    }

    private int getIndex(int key) {
        return Integer.hashCode(key) % SIZE;
    }

    private ListNode findNode(ListNode head, int key) {
        ListNode node = head;
        ListNode prev = null;
        while (node != null && node.key != key) {
            prev = node;
            node = node.next;
        }
        return prev;
    }

    private static class ListNode {
        int key, value;
        ListNode next;

        ListNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
