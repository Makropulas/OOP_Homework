package Task_1;

public enum Relationship {
    parent {
        @Override
        public Relationship getInverseRelationship() {
            return children;
        }
    },
    children {
        @Override
        public Relationship getInverseRelationship() {
            return parent;
        }
    },
    spouse,
    sibling;

    public Relationship getInverseRelationship() {
        return Relationship.valueOf(name());
    }
}
