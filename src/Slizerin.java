public class Slizerin extends Hogwarts{

    private int cunning;
    private int decisiveness;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slizerin(String name, int magicStrength, int transgressionRange, int cunning, int decisiveness, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicStrength, transgressionRange);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        if(cunning < 0 || cunning > 100) {
            throw new RuntimeException("������� �������� �������� ��������");
        }
        this.cunning = cunning;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public void setDecisiveness(int decisiveness) {
        if(decisiveness < 0 || decisiveness > 100) {
            throw new RuntimeException("������� �������� �������� �������������");
        }
        this.decisiveness = decisiveness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        if(ambition < 0 || ambition > 100) {
            throw new RuntimeException("������� �������� �������� �������������");
        }
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        if(resourcefulness < 0 || resourcefulness > 100) {
            throw new RuntimeException("������� �������� �������� ������������");
        }
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        if(lustForPower < 0 || lustForPower > 100) {
            throw new RuntimeException("������� �������� �������� ����� ������");
        }
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "������� " + getName() + " ������ �� ���������� �������� � ����� ���� �����: " + getMagicStrength() + ", ��������� ������������: "
                + getTransgressionRange() + ", ������� ��������: " + getCunning() + ", ������� �������������: " + getDecisiveness() + " � ������� �������������: " + getAmbition()
                + ", ������� ������������: " + getResourcefulness() + " � ������� ����� ������: " + getLustForPower();
    }
}


