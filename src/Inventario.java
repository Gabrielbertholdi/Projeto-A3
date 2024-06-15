class Inventario {
    private Item[] itens;
    private int tamanho;

    public Inventario() {
        this.itens = new Item[10]; // Tamanho inicial do array
        this.tamanho = 0;
    }

    // Método para adicionar um item
    public void adicionarItem(Item item) {
        if (tamanho == itens.length) {
            // Aumenta o tamanho do array
            Item[] novoArray = new Item[itens.length * 2];
            System.arraycopy(itens, 0, novoArray, 0, itens.length);
            itens = novoArray;
        }
        itens[tamanho++] = item;
    }

    // Método para remover um item pelo ID
    public void removerItem(int id) {
        int index = buscarIndicePorId(id);
        if (index != -1) {
            for (int j = index; j < tamanho - 1; j++) {
                itens[j] = itens[j + 1];
            }
            itens[--tamanho] = null;
        }
    }

    // Método para listar todos os itens
    public void listarItens() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(itens[i]);
        }
    }

    // Método para buscar um item por ID e retornar suas informações
    public Item buscarItemPorId(int id) {
        for (int i = 0; i < tamanho; i++) {
            if (itens[i].getId() == id) {
                return itens[i];
            }
        }
        return null; // Item não encontrado
    }

    // Método privativo para buscar o índice de um item por ID
    private int buscarIndicePorId(int id) {
        for (int i = 0; i < tamanho; i++) {
            if (itens[i].getId() == id) {
                return i;
            }
        }
        return -1; // Item não encontrado
    }

    // Método para atualizar um atributo de um item por ID
    public void atualizarItemPorId(int id, String atributo, Object valor) {
        Item item = buscarItemPorId(id);
        if (item != null) {
            switch (atributo.toLowerCase()) {
                case "nome":
                    item.setNome((String) valor);
                    break;
                case "durabilidade":
                    item.setDurabilidade((Integer) valor);
                    break;
                case "quantidade":
                    item.setQuantidade((Integer) valor);
                    break;
                case "dono":
                    item.setDono((String) valor);
                    break;
                case "raridade":
                    item.setRaridade((String) valor);
                    break;
                default:
                    System.out.println("Atributo inválido!");
            }
        } else {
            System.out.println("Item não encontrado!");
        }
    }
}