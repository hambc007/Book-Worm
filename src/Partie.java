
import java.util.Scanner;
public class Partie {
	private Lexique L;
	private Grille G;
	private Scanner s;
	
	
	
	 
	public Partie( String choix){
		 
		 L= new Lexique();
		 s=new Scanner(System.in);
		        if (choix.equals("1"))G=new Grille(5);
		        else    G=new Grille(10);

		     
	                         }// fin constructeur
	public void Ajout(int j,int m,int n)
	{
                           
                       char c= G.gets_char(m,n);
                      
		               G.set_char(m,n,c);
	                                                         }
	public int jeu(){
		
		int score=0;
	
		String Mout=new String();
		Mout="";
		String mot=new String();
		G.remplir();
		mot=L.donner_Mot();
		G.entrerMot(mot);
		int m=G.gets_L();
		int n=G.gets_C();
		char u = mot.charAt(0);
		Mout=Mout+u;
		
		char t;
		
		int j=1;
		String c=new String();
		 do{
				
				do{
				 G.afficher();
				   menu(Mout);
				 c=s.nextLine();
				}while((c.charAt(0)!='d')&&(c.charAt(0)!='D')&&(c.charAt(0)!='g')&&(c.charAt(0)!='G')&&(c.charAt(0)!='h')&&(c.charAt(0)!='H')&&(c.charAt(0)!='b')&&(c.charAt(0)!='B')&&(c.charAt(0)!='s')&&(c.charAt(0)!='S')&&(c.charAt(0)!='A')&&(c.charAt(0)!='a'));				
				
				
				if ((c.charAt(0)=='d')||(c.charAt(0)=='D'))
				{    if(   (n+1)>= G.size() )  System.out.println(" vous ne pouvez pas vous deplacez a droite!!");
				    else
				    { n++;
				      t = G.gets_char(m,n);
                       Mout+=t;
                       Ajout(j,m,n);
                       j++;
				    }
				}
				else if ((c.charAt(0)=='g')||(c.charAt(0)=='G'))
				{      if((n-1)<0)        System.out.println(" vous ne pouvez pas vous deplacez a gauche!!");
				       else
				         {  n--;
				            t = G.gets_char(m,n);
		                       Mout+=t;
		                       Ajout(j,m,n);
		                       j++;
				         }
				}
				else if((c.charAt(0)=='H')||(c.charAt(0)=='h'))
				{      if((m-1)<0)        System.out.println(" vous ne pouvez pas vous deplasser en haut!!");
				       else
				    {m--;
				     t = G.gets_char(m,n);
                     Mout+=t;
                     Ajout(j,m,n);
                     j++;
				    }
				}
				else if((c.charAt(0)=='b')||(c.charAt(0)=='B'))
				{
					    if((m+1)>=G.size())             System.out.println(" vous ne pouvez pas vous deplacez en bas!!");
					    else
					    {   m++;
					        
					        t = G.gets_char(m,n);
		                       Mout+=t;
		                       Ajout(j,m,n);
		                       j++;
					    }
				}
					
				}while((c.charAt(0)!='s')&&(c.charAt(0)!='S')&&(c.charAt(0)!='A')&&(c.charAt(0)!='a'));
				
				if((c.charAt(0)=='A')||(c.charAt(0)=='a'))
					    System.out.println("votre score est 0");
				else
				{    if(Mout.equals(mot))  
					{score=(50*mot.length())+500;
					 System.out.println("votre score est "+score);
					}
				    else{ int i=0;
				          boolean find= false;
				          while((i<L.gets_LMotC())&&(!find))
				          {    if(Mout.equals(L.gets_MotC(i))) find = true;
				              else  
				        	  i++;
				           
				          }// end while
				    if (find =true)  { score=50*Mout.length();
				                       System.out.println("c est pas le mot correcte mais se mot est trouver dans le dictionnaire votre score est "+score);
				                      }
				    else 
				    	   System.out.println("votre score est 0");
				        }//end else
				  
				          
				        
				 }//end big else 
		
		
			
		   
		
		    
			return score;
			
		
		}//fin methode jeu

public void menu(String Mot){
System.out.println("                                         Mot;"+Mot);
System.out.println("        Action:  d(->)  g(<-)  h()  b()  s(soumettre) a(Abandon)?");
}
public String suggestion(){    String choix="";
                            
                             
	                        do{
	                       System.out.println("1----->rejouer avec le meme joueur");
	                       System.out.println("2------->jouer avec un autre joueur deja creer");
	                       System.out.println("3-------->jouer avec un joueur nouveau");
	                       
	                       System.out.println("4----------->menu principale");
	                                    choix=s.nextLine();
	                                 
	                        }while((choix.charAt(0)!='1')&&(choix.charAt(0)!='2')&&(choix.charAt(0)!='3')&&(choix.charAt(0)!='4'));
	                        return choix;
	                       
                           }  
 
 
}//fin classe partie
