
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;


public class RandomTest {

  private static Scanner input = new Scanner(System.in);
  
  private static ArrayList<String> al;
  private static NbPrPlace[] tabNPP;
  private static HashMap<String,NbPrPlace> rangMap;
  private static HashMap<String,NbPrPlace> mapLettresObjet;
  private static NbPrPlace nppA = new NbPrPlace();
  private static NbPrPlace nppB = new NbPrPlace();
  private static NbPrPlace nppC = new NbPrPlace();
  private static NbPrPlace nppD = new NbPrPlace();
  private static NbPrPlace nppE = new NbPrPlace();
  private static NbPrPlace nppF = new NbPrPlace();
  
  private static int rang = 0;

  public static void main(String[] args) {
      
      al = new ArrayList<>();
      al.add("A");
      al.add("B");
      al.add("C");
      al.add("D");
      al.add("E");
      al.add("F");


      for ( int i = 1; i<7 ; i++) {
          nppA.setMapPlaces(String.valueOf(i), 0);
          nppB.setMapPlaces(String.valueOf(i), 0);
          nppC.setMapPlaces(String.valueOf(i), 0);
          nppD.setMapPlaces(String.valueOf(i), 0);
          nppE.setMapPlaces(String.valueOf(i), 0);
          nppF.setMapPlaces(String.valueOf(i), 0);
      }
      
      tabNPP = new NbPrPlace[]{nppA,nppB,nppC,nppD,nppE,nppF};
      mapLettresObjet = new HashMap<String,NbPrPlace>();

      rangMap = new HashMap<>();
      for(int i=0 ; i < 6 ; i++) {
          rangMap.put(al.get(i), tabNPP[i]);
          mapLettresObjet.put(al.get(i), tabNPP[i]);
      }
      
      RandomTest test = new RandomTest();
      int choixTirages = 0;

      do {
          System.out.println("Saisir le nombre de tirages ou 0 pour quitter :");
          choixTirages = input.nextInt();
          test.occurence(choixTirages);
      } while (choixTirages != 0);

  }

  public void remplirMap(NbPrPlace npp, int rang) {
      npp.setMapPlaces(String.valueOf(rang), (npp.getMapPlaces().get(String.valueOf(rang))+1));
  }
  
  public void occurence(int nbTirages) {
      for( int i=0; i<nbTirages; i++) {
          rang = 1;

          Collections.shuffle(al);

          Iterator<String> itrA = al.iterator();
          StringBuilder sgb = new StringBuilder();
          ArrayList<String> tab = new ArrayList<>();

          /**
           * Partie d'exercice théorique sur les chaînes et les tableaux :
           * Construction depuis un itérateur sur le tableau de lettres d'un StringBuilder qui est splitté pour retourner dans un 
           * tableau.
           */
          while(itrA.hasNext()) {
              sgb.append(itrA.next().concat(" "));
          }
          for (String string : sgb.toString().split(" ")) {
              tab.add(string);
          }

          for (String string : tab) {
              switch (string) {
              case "A":       
                  remplirMap(nppA,rang);
                  break;
              case "B":
                  remplirMap(nppB,rang);
                  break;
              case "C":
                  remplirMap(nppC,rang);
                  break;
              case "D":
                  remplirMap(nppD,rang);
                  break;
              case "E":
                  remplirMap(nppE,rang);
                  break;
              case "F":
                  remplirMap(nppF,rang);
                  break;
              default :
                  break;
              }
              rang++;
          }
          
      }
      
      double sum = 0;
      double moy = 0.0;
      //Fin fonction

      for(Entry<String, NbPrPlace> map : mapLettresObjet.entrySet()) {
          
          for(int val : map.getValue().getMapPlaces().values()) {
              sum += val;
          }
          
          moy = sum/map.getValue().getMapPlaces().size();
          DecimalFormat numberFormat = new DecimalFormat("#.00");
          
          System.out.println("\nMoyenne des occurences par rang :".concat(String.valueOf(numberFormat.format(moy))));
          System.out.println("Occurences de "+ map.getKey() + " selon le rang de tirage\n"+map);

          double varP = 0.0;
          int rangp = 1;
          HashMap<String,String> tempMap = new HashMap<>();
          
          /**
           * Liste des pourcentages de divergence à la moyenne
           */
          for (int n : map.getValue().getMapPlaces().values()) {
              varP = (n/moy)*100;        
              tempMap.put(String.valueOf(rangp), numberFormat.format(varP));
              rangp++;
          }
          
          System.out.println("Pourcentage de différence à la moyenne :");
          System.out.println(map.getKey()+"="+tempMap.toString());         
          System.out.println("\n");
          tempMap = null;
          sum = 0;
      }

  }
  

}

