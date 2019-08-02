

import java.util.Scanner;
public class Projet {
	 public static void main(String[]args)
	 {     Joueur []T=new Joueur[20];
	       
	       int j,M,indM;
	       boolean find;
	          String choix1,choix2;
	          Lexique L=new Lexique();
	           
		       String u;
	          String nom=new String();
	          int signe=0;
	          int i =0;
	          int b=0;
	          String  choix=new String("0");
	          T[b]=new Joueur();
	          Scanner c=new Scanner(System.in);
	      do{
	          do{         System.out.println("1--------------->jouer");
	                      System.out.println("2---------------->score");
	                      System.out.println("3---------------->Quitter l'application");
	                                    choix1=c.nextLine();
	            }while((choix1.charAt(0)!='1')&&(choix1.charAt(0)!='2')&&(choix1.charAt(0)!='3'));
 if(choix1.charAt(0)=='1'){
		   
		   
	          do{       if(signe==0)
	                   { choix="";
	        	         choix+=T[b].Jouer();}
	                     else
	                     {   choix="";
	                    	 choix=T[i].Jouer();}
	                 
	                      if(choix.charAt(0)=='1')  signe=0;
	                	         
	                  
	                  
	                      else if (choix.charAt(0)=='2'){      
	                    	                     if(b==0) 
	                    	                     { System.out.println("y a pas un autre joueur autre que celui ci");}
	                                  else{
	                	                      System.out.println("donner son pseudo identique a sa creation");
	                  
	                                               nom=c.nextLine();
	                                               find=false;
	                                               j=0;
	                                         while((j<=b)&&(!find))
	                                         {    if(nom.equals(T[j].gets_Pseudo()))  
                                                                   find=true;
	                                             else 
	                                        	                      j++;
	                                          }
	                                         if (find==true)
	                                                {i=j;
	                                                signe=1;}
	                                         else  System.out.println("se pseudo n est pas trouver!!");
	                                      }
	                                         }//fin if choix==2
	         
	                     else if (choix.charAt(0)=='3')
	                     {     b++;
	                        T[b]=new Joueur();
	                        signe=0;
	                        
	                        
	                  }
	            
	                	  
	                
	                                           
	                                 
	                  
	                  
	        	   
	                      }while((i<T.length)&&(choix.charAt(0)!='4'));
	                    }//end choix1==1
else if(choix1.charAt(0)=='2'){
		          do{
		                 do{
		                 System.out.println("1----->meilleur score");
		                 System.out.println("2------>meilleur score de tous les joueurs");
		                 System.out.println("3------>Menu principale");
		                   choix2=c.nextLine();
		                 }while((choix2.charAt(0)!='1')&&(choix2.charAt(0)!='2')&&(choix2.charAt(0)!='3'));
		                if(choix2.charAt(0)=='1'){ System.out.println("le meilleur score que peut avoir un joueur est  :"+L.M_score());}
		                	               
		                
		                else if(choix2.charAt(0)=='2')
		                {       if(choix.charAt(0)=='0')
		                	         {System.out.println("aucune partie a etais jouer");}
		                else{ M=0;
		                        indM=0;
		                	for(int n=0;n<=b;n++){
		                		   if(M<=T[n].get_Mscore())  
		                			     {M=T[n].get_Mscore();
		                			      indM=n;}
		                		   }
		                	if(M!=0) System.out.println("ya pas de meilleur score tous les joueurs on un score null ");
		                	else     System.out.println(T[indM].gets_Pseudo()+ "a le meilleur score est c est :"+M);
		                	}
		                }
	                }while(choix2.charAt(0)!='3'); 
	              }  //end choix1==2                
            }while(choix1.charAt(0)!='3');
	 }//ffin static

}
