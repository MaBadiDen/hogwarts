public class Pufenduy extends Hogwarts{

    private int diligence;
    private int loyalty;
    private int honesty;

    public Pufenduy(String name, int magicStrength, int transgressionRange, int diligence, int loyalty, int honesty) {
        super(name, magicStrength, transgressionRange);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        if(diligence < 0 || diligence > 100) {
            throw new RuntimeException("Введено неверное значение трудолюбия");
        }
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        if(loyalty < 0 || loyalty > 100) {
            throw new RuntimeException("Введено неверное значение верности");
        }
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        if(honesty < 0 || honesty > 100) {
            throw new RuntimeException("Введено неверное значение честности");
        }
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Студент " + getName() + " учится на факультете Гриффиндор и имеет силу магии: " + getMagicStrength() + ", дальность трансгрессии: "
                + getTransgressionRange() + ", уровень трудолюбия: " + getDiligence() + ", уровень верности: " + getLoyalty() + " и уровень честности: " + getHonesty();
    }
}
