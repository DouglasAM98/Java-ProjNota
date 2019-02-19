package visao;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Aluno;

/**
 *
 * @author Elvis
 * @version Beta
 * @since 19/04/2018
 */
public class UICadAluno extends javax.swing.JFrame
{
    Aluno aluno;
    
    /**
     * Creates new form UICadAluno
     */
    public UICadAluno()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        jlpDados = new javax.swing.JLayeredPane();
        jlNome = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jlSobrenome = new javax.swing.JLabel();
        jtSobrenome = new javax.swing.JTextField();
        jlSexo = new javax.swing.JLabel();
        jrMasculino = new javax.swing.JRadioButton();
        jrFeminino = new javax.swing.JRadioButton();
        jlDisc = new javax.swing.JLabel();
        jcLPV = new javax.swing.JCheckBox();
        jcSO1 = new javax.swing.JCheckBox();
        jcLPM = new javax.swing.JCheckBox();
        jcLPW = new javax.swing.JCheckBox();
        jlN1 = new javax.swing.JLabel();
        jlN2 = new javax.swing.JLabel();
        jlP1 = new javax.swing.JLabel();
        jlP2 = new javax.swing.JLabel();
        jtN1 = new javax.swing.JTextField();
        jtN2 = new javax.swing.JTextField();
        jtP1 = new javax.swing.JTextField();
        jtP2 = new javax.swing.JTextField();
        jlTotalAulas = new javax.swing.JLabel();
        jlNumPresencas = new javax.swing.JLabel();
        jtTotalAulas = new javax.swing.JTextField();
        jtNumPresencas = new javax.swing.JTextField();
        jspRelatorio = new javax.swing.JScrollPane();
        jtRelatorio = new javax.swing.JTextArea();
        jlRelatorio = new javax.swing.JLabel();
        jlNomeErro = new javax.swing.JLabel();
        jlpAcoes = new javax.swing.JLayeredPane();
        jbCadastrar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Aluno");

        jlpDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlNome.setText("Nome");

        jtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNomeFocusLost(evt);
            }
        });
        jtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtNomeKeyPressed(evt);
            }
        });

        jlSobrenome.setText("Sobrenome");

        jtSobrenome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtSobrenomeKeyPressed(evt);
            }
        });

        jlSexo.setText("Sexo");

        bgSexo.add(jrMasculino);
        jrMasculino.setText("Masculino");
        jrMasculino.setActionCommand("Masculino");
        jrMasculino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrMasculinoKeyPressed(evt);
            }
        });

        bgSexo.add(jrFeminino);
        jrFeminino.setText("Feminino");
        jrFeminino.setActionCommand("Feminino");
        jrFeminino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrFemininoKeyPressed(evt);
            }
        });

        jlDisc.setText("Disc");

        jcLPV.setText("LPV");
        jcLPV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcLPVKeyPressed(evt);
            }
        });

        jcSO1.setText("SO1");
        jcSO1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcSO1KeyPressed(evt);
            }
        });

        jcLPM.setText("LPM");
        jcLPM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcLPMKeyPressed(evt);
            }
        });

        jcLPW.setText("LPW");
        jcLPW.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcLPWKeyPressed(evt);
            }
        });

        jlN1.setText("N1");

        jlN2.setText("N2");

        jlP1.setText("P1");

        jlP2.setText("P2");

        jtN1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtN1KeyPressed(evt);
            }
        });

        jtN2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtN2KeyPressed(evt);
            }
        });

        jtP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtP1KeyPressed(evt);
            }
        });

        jtP2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtP2KeyPressed(evt);
            }
        });

        jlTotalAulas.setText("Total Aulas");

        jlNumPresencas.setText("Num. Presenças");

        jtTotalAulas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtTotalAulasKeyPressed(evt);
            }
        });

        jtNumPresencas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtNumPresencasKeyPressed(evt);
            }
        });

        jtRelatorio.setColumns(20);
        jtRelatorio.setRows(5);
        jtRelatorio.setEnabled(false);
        jspRelatorio.setViewportView(jtRelatorio);

        jlRelatorio.setText("Relatório");

        jlpDados.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlSobrenome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtSobrenome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlSexo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jrMasculino, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jrFeminino, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlDisc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jcLPV, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jcSO1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jcLPM, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jcLPW, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlN1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlN2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlP1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlP2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtN1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtN2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtP1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtP2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlTotalAulas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlNumPresencas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtTotalAulas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtNumPresencas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jspRelatorio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlRelatorio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlNomeErro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpDadosLayout = new javax.swing.GroupLayout(jlpDados);
        jlpDados.setLayout(jlpDadosLayout);
        jlpDadosLayout.setHorizontalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addComponent(jlNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addComponent(jlSexo)
                        .addGap(18, 18, 18)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jlpDadosLayout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jlpDadosLayout.createSequentialGroup()
                                        .addComponent(jlNumPresencas)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtNumPresencas, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jlpDadosLayout.createSequentialGroup()
                                        .addComponent(jlTotalAulas)
                                        .addGap(50, 50, 50)
                                        .addComponent(jtTotalAulas, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jlRelatorio)
                                    .addComponent(jspRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jlpDadosLayout.createSequentialGroup()
                                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrFeminino)
                                    .addGroup(jlpDadosLayout.createSequentialGroup()
                                        .addComponent(jrMasculino)
                                        .addGap(122, 122, 122)
                                        .addComponent(jlDisc)))
                                .addGap(28, 28, 28)
                                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jlpDadosLayout.createSequentialGroup()
                                        .addComponent(jcLPV)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcSO1))
                                    .addGroup(jlpDadosLayout.createSequentialGroup()
                                        .addComponent(jcLPM)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcLPW))))
                            .addGroup(jlpDadosLayout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jlNomeErro)
                                .addGap(35, 35, 35)
                                .addComponent(jlSobrenome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jlpDadosLayout.createSequentialGroup()
                            .addComponent(jlP2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtP2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jlpDadosLayout.createSequentialGroup()
                            .addComponent(jlP1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtP1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jlpDadosLayout.createSequentialGroup()
                            .addComponent(jlN2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtN2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jlpDadosLayout.createSequentialGroup()
                            .addComponent(jlN1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtN1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jlpDadosLayout.setVerticalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlSobrenome)
                    .addComponent(jtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNomeErro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlSexo)
                            .addComponent(jrMasculino)
                            .addComponent(jlDisc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrFeminino))
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcLPV)
                            .addComponent(jcSO1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcLPM)
                            .addComponent(jcLPW))))
                .addGap(25, 25, 25)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlN1)
                            .addComponent(jtN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlN2)
                            .addComponent(jtN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtTotalAulas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlTotalAulas))
                        .addGap(6, 6, 6)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNumPresencas)
                            .addComponent(jtNumPresencas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jlRelatorio)
                        .addGap(6, 6, 6)))
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlP1)
                            .addComponent(jtP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlP2)
                            .addComponent(jtP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jspRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                .addContainerGap())
        );

        jlpAcoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });
        jbCadastrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbCadastrarKeyPressed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        jbLimpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbLimparKeyPressed(evt);
            }
        });

        jbRelatorio.setText("Relatório");
        jbRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRelatorioActionPerformed(evt);
            }
        });
        jbRelatorio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbRelatorioKeyPressed(evt);
            }
        });

        jlpAcoes.setLayer(jbCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoes.setLayer(jbLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoes.setLayer(jbRelatorio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpAcoesLayout = new javax.swing.GroupLayout(jlpAcoes);
        jlpAcoes.setLayout(jlpAcoesLayout);
        jlpAcoesLayout.setHorizontalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jbRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jlpAcoesLayout.setVerticalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpAcoesLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbLimpar)
                    .addComponent(jbRelatorio))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlpDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlpAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlpAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Cadastra o aluno, exibe uma mensagem e anexa no relatório
     */
    private void cadastrar()
    {
        try {
            ArrayList<String> disciplinas = new ArrayList<>();
        if(jcLPV.isSelected()) disciplinas.add(jcLPV.getText());
        if(jcSO1.isSelected()) disciplinas.add(jcSO1.getText());
        if(jcLPM.isSelected()) disciplinas.add(jcLPM.getText());
        if(jcLPW.isSelected()) disciplinas.add(jcLPW.getText());
        
        double n1 = Double.parseDouble(jtN1.getText());
        double n2 = Double.parseDouble(jtN2.getText());
        double p1 = Double.parseDouble(jtP1.getText());
        double p2 = Double.parseDouble(jtP2.getText());
        int totalAulas = Integer.parseInt(jtTotalAulas.getText());
        int numPresencas = Integer.parseInt(jtNumPresencas.getText());
       
        String nome = jtNome.getText();
        if(nome.isEmpty()){
            throw new NumberFormatException(
                    "Preencha o nome!");
        }
        
        if(!jrMasculino.isSelected() &&
                !jrFeminino.isSelected()) {
            throw new NumberFormatException("Selecione seu sexo");
        }
        
        aluno = new Aluno
        (
            nome,
            jtSobrenome.getText(),
            bgSexo.getSelection().getActionCommand(),
            disciplinas,
            n1, n2,
            p1, p2, 
            totalAulas, numPresencas
        );
        
        /*JOptionPane.showMessageDialog(
                rootPane,
                "Divisão: "+aluno.dividir(10, 0));*/
        
        mostrarRelatorio();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Jovem, você errou! "+e.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException e){
            JOptionPane.showMessageDialog(
                    rootPane,
                    "ERRO! "+e.getMessage());
        } catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,
                    "Algum erro ocorreu! "+e.getMessage());
        } finally {
            System.out.println("PASSOU AQUI");
        }//fecha finally
    } // fecha cadastrar
    
    /**
     * Limpa os campos do formulário inteiro
     */
    private void limparFormulario()
    {
        jtNome.setText(null);
        jtSobrenome.setText(null);
        
        bgSexo.clearSelection();
        
        jcLPV.setSelected(false);
        jcSO1.setSelected(false);
        jcLPM.setSelected(false);
        jcLPW.setSelected(false);
        
        jtN1.setText(null);
        jtN2.setText(null);
        jtP1.setText(null);
        jtP2.setText(null);
        
        jtTotalAulas.setText(null);
        jtNumPresencas.setText(null);
        
        jtNome.grabFocus();
    } // fecha limparFormulario
    
    /**
     * Limpa a caixa de texto do formulario
     */
    private void limparRelatorio()
    {
        jtRelatorio.setText(null);
    } // fecha limparRelatorio
    
    /**
     * Anexa o relatório do ultimo aluno criado na caixa de texto
     */
    private void mostrarRelatorio()
    {
        jtRelatorio.setText(jtRelatorio.getText()
                            + "Dados: " + aluno.toString() + "\n\n");
    } // fecha mostrarRelatorio
    
    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbCadastrarActionPerformed
    {//GEN-HEADEREND:event_jbCadastrarActionPerformed
        cadastrar();
        limparFormulario();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbLimparActionPerformed
    {//GEN-HEADEREND:event_jbLimparActionPerformed
        limparRelatorio();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbRelatorioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbRelatorioActionPerformed
    {//GEN-HEADEREND:event_jbRelatorioActionPerformed
        mostrarRelatorio();
    }//GEN-LAST:event_jbRelatorioActionPerformed

    private void jbCadastrarKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jbCadastrarKeyPressed
    {//GEN-HEADEREND:event_jbCadastrarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            cadastrar();
            limparFormulario();
        }
    }//GEN-LAST:event_jbCadastrarKeyPressed

    private void jbLimparKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jbLimparKeyPressed
    {//GEN-HEADEREND:event_jbLimparKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) limparRelatorio();
    }//GEN-LAST:event_jbLimparKeyPressed

    private void jbRelatorioKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jbRelatorioKeyPressed
    {//GEN-HEADEREND:event_jbRelatorioKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) mostrarRelatorio();      
    }//GEN-LAST:event_jbRelatorioKeyPressed

    private void jtNomeKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtNomeKeyPressed
    {//GEN-HEADEREND:event_jtNomeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) jtSobrenome.grabFocus();        
    }//GEN-LAST:event_jtNomeKeyPressed

    private void jtSobrenomeKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtSobrenomeKeyPressed
    {//GEN-HEADEREND:event_jtSobrenomeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) jrMasculino.grabFocus();      
    }//GEN-LAST:event_jtSobrenomeKeyPressed

    private void jrMasculinoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jrMasculinoKeyPressed
    {//GEN-HEADEREND:event_jrMasculinoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) jrFeminino.grabFocus();
    }//GEN-LAST:event_jrMasculinoKeyPressed

    private void jrFemininoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jrFemininoKeyPressed
    {//GEN-HEADEREND:event_jrFemininoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) jcLPV.grabFocus();
    }//GEN-LAST:event_jrFemininoKeyPressed

    private void jcLPVKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jcLPVKeyPressed
    {//GEN-HEADEREND:event_jcLPVKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER) jcSO1.grabFocus();
    }//GEN-LAST:event_jcLPVKeyPressed

    private void jcSO1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jcSO1KeyPressed
    {//GEN-HEADEREND:event_jcSO1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) jcLPM.grabFocus();
    }//GEN-LAST:event_jcSO1KeyPressed

    private void jcLPMKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jcLPMKeyPressed
    {//GEN-HEADEREND:event_jcLPMKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) jcLPW.grabFocus();
    }//GEN-LAST:event_jcLPMKeyPressed

    private void jcLPWKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jcLPWKeyPressed
    {//GEN-HEADEREND:event_jcLPWKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) jtN1.grabFocus();
    }//GEN-LAST:event_jcLPWKeyPressed

    private void jtN1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtN1KeyPressed
    {//GEN-HEADEREND:event_jtN1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) jtN2.grabFocus();
    }//GEN-LAST:event_jtN1KeyPressed

    private void jtN2KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtN2KeyPressed
    {//GEN-HEADEREND:event_jtN2KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) jtP1.grabFocus();
    }//GEN-LAST:event_jtN2KeyPressed

    private void jtP1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtP1KeyPressed
    {//GEN-HEADEREND:event_jtP1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) jtP2.grabFocus();
    }//GEN-LAST:event_jtP1KeyPressed

    private void jtP2KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtP2KeyPressed
    {//GEN-HEADEREND:event_jtP2KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) jtTotalAulas.grabFocus();
    }//GEN-LAST:event_jtP2KeyPressed

    private void jtTotalAulasKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtTotalAulasKeyPressed
    {//GEN-HEADEREND:event_jtTotalAulasKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) jtNumPresencas.grabFocus();
    }//GEN-LAST:event_jtTotalAulasKeyPressed

    private void jtNumPresencasKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jtNumPresencasKeyPressed
    {//GEN-HEADEREND:event_jtNumPresencasKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            cadastrar();
            limparFormulario();
        }
    }//GEN-LAST:event_jtNumPresencasKeyPressed

    private void jtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNomeFocusLost
        if(jtNome.getText().isEmpty()){
            jtNome.setBackground(Color.red);
            jtNome.setForeground(Color.yellow);
            jlNomeErro.setIcon(
                    new ImageIcon(
                            getClass().getResource("/imagens/error.png")));
        }else{
            jtNome.setBackground(Color.green);
            jtNome.setForeground(Color.decode("#f98000"));
            jlNomeErro.setIcon(
                    new ImageIcon(
                            getClass().getResource("/imagens/certo.jpg")));
        }//fecha else
    }//GEN-LAST:event_jtNomeFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(UICadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(UICadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(UICadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(UICadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new UICadAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbRelatorio;
    private javax.swing.JCheckBox jcLPM;
    private javax.swing.JCheckBox jcLPV;
    private javax.swing.JCheckBox jcLPW;
    private javax.swing.JCheckBox jcSO1;
    private javax.swing.JLabel jlDisc;
    private javax.swing.JLabel jlN1;
    private javax.swing.JLabel jlN2;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNomeErro;
    private javax.swing.JLabel jlNumPresencas;
    private javax.swing.JLabel jlP1;
    private javax.swing.JLabel jlP2;
    private javax.swing.JLabel jlRelatorio;
    private javax.swing.JLabel jlSexo;
    private javax.swing.JLabel jlSobrenome;
    private javax.swing.JLabel jlTotalAulas;
    private javax.swing.JLayeredPane jlpAcoes;
    private javax.swing.JLayeredPane jlpDados;
    private javax.swing.JRadioButton jrFeminino;
    private javax.swing.JRadioButton jrMasculino;
    private javax.swing.JScrollPane jspRelatorio;
    private javax.swing.JTextField jtN1;
    private javax.swing.JTextField jtN2;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtNumPresencas;
    private javax.swing.JTextField jtP1;
    private javax.swing.JTextField jtP2;
    private javax.swing.JTextArea jtRelatorio;
    private javax.swing.JTextField jtSobrenome;
    private javax.swing.JTextField jtTotalAulas;
    // End of variables declaration//GEN-END:variables
}