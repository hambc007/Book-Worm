import java.util.Random;



public class Lexique {

    private  String [] MotL;
     private String []MotC;
	public Lexique(){
		  MotL=new String[6];
        MotL[0]="universiter";
        MotL[1]="fonctionaliter";
        MotL[2]="maison";
        MotL[3]="cartable";
        MotL[4]="faisable";
        MotL[5]="personnel";
        MotC=new String [6];
       MotC[0]="un";
       MotC[1]="fonction";
       MotC[2]="mais";
       MotC[3]="car";
       MotC[4]="fais";
       MotC[5]="personne";
		            
		           
	                  }
public String  donner_Mot(){
	        
	        Random rnd=new Random();
	        return(MotL[rnd.nextInt(MotL.length )]);
}
public String gets_MotC(int i ){ return ( MotC[i]);}
public int gets_LMotC(){return MotC.length ;}
public  int M_score(){ 
	       int s,max=0;
	       for(int i=0;i<MotL.length;i++)
	       {  if(MotL[i].length()>=max)
	    	       {   max=MotL[i].length();
	    	    	     	    	       }
	       }
	       s=max*50;
		   max= s+500;
	     return max;
}
}//fin classe lexique
