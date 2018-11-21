/* Filename: CreateShapes.java 
* Created by: Judy Chun, cs8afug and Lingchen Dang, cs8afuk 
* Date: 10/15/2017
*/ 

public class CreateShapes
{

    public static void main (String[] args) 
    { 
        World world1 = new World(400,400);
        Turtle judy = new Turtle(200,200,world1);
        int size = 200; 
        int thickness = 10;
        judy.setPenWidth(10);
        judy.penUp();
        judy.moveTo(0,200);
        judy.penDown();
        judy.drawShape(size, thickness);
        
        Turtle lynette = new Turtle(200,200,world1);
        lynette.penUp();
        lynette.moveTo(100,200);
        lynette.penDown();
        lynette.drawShape(100,7);
        
        Turtle judy1 = new Turtle(200,200,world1);
        judy1.penUp();
        judy1.moveTo(150,200);
        judy1.penDown();
        judy1.drawShape(50,5);
        
        Turtle lynette1 = new Turtle(200,200,world1);
        lynette1.penUp();
        lynette1.moveTo(175,200);
        lynette1.penDown();
        lynette1.drawShape(25,2);
        
   
    }

    
}


