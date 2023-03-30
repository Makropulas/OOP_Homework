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
    spouse {
        @Override
        public Relationship getInverseRelationship() {
            return spouse;
        }
    },
    sibling {
        @Override
        public Relationship getInverseRelationship() {
            return sibling;
        }
    };
    public abstract Relationship getInverseRelationship();
}
