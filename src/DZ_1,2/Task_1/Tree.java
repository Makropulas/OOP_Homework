package Task_1;

import java.util.ArrayList;

public interface Tree {
    ArrayList<Node> TREE = new ArrayList<>();

    void append(Person person1, Relationship rel, Person person2);
}
