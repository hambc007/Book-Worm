import java.util.Random;
import java.util.Scanner;


public class Grille{
	   private String [][]Mat;
	   private int L;
	   private int C;
	   private int F;
	   public  Grille(int B )
	   {     F=B;
	         Mat= new String [B][B];
	         L=0;
	         C=0;
	   }
	   public boolean ok(int i,int j,int Tij[],int lg){
           boolean trouve=false;
           int k=0;
          while((k<lg)&&(!trouve))
                     {if((Tij[k]==i)&&(Tij[k+1]==j))
                                trouve=true;
                       else 
                               k=k+2;
                    }
                       return trouve;
             }
                      

public void remplir(){
char[] lettres={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	  Random rnd =new Random(); 
	      char c;
	    for( int i=0;i<F;i++)
	    {for( int j =0;j<F;j++)
	    {       
	    	   c=lettres[rnd.nextInt(lettres.length)];
	    	   Mat[i][j]=new String(" "+c);
	    }
	    }
}
public void afficher()
{           
	           for(int i=0;i<F;i++)
            {    System.out.print("                 ");
	             for(int j=0;j<F;j++)
	             {     
	                            
	                   if((j-1>=0)&&(Mat[i][j-1].charAt(0)=='(')) System.out.print(Mat[i][j]+"   ");
	                   else System.out.print(" "+Mat[i][j]+"   ");
	                 }
              
	             System.out.println("");
            }  

	   
}
public void entrerMot( String mot){
	   int []Tij=new int [60];
	   
	  Random rnd = new Random ();
	  int i =rnd.nextInt(F);
	  int j=rnd.nextInt(F);
	  L=i;
	  C=j;
	  int k=1;
	  int choix;
	  
	  
	  char p=mot.charAt(0);
	  Mat[i][j]=new String("("+p+")");
	  
	  int g=0;
	  int lg=2;
	  int t;
			  while(k< mot.length())
			  {
	               Tij[g]=i;
			       Tij[g+1]=j;
     choix=rnd.nextInt(4);
if ( (choix==3) && ( (i-1)  >=0))  //haut
{    t=i-1;
	if(ok(t,j,Tij,lg)==false)
	{i--;
      p=mot.charAt(k);
 Mat[i][j]=new String(" "+p);
 
 k++;
 g=g+2;
 lg=lg+2;
	}
 
}
else if  ( (choix==2) && ( (j-1)>=0))//gauche
{        t=j-1;
	if(ok(i,t,Tij,lg)==false)
{
	j--;
	p=mot.charAt(k);
   Mat[i][j]=new String(" "+p);
   
   k++;
   g=g+2;
   lg=lg+2;
}
  
}
else if  ((choix==0) && ((i+1)<F))//bas
{    t=i+1;
	if(ok(t,j,Tij,lg)==false)
	{i++;
	p=mot.charAt(k);
	   Mat[i][j]=new String(" "+p);
   
   k++;
   g=g+2;
   lg=lg+2;
	}
  
   
}
else if ((choix==1) && ((j+1)<F))//droite
{      t=j+1;
	if(ok(i,t,Tij,lg)==false)
	{j++;
	p=mot.charAt(k);
	   Mat[i][j]=new String(" "+p);

k++;
g=g+2;
lg=lg+2;
	}
}

	        }//fin boucle while
}//fin methode entrer mot
public void set_char(int i ,int j , char c){
	Mat[i][j]=new String("("+c+")");
	
	
	          }
public char gets_char(int i , int j){ return (Mat[i][j].charAt(1));}
public int size(){ return F;}


public int gets_L() {return L;}
public int gets_C() {return C;}
	


	


}