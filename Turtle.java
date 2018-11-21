/* Filename: CreateShapes.java 
 * Created by: Judy Chun, cs8afug and Lingcheng Dang, cs8afuk
 * Date: 10/15/2017
 */ 

import java.util.*;
import java.awt.*;
import java.util.Random;

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle {
  ////////////////// constructors ///////////////////////
  
  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (int x, int y, Picture picture) {
    // let the parent constructor handle it
    super(x,y,picture);
  }
  
  /** Constructor that takes the x and y and a model
   * display to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public Turtle (int x, int y, ModelDisplay modelDisplayer) {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public Turtle (ModelDisplay modelDisplay) {
    // let the parent constructor handle it
    super(modelDisplay);

  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p) {
    // let the parent constructor handle it
    super(p);
  }  
  
  /////////////////// methods ///////////////////////
  //put your drawShape and drawTriangle methods here
  public void drawShape(int size, int thickness)
  {
    // move to start point
    
    this.setPenWidth(thickness);
    this.turn(30);
    this.forward(size);
    this.turn(60);
    this.forward(size);
    this.turn(60);
    this.forward(size);
    this.turn(60);
    this.forward(size);
    this.turn(60);
    this.forward(size);
    this.turn(60);
    this.forward(size);
    this.turn(30);

 
  }
  
    public static void main (String[] args)
    {
       
    }
    
    public void drawTriangle(Random random, int x, int y, int limit)
    {
       int length = generator.nextInt(limit);
       
    }
}
  

