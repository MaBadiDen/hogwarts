public class Compare {

    public static void compareGrif(Grifindor one, Grifindor two) {
        int sumOne = one.getCourage() + one.getHonor() + one.getNobility();
        int sumTwo = two.getCourage() + two.getNobility() + two.getHonor();

        if (sumOne > sumTwo) {
            System.out.println(one.getName() + " лучший Гриффиндорец чем " + two.getName());
        } else if (sumOne < sumTwo) {
            System.out.println(two.getName() + " лучший Гриффиндорец чем " + one.getName());
        } else {
            System.out.println("Оба гриффиндорца равны");
        }
    }
    public static void compareSliz(Slizerin one, Slizerin two) {
        int sumOne = one.getAmbition() + one.getResourcefulness() + one.getLustForPower() + one.getCunning() + one.getDecisiveness();
        int sumTwo = two.getAmbition() + two.getResourcefulness() + two.getLustForPower() + two.getCunning() + two.getDecisiveness();

        if (sumOne > sumTwo) {
            System.out.println(one.getName() + " лучший Слизеренец чем " + two.getName());
        } else if (sumOne < sumTwo) {
            System.out.println(two.getName() + " лучший Слизеренец чем " + one.getName());
        } else {
            System.out.println("Оба Слизеренца равны");
        }
    }
    public static void comparePuf(Pufenduy one, Pufenduy two) {
        int sumOne = one.getDiligence() + one.getHonesty() + one.getLoyalty();
        int sumTwo = two.getDiligence() + two.getHonesty() + two.getLoyalty();

        if (sumOne > sumTwo) {
            System.out.println(one.getName() + " лучший Пуффендуец чем " + two.getName());
        } else if (sumOne < sumTwo) {
            System.out.println(two.getName() + " лучший Пуффендуец чем " + one.getName());
        } else {
            System.out.println("Оба Пуффендуйца равны");
        }
    }
    public static void compareKog(Kogtevran one, Kogtevran two) {
        int sumOne = one.getCreativity() + one.getWit() + one.getWisdom() + one.getMind();
        int sumTwo = two.getCreativity() + two.getWit() + two.getWisdom() + two.getMind();

        if (sumOne > sumTwo) {
            System.out.println(one.getName() + " лучший Когтевранец чем " + two.getName());
        } else if (sumOne < sumTwo) {
            System.out.println(two.getName() + " лучший Когтевранец чем " + one.getName());
        } else {
            System.out.println("Оба Когтевранца равны");
        }
    }

    public static void compareAnyStudents(Hogwarts one, Hogwarts two) {
        int sumOne = one.getMagicStrength() + one.getTransgressionRange();
        int sumTwo = two.getMagicStrength() + two.getTransgressionRange();
        if (sumOne > sumTwo) {
            System.out.println(one.getName() + " лучший студент чем " + two.getName());
        } else if (sumOne < sumTwo) {
            System.out.println(two.getName() + " лучший студент чем " + one.getName());
        } else {
            System.out.println("Оба студента равны");
        }
    }


}
