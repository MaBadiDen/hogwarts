public class Compare {






    public static void compareAnyStudents(Hogwarts one, Hogwarts two) {
        int sumOne = one.getMagicStrength() + one.getTransgressionRange();
        int sumTwo = two.getMagicStrength() + two.getTransgressionRange();
        if (sumOne > sumTwo) {
            System.out.println(one.getName() + " ������ ������� ��� " + two.getName());
        } else if (sumOne < sumTwo) {
            System.out.println(two.getName() + " ������ ������� ��� " + one.getName());
        } else {
            System.out.println("��� �������� �����");
        }
    }


}
