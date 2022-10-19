public class Grifindor extends Hogwarts{

    private int nobility;
    private int honor;
    private int courage;

    public Grifindor(String name, int magicStrength, int transgressionRange, int nobility, int honor, int courage) {
        super(name, magicStrength, transgressionRange);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        if(nobility < 0 || nobility > 100) {
            throw new RuntimeException("Введено неверное значение благородства");
        }
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        if(honor < 0 || honor > 100) {
            throw new RuntimeException("Введено неверное значение чести");
        }
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        if(courage < 0 || courage > 100) {
            throw new RuntimeException("Введено неверное значение храбрости");
        }
        this.courage = courage;
    }

    @Override
    public String toString() {
        return "Студент " + getName() + " учится на факультете Гриффиндор и имеет силу магии: " + getMagicStrength() + ", дальность трансгрессии: "
        + getTransgressionRange() + ", уровень благородства: " + getNobility() + ", уровень чести: " + getHonor() + " и уровень храбрости: " + getCourage();
    }

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
}
