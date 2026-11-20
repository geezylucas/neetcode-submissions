class LRUCache {

    private Map<Integer, Node> store;
    private Node head;
    private Node tail;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.store = new HashMap<>();
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }
    
    public int get(int key) {
        Node node = store.get(key);
        if (node == null) {
            return -1;
        }

        remove(node);
        addFirst(node);

        return node.val;
    }
    
    public void put(int key, int value) {
        Node node = store.get(key);

        if (node != null) {
            node.val = value;
            remove(node);
            addFirst(node);
            return;
        }

        if (store.size() == capacity) {
            Node lru = tail.prev;
            remove(lru);
            store.remove(lru.key);
        }

        Node fresh = new Node(key, value);
        store.put(key, fresh);
        addFirst(fresh);
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addFirst(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    private static class Node {

        int key;
        int val;
        Node next;
        Node prev;

        Node (int key, int val) {
            this.key = key;
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }
}
