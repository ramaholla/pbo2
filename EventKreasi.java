package tugas_02;

import javax.swing.*;
import java.awt.event.*;

class EventKreasi extends JFrame{
    JLabel lblnm=new JLabel("Nama Games");
    JTextField txnm=new JTextField(20);
    JLabel lbpl=new JLabel("Platform");
    JRadioButton pc=new JRadioButton("PC");
    JRadioButton xb=new JRadioButton("XBOX ONE");
    JRadioButton ps=new JRadioButton("PS4");
    ButtonGroup pl=new ButtonGroup();
    JLabel lbgn=new JLabel("Genre");
    JCheckBox ac=new JCheckBox("Action");
    JCheckBox adv=new JCheckBox("Adventure");
    JCheckBox rpg=new JCheckBox("RPG");
    JCheckBox str=new JCheckBox("Strategy");
    JCheckBox sml=new JCheckBox("Simulation");
    JCheckBox sht=new JCheckBox("Shooter");
    JButton ctk=new JButton("Cetak");
    JTextArea hsl=new JTextArea();

    EventKreasi(){
        setTitle("Event Sederhana");
        setLocation(300, 100);
        setSize(300, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void KomponenVisual(){
        getContentPane().setLayout(null);
        getContentPane().add(lblnm);
        lblnm.setBounds(10, 10, 80, 20);
        getContentPane().add(txnm);
        txnm.setBounds(95, 10, 165, 20);
        getContentPane().add(lbpl);
        lbpl.setBounds(10, 33, 80,  20);
        pl.add(ps);
        pl.add(xb);
        pl.add(pc);
        getContentPane().add(ps);
        ps.setBounds(90, 33, 50, 20);
        getContentPane().add(xb);
        xb.setBounds(140, 33, 90, 20);
        getContentPane().add(pc);
        pc.setBounds(227, 33, 50, 20);
        getContentPane().add(lbgn);
        lbgn.setBounds(10, 56, 80, 20);
        getContentPane().add(ac);
        ac.setBounds(50, 56, 65, 20);
        getContentPane().add(adv);
        adv.setBounds(115, 56, 85, 20);
        getContentPane().add(rpg);
        rpg.setBounds(200, 56, 50, 20);
        getContentPane().add(str);
        str.setBounds(50, 79, 75, 20);
        getContentPane().add(sml);
        sml.setBounds(125, 79, 85, 20);
        getContentPane().add(sht);
        sht.setBounds(210, 79, 70, 20);
        getContentPane().add(ctk);
        ctk.setBounds(10, 102, 265, 20);
        getContentPane().add(hsl);
        hsl.setBounds(10, 125, 265, 150);
        setVisible(true);
    }
    
    void AksiReaksi(){
        ctk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                hsl.append(txnm.getText()+"\n");
                if(ps.isSelected()==true){
                    hsl.append(ps.getText()+"\n");
                }
                else if(xb.isSelected()==true){
                    hsl.append(xb.getText()+"\n");
                }
                else {
                    hsl.append(pc.getText()+"\n");
                }
                if(ac.isSelected()==true){
                    hsl.append(ac.getText()+"\n");
                }
                if(adv.isSelected()==true){
                    hsl.append(adv.getText()+"\n");
                }
                if(rpg.isSelected()==true){
                    hsl.append(rpg.getText()+"\n");
                }
                if(str.isSelected()==true){
                    hsl.append(str.getText()+"\n");
                }
                if(sml.isSelected()==true){
                    hsl.append(sml.getText()+"n");
                }
                if(sht.isSelected()==true){
                    hsl.append(sht.getText()+"\n");
                }
            }
        });
    }
    
    public static void main(String[] args) {
        EventKreasi ek=new EventKreasi();
        ek.KomponenVisual();
        ek.AksiReaksi();
    }
}
