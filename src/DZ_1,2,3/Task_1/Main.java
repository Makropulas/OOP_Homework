package Task_1;

public class Main {
    public static void main(String[] args) {
        Person dmitriy = new Person("Дмитрий", Sex.male);
        Person tsira = new Person("Цира", Sex.female);
        Person vova = new Person("Вова", Sex.male);
        Person vitalik = new Person("Виталик", Sex.male);
        Person slava = new Person("Слава", Sex.male);
        Person vitya = new Person("Витя", Sex.male);
        Person anton = new Person("Антон", Sex.male);
        GeoTree gt = new GeoTree();
        gt.append(dmitriy, Relationship.spouse, tsira);
        gt.append(dmitriy, Relationship.children, vova);
        gt.append(tsira, Relationship.children, vova);
        gt.append(dmitriy, Relationship.children, vitalik);
        gt.append(tsira, Relationship.children, vitalik);
        gt.append(dmitriy, Relationship.children, slava);
        gt.append(tsira, Relationship.children, slava);
        gt.append(dmitriy, Relationship.children, vitya);
        gt.append(tsira, Relationship.children, vitya);
        gt.append(dmitriy, Relationship.children, anton);
        gt.append(tsira, Relationship.children, anton);
        gt.append(vova, Relationship.sibling, vitalik);
        gt.append(vova, Relationship.sibling, slava);
        gt.append(vova, Relationship.sibling, vitya);
        gt.append(vova, Relationship.sibling, anton);
        gt.append(vitalik, Relationship.sibling, slava);
        gt.append(vitalik, Relationship.sibling, vitya);
        gt.append(vitalik, Relationship.sibling, anton);
        gt.append(slava, Relationship.sibling, vitya);
        gt.append(slava, Relationship.sibling, anton);
        gt.append(vitya, Relationship.sibling, anton);

        System.out.println("Моя супруга " + new Research(gt).spend(dmitriy, Relationship.spouse));
        System.out.println("Мои дети " + new Research(gt).spend(dmitriy, Relationship.children));
        System.out.println("Братья Вовы " + new Research(gt).spend(vova, Relationship.sibling));
        System.out.println("Родители Вовы " + new Research(gt).spend(vova, Relationship.parent) + "\n");
        System.out.println("Все женщины в семье " + new Research(gt).gender(Sex.female));
        System.out.println("Все мужчины в семье " + new Research(gt).gender(Sex.male));
    }
}
