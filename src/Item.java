abstract class Item {
    protected int id;
    protected String nome;
    protected int durabilidade;
    protected int quantidade;
    protected String dono;
    protected String raridade;
    private static int contador = 1;

    public Item() {
        this.id = contador++;
    }

    public Item(String nome, int durabilidade, int quantidade, String dono, String raridade) {
        this.id = contador++;
        this.nome = nome;
        this.durabilidade = durabilidade;
        this.quantidade = quantidade;
        this.dono = dono;
        this.raridade = raridade;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getRaridade() {
        return raridade;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Durabilidade: " + durabilidade + ", Quantidade: " + quantidade +
                ", Dono: " + dono + ", Raridade: " + raridade;
    }
}