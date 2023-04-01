package Task_1;

import java.util.ArrayList;
import java.util.HashSet;

public class Research {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Research(GeoTree geoTree) {
        tree = geoTree.TREE;
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.getP1().getFullName().equals(p.getFullName())  && t.getRe() == re) {
                result.add(t.getP2().getFullName());
            }
        }
        return result;
    }
    public HashSet<String> gender(Sex sex) {
        for (Node t : tree) {
            if (t.getP1().getSex().equals(sex)) {
                result.add(t.getP1().getFullName());
            }
        }
        return new HashSet<>(result);
    }
}
