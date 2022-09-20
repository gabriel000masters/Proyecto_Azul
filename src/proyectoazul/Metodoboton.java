/*
  * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoazul;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Locale;
import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;
import javax.speech.synthesis.Voice;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Gabriel Olivares Arm
 */
public class Metodoboton implements Runnable{
    private JTextArea txtadecir;
    public Metodoboton(JTextArea area)
    {
        txtadecir=area;
    }

    @Override
    public void run() {
         try {
 String obtener=txtadecir.getText(),say="";
  StringBuilder reemplazo=new StringBuilder();
  boolean esjapo=false;
     long largoobtener=obtener.length();
     long espari[]=new long[obtener.length()];
    for(int i=0;i<largoobtener;i++)
    {
         if(obtener.charAt(i)=='さ'||obtener.charAt(i)=='サ')
         {
             reemplazo.append("sa");
      esjapo=true;
         }
         if(obtener.charAt(i)=='し'||obtener.charAt(i)=='シ')
         {
             reemplazo.append("shi");
      esjapo=true;
         }
         if(obtener.charAt(i)=='す'||obtener.charAt(i)=='ス')
         {
             reemplazo.append("su");
      esjapo=true;
         }
         if(obtener.charAt(i)=='セ'||obtener.charAt(i)=='せ')
         {
             reemplazo.append("se");
      esjapo=true;
         }
         if(obtener.charAt(i)=='そ'||obtener.charAt(i)=='ソ')
         {
             reemplazo.append("so");
      esjapo=true;
         }
         if(obtener.charAt(i)=='ざ'||obtener.charAt(i)=='ザ')
         {
             reemplazo.append("sa");
      esjapo=true;
         }
          if(obtener.charAt(i)=='じ'||obtener.charAt(i)=='ジ')
         {
             reemplazo.append("yi");
      esjapo=true;
         }
          if(obtener.charAt(i)=='ず'||obtener.charAt(i)=='ズ')
         {
             reemplazo.append("su");
      esjapo=true;
         }
          if(obtener.charAt(i)=='ぜ'||obtener.charAt(i)=='ぜ')
         {
             reemplazo.append("se");
      esjapo=true;
         }
          if(obtener.charAt(i)=='ぞ'||obtener.charAt(i)=='ゾ')
         {
             reemplazo.append("so");
      esjapo=true;
         }
           if(obtener.charAt(i)=='っ'||obtener.charAt(i)=='ッ')
         {
             reemplazo.append(", ");
      esjapo=true;
         }
            if(obtener.charAt(i)=='あ'||obtener.charAt(i)=='ア')
         {
             reemplazo.append("ah");
      esjapo=true;
         } if(obtener.charAt(i)=='エ'||obtener.charAt(i)=='え')
         {
             reemplazo.append("eh");
      esjapo=true;
         }
          if(obtener.charAt(i)=='い'||obtener.charAt(i)=='イ')
         {
             reemplazo.append("i");
      esjapo=true;
         }
           if(obtener.charAt(i)=='お'||obtener.charAt(i)=='オ')
         {
             reemplazo.append("o");
      esjapo=true;
         }
            if(obtener.charAt(i)=='う'||obtener.charAt(i)=='ウ')
         {
             reemplazo.append("uh");
      esjapo=true;
         }
            if(obtener.charAt(i)=='か'||obtener.charAt(i)=='カ')
         {
             reemplazo.append("kah");
      esjapo=true;
         }
         if(obtener.charAt(i)=='キ'||obtener.charAt(i)=='き')
         {
             reemplazo.append("ki");
      esjapo=true;
         }
         if(obtener.charAt(i)=='ク'||obtener.charAt(i)=='く')
         {
             reemplazo.append("ku");
      esjapo=true;
         }
         if(obtener.charAt(i)=='ケ'||obtener.charAt(i)=='け')
         {
             reemplazo.append("ke");
      esjapo=true;
         }
         if(obtener.charAt(i)=='コ'||obtener.charAt(i)=='こ')
         {
             reemplazo.append("coh");
      esjapo=true;
         }
         if(obtener.charAt(i)=='が'||obtener.charAt(i)=='ガ')
         {
             reemplazo.append("gha");
      esjapo=true;
         }
         if((obtener.charAt(i)=='ぎ'&&obtener.charAt(i+1)=='ょ'||obtener.charAt(i)=='ギ'&&obtener.charAt(i+1)=='ョ'))
         {   
             reemplazo.append("gyo");
             reemplazo.deleteCharAt(i+2);
      esjapo=true;
         }
           if((obtener.charAt(i)=='ぎ'&&obtener.charAt(i+1)=='ゃ'||obtener.charAt(i)=='ギ'&&obtener.charAt(i+1)=='ャ'))
         {   
             reemplazo.append("gya");
             reemplazo.deleteCharAt(i+2);
      esjapo=true;
         }
            if((obtener.charAt(i)=='ぎ'&&obtener.charAt(i+1)=='ゅ'||obtener.charAt(i)=='ギ'&&obtener.charAt(i+1)=='ュ'))
         {   
             reemplazo.append("gyu");
             reemplazo.deleteCharAt(i+3);
      esjapo=true;
         }
          if(obtener.charAt(i)=='ギ'||obtener.charAt(i)=='ぎ')
         {
             reemplazo.append("ghi");
      esjapo=true;
         }
          if(obtener.charAt(i)=='ぐ'||obtener.charAt(i)=='グ')
         {
             reemplazo.append("guh");
      esjapo=true;
         }
          if(obtener.charAt(i)=='げ'||obtener.charAt(i)=='ゲ')
         {
             reemplazo.append("ghe");
      esjapo=true;
         }
          if(obtener.charAt(i)=='ご'||obtener.charAt(i)=='ゴ')
         {
             reemplazo.append("gho");
      esjapo=true;
         }
          if(obtener.charAt(i)=='た'||obtener.charAt(i)=='タ')
         {
             reemplazo.append("ta");
      esjapo=true;
         }
         if(obtener.charAt(i)=='チ'||obtener.charAt(i)=='ち')
         {
             reemplazo.append("chi");
      esjapo=true;
         }
         if(obtener.charAt(i)=='つ'||obtener.charAt(i)=='ツ')
         {
             reemplazo.append("tsu");
      esjapo=true;
         }
         if(obtener.charAt(i)=='テ'||obtener.charAt(i)=='て')
         {
             reemplazo.append("te");
      esjapo=true;
         }
         if(obtener.charAt(i)=='と'||obtener.charAt(i)=='ト')
         {
             reemplazo.append("tohh");
      esjapo=true;
         }
         if(obtener.charAt(i)=='ダ'||obtener.charAt(i)=='だ')
         {
             reemplazo.append("da");
      esjapo=true;
         }
       
          if(obtener.charAt(i)=='で'||obtener.charAt(i)=='デ')
         {
             reemplazo.append("de");
      esjapo=true;
         }
          if(obtener.charAt(i)=='ド'||obtener.charAt(i)=='ど')
         {
             reemplazo.append("doh");
      esjapo=true;
         }
          if(obtener.charAt(i)=='な'||obtener.charAt(i)=='ナ')
         {
             reemplazo.append("na");
      esjapo=true;
         }
         if(obtener.charAt(i)=='に'||obtener.charAt(i)=='ニ')
         {
             reemplazo.append("ni");
      esjapo=true;
         }
         if(obtener.charAt(i)=='ぬ'||obtener.charAt(i)=='ヌ')
         {
             reemplazo.append("nu");
      esjapo=true;
         }
         if(obtener.charAt(i)=='ね'||obtener.charAt(i)=='ネ')
         {
             reemplazo.append("nehh");
      esjapo=true;
         }
         if(obtener.charAt(i)=='の'||obtener.charAt(i)=='ノ')
         {
             reemplazo.append("no");
      esjapo=true;
         }
         if(obtener.charAt(i)=='ま'||obtener.charAt(i)=='マ')
         {
             reemplazo.append("ma");
      esjapo=true;
         }
          if(obtener.charAt(i)=='み'||obtener.charAt(i)=='ミ')
         {
             reemplazo.append("mi");
      esjapo=true;
         }
          if(obtener.charAt(i)=='む'||obtener.charAt(i)=='ム')
         {
             reemplazo.append("mu");
      esjapo=true;
         }
          if(obtener.charAt(i)=='め'||obtener.charAt(i)=='メ')
         {
             reemplazo.append("me");
      esjapo=true;
         }
          if(obtener.charAt(i)=='も'||obtener.charAt(i)=='モ')
         {
             reemplazo.append("mo");
      esjapo=true;
         }
          if(obtener.charAt(i)=='ハ'||obtener.charAt(i)=='は')
         {
             reemplazo.append("ja");
      esjapo=true;
         }
         if(obtener.charAt(i)=='ひ'||obtener.charAt(i)=='ヒ')
         {
             reemplazo.append("ji");
      esjapo=true;
         }
         if(obtener.charAt(i)=='ふ'||obtener.charAt(i)=='フ')
         {
             reemplazo.append("fu");
      esjapo=true;
         }
         if(obtener.charAt(i)=='ヘ'||obtener.charAt(i)=='へ')
         {
             reemplazo.append("je");
      esjapo=true;
         }
         if(obtener.charAt(i)=='ほ'||obtener.charAt(i)=='ホ')
         {
             reemplazo.append("jo");
      esjapo=true;
         }
         if(obtener.charAt(i)=='ら'||obtener.charAt(i)=='ラ')
         {
             reemplazo.append("rah");
      esjapo=true;
         }
          if(obtener.charAt(i)=='り'||obtener.charAt(i)=='リ')
         {
             reemplazo.append("ri");
      esjapo=true;
         }
          if(obtener.charAt(i)=='る'||obtener.charAt(i)=='ル')
         {
             reemplazo.append("rhu");
      esjapo=true;
         }
          if(obtener.charAt(i)=='れ'||obtener.charAt(i)=='レ')
         {
             reemplazo.append("re");
      esjapo=true;
         }
          if(obtener.charAt(i)=='ろ'||obtener.charAt(i)=='ロ')
         {
             reemplazo.append("ro");
      esjapo=true;
         }
            if(obtener.charAt(i)=='よ'||obtener.charAt(i)=='よ')
         {
             reemplazo.append("yo");
      esjapo=true;
         }
              if(obtener.charAt(i)=='や'||obtener.charAt(i)=='ヤ')
         {
             reemplazo.append("ya");
      esjapo=true;
         }
                if(obtener.charAt(i)=='ゆ'||obtener.charAt(i)=='ユ')
         {
             reemplazo.append("yu");
      esjapo=true;
         }
                  if(obtener.charAt(i)=='わ'||obtener.charAt(i)=='ワ')
         {
             reemplazo.append("wa");
      esjapo=true;
         }
                    if(obtener.charAt(i)=='を'||obtener.charAt(i)=='ヲ')
         {
             reemplazo.append("o");
      esjapo=true;
         }
          if(obtener.charAt(i)=='ん'&&obtener.charAt(i-1)=='ょ'||obtener.charAt(i)=='ン'&&obtener.charAt(i-1)=='ョ')
         {
           
             reemplazo.append("ohn");
      esjapo=true;
         }
          if(obtener.charAt(i)=='ん'&&obtener.charAt(i-1)=='ゃ'||obtener.charAt(i)=='ン'&&obtener.charAt(i-1)=='ャ')
         {
           
             reemplazo.append("ahn");
      esjapo=true;
         }
           if(obtener.charAt(i)=='ん'&&obtener.charAt(i-1)=='ゅ'||obtener.charAt(i)=='ン'&&obtener.charAt(i-1)=='ュ')
         {
           
             reemplazo.append("uhn");
      esjapo=true;
         }
            if(obtener.charAt(i)=='ん'||obtener.charAt(i)=='ン')
         {
             reemplazo.append("n");
      esjapo=true;
         }
                       if(obtener.charAt(i)=='ば'||obtener.charAt(i)=='バ')
         {
             reemplazo.append("bah");
      esjapo=true;
         }
         if(obtener.charAt(i)=='び'||obtener.charAt(i)=='ビ')
         {
             reemplazo.append("bhi");
      esjapo=true;
         }
          if((obtener.charAt(i)=='び'&&obtener.charAt(i+1)=='ょ'||obtener.charAt(i)=='ビ'&&obtener.charAt(i+1)=='ョ'))
         {   
             reemplazo.append("bio");
             reemplazo.deleteCharAt(i+2);
      esjapo=true;
         }
           if((obtener.charAt(i)=='び'&&obtener.charAt(i+1)=='ゃ'||obtener.charAt(i)=='ビ'&&obtener.charAt(i+1)=='ャ'))
         {   
             reemplazo.append("bya");
             reemplazo.deleteCharAt(i+2);
      esjapo=true;
         }
            if((obtener.charAt(i)=='び'&&obtener.charAt(i+1)=='ゅ'||obtener.charAt(i)=='ビ'&&obtener.charAt(i+1)=='ュ'))
         {   
             reemplazo.append("byu");
             reemplazo.deleteCharAt(i+3);
      esjapo=true;
         }
         if(obtener.charAt(i)=='ぶ'||obtener.charAt(i)=='ブ')
         {
             reemplazo.append("buh");
      esjapo=true;
         }
         if(obtener.charAt(i)=='ベ'||obtener.charAt(i)=='べ')
         {
             reemplazo.append("beh");
      esjapo=true;
         }
         if(obtener.charAt(i)=='ぼ'||obtener.charAt(i)=='ボ')
         {
             reemplazo.append("bho");
      esjapo=true;
         }
          if(obtener.charAt(i)=='ぱ'||obtener.charAt(i)=='パ')
         {
             reemplazo.append("pah");
      esjapo=true;
         }
         if(obtener.charAt(i)=='ピ'||obtener.charAt(i)=='ぴ')
         {
             reemplazo.append("pih");
      esjapo=true;
         }
         if(obtener.charAt(i)=='ぷ'||obtener.charAt(i)=='プ')
         {
             reemplazo.append("puh");
      esjapo=true;
         }
         if(obtener.charAt(i)=='ペ'||obtener.charAt(i)=='ぺ')
         {
             reemplazo.append("peh");
      esjapo=true;
         }
         if(obtener.charAt(i)=='ぽ'||obtener.charAt(i)=='ポ')
         {
             reemplazo.append("poh");
      esjapo=true;
         }
       
        if(obtener.charAt(i)=='シ'&&obtener.charAt(i+1)=='ャ')
       {   
         String shon= obtener.replace("ャ", "a");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
       }
           if(obtener.charAt(i)=='し'&&obtener.charAt(i+1)=='ゃ')
           {
               String shon= obtener.replace("ゃ", "a");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
           }
              if(obtener.charAt(i)=='シ'&&obtener.charAt(i+1)=='ュ')
       {   
         String shon= obtener.replace("ュ", "a");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
       }
           if(obtener.charAt(i)=='し'&&obtener.charAt(i+1)=='ゅ')
           {
               String shon= obtener.replace("ゅ", "u");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
           }
       
           if(obtener.charAt(i)=='シ'&&obtener.charAt(i+1)=='ョ')
       {   
         String shon= obtener.replace("ョ", "o");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
       }
           if(obtener.charAt(i)=='し'&&obtener.charAt(i+1)=='ょ')
           {
               String shon= obtener.replace("ょ", "o");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
           }
           if(obtener.charAt(i)=='シ'&&obtener.charAt(i+1)=='ョ')
       {   
         String shon= obtener.replace("ョ", "o");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
       }
        if(obtener.charAt(i)=='き'&&obtener.charAt(i+1)=='ょ')
           {
               String shon= obtener.replace("ょ", "o");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
           }
        if(obtener.charAt(i)=='キ'&&obtener.charAt(i+1)=='ョ')
       {   
         String shon= obtener.replace("ョ", "o");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
       }
       
           if(obtener.charAt(i)=='ぎ'&&obtener.charAt(i+1)=='ょ')
           {
               String shon= obtener.replace("ょ", "o");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
           }
           if(obtener.charAt(i)=='ギ'&&obtener.charAt(i+1)=='ョ')
           {
               String shon= obtener.replace("ョ", "o");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
           }
           if(obtener.charAt(i)=='ジ'&&obtener.charAt(i+1)=='ョ')
       {   
         String shon= obtener.replace("ョ", "o");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
       }
           if(obtener.charAt(i)=='じ'&&obtener.charAt(i+1)=='ょ')
           {
               String shon= obtener.replace("ょ", "o");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
           }
           if(obtener.charAt(i)=='ニ'&&obtener.charAt(i+1)=='ョ')
       {   
         String shon= obtener.replace("ョ", "o");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
       }
           if(obtener.charAt(i)=='ミ'&&obtener.charAt(i+1)=='ョ')
           {
               String shon= obtener.replace("ョ", "o");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
           }
           if(obtener.charAt(i)=='み'&&obtener.charAt(i+1)=='ょ')
       {   
         String shon= obtener.replace("ょ", "o");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
       }
           if(obtener.charAt(i)=='に'&&obtener.charAt(i+1)=='ょ')
           {
               String shon= obtener.replace("ょ", "o");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
           }
           if(obtener.charAt(i)=='ヒ'&&obtener.charAt(i+1)=='ョ')
       {   
         String shon= obtener.replace("ョ", "o");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
       }
           if(obtener.charAt(i)=='ひ'&&obtener.charAt(i+1)=='ょ')
           {
               String shon= obtener.replace("ょ", "o");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
           }
           if(obtener.charAt(i)=='ビ'&&obtener.charAt(i+1)=='ョ')
       {   
         String shon= obtener.replace("ョ", "o");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
       }
           if(obtener.charAt(i)=='ぴ'&&obtener.charAt(i+1)=='ょ')
           {
               String shon= obtener.replace("ょ", "o");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
           }
           if(obtener.charAt(i)=='ピ'&&obtener.charAt(i+1)=='ョ')
       {   
         String shon= obtener.replace("ョ", "o");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
       }
           if(obtener.charAt(i)=='ぴ'&&obtener.charAt(i+1)=='ょ')
           {
               String shon= obtener.replace("ょ", "o");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
           }
           if(obtener.charAt(i)=='チ'&&obtener.charAt(i+1)=='ョ')
       {   
         String shon= obtener.replace("ョ", "o");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
       }
           if(obtener.charAt(i)=='ち'&&obtener.charAt(i+1)=='ょ')
           {
               String shon= obtener.replace("ょ", "o");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
           }
           if(obtener.charAt(i)=='リ'&&obtener.charAt(i+1)=='ョ')
       {   
         String shon= obtener.replace("ョ", "o");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
       }
           if(obtener.charAt(i)=='り'&&obtener.charAt(i+1)=='ょ')
           {
               String shon= obtener.replace("ょ", "o");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
           }
           if(obtener.charAt(i)=='き'&&obtener.charAt(i+1)=='ゃ')
           {
               String shon= obtener.replace("ゃ", "a");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
           }
        if(obtener.charAt(i)=='キ'&&obtener.charAt(i+1)=='ャ')
       {   
         String shon= obtener.replace("ャ", "a");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
       }
       
           if(obtener.charAt(i)=='ぎ'&&obtener.charAt(i+1)=='ゃ')
           {
               String shon= obtener.replace("ゃ", "a");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
           }
           if(obtener.charAt(i)=='ギ'&&obtener.charAt(i+1)=='ャ')
           {
               String shon= obtener.replace("ャ", "a");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
           }
           if(obtener.charAt(i)=='ジ'&&obtener.charAt(i+1)=='ャ')
       {   
         String shon= obtener.replace("ャ", "a");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
       }
           if(obtener.charAt(i)=='じ'&&obtener.charAt(i+1)=='ゃ')
           {
               String shon= obtener.replace("ゃ", "a");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
           }
           if(obtener.charAt(i)=='ニ'&&obtener.charAt(i+1)=='ャ')
       {   
         String shon= obtener.replace("ャ", "a");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
       }
           if(obtener.charAt(i)=='ミ'&&obtener.charAt(i+1)=='ャ')
           {
               String shon= obtener.replace("ャ", "a");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
           }
           if(obtener.charAt(i)=='み'&&obtener.charAt(i+1)=='ゃ')
       {   
         String shon= obtener.replace("ゃ", "a");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
       }
           if(obtener.charAt(i)=='に'&&obtener.charAt(i+1)=='ゃ')
           {
               String shon= obtener.replace("ゃ", "a");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
           }
           if(obtener.charAt(i)=='ヒ'&&obtener.charAt(i+1)=='ャ')
       {   
         String shon= obtener.replace("ャ", "a");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
       }
           if(obtener.charAt(i)=='ひ'&&obtener.charAt(i+1)=='ゃ')
           {
               String shon= obtener.replace("ゃ", "a");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
           }
           if(obtener.charAt(i)=='ビ'&&obtener.charAt(i+1)=='ャ')
       {   
         String shon= obtener.replace("ャ", "a");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
       }
           if(obtener.charAt(i)=='ぴ'&&obtener.charAt(i+1)=='ゃ')
           {
               String shon= obtener.replace("ゃ", "a");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
           }
           if(obtener.charAt(i)=='ピ'&&obtener.charAt(i+1)=='ャ')
       {   
         String shon= obtener.replace("ャ", "a");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
       }
           if(obtener.charAt(i)=='ぴ'&&obtener.charAt(i+1)=='ゃ')
           {
               String shon= obtener.replace("ゃ", "a");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
           }
           if(obtener.charAt(i)=='チ'&&obtener.charAt(i+1)=='ャ')
       {   
         String shon= obtener.replace("ャ", "a");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
       }
           if(obtener.charAt(i)=='ち'&&obtener.charAt(i+1)=='ゃ')
           {
               String shon= obtener.replace("ゃ", "a");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
           }
           if(obtener.charAt(i)=='リ'&&obtener.charAt(i+1)=='ャ')
       {   
         String shon= obtener.replace("ャ", "a");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
       }
           if(obtener.charAt(i)=='り'&&obtener.charAt(i+1)=='ゃ')
           {
               String shon= obtener.replace("ゃ", "a");
         reemplazo.append(shon);
          reemplazo.deleteCharAt(i+2);
        
           esjapo=true;
           }
           
           if(obtener.charAt(i)=='、')
           {
               reemplazo.append(", ");
               esjapo=true;
           }
           if(obtener.charAt(i)=='。')
           {
               reemplazo.append(". ");
               esjapo=true;
           }
           
           
              

    }
   
    if(esjapo==true)
    {
 say=reemplazo.toString();
    }else
    {
        say=obtener;
    }
 
 int i=0;
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
