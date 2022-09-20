/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoazul;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.speech.AudioException;
import javax.speech.Central;
import javax.speech.EngineException;
import javax.speech.EngineStateError;
import javax.speech.synthesis.SynthesizerModeDesc;
import javax.speech.synthesis.Voice;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

/**
 *
 * @author Gabriel Olivares Arm
 */
public class Codigo_boton_word implements Runnable {
     private JButton boton;
    private FileNameExtensionFilter filtro=new FileNameExtensionFilter("Word Files/Archivos Word/(.doc,.docx)", "doc","docx");
 public Codigo_boton_word(JButton boton)
 {
     
 }

    @Override
    public void run() {
         try {                                         
                JFileChooser jf=new JFileChooser();
                jf.setFileFilter(filtro);
                jf.showOpenDialog(jf);
                Desktop es=Desktop.getDesktop();
                
                File archivo=jf.getSelectedFile();
                String ruta = archivo.getAbsolutePath();
                XWPFDocument doc=new XWPFDocument(new FileInputStream(ruta));
                XWPFWordExtractor extractor= new XWPFWordExtractor (doc);
                
                    
                    String say;
                    
                    SynthesizerModeDesc required = new SynthesizerModeDesc();
                    required.setLocale(Locale.ROOT);
                    
                    Voice voice=new Voice(null, Voice.AGE_MIDDLE_ADULT, Voice.GENDER_MALE, null);
                    
                    required.addVoice(voice);
                    
                    javax.speech.synthesis.Synthesizer synth = Central.createSynthesizer(null);
                    
                    synth.allocate();
                    synth.resume();
                    
                    say=extractor.getText();
                    synth.speakPlainText(say,null);
                    
                    
                    synth.waitEngineState(javax.speech.synthesis.Synthesizer.QUEUE_EMPTY);
                    synth.deallocate();
                    JOptionPane.showMessageDialog(null, "Proceso exitoso/Successful Process/プロセス成功"); 
                    
                } catch (java.lang.NullPointerException ex) {
                    JOptionPane.showMessageDialog(null, "File wasn't selected/No se eligió archivo/ファイルを選べませんでした。");
                    
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "App didn't start at the required moment, please retry./La aplicación no se inició en el momento requerido, por favor reintente./アップリの発動がとある事情によって遅れましたので、もう一回やって下さい");
                    
                } catch (InterruptedException ex) {
             Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IllegalArgumentException ex) {
             Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
         } catch (EngineException ex) {
             Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
         } catch (EngineStateError ex) {
             Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
         } catch (AudioException ex) {
             Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
         }
    
        
    }
}
