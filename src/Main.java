import java.util.Random;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {


        Grifindor harry = new Grifindor("����� ������", getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100));
        Grifindor germa = new Grifindor("�������� ���������", getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100));
        Grifindor ron = new Grifindor("��� �����", getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100));


        Slizerin drako = new Slizerin("����� ������", getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100));
        Slizerin mont = new Slizerin("������ �������", getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100));
        Slizerin goyl = new Slizerin("������� ����", getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100));


        Pufenduy zah = new Pufenduy("������� ����", getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100));
        Pufenduy sedr = new Pufenduy("������ �������", getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100));
        Pufenduy djast =  new Pufenduy("������� ����-�������", getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100));

        Kogtevran chou = new Kogtevran("���� ����", getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100));
        Kogtevran padma = new Kogtevran("����� �����", getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100));
        Kogtevran mark = new Kogtevran("������ �����", getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100));

        harry.setMagicStrength(100);
        System.out.println(harry);

        Grifindor.compareGrif(harry, ron);
        Hogwarts.compareAnyStudents(harry, drako);
    }

    public static int getRandomScore(int maxScore) {
        return (int) (random() * (maxScore + 1));
    }

}