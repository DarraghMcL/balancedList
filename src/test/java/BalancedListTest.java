import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BalancedListTest {

    BalancedList balancedList;

    @BeforeEach
    public void setup(){


    }

    @Test
    public void createNewNodeTest(){
        BalancedNode newNode = BalancedNode.createNewNode(new Object(), 2);
        assertTrue(newNode.getId()==2);

    }

    @Test
    public void addNodeTest(){
        BalancedNode node = BalancedNode.createNewNode(new Object(), 1);

        balancedList = BalancedList.createNewList(node);
        balancedList.add(BalancedNode.createNewNode(new Object(), 2), BalancedNode.createNewNode(new Object(), 3));
        System.out.println(balancedList.toString());

        assertTrue(balancedList.size()== 3);

    }

    @Test
    public void addMultipleNodeTest(){
        BalancedNode node = BalancedNode.createRootNode(new Object(), 1);

        balancedList = BalancedList.createNewList(node);
        balancedList.add(BalancedNode.createNewNode(new Object(), 2), BalancedNode.createNewNode(new Object(), 3));
        balancedList.add(BalancedNode.createNewNode(new Object(), 4), BalancedNode.createNewNode(new Object(), 5));
        balancedList.add(BalancedNode.createNewNode(new Object(), 6), BalancedNode.createNewNode(new Object(), 7));
        balancedList.add(BalancedNode.createNewNode(new Object(), 8), BalancedNode.createNewNode(new Object(), 9));
        balancedList.add(BalancedNode.createNewNode(new Object(), 10), BalancedNode.createNewNode(new Object(), 11));


        System.out.println(balancedList.toString());

        assertTrue(balancedList.size()== 11);

    }

    @Test
    public void popRightTest(){
        BalancedNode node = BalancedNode.createRootNode(new Object(), 1);

        balancedList = BalancedList.createNewList(node);
        balancedList.add(BalancedNode.createNewNode(new Object(), 2), BalancedNode.createNewNode(new Object(), 3));
        balancedList.add(BalancedNode.createNewNode(new Object(), 4), BalancedNode.createNewNode(new Object(), 5));
        balancedList.add(BalancedNode.createNewNode(new Object(), 6), BalancedNode.createNewNode(new Object(), 7));
        balancedList.add(BalancedNode.createNewNode(new Object(), 8), BalancedNode.createNewNode(new Object(), 9));
        balancedList.add(BalancedNode.createNewNode(new Object(), 10), BalancedNode.createNewNode(new Object(), 11));

        balancedList.popRight();

        System.out.println(balancedList.toString());

        assertTrue(balancedList.getRootNode().getId()==3);

    }

    @Test
    public void popRightMultipleTest(){
        BalancedNode node = BalancedNode.createRootNode(new Object(), 1);

        balancedList = BalancedList.createNewList(node);
        balancedList.add(BalancedNode.createNewNode(new Object(), 2), BalancedNode.createNewNode(new Object(), 3));
        balancedList.add(BalancedNode.createNewNode(new Object(), 4), BalancedNode.createNewNode(new Object(), 5));
        balancedList.add(BalancedNode.createNewNode(new Object(), 6), BalancedNode.createNewNode(new Object(), 7));
        balancedList.add(BalancedNode.createNewNode(new Object(), 8), BalancedNode.createNewNode(new Object(), 9));
        balancedList.add(BalancedNode.createNewNode(new Object(), 10), BalancedNode.createNewNode(new Object(), 11));

        balancedList.popRight();
        balancedList.popRight();
        balancedList.popRight();
        balancedList.popRight();

        System.out.println(balancedList.toString());

        assertTrue(balancedList.getRootNode().getId()==9);

    }


    @Test
    public void popLeftTest(){
        BalancedNode node = BalancedNode.createRootNode(new Object(), 1);

        balancedList = BalancedList.createNewList(node);
        balancedList.add(BalancedNode.createNewNode(new Object(), 2), BalancedNode.createNewNode(new Object(), 3));
        balancedList.add(BalancedNode.createNewNode(new Object(), 4), BalancedNode.createNewNode(new Object(), 5));
        balancedList.add(BalancedNode.createNewNode(new Object(), 6), BalancedNode.createNewNode(new Object(), 7));
        balancedList.add(BalancedNode.createNewNode(new Object(), 8), BalancedNode.createNewNode(new Object(), 9));
        balancedList.add(BalancedNode.createNewNode(new Object(), 10), BalancedNode.createNewNode(new Object(), 11));

        balancedList.popLeft();

        System.out.println(balancedList.toString());

        assertTrue(balancedList.getRootNode().getId()==2);

    }

    @Test
    public void popLeftMultipleTest(){
        BalancedNode node = BalancedNode.createRootNode(new Object(), 1);

        balancedList = BalancedList.createNewList(node);
        balancedList.add(BalancedNode.createNewNode(new Object(), 2), BalancedNode.createNewNode(new Object(), 3));
        balancedList.add(BalancedNode.createNewNode(new Object(), 4), BalancedNode.createNewNode(new Object(), 5));
        balancedList.add(BalancedNode.createNewNode(new Object(), 6), BalancedNode.createNewNode(new Object(), 7));
        balancedList.add(BalancedNode.createNewNode(new Object(), 8), BalancedNode.createNewNode(new Object(), 9));
        balancedList.add(BalancedNode.createNewNode(new Object(), 10), BalancedNode.createNewNode(new Object(), 11));

        balancedList.popLeft();
        balancedList.popLeft();
        balancedList.popLeft();
        balancedList.popLeft();


        System.out.println(balancedList.toString());

        assertTrue(balancedList.getRootNode().getId()==8);

    }

    @Test
    public void passTheParcel(){

        String parcel = "Pass Me";
        BalancedNode node = BalancedNode.createRootNode(parcel, 1);

        balancedList = BalancedList.createNewList(node);
        balancedList.add(BalancedNode.createNewNode(new Object(), 2), BalancedNode.createNewNode(new Object(), 3));
        balancedList.add(BalancedNode.createNewNode(new Object(), 4), BalancedNode.createNewNode(new Object(), 5));

        balancedList.popLeft();
        balancedList.popLeft();
        balancedList.popLeft();
        balancedList.popLeft();
        balancedList.popLeft();

        balancedList.popRight();
        balancedList.popRight();
        balancedList.popRight();
        balancedList.popRight();
        balancedList.popRight();

        System.out.println("Pass the Parcel: " + balancedList.toString());

        assertTrue(balancedList.getRootNode().getPayload().equals("Pass Me"));

    }


}
