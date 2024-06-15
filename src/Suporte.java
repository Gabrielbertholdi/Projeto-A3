class Suporte extends Item {
    private int fatorCura;

    public Suporte() {
        super();
    }

    public Suporte(String nome, int durabilidade, int quantidade, String dono, String raridade, int fatorCura) {
        super(nome, durabilidade, quantidade, dono, raridade);
        this.fatorCura = fatorCura;
    }

    public int getFatorCura() {
        return fatorCura;
    }

    public void setFatorCura(int fatorCura) {
        this.fatorCura = fatorCura;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fator de Cura: " + fatorCura;
    }
}