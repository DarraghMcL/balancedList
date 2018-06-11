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
        BalancedNode<String> newNode = new BalancedNode<>("Two", 2);
        assertTrue(newNode.getId()==2);
    }

    @Test
    public void addNodeTest(){
        BalancedNode<String> rootNode = new BalancedNode<>("One", 1);

        balancedList = BalancedList.createNewList(rootNode);
        balancedList.add(new BalancedNode<>("Two", 2), new BalancedNode<>("Three", 3));
        System.out.println(balancedList.toString());

        assertTrue(balancedList.size()== 3);

    }

    @Test
    public void addMultipleNodeTest(){
        BalancedNode<String> rootNode = new BalancedNode<>("One", 1);

        balancedList = BalancedList.createNewList(rootNode);
        balancedList.add(new BalancedNode<>("Two", 2), new BalancedNode<>("Three", 3));
        balancedList.add(new BalancedNode<>("Four", 4), new BalancedNode<>("Five", 5));
        balancedList.add(new BalancedNode<>("Six", 6), new BalancedNode<>("Seven", 7));
        balancedList.add(new BalancedNode<>("Eight", 8), new BalancedNode<>("Nine", 9));
        balancedList.add(new BalancedNode<>("Ten", 10), new BalancedNode<>("Eleven", 11));


        System.out.println(balancedList.toString());

        assertTrue(balancedList.size()== 11);

    }

    @Test
    public void popRightTest(){
        BalancedNode<String> rootNode = new BalancedNode<>("One", 1);

        balancedList = BalancedList.createNewList(rootNode);
        balancedList.add(new BalancedNode<>("Two", 2), new BalancedNode<>("Three", 3));
        balancedList.add(new BalancedNode<>("Four", 4), new BalancedNode<>("Five", 5));
        balancedList.add(new BalancedNode<>("Six", 6), new BalancedNode<>("Seven", 7));
        balancedList.add(new BalancedNode<>("Eight", 8), new BalancedNode<>("Nine", 9));
        balancedList.add(new BalancedNode<>("Ten", 10), new BalancedNode<>("Eleven", 11));

        balancedList.popRight();

        System.out.println(balancedList.toString());

        assertTrue(balancedList.getRootNode().getId()==3);

    }

    @Test
    public void popRightMultipleTest(){
        BalancedNode<String> rootNode = new BalancedNode<>("One", 1);

        balancedList = BalancedList.createNewList(rootNode);
        balancedList.add(new BalancedNode<>("Two", 2), new BalancedNode<>("Three", 3));
        balancedList.add(new BalancedNode<>("Four", 4), new BalancedNode<>("Five", 5));
        balancedList.add(new BalancedNode<>("Six", 6), new BalancedNode<>("Seven", 7));
        balancedList.add(new BalancedNode<>("Eight", 8), new BalancedNode<>("Nine", 9));
        balancedList.add(new BalancedNode<>("Ten", 10), new BalancedNode<>("Eleven", 11));

        balancedList.popRight();
        balancedList.popRight();
        balancedList.popRight();
        balancedList.popRight();

        System.out.println(balancedList.toString());

        assertTrue(balancedList.getRootNode().getId()==9);

    }


    @Test
    public void popLeftTest(){
        BalancedNode<String> rootNode = new BalancedNode<>("One", 1);

        balancedList = BalancedList.createNewList(rootNode);
        balancedList.add(new BalancedNode<>("Two", 2), new BalancedNode<>("Three", 3));
        balancedList.add(new BalancedNode<>("Four", 4), new BalancedNode<>("Five", 5));
        balancedList.add(new BalancedNode<>("Six", 6), new BalancedNode<>("Seven", 7));
        balancedList.add(new BalancedNode<>("Eight", 8), new BalancedNode<>("Nine", 9));
        balancedList.add(new BalancedNode<>("Ten", 10), new BalancedNode<>("Eleven", 11));

        balancedList.popLeft();

        System.out.println(balancedList.toString());

        assertTrue(balancedList.getRootNode().getId()==2);

    }

    @Test
    public void popLeftMultipleTest(){

        BalancedNode<String> rootNode = new BalancedNode<>("One", 1);

        balancedList = BalancedList.createNewList(rootNode);
        balancedList.add(new BalancedNode<>("Two", 2), new BalancedNode<>("Three", 3));
        balancedList.add(new BalancedNode<>("Four", 4), new BalancedNode<>("Five", 5));
        balancedList.add(new BalancedNode<>("Six", 6), new BalancedNode<>("Seven", 7));
        balancedList.add(new BalancedNode<>("Eight", 8), new BalancedNode<>("Nine", 9));
        balancedList.add(new BalancedNode<>("Ten", 10), new BalancedNode<>("Eleven", 11));

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
        BalancedNode<String> rootNode = new BalancedNode<>(parcel, 1);

        balancedList = BalancedList.createNewList(rootNode);
        balancedList.add(new BalancedNode<>("Two", 2), new BalancedNode<>("Three", 3));
        balancedList.add(new BalancedNode<>("Four", 4), new BalancedNode<>("Five", 5));
        balancedList.add(new BalancedNode<>("Six", 6), new BalancedNode<>("Seven", 7));

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
