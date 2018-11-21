/* Filename: TurtleFun.java 
* Created by: Judy Chun, cs8afug and Lingchen Dang, cs8afuk 
* Date: 10/15/2017
*/ 
import java.util.Random;

public class CreateTriangles
{
  public static void main (String[] args)
  {
     int length;
     World world1 = new World(200,200);
     int x = 10;
     int y = 100;
     int limit = 20;
     Turtle judy = new Turtle(x,y,world1);
     Random generator = new Random();
     
     judy.drawTriangle(generator, x, y,limit);

     
     
     
  }
}