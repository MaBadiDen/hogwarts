import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {


        Grifindor harry = new Grifindor("����� ������", (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101));
        Grifindor germa = new Grifindor("�������� ���������", (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101));
        Grifindor ron = new Grifindor("��� �����", (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101));


        Slizerin drako = new Slizerin("����� ������", (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101));
        Slizerin mont = new Slizerin("������ �������", (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101));
        Slizerin goyl = new Slizerin("������� ����", (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101));


        Pufenduy zah = new Pufenduy("������� ����", (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101));
        Pufenduy sedr = new Pufenduy("������ �������", (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101));
        Pufenduy djast =  new Pufenduy("������� ����-�������", (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101));

        Kogtevran chou = new Kogtevran("���� ����", (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101));
        Kogtevran padma = new Kogtevran("����� �����", (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101));
        Kogtevran mark = new Kogtevran("������ �����", (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101));

        harry.setMagicStrength(100);
        System.out.println(harry);

        Compare.compareGrif(harry, ron);
        Compare.compareAnyStudents(harry, drako);
    }

}