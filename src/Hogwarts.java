public class Hogwarts {
    private String name;
    private int magicStrength;
    private int transgressionRange;


    public Hogwarts(String name, int magicStrength, int transgressionRange) {
        if(magicStrength < 0 || magicStrength > 100) {
            throw new RuntimeException("¬ведено неверное значение силы магии");
        }
        if(transgressionRange < 0 ||transgressionRange > 100) {
            throw new RuntimeException("¬ведено неверное значение дальности трансгрессии");
        }
        this.name = name;
        this.magicStrength = magicStrength;
        this.transgressionRange = transgressionRange;

    }

    public int getMagicStrength() {
        return magicStrength;
    }

    public void setMagicStrength(int magicStrength) {
        if(magicStrength < 0 || magicStrength > 100) {
            throw new RuntimeException("¬ведено неверное значение силы магии");
        }
        this.magicStrength = magicStrength;
    }

    public int getTransgressionRange() {
        return transgressionRange;
    }

    public void setTransgressionRange(int transgressionRange) {
        if(transgressionRange < 0 ||transgressionRange > 100) {
            throw new RuntimeException("¬ведено неверное значение дальности трансгрессии");
        }
        this.transgressionRange = transgressionRange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void compareAnyStudents(Hogwarts one, Hogwarts two) {
        int sumOne = one.getMagicStrength() + one.getTransgressionRange();
        int sumTwo = two.getMagicStrength() + two.getTransgressionRange();
        if (sumOne > sumTwo) {
            System.out.println(one.getName() + " лучший студент чем " + two.getName());
        } else if (sumOne < sumTwo) {
            System.out.println(two.getName() + " лучший студент чем " + one.getName());
        } else {
            System.out.println("ќба студента равны");
        }
    }


}

