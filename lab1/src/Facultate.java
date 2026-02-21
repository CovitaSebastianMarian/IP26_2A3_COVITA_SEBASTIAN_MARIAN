public class Facultate {
    private int nr_studenti, nr_profesori, cnt_studenti, cnt_profesori;
    private Persoana[] studenti;
    private Persoana[] profesori;
    private String nume;
    public Facultate(String nume, int nr_studenti, int nr_profesori) {
        studenti = new Student[nr_studenti];
        profesori = new Profesor[nr_profesori];
        this.nr_studenti = nr_studenti;
        this.nr_profesori = nr_profesori;
        this.nume = nume;
    }
    public String getNume() {
        return nume;
    }
    public void addStudent(Persoana s) {
        if(cnt_studenti < nr_studenti) {
            for(int i = 0;i<cnt_studenti;++i) {
                if(studenti[i].equals(s)) return;
            }
            studenti[cnt_studenti] = s;
            cnt_studenti++;
        }
    }
    public void addProfesor(Persoana p) {
        if(cnt_profesori < nr_profesori) {
            for(int i = 0;i<cnt_profesori;++i) {
                if(profesori[i].equals(p)) return;
            }
            profesori[cnt_profesori] = p;
            cnt_profesori++;
        }
    }
    public void removeStudent(Student s) {
        for(int i = 0;i<cnt_studenti;++i) {
            if(studenti[i].equals(s)) {
                for(int j = i;j<cnt_studenti - 1;++j) {
                    studenti[i] = studenti[i + 1];
                }
                cnt_studenti--;
                return;
            }
        }
    }
    public void removeProfesor(Profesor p) {
        for(int i = 0;i<cnt_profesori;++i) {
            if(profesori[i].equals(p)) {
                for(int j = i;j<cnt_profesori - 1;++j) {
                    profesori[i] = profesori[i + 1];
                }
                cnt_profesori--;
                return;
            }
        }
    }
    public void print(int x) {
        for(int j = 0;j<x;++j) System.out.print(" ");
        System.out.println("Facultate: " + nume);
        for(int j = 0;j<x;++j) System.out.print(" ");
        System.out.println("Profesori:");
        for(int i = 0;i<cnt_profesori;++i) {
            profesori[i].print(x + 4);
        }
        for(int j = 0;j<x;++j) System.out.print(" ");
        System.out.println("Studenti:");
        for(int i = 0;i<cnt_studenti;++i) {
            studenti[i].print(x + 4);
        }
    }
}

