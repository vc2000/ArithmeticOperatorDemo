/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vc2000
 */
public class ArithmeticOperatorDemo {
  public static void main (String[] args){
    int y = 10;
    int z = 5;
    
    int x = y + z;
    //basic arithmetic operators
    System.out.println("+ operator resulted in " + x); //15
    x=y-z;
    System.out.println("- operator resulted in " + x);
    x=y*z;
    System.out.println("* operator resulted in " + x);
    x=y/z;
    System.out.println("/ operator resulted in " + x);
    x=y%z;
    System.out.println("% operator resulted in " + x);
    //what follows are assignment shortcuts
    x=y++;
    System.out.println("++ increment operator resulted in " + x);
    x=++z;
    System.out.println("++ increment operator resulted in " + x);
    x= y--;
    System.out.println("-- decrement operator resulted in " + x);
    x += 2;
    System.out.println("+= operator resulted in " + x);
    x *=2;
    System.out.println("*= operator resulted in " + x);
    
  
  }
    }
