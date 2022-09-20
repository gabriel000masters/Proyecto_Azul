/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoazul;

import java.util.Locale;
import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;
import javax.speech.synthesis.Voice;
import javax.swing.JTextArea;


/**
 *
 * @author Gabriel Olivares Armijo
 */
public class Japones {
    
    public void AlJapones(JTextArea txtadecir)
    {
     String obtener=txtadecir.getText();
     long largoobtener=obtener.length();
    
     for(int i=0;i<largoobtener;i++)
     {
         if(obtener.charAt(i)=='さ')
         {
          obtener.replaceAll("さ", "sa");
         }
       
     }
        try {

 String say=obtener;
 
 
 
 SynthesizerModeDesc required = new SynthesizerModeDesc();
 required.setLocale(Locale.ROOT);
 
 Voice voice=new Voice(null, Voice.GENDER_FEMALE, Voice.GENDER_FEMALE, null);
 
 required.addVoice(voice);
 
 Synthesizer synth = Central.createSynthesizer(null);
 
 synth.allocate();

 
  synth.resume();
  
 synth.speak(say, null);
 
  
  
     
 
 } catch (Exception e) {
 e.printStackTrace();
 }
  
    }
}
