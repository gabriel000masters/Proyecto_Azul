/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoazul;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author Gabriel Olivares Arm
 */
public class Botoncrearword implements Runnable {
    
    JTextArea texto;
    public Botoncrearword(JButton boton, JTextArea campo) 
    {
     texto= campo;   
    }

    @Override
    public void run() {
   
        String sb = texto.getText();  
    XWPFDocument document= new XWPFDocument();
    JFileChooser chooser = new JFileChooser();
    chooser.setCurrentDirectory(new File("/home/me/Documents"));
    int retrival = chooser.showSaveDialog(null);
    if (retrival == JFileChooser.APPROVE_OPTION||retrival == JFileChooser.APPROVE_OPTION) {
        try {
            FileOutputStream out = new FileOutputStream(chooser.getSelectedFile()+".docx");
             XWPFParagraph paragraph = document.createParagraph();
   XWPFRun run=paragraph.createRun();
   run.setText(sb);
            document.write(out);
            out.close();
            document.close();
            JOptionPane.showMessageDialog(null, "Proceso exitoso/Successful Process/プロセス成功"); 
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
    }
    else{
            
  JOptionPane.showMessageDialog(null, "You didn't name the file/No se dió nombre al archivo/ファイルに名前を与えられませんでした。");       
     
} 
} 
}
