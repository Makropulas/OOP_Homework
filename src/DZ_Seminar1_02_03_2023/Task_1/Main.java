package DZ_Seminar1_02_03_2023.Task_1;

public class Main {
    public static void main(String[] args) {
        Person dmitriy = new Person("Дмитрий", "муж");
        Person tsira = new Person("Цира", "жен");
        Person vova = new Person("Вова", "муж");
        Person vitalik = new Person("Виталик", "муж");
        Person slava = new Person("Слава", "муж");
        Person vitya = new Person("Витя", "муж");
        Person anton = new Person("Антон", "муж");
        GeoTree gt = new GeoTree();
        gt.append(dmitriy, Relationship.spouse, tsira);
        gt.append(dmitriy, Relationship.parent, vova);
        gt.append(tsira, Relationship.parent, vova);
        gt.append(dmitriy, Relationship.parent, vitalik);
        gt.append(tsira, Relationship.parent, vitalik);
        gt.append(dmitriy, Relationship.parent, slava);
        gt.append(tsira, Relationship.parent, slava);
        gt.append(dmitriy, Relationship.parent, vitya);
        gt.append(tsira, Relationship.parent, vitya);
        gt.append(dmitriy, Relationship.parent, anton);
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

        System.out.println(new Reserch(gt).spend(dmitriy,
                Relationship.spouse));
    }

}
