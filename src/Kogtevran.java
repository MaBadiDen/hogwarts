public class Kogtevran extends Hogwarts{

    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Kogtevran(String name, int magicStrength, int transgressionRange, int mind, int wisdom, int wit, int creativity) {
        super(name, magicStrength, transgressionRange);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        if(mind < 0 || mind > 100) {
            throw new RuntimeException("Введено неверное значение ума");
        }
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        if(wisdom < 0 || wisdom > 100) {
            throw new RuntimeException("Введено неверное значение мудрости");
        }
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        if(wit < 0 || wit > 100) {
            throw new RuntimeException("Введено неверное значение остроумия");
        }
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        if(creativity < 0 || creativity > 100) {
            throw new RuntimeException("Введено неверное значение креативности");
        }
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Студент " + getName() + " учится на факультете Когтевран и имеет силу магии: " + getMagicStrength() + ", дальность трансгрессии: "
                + getTransgressionRange() + ", уровень ума: " + getMind() + ", уровень мудрости: " + getWisdom() + " и уровень остроумия: " + getWit()
                + " и уровень креативности: " + getCreativity();
    }
}
