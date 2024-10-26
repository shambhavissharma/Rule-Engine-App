package src.main.java.model;

public class Node {
    private String type; // "operator" (AND/OR) or "operand" (condition)
    private Node left;
    private Node right;
    private String value; // e.g., "age > 30" for operand nodes

    public Node(String type, Node left, Node right, String value) {
        this.type = type;
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public String getType() { return type; }
    public Node getLeft() { return left; }
    public Node getRight() { return right; }
    public String getValue() { return value; }
}