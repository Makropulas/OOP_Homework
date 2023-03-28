package DZ_Seminar1_27_03_2023.Task_1;

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
        gt.append(vova, Relationship.brother, vitalik);
        gt.append(vova, Relationship.brother, slava);
        gt.append(vova, Relationship.brother, vitya);
        gt.append(vova, Relationship.brother, anton);
        gt.append(vitalik, Relationship.brother, slava);
        gt.append(vitalik, Relationship.brother, vitya);
        gt.append(vitalik, Relationship.brother, anton);
        gt.append(slava, Relationship.brother, vitya);
        gt.append(slava, Relationship.brother, anton);
        gt.append(vitya, Relationship.brother, anton);

        System.out.println("Моя супруга " + new Research(gt).spend(dmitriy, Relationship.spouse));
        System.out.println("Мои дети " + new Research(gt).spend(dmitriy, Relationship.children));
        System.out.println("Братья Вовы " + new Research(gt).spend(vova, Relationship.brother));
        System.out.println("Родители Вовы " + new Research(gt).spend(vova, Relationship.parent));
    }
}
