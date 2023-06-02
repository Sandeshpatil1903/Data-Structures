package Queue;

public class NodeLL {

    String data;
    NodeLL next;

    public NodeLL(String data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "NodeLL{" +
                "data='" + data + '\'' +
                ", next=" + next +
                '}';
    }
}
