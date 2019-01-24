/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfranc.com;

/**
 *
 * @author es556337
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class SanoTest {
    
    @Test
	public void test() {
		Markov m = new Markov();
		m.readFile("cosette.txt");
		Couple p = Markov.randomElement(m.couples.keySet());
		String res = m.generateText(p, 10);
		assertNotNull(res);
		System.out.println(res);
	}
    @Test
	public void test_read_phrasestxt() {
            
            Markov m1 = new Markov();
	    m1.readFile("phrases.txt");
            Couple p = Markov.randomElement(m1.couples.keySet());
            String res = m1.generateText(p, 5);
            assertNotNull(res);
            System.out.println(res);
            
         }
        
        @Test
	public void test_read_fileVide() {
           Markov m2 = new Markov();
	   m2.readFile("fileVide.txt");
           int prev = m2.couples.size();
           assertEquals(0,prev);

            
         }
         @Test
	public void test_generate_couple(){
            Markov m5 = new Markov();
            m5.readFile("phrases.txt");
            Couple c1= new Couple("Securité","réseau");
            String res = m5.generateText(c1, 1);
            assertEquals("Securité réseau ",res);
            
    
}
        @Test
	public void test_hashCode_c1_c2() {
            Couple c1= new Couple("Securité","réseau");
            Couple c2= new Couple("Securité","réseau");
            int h3 = c1.hashCode();
            int h4 = c2.hashCode();  
            assertEquals(c1, c2);
            System.out.println(h3);
            System.out.println(h4);

         }
       
        
}

    


