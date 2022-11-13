public class Main {
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        Fakultet f1 = new Fakultet();
        f1.nazivNaFakultet = "FIKT";
        f1.brojNaSmerovi = 4;
        f1.brojNaStudenti = 1032;
        f1.dekan = "Aleksandar Markovski";
        f1.sedishte = "Bitola";

        f1.pMetod();
        System.out.println("Namalen broj studenti: " + f1.vMetod(50));
        f1.tMetod();

        Fakultet f2 = new Fakultet();
        f2.nazivNaFakultet = "VFB";
        f2.brojNaSmerovi = 1;
        f2.brojNaStudenti = 50;
        f2.dekan = "Antonio Barabanovski";
        f2.sedishte = "Bitola";

        f1.pMetod();
        System.out.println("Namalen broj na studenti: " + f2.vMetod(30));
        f2.tMetod();
    }

}