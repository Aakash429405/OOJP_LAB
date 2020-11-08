import java.util.Scanner;
class Player{
int id;
String name;
int scores;
int matches_played;

void Playerdetail(){
System.out.println("Enter player detail");
Scanner s=new Scanner(System.in);
System.out.println("Enter name");
name=s.nextLine();
System.out.println("Enter id");
id=s.nextInt();
System.out.println("Enter score");
scores=s.nextInt();
System.out.println("Enter Matches played");
matches_played=s.nextInt();}

void Displaydetails(){
System.out.println("NAME "+name+" ID "+id+" SCORE "+scores+" MATCHES PLAYED "+matches_played);
}
Player(){
System.out.println("Constructor is created");
}
int AvgScore(){
int average;
average=scores/matches_played;
//System.out.println("Average Score"+average);
return average;
}}

class PlayerRunner{
public static void main (String args []){
Player p=new Player();
p.Playerdetail();
Player q=new Player();
q.Playerdetail();

if(p.AvgScore()>q.AvgScore())
p.Displaydetails();
else 
q.Displaydetails();
}
}
