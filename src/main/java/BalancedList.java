public class BalancedList<T> {

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
        rightestNode.getLeftBuddy().setRightBuddy(null);

        detachNode(rightestNode);
        addLeftNode(rightestNode);

        setRootNode(rootNode.getLeftBuddy());

    }

    public void popRight() {
        BalancedNode leftestNode = getLeftestNode();
        leftestNode.getRightBuddy().setLeftBuddy(null);

        detachNode(leftestNode);
        addRightNode(leftestNode);

        setRootNode(rootNode.getRightBuddy());

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
            return traverseLeft(n.getLeftBuddy());
        }
        return n;
    }

    private BalancedNode traverseRight(BalancedNode n) {

        if (n.getRightBuddy() != null) {
           return traverseRight(n.getRightBuddy());
        }
        return n;

    }

    public BalancedNode getLeftestNode() {
        return traverseLeft(rootNode);
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
