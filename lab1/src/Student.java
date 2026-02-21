public class Student extends Persoana {
    private Materie[] materii;
    private int[] note;
    private int nr_materii;
    private static final int MAX = 10;
    public Student(String nume, String prenume, int varsta) {
        super(nume, prenume, varsta);
        materii = new Materie[MAX];
        note = new int[MAX];
    }
    public void addMaterie(Materie m, int nota) {
        if(nr_materii < materii.length) {
            for(int i = 0;i<nr_materii;++i) {
                if(m.getNume() == materii[i].getNume()) {
                    return;
                }
            }
            materii[nr_materii] = m;
            note[nr_materii] = nota;
            nr_materii++;
        }
    }
    @Override
    public void print(int x) {
        for(int j = 0;j<x;++j) System.out.print(" ");
        System.out.println("Student: " + nume + " " + prenume + " varsta: " + varsta);
        for(int i = 0;i<nr_materii;++i) {
            for(int j = 0;j<x + 4;++j) System.out.print(" ");
            System.out.println("Studiaza: " + materii[i].getNume() + " nota: " + note[i]);
        }
    }
}
