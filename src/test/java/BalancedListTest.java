import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BalancedListTest {

    BalancedList balancedList;

    @BeforeEach
    public void setup(){

        BalancedNode node = BalancedNode.createNewNode(new Object(), 1);

        BalancedList balancedList = BalancedList.createNewList(node);

    }

    @Test
    public void createNewNodeTest(){
        BalancedNode newNode = BalancedNode.createNewNode(new Object(), 2);
        assertTrue(newNode.getId()==2);

    }

    @Test
    public void addNodeTest(){

        balancedList.add(BalancedNode.createNewNode(new Object(), 2), BalancedNode.createNewNode(new Object(), 3) );
        System.out.print(balancedList.toString());

        assertTrue(balancedList.size()== 3);

    }

}