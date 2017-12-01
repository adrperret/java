package randomTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

//Principe Kiss, fonctions ayant le moins d'actions
public class RandomTest {

    private static Scanner input = new Scanner(System.in);
    private static ArrayList<String> al;
    private static HashMap<String,Integer> nbParPlaceA;
    private static HashMap<String,Integer> nbParPlaceB;
    private static HashMap<String,Integer> nbParPlaceC;
    private static HashMap<String,Integer> nbParPlaceD;
    private static HashMap<String,Integer> nbParPlaceE;
    private static HashMap<String,Integer> nbParPlaceF;
    
    private static HashMap<String,Double> pcParPlaceA;
    private static HashMap<String,Double> pcParPlaceB;
    private static HashMap<String,Double> pcParPlaceC;
    private static HashMap<String,Double> pcParPlaceD;
    private static HashMap<String,Double> pcParPlaceE;
    private static HashMap<String,Double> pcParPlaceF;
    //private static ArrayList<HashMap<String,Integer>> tabLettres;
    private static HashMap<String,HashMap<String,Integer>> mapLettres;

    private static int rang = 0;

    public static void main(String[] args) {
        //ArrayList<String> 
        al = new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add("F");
        
        //TODO créer objets avec des hashmaps dans constructeurs, param : String pour la lettre et Integer pour rang

        nbParPlaceA = new HashMap<>();
        nbParPlaceA.put("1", 0);
        nbParPlaceA.put("2", 0);
        nbParPlaceA.put("3", 0);
        nbParPlaceA.put("4", 0);
        nbParPlaceA.put("5", 0);
        nbParPlaceA.put("6", 0);
        
        pcParPlaceA = new HashMap<>();
        pcParPlaceA.put("1", 0.0);
        pcParPlaceA.put("2", 0.0);
        pcParPlaceA.put("3", 0.0);
        pcParPlaceA.put("4", 0.0);
        pcParPlaceA.put("5", 0.0);
        pcParPlaceA.put("6", 0.0);

        nbParPlaceB = new HashMap<>();
        nbParPlaceB.put("1", 0);
        nbParPlaceB.put("2", 0);
        nbParPlaceB.put("3", 0);
        nbParPlaceB.put("4", 0);
        nbParPlaceB.put("5", 0);
        nbParPlaceB.put("6", 0);

        pcParPlaceB = new HashMap<>();
        pcParPlaceB.put("1", 0.0);
        pcParPlaceB.put("2", 0.0);
        pcParPlaceB.put("3", 0.0);
        pcParPlaceB.put("4", 0.0);
        pcParPlaceB.put("5", 0.0);
        pcParPlaceB.put("6", 0.0);
        
        nbParPlaceC = new HashMap<>();
        nbParPlaceC.put("1", 0);
        nbParPlaceC.put("2", 0);
        nbParPlaceC.put("3", 0);
        nbParPlaceC.put("4", 0);
        nbParPlaceC.put("5", 0);
        nbParPlaceC.put("6", 0);

        pcParPlaceC = new HashMap<>();
        pcParPlaceC.put("1", 0.0);
        pcParPlaceC.put("2", 0.0);
        pcParPlaceC.put("3", 0.0);
        pcParPlaceC.put("4", 0.0);
        pcParPlaceC.put("5", 0.0);
        pcParPlaceC.put("6", 0.0);
        
        nbParPlaceD = new HashMap<>();
        nbParPlaceD.put("1", 0);
        nbParPlaceD.put("2", 0);
        nbParPlaceD.put("3", 0);
        nbParPlaceD.put("4", 0);
        nbParPlaceD.put("5", 0);
        nbParPlaceD.put("6", 0);

        pcParPlaceD = new HashMap<>();
        pcParPlaceD.put("1", 0.0);
        pcParPlaceD.put("2", 0.0);
        pcParPlaceD.put("3", 0.0);
        pcParPlaceD.put("4", 0.0);
        pcParPlaceD.put("5", 0.0);
        pcParPlaceD.put("6", 0.0);
        
        nbParPlaceE = new HashMap<>();
        nbParPlaceE.put("1", 0);
        nbParPlaceE.put("2", 0);
        nbParPlaceE.put("3", 0);
        nbParPlaceE.put("4", 0);
        nbParPlaceE.put("5", 0);
        nbParPlaceE.put("6", 0);

        pcParPlaceE = new HashMap<>();
        pcParPlaceE.put("1", 0.0);
        pcParPlaceE.put("2", 0.0);
        pcParPlaceE.put("3", 0.0);
        pcParPlaceE.put("4", 0.0);
        pcParPlaceE.put("5", 0.0);
        pcParPlaceE.put("6", 0.0);
        
        nbParPlaceF = new HashMap<>();
        nbParPlaceF.put("1", 0);
        nbParPlaceF.put("2", 0);
        nbParPlaceF.put("3", 0);
        nbParPlaceF.put("4", 0);
        nbParPlaceF.put("5", 0);
        nbParPlaceF.put("6", 0);

        pcParPlaceF = new HashMap<>();
        pcParPlaceF.put("1", 0.0);
        pcParPlaceF.put("2", 0.0);
        pcParPlaceF.put("3", 0.0);
        pcParPlaceF.put("4", 0.0);
        pcParPlaceF.put("5", 0.0);
        pcParPlaceF.put("6", 0.0);
        
        mapLettres = new HashMap<String,HashMap<String,Integer>>();
        mapLettres.put("A",nbParPlaceA);
        mapLettres.put("B",nbParPlaceB);
        mapLettres.put("C",nbParPlaceC);
        mapLettres.put("D",nbParPlaceD);
        mapLettres.put("E",nbParPlaceE);
        mapLettres.put("F",nbParPlaceF);
        
       // mapPourcentages =

        RandomTest test = new RandomTest();
        int choixTirages = 0;

        do {
            System.out.println("Saisir le nombre de tirages ou 0 pour quitter :");
            choixTirages = input.nextInt();
            test.occurence(choixTirages);
        } while (choixTirages != 0);

    }

    public void occurence(int nbTirages) {
        for( int i=0; i<nbTirages; i++) {
            rang = 1;

            Collections.shuffle(al);

            Iterator<String> itrA = al.iterator();
            StringBuilder sgb = new StringBuilder();
            ArrayList<String> tab = new ArrayList<>();

            //Tant que l'itérateur trouve des élements on les ajoute au StringBuilder
            while(itrA.hasNext()) {
                sgb.append(itrA.next().concat(" "));
            }
            //On découpe le StringBuilder et on envoie ses parties dans un tableau
            for (String string : sgb.toString().split(" ")) {
                tab.add(string);
            }
            //System.out.println(tab.toString());
            int testVar;
            int oldValue;

            for (String string : tab) {
                switch (string) {
                case "A":       
                    testVar = (nbParPlaceA.get(String.valueOf(rang))+1);
                    nbParPlaceA.replace(String.valueOf(rang), (nbParPlaceA.get(String.valueOf(rang))+1));
                    //Pour test
                    //System.out.println("Présence d'un A au rang : "+ rang);
                    //System.out.println(nbParPlaceA);
                    break;
                case "B":
                    nbParPlaceB.replace(String.valueOf(rang), (nbParPlaceB.get(String.valueOf(rang))+1));
                    break;
                case "C":
                    nbParPlaceC.replace(String.valueOf(rang), (nbParPlaceC.get(String.valueOf(rang))+1));
                    break;
                case "D":
                    nbParPlaceD.replace(String.valueOf(rang), (nbParPlaceD.get(String.valueOf(rang))+1));
                    break;
                case "E":
                    nbParPlaceE.replace(String.valueOf(rang), (nbParPlaceE.get(String.valueOf(rang))+1));
                    break;
                case "F":
                    nbParPlaceF.replace(String.valueOf(rang), (nbParPlaceF.get(String.valueOf(rang))+1));
                    break;
                default :
                    break;
                }
                rang++;
            }
        }

        double sum = 0;
        int i = 0;
        double moy = 0.0;

        double sumA = 0;
        double sumB = 0;
        double sumC = 0;
        double sumD = 0;
        double sumE = 0;
        double sumF = 0;


        for(Entry<String, HashMap<String, Integer>> map : mapLettres.entrySet()) {
            for(int val : map.getValue().values()) {
                sum += val;
            }
            
            moy = sum/map.getValue().size();
            
            //System.out.println("Moyenne des occurences par rang :".concat(String.valueOf(sum/map.getValue().size())));
            System.out.println("Moyenne des occurences par rang :".concat(String.valueOf(moy)));
            System.out.println("Occurences de "+ map.getKey() + " selon le rang de tirage\n"+map+"\n");
            //liste de % de divergence à la moyenne
            for (int n : map.getValue().values()) {
                System.out.println( ((n/moy)*100) + "%" ); //TODO ajouter à hashmap
            }
            System.out.println("\n\n");
            //System.out.println(map.getValue().values().toString()); // TODO à extraire pour différence avec moyenne
            sum = 0;
            i++;
        }


        /*for(int val : nbParPlaceA.values()) {
            sumA += val;
        }
        System.out.println("Moyenne des occurences de A par rang :".concat(String.valueOf(sumA/nbParPlaceA.size())));
        System.out.println("Occurences de A selon le rang de tirage\n"+nbParPlaceA+"\n\n");
        System.out.println("Occurences de B selon le rang de tirage\n"+nbParPlaceB+"\n\n");
        System.out.println("Occurences de C selon le rang de tirage\n"+nbParPlaceC+"\n\n");
        System.out.println("Occurences de D selon le rang de tirage\n"+nbParPlaceD+"\n\n");
        System.out.println("Occurences de E selon le rang de tirage\n"+nbParPlaceE+"\n\n");
        System.out.println("Occurences de F selon le rang de tirage\n"+nbParPlaceF+"\n\n");*/
    }

}

