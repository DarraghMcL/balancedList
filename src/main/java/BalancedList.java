public class BalancedList {

    private BalancedNode rootNode;


    public BalancedList(BalancedNode rootNode){
        this.rootNode = rootNode;
    }

    public BalancedNode getRootNode() {
        return rootNode;
    }

    public void setRootNode(BalancedNode n) {
        this.rootNode = n;
    }

    public static BalancedList createNewList(BalancedNode node){

        return new BalancedList(node);

    }

    public void popLeft() {

        BalancedNode rightestNode = getRightestNode();

        detachNode(rightestNode);
        addLeftNode(rightestNode);

        rootNode.setRoot(false);
        rootNode.getLeftBuddy().setRoot(true);

    }

    public void popRight() {
        BalancedNode leftestNode = getLeftestNode();

        detachNode(leftestNode);
        addRightNode(leftestNode);

        rootNode.setRoot(false);
        rootNode.getRightBuddy().setRoot(true);

    }

    public int size(){

        int size=0;
        BalancedNode node = getLeftestNode();

        while(node != null){
            size += 1;
            node = node.getRightBuddy();
        }

        return size;
    }

    public void add(BalancedNode leftNode, BalancedNode rightNode) {
        addLeftNode(leftNode);
        addRightNode(rightNode);
    }

    private BalancedNode traverseLeft(BalancedNode n) {

        if (n.getLeftBuddy() != null) {
            traverseLeft(n.getLeftBuddy());
        }
        return n;
    }

    public BalancedNode getLeftestNode() {
        return traverseLeft(rootNode);
    }

    private BalancedNode traverseRight(BalancedNode n) {

        if (n.getRightBuddy() != null) {
            traverseRight(n.getRightBuddy());
        }
        return n;

    }

    public BalancedNode getRightestNode() {
        return traverseRight(rootNode);
    }


    private void addLeftNode(BalancedNode n) {

        BalancedNode newNode = n;
        BalancedNode currentLeft = getLeftestNode();
        currentLeft.setLeftBuddy(n);
        newNode.setRightBuddy(currentLeft);

    }

    private void addRightNode(BalancedNode n) {
        BalancedNode newNode = n;
        BalancedNode currentRight = getRightestNode();
        currentRight.setRightBuddy(newNode);
        newNode.setLeftBuddy(currentRight);
    }

    public void detachNode(BalancedNode n) {
        n.leftBuddy = null;
        n.rightBuddy = null;
    }

    @Override
    public String toString(){
        String string = "This List: ";

        BalancedNode node = getLeftestNode();

        while(node != null){
            string += node.id + " ";
            node = node.getRightBuddy();
        }

        return string;
    }
}
