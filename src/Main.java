import java.util.Random;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {


        Grifindor harry = new Grifindor("Гарри Поттер", getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100));
        Grifindor germa = new Grifindor("Гермиона Грейнджер", getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100));
        Grifindor ron = new Grifindor("Рон Уизли", getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100));


        Slizerin drako = new Slizerin("Драко Малфой", getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100));
        Slizerin mont = new Slizerin("Грэхэм Монтегю", getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100));
        Slizerin goyl = new Slizerin("Грегори Гойл", getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100));


        Pufenduy zah = new Pufenduy("Захария Смит", getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100));
        Pufenduy sedr = new Pufenduy("Седрик Диггори", getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100));
        Pufenduy djast =  new Pufenduy("Джастин Финч-Флетчли", getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100));

        Kogtevran chou = new Kogtevran("Чжоу Чанг", getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100));
        Kogtevran padma = new Kogtevran("Падма Патил", getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100));
        Kogtevran mark = new Kogtevran("Маркус Белби", getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100), getRandomScore(100));

        harry.setMagicStrength(100);
        System.out.println(harry);

        Grifindor.compareGrif(harry, ron);
        Hogwarts.compareAnyStudents(harry, drako);
    }

    public static int getRandomScore(int maxScore) {
        return (int) (random() * (maxScore + 1));
    }

}