package main.java;

public class BalancedNode<T> {

    public BalancedNode leftBuddy;
    public BalancedNode rightBuddy;
    public boolean isRoot;
    public T payload;
    public int id;


    public BalancedNode(T payload, boolean isRoot, BalancedNode leftBuddy, BalancedNode rightBuddy, int id ){
        this.payload = payload;
        this.isRoot = isRoot;
        this.leftBuddy = leftBuddy;
        this.rightBuddy = rightBuddy;
        this.id = id;
    }


    //I am (G)roooot
    public void setRoot(boolean isRoot) {
        this.isRoot = isRoot;
    }

    public void setLeftBuddy(BalancedNode leftBuddy){
        this.leftBuddy=leftBuddy;
    }

    public void setRightBuddy(BalancedNode rightBuddy){
        this.rightBuddy=rightBuddy;
    }

    public BalancedNode getLeftBuddy() {
        return leftBuddy;
    }

    public BalancedNode getRightBuddy() {
        return rightBuddy;
    }

}
