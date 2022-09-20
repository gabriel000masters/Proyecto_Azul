/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoazul;

import edu.cmu.sphinx.frontend.util.Microphone;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.Result;
import edu.cmu.sphinx.util.props.ConfigurationManager;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Gabriel Olivares Arm
 */
public class Metodohablar implements Runnable {
 
    private JTextArea txtadecir;
    public Metodohablar(JTextArea area)
    {
       
        this.txtadecir=area;
    }
    @Override
    public void run() {
         try {
           ConfigurationManager cm = new ConfigurationManager(ProyectoAzul.class.getResource("jarvisMusica.config.xml"));
            Recognizer recognizer = (Recognizer) cm.lookup("recognizer");
           recognizer.allocate();
           Microphone microphone = (Microphone) cm.lookup("microphone");
           if (!microphone.startRecording()) {
               JOptionPane.showMessageDialog(null, "Error, microfono no encontrado.");
               recognizer.deallocate();
               System.exit(1);
           } 
             JOptionPane.showMessageDialog(null, "habla");
           while (true)
           {
                    
       Result resu= recognizer.recognize();
     
                String resu1 = resu.getBestFinalResultNoFiller();
                this.txtadecir.setText(resu1);
                System.out.println(resu1);
           }
    } catch(Exception e)
    {
        
    }
    
}
}
