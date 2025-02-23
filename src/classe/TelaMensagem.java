package classe;
// importando pacotes necessários

import java.awt.Component;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.GroupLayout;

public class TelaMensagem extends javax.swing.JFrame {

    // private int cont = 0;
    // private boolean mostrouOlaMundo = false;
    // lista para armazenar a lista de frases
    private List<String> frasesParaTela = new ArrayList<>();
    // variavel para gerar valor aleatorio para selecionar o indice que vai conter a frase
    private Random valorAleatorio = new Random();

    public TelaMensagem() {
        // metodo para pré carregar a lista de frases
        carregarFrases();
        initComponents();
        // iniciando com a frase "Aqui vai aparecer frase" na fonte arial
        // para depois virar Italico
        labelMensagem.setFont(new Font("Arial", Font.BOLD, 24));
    }
// metodo que vai carregar o arquivo de frases

    private void carregarFrases() {
        // criando objeto que vai armazenar as frases na memoria para posterior uso
        try (BufferedReader carregadorDeFrase = new BufferedReader(new FileReader("Frases.txt"))) {
            // variavel que vai armazenar as frases
            String linha;
            // laço que vai percorrer as frases no arquivo até acabar as linhas
            while ((linha = carregadorDeFrase.readLine()) != null) {

                if (!linha.isEmpty() && linha.charAt(linha.length() - 1) == ',') {
                    linha = linha.substring(0, linha.length() - 1).trim();

                }

                // botando cada frase na String linha
                linha = linha.replace("(traduzido)", "").trim();
                frasesParaTela.add(linha);
            }
            // exceção para caso de não houver nenhuma frase
        } catch (Exception e) {

            // Se o arquivo não existir, adicione frases padrão
            frasesParaTela.add("O segredo do sucesso é começar. – Mark Twain");
            frasesParaTela.add("Sonhe grande, comece pequeno. – Robert Kiyosaki");
            // Adicione mais frases padrão aqui
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelMensagem = new javax.swing.JLabel();
        botaoMensagem1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerador de Frase Aleatoria");
        setResizable(false);

        labelMensagem.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        labelMensagem.setForeground(new java.awt.Color(102, 102, 102));
        labelMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMensagem.setText("Aqui vai aparecer uma frase aleatória.");
        labelMensagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        botaoMensagem1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botaoMensagem1.setForeground(new java.awt.Color(102, 102, 102));
        botaoMensagem1.setText("Clique aqui!");
        botaoMensagem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMensagem1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(botaoMensagem1)
                .addContainerGap(349, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(botaoMensagem1)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// botao altera mensagem a cada clique
    private void botaoMensagem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMensagem1ActionPerformed
        // verifica se existe frase na lista
        if (frasesParaTela.isEmpty()) {
            labelMensagem.setText("Nenhuma frase disponível. Adicione frases em 'frases.txt'.");
            return;
        }
        // valor aleatorio que vai servir de indice selecionar a frase na lista
        // primeiro pega o tamanho da lista e seleciona um indice
        int indice = valorAleatorio.nextInt(frasesParaTela.size());
        // mostrando a frase na tela
        labelMensagem.setText(frasesParaTela.get(indice));
        // colocando no formato Italico
        labelMensagem.setFont(new Font("Arial", Font.ITALIC | Font.ITALIC, 21));
        // Ajustar o layout dinamicamente para centralizar o botão
        GroupLayout layout = (GroupLayout) getContentPane().getLayout();
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botaoMensagem1)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(labelMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(botaoMensagem1)
                                .addContainerGap(48, Short.MAX_VALUE))
        );

        // ajustando a janela para a palavra não ficar muito longa
        pack();


    }//GEN-LAST:event_botaoMensagem1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMensagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoMensagem1;
    private javax.swing.JLabel labelMensagem;
    // End of variables declaration//GEN-END:variables
}
