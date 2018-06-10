public class BalancedNode<T> {

    public BalancedNode leftBuddy;
    public BalancedNode rightBuddy;
    public boolean isRoot;
    public T payload;
    public int id;


    public BalancedNode(T payload, boolean isRoot, BalancedNode leftBuddy, BalancedNode rightBuddy, int id) {
        this.payload = payload;
        this.isRoot = isRoot;
        this.leftBuddy = leftBuddy;
        this.rightBuddy = rightBuddy;
        this.id = id;
    }

    public static BalancedNode createNewNode(Object payload, boolean isRoot, BalancedNode leftBuddy, BalancedNode rightBuddy, int id) {
        return new BalancedNode(payload, isRoot, leftBuddy, rightBuddy, id);
    }

    public static BalancedNode createNewNode(Object payload, int id) {
        return new BalancedNode(payload, false, null, null, id);
    }

    public static BalancedNode createRootNode(Object payload, int id) {
        return new BalancedNode(payload, true, null, null, id);
    }


    //I am (G)roooot
    public void setRoot(boolean isRoot) {
        this.isRoot = isRoot;
    }

    public void setLeftBuddy(BalancedNode leftBuddy) {
        this.leftBuddy = leftBuddy;
    }

    public void setRightBuddy(BalancedNode rightBuddy) {
        this.rightBuddy = rightBuddy;
    }

    public BalancedNode getLeftBuddy() {
        if (leftBuddy != null) {
            return leftBuddy;
        } else {
            return null;
        }
    }

    public BalancedNode getRightBuddy() {
        if (rightBuddy != null) {
            return rightBuddy;
        } else {
            return null;
        }
    }

    public Object getPayload() {
        return payload;
    }

    public int getId() {
        return this.id;
    }

}
