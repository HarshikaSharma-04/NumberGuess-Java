import java.util.*;
import java.util.Random;
class guessnumbergame {
    public int guess=0,User,Computer;
    public void Userinput(int n){
      User=n; //to use this number multiple times
    }

    public guessnumbergame(){
       Random random=new Random();
       Computer=random.nextInt(100);
    }
     public boolean check(){
        while(User!=Computer){
    if(User>Computer){
        System.out.println("Too HIGH");
        guess++;
        return false;
    }else if(User<Computer){
        System.out.println("Too LOW!!");
        guess++;
        return false;
    }
   
    }
    guess++;
    return true;
}
  public int guesstaken(){
    return guess;
  }
}
public class Game{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        guessnumbergame g=new guessnumbergame();
        System.out.println("Enter your guess : ");
        g.Userinput(sc.nextInt());
        while(!(g.check())){
            System.out.println("Enter number again");
            g.Userinput(sc.nextInt());
        }
            System.out.println("Yayyyyy.....Right guess");
            System.out.println("Number of guesses "+ g.guesstaken());
        
sc.close();
    }      
          
    }


