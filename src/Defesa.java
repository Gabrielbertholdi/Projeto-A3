class Defesa extends Item {
    private int resistencia;

    public Defesa() {
        super();
    }

    public Defesa(String nome, int durabilidade, int quantidade, String dono, String raridade, int resistencia) {
        super(nome, durabilidade, quantidade, dono, raridade);
        this.resistencia = resistencia;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return super.toString() + ", Resistência: " + resistencia;
    }
}