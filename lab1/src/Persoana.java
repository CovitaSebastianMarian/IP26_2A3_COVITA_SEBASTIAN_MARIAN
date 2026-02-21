public class Persoana {
    protected String nume;
    protected String prenume;
    protected int varsta;
    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }
    public void print(int x) {
        for(int j = 0;j<x;++j) System.out.print(" ");
        System.out.println("Nume: " + nume + " prenume: " + prenume + " varsta: " + varsta);
    }
    public boolean equals(Persoana s) {
        return nume == s.nume && prenume == s.prenume && varsta == s.varsta;
    }
}

