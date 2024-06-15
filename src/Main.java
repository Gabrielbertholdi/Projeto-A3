import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static Inventario inventario = new Inventario();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gerenciamento de Itens");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        JPanel panel = new JPanel(new GridLayout(8, 2));
        JLabel tipoLabel = new JLabel("Tipo:");
        JComboBox<String> tipoComboBox = new JComboBox<>(new String[]{"Ataque", "Defesa", "Suporte"});
        JLabel nomeLabel = new JLabel("Nome:");
        JTextField nomeField = new JTextField();
        JLabel durabilidadeLabel = new JLabel("Durabilidade:");
        JTextField durabilidadeField = new JTextField();
        JLabel quantidadeLabel = new JLabel("Quantidade:");
        JTextField quantidadeField = new JTextField();
        JLabel donoLabel = new JLabel("Dono:");
        JTextField donoField = new JTextField();
        JLabel raridadeLabel = new JLabel("Raridade:");
        JTextField raridadeField = new JTextField();
        JLabel atributoLabel = new JLabel("Dano/Resistência/Fator de Cura:");
        JTextField atributoField = new JTextField();
        JButton adicionarButton = new JButton("Adicionar Item");

        panel.add(tipoLabel);
        panel.add(tipoComboBox);
        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(durabilidadeLabel);
        panel.add(durabilidadeField);
        panel.add(quantidadeLabel);
        panel.add(quantidadeField);
        panel.add(donoLabel);
        panel.add(donoField);
        panel.add(raridadeLabel);
        panel.add(raridadeField);
        panel.add(atributoLabel);
        panel.add(atributoField);
        panel.add(adicionarButton);

        frame.add(panel, BorderLayout.NORTH);

        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tipo = (String) tipoComboBox.getSelectedItem();
                String nome = nomeField.getText();
                int durabilidade = Integer.parseInt(durabilidadeField.getText());
                int quantidade = Integer.parseInt(quantidadeField.getText());
                String dono = donoField.getText();
                String raridade = raridadeField.getText();
                int atributo = Integer.parseInt(atributoField.getText());

                Item item;
                if ("Ataque".equals(tipo)) {
                    item = new Ataque(nome, durabilidade, quantidade, dono, raridade, atributo);
                } else if ("Defesa".equals(tipo)) {
                    item = new Defesa(nome, durabilidade, quantidade, dono, raridade, atributo);
                } else {
                    item = new Suporte(nome, durabilidade, quantidade, dono, raridade, atributo);
                }

                inventario.adicionarItem(item);
                textArea.append("Item adicionado: " + item + "\n");
            }
        });

        frame.setVisible(true);
    }
}