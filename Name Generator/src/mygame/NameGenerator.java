/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

/**
 *
 * @author Bob
 */
public class NameGenerator {

public String generateName(String originalName) {
    
    String newName;
    
    if (originalName.length() < 3)    
    originalName   = "abc";
    
    String fc      = originalName.toLowerCase().substring(1,2);
    String sc      = originalName.toLowerCase().substring(originalName.length()-2,originalName.length()-1);
    String tc      = originalName.toLowerCase().substring(originalName.length()-1);
    newName        = (getSyllable(fc) + " " + getSyllable(sc) + " " + getSyllable(tc));
    
    return newName;
    
}

private String getSyllable(String letter) {
  
  String syl = "";
  
  if (letter.equals("a")) {
      syl = "Ho";
  }
  
  else if (letter.equals("b")) {
      syl = "Wu";   
  }
  
  else if (letter.equals("c")) {
      syl = "Hao";
  }

  else if (letter.equals("d")) {
      syl = "Tang";
  }
  
  else if (letter.equals("e")) {
      syl = "Lee";
  }
  
  else if (letter.equals("f")) {
      syl = "Pang";
  }
  
  else if (letter.equals("g")) {
      syl = "Kim";
  }
  
  else if (letter.equals("h")) {
      syl = "Wang";
  }
  
  else if (letter.equals("i")) {
      syl = "Sum";
  }
  
  else if (letter.equals("j")) {
      syl = "Hong";
  }
  
  else if (letter.equals("k")) {
      syl = "Jin";
  }
  
  else if (letter.equals("l")) {
      syl = "Ting";
  }
  
  else if (letter.equals("m")) {
      syl = "Gong";
  }
  
  else if (letter.equals("n")) {
      syl = "Ling";
  }
  
  else if (letter.equals("o")) {
      syl = "Chen";
  }
  
  else if (letter.equals("p")) {
      syl = "Bang";
  }
  
  else if (letter.equals("q")) {
      syl = "Pow";
  }
  
  else if (letter.equals("r")) {
      syl = "Chong";
  }
  
  else if (letter.equals("s")) {
      syl = "Fuk";
  }
  
  else if (letter.equals("t")) {
      syl = "Chi";
  }
  
  else if (letter.equals("u")) {
      syl = "Lu";
  }
  
  else if (letter.equals("v")) {
      syl = "Tee";
  }
  
  else if (letter.equals("w")) {
      syl = "Mu";
  }
  
  else if (letter.equals("x")) {
      syl = "Wu";
  }
  
  else if (letter.equals("y")) {
      syl = "Wong";
  }
  
  else if (letter.equals("z")) {
      syl = "Pu";
  }
  
  return syl;
  }
    
}
