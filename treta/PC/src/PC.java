public class PC {
    public static void main(String[] args) {}
    //TODO Auto-generated method
    int memorija;
    String tipNaMemorija;
    int HD;
    String golemina="GB";

        public PC(){
            this.memorija = 2;
            this.tipNaMemorija = "DDR4";
            this.HD = 160;

        }

        public void pMetod(int zgolemiMemorija ,int novHD){
            System.out.println("Memorijata bese " + this.memorija + golemina + " ,Sega iznesuva " + (zgolemiMemorija + memorija) + golemina + ".");
            System.out.println("Tipot na memorijata e " + this.tipNaMemorija + ".");
            System.out.println("HD ima golemina od " + novHD + golemina + ". Prethodno iznesuvashe " + this.HD + golemina + ".");

        }
}

