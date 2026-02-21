interface Materie {
    public String getNume();
    public int getCredite();
}

class Matematica implements  Materie {
    @Override
    public String getNume() {
        return "Matematica";
    }

    @Override
    public int getCredite() {
        return 5;
    }
}

class Logica implements Materie {
    @Override
    public String getNume() {
        return "Logica";
    }

    @Override
    public int getCredite() {
        return 6;
    }
}

class Engleza implements Materie {
    @Override
    public String getNume() {
        return "Engleza";
    }

    @Override
    public int getCredite() {
        return 3;
    }
}
