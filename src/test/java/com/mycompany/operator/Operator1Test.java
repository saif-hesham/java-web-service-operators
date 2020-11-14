/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.operator;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jayce
 */
public class Operator1Test {
    
    public Operator1Test() {      
    }
    @Test
       public void testsum()
        {
            System.out.print("Sum");
            int a = 10;
            int b = 4;
            Operator1 instance =new Operator1(); 
            int result = instance.Sum(a,b);
            assertEquals(14,result);
            
        }
      @Test
       public void testsup()
        {
            System.out.print("Sup");
            int a = 10;
            int b = 4;
            Operator1 instance =new Operator1(); 
            int result = instance.Sup(a,b);
            assertEquals(6,result);
            
        }
       
          @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Operator1.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

    
    

