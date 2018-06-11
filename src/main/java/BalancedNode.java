public class BalancedNode<T> {

    public BalancedNode leftBuddy;
    public BalancedNode rightBuddy;
    public T payload;
    public int id;


    public BalancedNode(T payload, BalancedNode leftBuddy, BalancedNode rightBuddy, int id) {
        this.payload = payload;
        this.leftBuddy = leftBuddy;
        this.rightBuddy = rightBuddy;
        this.id = id;
    }

    public BalancedNode(T payload, int id){
        this.payload = payload;
        this.leftBuddy = null;
        this.rightBuddy = null;
        this.id = id;
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
