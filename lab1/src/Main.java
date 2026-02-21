

public class Main {
    public static void main(String[] args) {
        Materie m1 = new Engleza();
        Materie m2 = new Logica();
        Materie m3 = new Matematica();
        Facultate info = new Facultate("Informatica", 3, 3);
        Persoana p1 = new Profesor("Popescu", "Ion", 45, m1);
        Persoana p2 = new Profesor("Popescu", "Ion", 25, m2);
        Persoana p3 = new Profesor("Popescu", "Ion", 15, m3);
        Student s1 = new Student("Carabus", "Sebastian", 20);
        Student s2 = new Student("Covita", "Sebastian", 20);
        Student s3 = new Student("Ion", "Ionut", 19);
        s1.addMaterie(m2, 4);
        s2.addMaterie(m2, 10);
        s3.addMaterie(m1, 5);
        s2.addMaterie(m3, 8);
        info.addProfesor(p1);
        info.addProfesor(p2);
        info.addProfesor(p3);
        info.addStudent(s1);
        info.addStudent(s2);
        info.addStudent(s3);

        Facultate eng = new Facultate("Limbi straine", 1, 1);
        Student s4 = new Student("Popescu", "Maria", 20);
        eng.addProfesor(p1);
        eng.addStudent(s4);


        Universitate u = new Universitate("Alexandru Ioan Cuza", 2);
        u.addFacultate(info);
        u.addFacultate(eng);

        u.print();
    }
}