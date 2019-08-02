import java.util.Scanner;


public class Joueur {
	  private int []score;
	  private String Pseudo;
	  private Partie []P;
	  private int i ;
	           public Joueur(){
	        	   P=new Partie [20];
	        	   Pseudo= new String();
	        	   Pseudo="";
	        	   score=new int [20];
	        	   i=0;
	                            }
       public String Jouer(){
                 String choix =new String ("0");
                 String kiki=new String("");
                 Scanner y =new Scanner(System.in);
                 if(Pseudo.equals(""))
                 { System.out.println(" what s your name");
    	         
    	         Pseudo=y.nextLine();
                 }
    	        
    	         System.out.println("hey " +Pseudo +"  choose difficulty:");
    	         if(Pseudo.equals("")==false)
    	         {  do{  
    	         System.out.println("1------->easy");
    	              System.out.println("2--------->difficult");
    	        	 
					choix=y.nextLine();
    	         }while((choix.equals("1")==false)&&(choix.equals("2")==false));
    	         }
    	         P[i]=new Partie(choix);
    	         
    	       score[i]= P[i].jeu();
    	       i++;
    	       kiki=P[i-1].suggestion();
    	            return kiki;
    	             
    	            	
    	              
       }//fin methode jouer
       
       
       
       
       public int get_Mscore(){
    	         
    	          int Max=0;
    	          for(int j=0;j<i;j++){
    	          if(Max<=score[j])
    	        	       Max=score[j];
    	          }
    	            
    	           return Max;
       }
       
       
	public String gets_Pseudo() {return Pseudo;}
	

		
	
		
	
    	         
    	         
       
	
}//fin class joueur
