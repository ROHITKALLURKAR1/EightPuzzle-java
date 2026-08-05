public class Node {

    Board board;

    Node parent;

    int g;
    int h;
    int f;

    public Node(Board board, Node parent, int g) {
        this.board = board;
        this.parent = parent;
        this.g = g;
    }

}