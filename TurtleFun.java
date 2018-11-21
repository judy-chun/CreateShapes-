
/* Filename: TurtleFun.java 
* Created by: Judy Chun, cs8afug and Lingchen Dang, cs8afuk 
* Date: 10/15/2017
*/ 
public class TurtleFun
{
  public static void main (String[] args) 
    { 
        World world1 = new World(450,450);
        Turtle judy = new Turtle(225,225,world1);
        int size = 50; 
        int thickness = 5;
        judy.setPenWidth(5);
        judy.penUp();
        judy.moveTo(0,225);
        judy.penDown();
        judy.drawShape(size, thickness);
        
        Turtle lynette = new Turtle(225,225,world1);
        lynette.penUp();
        lynette.moveTo(150,225);
        lynette.penDown();
        lynette.drawShape(size, thickness);
        
        Turtle john;
        john = lynette;
        john.penUp();
        john.moveTo(300,225);
        john.penDown();
        john.drawShape(size, thickness);
       
    }
}