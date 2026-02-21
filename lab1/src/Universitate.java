public class Universitate {
    private Facultate[] facultati;
    private int nr_facultati;
    private String nume;
    public Universitate(String nume, int n) {
        this.nume = nume;
        facultati = new Facultate[n];
    }
    public void addFacultate(Facultate f) {
        if(nr_facultati < facultati.length) {
            for(int i = 0;i<nr_facultati;++i) {
                if(facultati[i].getNume().equals(f.getNume())) return;
            }
            facultati[nr_facultati] = f;
            nr_facultati++;
        }
    }
    public void print() {
        System.out.println("Universitate: " + nume);
        for(int i =0;i<nr_facultati;++i) {
            facultati[i].print(4);
        }
    }
}
