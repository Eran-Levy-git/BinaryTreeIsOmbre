public class main {

    private TestNode n = new TestNode(null,null,"c");

    public void doSomething(TestNode a){
        a.color = "ro";
    }

    public static void main(String[] args) {
        
        Node binaryTree = new Node(new Shade("green", "blue"));
        binaryTree.setLeft(new Node(new Shade("purple", "blue")));
        binaryTree.setRight(new Node(new Shade("blue", "azure")));
        binaryTree.getLeft().setLeft(new Node(new Shade("orange", "purple")));
        binaryTree.getLeft().setRight(new Node(new Shade("pink", "purple")));
        binaryTree.getLeft().getRight().setRight(new Node(new Shade("pink", "red")));

        System.out.println(binaryTree.isOmbre(binaryTree));
        
        // TestNode b = new TestNode(null, null,"yell");
        // System.out.println(b.color);
        // main a = new main();
        // a.doSomething(b);
        // System.out.println(b.color);
    }
}


