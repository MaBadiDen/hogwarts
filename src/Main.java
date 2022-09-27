import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {


        Grifindor harry = new Grifindor("Гарри Поттер", (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101));
        Grifindor germa = new Grifindor("Гермиона Грейнджер", (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101));
        Grifindor ron = new Grifindor("Рон Уизли", (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101));


        Slizerin drako = new Slizerin("Драко Малфой", (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101));
        Slizerin mont = new Slizerin("Грэхэм Монтегю", (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101));
        Slizerin goyl = new Slizerin("Грегори Гойл", (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101));


        Pufenduy zah = new Pufenduy("Захария Смит", (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101));
        Pufenduy sedr = new Pufenduy("Седрик Диггори", (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101));
        Pufenduy djast =  new Pufenduy("Джастин Финч-Флетчли", (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101));

        Kogtevran chou = new Kogtevran("Чжоу Чанг", (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101));
        Kogtevran padma = new Kogtevran("Падма Патил", (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101));
        Kogtevran mark = new Kogtevran("Маркус Белби", (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101), (int) (random() * 101));

        harry.setMagicStrength(100);
        System.out.println(harry);

        Compare.compareGrif(harry, ron);
        Compare.compareAnyStudents(harry, drako);
    }

}