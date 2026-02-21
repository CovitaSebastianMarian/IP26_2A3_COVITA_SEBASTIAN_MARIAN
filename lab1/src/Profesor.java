public class Profesor extends Persoana {
    private Materie curs;
    public Profesor(String nume, String prenume, int varsta, Materie m) {
        super(nume, prenume, varsta);
        curs = m;
    }
    @Override
    public void print(int x) {
        for(int j = 0;j<x;++j) System.out.print(" ");
        System.out.println("Profesor: " + nume + " " + prenume + " varsta: " + varsta + " materie: " + curs.getNume() + " credite: " + curs.getCredite());
    }
}

