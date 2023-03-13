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

        System.out.println("Моя супруга " + new Reserch(gt).spend(dmitriy, Relationship.spouse));
        System.out.println("Мои дети " + new Reserch(gt).spend(dmitriy, Relationship.children));
        System.out.println("Братья Вовы " + new Reserch(gt).spend(vova, Relationship.brother));
        System.out.println("Родители Вовы " + new Reserch(gt).spend(vova, Relationship.parent));
    }

}
