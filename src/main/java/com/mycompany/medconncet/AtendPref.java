/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.medconncet;

import static com.mycompany.medconncet.Senha2.gerarSenha2;
import static com.mycompany.medconncet.Senha3.gerarSenha3;
import static com.mycompany.medconncet.Senha4.gerarSenha4;

/**
 *
 * @author tiago
 */
public class AtendPref extends javax.swing.JFrame {

    /**
     * Creates new form Tela3
     */
    public AtendPref() {
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

        Volta2 = new javax.swing.JButton();
        botão1 = new Modelos.Botão();
        NSpref = new Modelos.TextField();
        jPanel1 = new javax.swing.JPanel();
        Espaco = new javax.swing.JButton();
        e = new Modelos.Botão();
        w = new Modelos.Botão();
        q = new Modelos.Botão();
        r = new Modelos.Botão();
        t = new Modelos.Botão();
        y = new Modelos.Botão();
        u = new Modelos.Botão();
        i = new Modelos.Botão();
        o = new Modelos.Botão();
        a = new Modelos.Botão();
        s = new Modelos.Botão();
        d = new Modelos.Botão();
        f = new Modelos.Botão();
        g = new Modelos.Botão();
        h = new Modelos.Botão();
        j = new Modelos.Botão();
        k = new Modelos.Botão();
        l = new Modelos.Botão();
        p = new Modelos.Botão();
        z = new Modelos.Botão();
        x = new Modelos.Botão();
        v = new Modelos.Botão();
        b = new Modelos.Botão();
        m = new Modelos.Botão();
        c = new Modelos.Botão();
        n = new Modelos.Botão();
        botão4 = new Modelos.Botão();
        botão2 = new Modelos.Botão();
        jLabel1 = new javax.swing.JLabel();
        Psenha3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1350, 900));
        setResizable(false);
        getContentPane().setLayout(null);

        Volta2.setIcon(new javax.swing.ImageIcon("C:\\Faculdade2\\MedConncet\\src\\main\\java\\Imagens\\de-volta.png")); // NOI18N
        Volta2.setBorder(null);
        Volta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volta2ActionPerformed(evt);
            }
        });
        getContentPane().add(Volta2);
        Volta2.setBounds(80, 100, 90, 60);

        botão1.setBorder(null);
        botão1.setForeground(new java.awt.Color(255, 255, 255));
        botão1.setText("Confirmar");
        botão1.setBorderColor(new java.awt.Color(19, 107, 105));
        botão1.setColor(new java.awt.Color(19, 107, 105));
        botão1.setColorClick(new java.awt.Color(19, 107, 105));
        botão1.setColorOver(new java.awt.Color(19, 107, 105));
        botão1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        botão1.setRadius(65);
        botão1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão1ActionPerformed(evt);
            }
        });
        getContentPane().add(botão1);
        botão1.setBounds(980, 370, 244, 65);

        NSpref.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        NSpref.setLineColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(NSpref);
        NSpref.setBounds(100, 370, 814, 65);

        jPanel1.setBackground(new java.awt.Color(19, 107, 105));
        jPanel1.setLayout(null);

        Espaco.setBackground(new java.awt.Color(210, 236, 235));
        Espaco.setIcon(new javax.swing.ImageIcon("C:\\Users\\tiago\\Downloads\\minus_748114.png")); // NOI18N
        Espaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspacoActionPerformed(evt);
            }
        });
        jPanel1.add(Espaco);
        Espaco.setBounds(240, 260, 640, 30);

        e.setBackground(new java.awt.Color(210, 236, 235));
        e.setForeground(new java.awt.Color(5, 78, 76));
        e.setText("e");
        e.setBorderColor(new java.awt.Color(210, 236, 235));
        e.setColor(new java.awt.Color(210, 236, 235));
        e.setColorClick(new java.awt.Color(210, 236, 235));
        e.setColorOver(new java.awt.Color(210, 236, 235));
        e.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        e.setRadius(10);
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });
        jPanel1.add(e);
        e.setBounds(220, 30, 65, 49);

        w.setBackground(new java.awt.Color(210, 236, 235));
        w.setForeground(new java.awt.Color(5, 78, 76));
        w.setText("w");
        w.setBorderColor(new java.awt.Color(210, 236, 235));
        w.setColor(new java.awt.Color(210, 236, 235));
        w.setColorClick(new java.awt.Color(210, 236, 235));
        w.setColorOver(new java.awt.Color(210, 236, 235));
        w.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        w.setRadius(10);
        w.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wActionPerformed(evt);
            }
        });
        jPanel1.add(w);
        w.setBounds(120, 30, 65, 49);

        q.setBackground(new java.awt.Color(210, 236, 235));
        q.setForeground(new java.awt.Color(5, 78, 76));
        q.setText("q");
        q.setBorderColor(new java.awt.Color(210, 236, 235));
        q.setColor(new java.awt.Color(210, 236, 235));
        q.setColorClick(new java.awt.Color(210, 236, 235));
        q.setColorOver(new java.awt.Color(210, 236, 235));
        q.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        q.setRadius(10);
        q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qActionPerformed(evt);
            }
        });
        jPanel1.add(q);
        q.setBounds(30, 30, 65, 49);

        r.setBackground(new java.awt.Color(210, 236, 235));
        r.setForeground(new java.awt.Color(5, 78, 76));
        r.setText("r");
        r.setBorderColor(new java.awt.Color(210, 236, 235));
        r.setColor(new java.awt.Color(210, 236, 235));
        r.setColorClick(new java.awt.Color(210, 236, 235));
        r.setColorOver(new java.awt.Color(210, 236, 235));
        r.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        r.setRadius(10);
        r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rActionPerformed(evt);
            }
        });
        jPanel1.add(r);
        r.setBounds(330, 30, 65, 49);

        t.setBackground(new java.awt.Color(210, 236, 235));
        t.setForeground(new java.awt.Color(5, 78, 76));
        t.setText("t");
        t.setBorderColor(new java.awt.Color(210, 236, 235));
        t.setColor(new java.awt.Color(210, 236, 235));
        t.setColorClick(new java.awt.Color(210, 236, 235));
        t.setColorOver(new java.awt.Color(210, 236, 235));
        t.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        t.setRadius(10);
        t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tActionPerformed(evt);
            }
        });
        jPanel1.add(t);
        t.setBounds(430, 30, 65, 49);

        y.setBackground(new java.awt.Color(210, 236, 235));
        y.setForeground(new java.awt.Color(5, 78, 76));
        y.setText("y");
        y.setBorderColor(new java.awt.Color(210, 236, 235));
        y.setColor(new java.awt.Color(210, 236, 235));
        y.setColorClick(new java.awt.Color(210, 236, 235));
        y.setColorOver(new java.awt.Color(210, 236, 235));
        y.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        y.setRadius(10);
        y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yActionPerformed(evt);
            }
        });
        jPanel1.add(y);
        y.setBounds(530, 30, 65, 49);

        u.setBackground(new java.awt.Color(210, 236, 235));
        u.setForeground(new java.awt.Color(5, 78, 76));
        u.setText("u");
        u.setBorderColor(new java.awt.Color(210, 236, 235));
        u.setColor(new java.awt.Color(210, 236, 235));
        u.setColorClick(new java.awt.Color(210, 236, 235));
        u.setColorOver(new java.awt.Color(210, 236, 235));
        u.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        u.setRadius(10);
        u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uActionPerformed(evt);
            }
        });
        jPanel1.add(u);
        u.setBounds(630, 30, 65, 49);

        i.setBackground(new java.awt.Color(210, 236, 235));
        i.setForeground(new java.awt.Color(5, 78, 76));
        i.setText("i");
        i.setBorderColor(new java.awt.Color(210, 236, 235));
        i.setColor(new java.awt.Color(210, 236, 235));
        i.setColorClick(new java.awt.Color(210, 236, 235));
        i.setColorOver(new java.awt.Color(210, 236, 235));
        i.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        i.setRadius(10);
        i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iActionPerformed(evt);
            }
        });
        jPanel1.add(i);
        i.setBounds(730, 30, 65, 49);

        o.setBackground(new java.awt.Color(210, 236, 235));
        o.setForeground(new java.awt.Color(5, 78, 76));
        o.setText("o");
        o.setBorderColor(new java.awt.Color(210, 236, 235));
        o.setColor(new java.awt.Color(210, 236, 235));
        o.setColorClick(new java.awt.Color(210, 236, 235));
        o.setColorOver(new java.awt.Color(210, 236, 235));
        o.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        o.setRadius(10);
        o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oActionPerformed(evt);
            }
        });
        jPanel1.add(o);
        o.setBounds(830, 30, 65, 49);

        a.setBackground(new java.awt.Color(210, 236, 235));
        a.setForeground(new java.awt.Color(5, 78, 76));
        a.setText("a");
        a.setBorderColor(new java.awt.Color(210, 236, 235));
        a.setColor(new java.awt.Color(210, 236, 235));
        a.setColorClick(new java.awt.Color(210, 236, 235));
        a.setColorOver(new java.awt.Color(210, 236, 235));
        a.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        a.setRadius(10);
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        jPanel1.add(a);
        a.setBounds(70, 110, 65, 49);

        s.setBackground(new java.awt.Color(210, 236, 235));
        s.setForeground(new java.awt.Color(5, 78, 76));
        s.setText("s");
        s.setBorderColor(new java.awt.Color(210, 236, 235));
        s.setColor(new java.awt.Color(210, 236, 235));
        s.setColorClick(new java.awt.Color(210, 236, 235));
        s.setColorOver(new java.awt.Color(210, 236, 235));
        s.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        s.setRadius(10);
        s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sActionPerformed(evt);
            }
        });
        jPanel1.add(s);
        s.setBounds(170, 110, 65, 49);

        d.setBackground(new java.awt.Color(210, 236, 235));
        d.setForeground(new java.awt.Color(5, 78, 76));
        d.setText("d");
        d.setBorderColor(new java.awt.Color(210, 236, 235));
        d.setColor(new java.awt.Color(210, 236, 235));
        d.setColorClick(new java.awt.Color(210, 236, 235));
        d.setColorOver(new java.awt.Color(210, 236, 235));
        d.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        d.setRadius(10);
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });
        jPanel1.add(d);
        d.setBounds(270, 110, 65, 49);

        f.setBackground(new java.awt.Color(210, 236, 235));
        f.setForeground(new java.awt.Color(5, 78, 76));
        f.setText("f");
        f.setBorderColor(new java.awt.Color(210, 236, 235));
        f.setColor(new java.awt.Color(210, 236, 235));
        f.setColorClick(new java.awt.Color(210, 236, 235));
        f.setColorOver(new java.awt.Color(210, 236, 235));
        f.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        f.setRadius(10);
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });
        jPanel1.add(f);
        f.setBounds(360, 110, 65, 49);

        g.setBackground(new java.awt.Color(210, 236, 235));
        g.setForeground(new java.awt.Color(5, 78, 76));
        g.setText("g");
        g.setBorderColor(new java.awt.Color(210, 236, 235));
        g.setColor(new java.awt.Color(210, 236, 235));
        g.setColorClick(new java.awt.Color(210, 236, 235));
        g.setColorOver(new java.awt.Color(210, 236, 235));
        g.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        g.setRadius(10);
        g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gActionPerformed(evt);
            }
        });
        jPanel1.add(g);
        g.setBounds(460, 110, 65, 49);

        h.setBackground(new java.awt.Color(210, 236, 235));
        h.setForeground(new java.awt.Color(5, 78, 76));
        h.setText("h");
        h.setBorderColor(new java.awt.Color(210, 236, 235));
        h.setColor(new java.awt.Color(210, 236, 235));
        h.setColorClick(new java.awt.Color(210, 236, 235));
        h.setColorOver(new java.awt.Color(210, 236, 235));
        h.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        h.setRadius(10);
        h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hActionPerformed(evt);
            }
        });
        jPanel1.add(h);
        h.setBounds(560, 110, 65, 49);

        j.setBackground(new java.awt.Color(210, 236, 235));
        j.setForeground(new java.awt.Color(5, 78, 76));
        j.setText("j");
        j.setBorderColor(new java.awt.Color(210, 236, 235));
        j.setColor(new java.awt.Color(210, 236, 235));
        j.setColorClick(new java.awt.Color(210, 236, 235));
        j.setColorOver(new java.awt.Color(210, 236, 235));
        j.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        j.setRadius(10);
        j.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActionPerformed(evt);
            }
        });
        jPanel1.add(j);
        j.setBounds(660, 110, 65, 49);

        k.setBackground(new java.awt.Color(210, 236, 235));
        k.setForeground(new java.awt.Color(5, 78, 76));
        k.setText("k");
        k.setBorderColor(new java.awt.Color(210, 236, 235));
        k.setColor(new java.awt.Color(210, 236, 235));
        k.setColorClick(new java.awt.Color(210, 236, 235));
        k.setColorOver(new java.awt.Color(210, 236, 235));
        k.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        k.setRadius(10);
        k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kActionPerformed(evt);
            }
        });
        jPanel1.add(k);
        k.setBounds(770, 110, 65, 49);

        l.setBackground(new java.awt.Color(210, 236, 235));
        l.setForeground(new java.awt.Color(5, 78, 76));
        l.setText("l");
        l.setBorderColor(new java.awt.Color(210, 236, 235));
        l.setColor(new java.awt.Color(210, 236, 235));
        l.setColorClick(new java.awt.Color(210, 236, 235));
        l.setColorOver(new java.awt.Color(210, 236, 235));
        l.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        l.setRadius(10);
        l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lActionPerformed(evt);
            }
        });
        jPanel1.add(l);
        l.setBounds(870, 110, 65, 49);

        p.setBackground(new java.awt.Color(210, 236, 235));
        p.setForeground(new java.awt.Color(5, 78, 76));
        p.setText("p");
        p.setBorderColor(new java.awt.Color(210, 236, 235));
        p.setColor(new java.awt.Color(210, 236, 235));
        p.setColorClick(new java.awt.Color(210, 236, 235));
        p.setColorOver(new java.awt.Color(210, 236, 235));
        p.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        p.setRadius(10);
        p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActionPerformed(evt);
            }
        });
        jPanel1.add(p);
        p.setBounds(930, 30, 65, 49);

        z.setBackground(new java.awt.Color(210, 236, 235));
        z.setForeground(new java.awt.Color(5, 78, 76));
        z.setText("z");
        z.setBorderColor(new java.awt.Color(210, 236, 235));
        z.setColor(new java.awt.Color(210, 236, 235));
        z.setColorClick(new java.awt.Color(210, 236, 235));
        z.setColorOver(new java.awt.Color(210, 236, 235));
        z.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        z.setRadius(10);
        z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zActionPerformed(evt);
            }
        });
        jPanel1.add(z);
        z.setBounds(240, 190, 65, 49);

        x.setBackground(new java.awt.Color(210, 236, 235));
        x.setForeground(new java.awt.Color(5, 78, 76));
        x.setText("x");
        x.setBorderColor(new java.awt.Color(210, 236, 235));
        x.setColor(new java.awt.Color(210, 236, 235));
        x.setColorClick(new java.awt.Color(210, 236, 235));
        x.setColorOver(new java.awt.Color(210, 236, 235));
        x.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        x.setRadius(10);
        x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xActionPerformed(evt);
            }
        });
        jPanel1.add(x);
        x.setBounds(330, 190, 65, 49);

        v.setBackground(new java.awt.Color(210, 236, 235));
        v.setForeground(new java.awt.Color(5, 78, 76));
        v.setText("v");
        v.setBorderColor(new java.awt.Color(210, 236, 235));
        v.setColor(new java.awt.Color(210, 236, 235));
        v.setColorClick(new java.awt.Color(210, 236, 235));
        v.setColorOver(new java.awt.Color(210, 236, 235));
        v.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        v.setRadius(10);
        v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vActionPerformed(evt);
            }
        });
        jPanel1.add(v);
        v.setBounds(530, 190, 65, 49);

        b.setBackground(new java.awt.Color(210, 236, 235));
        b.setForeground(new java.awt.Color(5, 78, 76));
        b.setText("b");
        b.setBorderColor(new java.awt.Color(210, 236, 235));
        b.setColor(new java.awt.Color(210, 236, 235));
        b.setColorClick(new java.awt.Color(210, 236, 235));
        b.setColorOver(new java.awt.Color(210, 236, 235));
        b.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        b.setRadius(10);
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        jPanel1.add(b);
        b.setBounds(630, 190, 65, 49);

        m.setBackground(new java.awt.Color(210, 236, 235));
        m.setForeground(new java.awt.Color(5, 78, 76));
        m.setText("m");
        m.setBorderColor(new java.awt.Color(210, 236, 235));
        m.setColor(new java.awt.Color(210, 236, 235));
        m.setColorClick(new java.awt.Color(210, 236, 235));
        m.setColorOver(new java.awt.Color(210, 236, 235));
        m.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        m.setRadius(10);
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });
        jPanel1.add(m);
        m.setBounds(830, 190, 65, 50);

        c.setBackground(new java.awt.Color(210, 236, 235));
        c.setForeground(new java.awt.Color(5, 78, 76));
        c.setText("c");
        c.setBorderColor(new java.awt.Color(210, 236, 235));
        c.setColor(new java.awt.Color(210, 236, 235));
        c.setColorClick(new java.awt.Color(210, 236, 235));
        c.setColorOver(new java.awt.Color(210, 236, 235));
        c.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        c.setRadius(10);
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        jPanel1.add(c);
        c.setBounds(430, 190, 65, 49);

        n.setBackground(new java.awt.Color(210, 236, 235));
        n.setForeground(new java.awt.Color(5, 78, 76));
        n.setText("n");
        n.setBorderColor(new java.awt.Color(210, 236, 235));
        n.setColor(new java.awt.Color(210, 236, 235));
        n.setColorClick(new java.awt.Color(210, 236, 235));
        n.setColorOver(new java.awt.Color(210, 236, 235));
        n.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        n.setRadius(10);
        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });
        jPanel1.add(n);
        n.setBounds(730, 190, 65, 49);

        botão4.setBackground(new java.awt.Color(210, 236, 235));
        botão4.setIcon(new javax.swing.ImageIcon("C:\\Faculdade2\\MedConncet\\src\\main\\java\\Imagens\\de-volta.png")); // NOI18N
        botão4.setBorderColor(new java.awt.Color(210, 236, 235));
        botão4.setColor(new java.awt.Color(210, 236, 235));
        botão4.setColorClick(new java.awt.Color(210, 236, 235));
        botão4.setColorOver(new java.awt.Color(210, 236, 235));
        botão4.setRadius(10);
        botão4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão4ActionPerformed(evt);
            }
        });
        jPanel1.add(botão4);
        botão4.setBounds(1020, 30, 170, 50);

        botão2.setBackground(new java.awt.Color(210, 236, 235));
        botão2.setBorder(null);
        botão2.setText("CapsLock");
        botão2.setBorderColor(new java.awt.Color(210, 236, 235));
        botão2.setColor(new java.awt.Color(210, 236, 235));
        botão2.setColorClick(new java.awt.Color(210, 236, 235));
        botão2.setColorOver(new java.awt.Color(210, 236, 235));
        botão2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        botão2.setRadius(10);
        botão2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botão2MouseClicked(evt);
            }
        });
        botão2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão2ActionPerformed(evt);
            }
        });
        jPanel1.add(botão2);
        botão2.setBounds(1020, 100, 179, 49);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(70, 480, 1230, 300);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Faculdade2\\MedConncet\\src\\main\\java\\Imagens\\AtendimentoPref.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1340, 860);

        Psenha3.setText("jTextField1");
        getContentPane().add(Psenha3);
        Psenha3.setBounds(1190, 150, 71, 22);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Volta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volta2ActionPerformed
        Menu mn = new Menu();
        mn.setVisible(true);
        dispose();
    }//GEN-LAST:event_Volta2ActionPerformed

    private void botão1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão1ActionPerformed
        String gerarSenha3 = gerarSenha3(4);
        Psenha3.setText(gerarSenha3);

        SenhaPref prf = new SenhaPref();
        prf.Npref.setText(NSpref.getText());
        prf.Senha4.setText(Psenha3.getText());
        prf.setVisible(true);
        dispose();
    }//GEN-LAST:event_botão1ActionPerformed

    private void EspacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspacoActionPerformed
        NSpref.setText(NSpref.getText()+" ");
    }//GEN-LAST:event_EspacoActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        NSpref.setText(NSpref.getText()+e.getText());
    }//GEN-LAST:event_eActionPerformed

    private void wActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wActionPerformed
        NSpref.setText(NSpref.getText()+w.getText());
    }//GEN-LAST:event_wActionPerformed

    private void qActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qActionPerformed
        NSpref.setText(NSpref.getText()+q.getText());
    }//GEN-LAST:event_qActionPerformed

    private void rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rActionPerformed
        NSpref.setText(NSpref.getText()+r.getText());
    }//GEN-LAST:event_rActionPerformed

    private void tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tActionPerformed
        NSpref.setText(NSpref.getText()+t.getText());
    }//GEN-LAST:event_tActionPerformed

    private void yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yActionPerformed
        NSpref.setText(NSpref.getText()+y.getText());
    }//GEN-LAST:event_yActionPerformed

    private void uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uActionPerformed
        NSpref.setText(NSpref.getText()+u.getText());
    }//GEN-LAST:event_uActionPerformed

    private void iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iActionPerformed
        NSpref.setText(NSpref.getText()+i.getText());
    }//GEN-LAST:event_iActionPerformed

    private void oActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oActionPerformed
        NSpref.setText(NSpref.getText()+o.getText());
    }//GEN-LAST:event_oActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        NSpref.setText(NSpref.getText()+a.getText());
    }//GEN-LAST:event_aActionPerformed

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
        NSpref.setText(NSpref.getText()+s.getText());
    }//GEN-LAST:event_sActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        NSpref.setText(NSpref.getText()+d.getText());
    }//GEN-LAST:event_dActionPerformed

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
        NSpref.setText(NSpref.getText()+f.getText());
    }//GEN-LAST:event_fActionPerformed

    private void gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gActionPerformed
        NSpref.setText(NSpref.getText()+g.getText());
    }//GEN-LAST:event_gActionPerformed

    private void hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hActionPerformed
        NSpref.setText(NSpref.getText()+h.getText());
    }//GEN-LAST:event_hActionPerformed

    private void jActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActionPerformed
        NSpref.setText(NSpref.getText()+j.getText());
    }//GEN-LAST:event_jActionPerformed

    private void kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kActionPerformed
        NSpref.setText(NSpref.getText()+k.getText());
    }//GEN-LAST:event_kActionPerformed

    private void lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lActionPerformed
        NSpref.setText(NSpref.getText()+l.getText());
    }//GEN-LAST:event_lActionPerformed

    private void pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pActionPerformed
        NSpref.setText(NSpref.getText()+p.getText());
    }//GEN-LAST:event_pActionPerformed

    private void zActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zActionPerformed
        NSpref.setText(NSpref.getText()+z.getText());
    }//GEN-LAST:event_zActionPerformed

    private void xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xActionPerformed
        NSpref.setText(NSpref.getText()+x.getText());
    }//GEN-LAST:event_xActionPerformed

    private void vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vActionPerformed
        NSpref.setText(NSpref.getText()+v.getText());
    }//GEN-LAST:event_vActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        NSpref.setText(NSpref.getText()+b.getText());
    }//GEN-LAST:event_bActionPerformed

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed
        NSpref.setText(NSpref.getText()+m.getText());
    }//GEN-LAST:event_mActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        NSpref.setText(NSpref.getText()+c.getText());
    }//GEN-LAST:event_cActionPerformed

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        NSpref.setText(NSpref.getText()+n.getText());
    }//GEN-LAST:event_nActionPerformed

    private void botão4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão4ActionPerformed
        String bt;
        if(NSpref.getText().length()>0){
        }

        StringBuilder st = new StringBuilder(NSpref.getText());
        st.deleteCharAt(NSpref.getText().length()-1);
        bt = st.toString();
        NSpref.setText(bt);
    }//GEN-LAST:event_botão4ActionPerformed

    private void botão2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botão2MouseClicked
        if (evt.getClickCount() == 2){
            a.setText("a");
            b .setText("b");
            c.setText("c");
            d.setText("d");
            e.setText("e");
            f.setText("f");
            g.setText("g");
            h.setText("h");
            i.setText("i");
            j.setText("j");
            k.setText("k");
            l.setText("l");
            m.setText("m");
            n.setText("n");
            o.setText("o");
            p.setText("p");
            q.setText("q");
            r.setText("r");
            s.setText("s");
            t.setText("t");
            u.setText("u");
            v.setText("v");
            w.setText("w");
            x.setText("x");
            y.setText("y");
            z.setText("z");

        }
        if (evt.getClickCount() == 1) {
            a.setText("A");
            b.setText("B");
            c.setText("C");
            d.setText("D");
            e.setText("E");
            f.setText("F");
            g.setText("G");
            h.setText("H");
            i.setText("I");
            j.setText("J");
            k.setText("K");
            l.setText("L");
            m.setText("M");
            n.setText("N");
            o.setText("O");
            p.setText("P");
            q.setText("Q");
            r.setText("R");
            s.setText("S");
            t.setText("T");
            u.setText("U");
            v.setText("V");
            w.setText("W");
            x.setText("X");
            y.setText("Y");
            z.setText("Z");
        }

    }//GEN-LAST:event_botão2MouseClicked

    private void botão2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botão2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AtendPref.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtendPref.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtendPref.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtendPref.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtendPref().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Espaco;
    private Modelos.TextField NSpref;
    private javax.swing.JTextField Psenha3;
    private javax.swing.JButton Volta2;
    private Modelos.Botão a;
    private Modelos.Botão b;
    private Modelos.Botão botão1;
    private Modelos.Botão botão2;
    private Modelos.Botão botão4;
    private Modelos.Botão c;
    private Modelos.Botão d;
    private Modelos.Botão e;
    private Modelos.Botão f;
    private Modelos.Botão g;
    private Modelos.Botão h;
    private Modelos.Botão i;
    private Modelos.Botão j;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private Modelos.Botão k;
    private Modelos.Botão l;
    private Modelos.Botão m;
    private Modelos.Botão n;
    private Modelos.Botão o;
    private Modelos.Botão p;
    private Modelos.Botão q;
    private Modelos.Botão r;
    private Modelos.Botão s;
    private Modelos.Botão t;
    private Modelos.Botão u;
    private Modelos.Botão v;
    private Modelos.Botão w;
    private Modelos.Botão x;
    private Modelos.Botão y;
    private Modelos.Botão z;
    // End of variables declaration//GEN-END:variables
}
