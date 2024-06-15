class Ataque extends Item {
    private int dano;

    public Ataque() {
        super();
    }

    public Ataque(String nome, int durabilidade, int quantidade, String dono, String raridade, int dano) {
        super(nome, durabilidade, quantidade, dono, raridade);
        this.dano = dano;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    @Override
    public String toString() {
        return super.toString() + ", Dano: " + dano;
    }
}