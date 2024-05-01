/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project.seminario.LoginAndRegister;

import com.project.seminario.DBConnection;
import com.project.seminario.Dashboard.DashboardMenu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author beast
 */
public class LoginAndRegister extends javax.swing.JFrame {

    DBConnection conn;

    public LoginAndRegister() {
        conn = new DBConnection();
        if (conn == null) {
            JOptionPane.showMessageDialog(rootPane, "Impossível conectar-se ao banco de dados.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelMatriculaLogin = new javax.swing.JLabel();
        tfMatriculaLogin = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        labelSenhaLogin = new javax.swing.JLabel();
        tfSenhaLogin = new javax.swing.JPasswordField();
        jPanel11 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        BotaoLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        labelSenha = new javax.swing.JLabel();
        tfSenha = new javax.swing.JPasswordField();
        jPanel12 = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        labelMatricula = new javax.swing.JLabel();
        tfMatricula = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        labelEmail4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        labelEmail5 = new javax.swing.JLabel();
        tfEmail4 = new javax.swing.JTextField();
        labelCurso = new javax.swing.JLabel();
        tfCurso = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        labelEmail7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        BotaoRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hello");
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        bg.setBackground(new java.awt.Color(5, 111, 137));
        bg.setInheritsPopupMenu(true);

        jPanel1.setBackground(new java.awt.Color(8, 104, 126));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        labelMatriculaLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelMatriculaLogin.setForeground(new java.awt.Color(255, 255, 255));
        labelMatriculaLogin.setText("Matrícula:");

        tfMatriculaLogin.setBackground(new java.awt.Color(8, 104, 126));
        tfMatriculaLogin.setForeground(new java.awt.Color(255, 255, 255));
        tfMatriculaLogin.setBorder(null);
        tfMatriculaLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfMatriculaLoginKeyTyped(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        labelSenhaLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelSenhaLogin.setForeground(new java.awt.Color(255, 255, 255));
        labelSenhaLogin.setText("Senha:");

        tfSenhaLogin.setBackground(new java.awt.Color(8, 104, 126));
        tfSenhaLogin.setForeground(new java.awt.Color(255, 255, 255));
        tfSenhaLogin.setBorder(null);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(5, 111, 137));

        BotaoLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        BotaoLogin.setForeground(new java.awt.Color(255, 255, 255));
        BotaoLogin.setText("Entrar");
        BotaoLogin.setBorder(null);
        BotaoLogin.setContentAreaFilled(false);
        BotaoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotaoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotaoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoCESTazul.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelSenhaLogin)
                        .addComponent(tfMatriculaLogin)
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addComponent(labelMatriculaLogin)
                        .addComponent(tfSenhaLogin)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(labelMatriculaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfMatriculaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(labelSenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfSenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        labelEmail.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail.setText("Email:");

        tfEmail.setBackground(new java.awt.Color(5, 111, 137));
        tfEmail.setForeground(new java.awt.Color(255, 255, 255));
        tfEmail.setBorder(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        labelSenha.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(255, 255, 255));
        labelSenha.setText("Senha:");

        tfSenha.setBackground(new java.awt.Color(5, 111, 137));
        tfSenha.setForeground(new java.awt.Color(255, 255, 255));
        tfSenha.setBorder(null);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        labelNome.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelNome.setForeground(new java.awt.Color(255, 255, 255));
        labelNome.setText("Nome completo:");

        tfNome.setBackground(new java.awt.Color(5, 111, 137));
        tfNome.setForeground(new java.awt.Color(255, 255, 255));
        tfNome.setBorder(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        labelMatricula.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelMatricula.setForeground(new java.awt.Color(255, 255, 255));
        labelMatricula.setText("Matrícula:");

        tfMatricula.setBackground(new java.awt.Color(5, 111, 137));
        tfMatricula.setForeground(new java.awt.Color(255, 255, 255));
        tfMatricula.setBorder(null);
        tfMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfMatriculaKeyTyped(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(0, 2));

        labelEmail4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelEmail4.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail4.setText("Email:");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(0, 2));

        labelEmail5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelEmail5.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail5.setText("Email:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        tfEmail4.setBackground(new java.awt.Color(8, 104, 126));
        tfEmail4.setForeground(new java.awt.Color(255, 255, 255));
        tfEmail.setBorder(null);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelEmail4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfEmail4)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(tfEmail4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(labelEmail4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        labelCurso.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelCurso.setForeground(new java.awt.Color(255, 255, 255));
        labelCurso.setText("Curso:");

        tfCurso.setBackground(new java.awt.Color(5, 111, 137));
        tfCurso.setForeground(new java.awt.Color(255, 255, 255));
        tfCurso.setBorder(null);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(0, 2));

        labelEmail7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelEmail7.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail7.setText("Email:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(8, 104, 126));

        BotaoRegister.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        BotaoRegister.setForeground(new java.awt.Color(255, 255, 255));
        BotaoRegister.setText("Criar conta");
        BotaoRegister.setBorder(null);
        BotaoRegister.setContentAreaFilled(false);
        BotaoRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotaoRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotaoRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfEmail)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(labelEmail)
                        .addComponent(labelSenha)
                        .addComponent(labelNome)
                        .addComponent(tfNome)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(labelMatricula)
                        .addComponent(tfMatricula)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelCurso)
                        .addComponent(tfCurso)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfSenha)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(labelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(labelMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(labelCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 828, 508);
    }// </editor-fold>//GEN-END:initComponents

    private void userLogin(int registration, String password) {
        Connection dbconn = null;
        try {
            dbconn = DBConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            PreparedStatement st = (PreparedStatement) dbconn
                    .prepareStatement("Select * from usuario WHERE matricula = ? AND senha = ?");
            st.setInt(1, registration);
            st.setString(2, password);
            ResultSet res = st.executeQuery();
            if (res.next()) {
                // tela de acesso ao sistema!!
                dispose();
                DashboardMenu d = new DashboardMenu();
                d.setTitle("Dashboard");
                d.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Matrícula ou senha não encontrados!", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void userRegister(String email, String password, String name, int registration, String course) {
        Connection dbconn = null;
        try {
            dbconn = DBConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            PreparedStatement checkStmt = dbconn
                    .prepareStatement("SELECT * FROM usuario WHERE matricula = ?");
            checkStmt.setInt(1, registration);
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(rootPane, "Matrícula já cadastrada!", "Erro",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                PreparedStatement st = (PreparedStatement) dbconn
                        .prepareStatement("INSERT INTO usuario (matricula,email,nome,senha,curso) VALUES(?,?,?,?,?)");
                st.setInt(1, registration);
                st.setString(2, email);
                st.setString(3, name);
                st.setString(4, password);
                st.setString(5, course);
                int res = st.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Usuário cadastrado com sucesso!", "Sucesso",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            rs.close();
            checkStmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void verificarCamposLogin(String registration, String password) {
        if (password.isEmpty() && registration.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Os campos matrícula e senha não podem estar vazios", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O campo Senha não pode estar vazio!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if (registration.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O campo matrícula não pode estar vazio!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            int registrationInt = Integer.parseInt(registration);
            userLogin(registrationInt, password);
        }
    }

    private void verificarCamposRegister(String email, String password, String name, String registration,
            String course) {
        if (password.isEmpty() || email.isEmpty() || name.isEmpty() || registration.isEmpty()
                || course.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Todos os campos de cadastro devem ser preenchidos!", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            int registrationInt = Integer.parseInt(registration);
            userRegister(email, password, name, registrationInt, course);
        }
    }

    private void tfMatriculaLoginKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_tfMatriculaLoginKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }// GEN-LAST:event_tfMatriculaLoginKeyTyped

    private void tfMatriculaKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_tfMatriculaKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }// GEN-LAST:event_tfMatriculaKeyTyped

    private void BotaoRegisterActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BotaoRegisterActionPerformed
        String email = tfEmail.getText();
        String password = String.valueOf(tfSenha.getPassword());
        String name = tfNome.getText();
        String registration = tfMatricula.getText();
        String course = tfCurso.getText();

        verificarCamposRegister(email, password, name, registration, course);
    }// GEN-LAST:event_BotaoRegisterActionPerformed

    private void BotaoLoginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BotaoLoginActionPerformed
        String registration = tfMatriculaLogin.getText();
        String password = String.valueOf(tfSenhaLogin.getPassword());
        verificarCamposLogin(registration, password);
    }// GEN-LAST:event_BotaoLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginAndRegister.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAndRegister.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAndRegister.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAndRegister.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAndRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoLogin;
    private javax.swing.JButton BotaoRegister;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel labelCurso;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEmail4;
    private javax.swing.JLabel labelEmail5;
    private javax.swing.JLabel labelEmail7;
    private javax.swing.JLabel labelMatricula;
    private javax.swing.JLabel labelMatriculaLogin;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelSenhaLogin;
    private javax.swing.JTextField tfCurso;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEmail4;
    private javax.swing.JTextField tfMatricula;
    private javax.swing.JTextField tfMatriculaLogin;
    private javax.swing.JTextField tfNome;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JPasswordField tfSenhaLogin;
    // End of variables declaration//GEN-END:variables
}
