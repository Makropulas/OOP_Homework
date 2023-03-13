package DZ_Seminar1_02_03_2023.Task_1;

import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person person1, Relationship rel, Person person2) {
        if(rel == Relationship.parent){
            tree.add(new Node(person1, Relationship.parent, person2));
            tree.add(new Node(person2, Relationship.children, person1));
        }
        if(rel == Relationship.spouse){
            if(person1.getSex().equals(person2.getSex()))
                System.out.println("Семья может быть только традиционной. Однополые браки неприемлемы!");
            else {
                tree.add(new Node(person1, Relationship.spouse, person2));
                tree.add(new Node(person2, Relationship.spouse, person1));
            }
        }
        if(rel == Relationship.brother){
            tree.add(new Node(person1, Relationship.brother, person2));
            tree.add(new Node(person2, Relationship.brother, person1));
        }
    }

}
