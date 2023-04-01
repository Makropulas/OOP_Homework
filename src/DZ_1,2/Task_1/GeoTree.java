package Task_1;

public class GeoTree implements Tree {
    @Override
    public void append(Person person1, Relationship rel, Person person2) {
        if (person1.equals(person2) || (rel == Relationship.spouse && person1.getSex().equals(person2.getSex()))) {
            System.out.println("Установить связь между " + person1.getFullName() + " и " + person2.getFullName() + " невозможно!");
        } else {
            TREE.add(new Node(person1, rel, person2));
            TREE.add(new Node(person2, rel.getInverseRelationship(), person1));
        }
    }
}
