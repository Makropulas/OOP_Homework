package DZ_Seminar1_27_03_2023.Task_1;

import java.util.ArrayList;

public class Research {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.getP1().getFullName().equals(p.getFullName())  && t.getRe() == re) {
                result.add(t.getP2().getFullName());
            }
        }
        return result;
    }
}
