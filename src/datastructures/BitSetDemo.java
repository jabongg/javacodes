package hackerrank.java.datastructures;

import java.util.BitSet;

public class BitSetDemo {
	 public static void main(String arg[])
	    {
	        //System.out.println(null);
	        BitSet bitSetA = new BitSet();
	        System.out.println(bitSetA);

	        bitSetA.set(2);
	        bitSetA.set(3);
	        bitSetA.set(4);
	        bitSetA.set(5);
	       // bitSetA.set((Integer) null);
	        System.out.println("bitSetA = " + bitSetA);
	        BitSet bitSetB = new BitSet();
	        bitSetB.set(1, 5);
	        System.out.println("bitSetB = " + bitSetB);
	        System.out.println(bitSetB.size());

	        	        // Clone of bitSetA
	        BitSet bitSetC = new BitSet();
	        bitSetC = (BitSet) bitSetA.clone();
	        System.out.println("bitSetC = " + bitSetC);
	        // AND bits
	        bitSetA.and(bitSetB);
	        System.out.println("bitSetA and bitSetB = " + bitSetA);
	        // OR bits
	        bitSetA.or(bitSetB);
	        System.out.println("bitSetA or bitSetB = " + bitSetA);
	        // AND NOT
	        bitSetA.andNot(bitSetB);
	        System.out.println("bitSetA and not bitSetB = " + bitSetA);
	        
	        bitSetB.andNot(bitSetA);
	        System.out.println("bitSetB and not bitSetA  = " + bitSetA);
	        
	          // XOR bits
	        bitSetC.xor(bitSetB);
	        System.out.println("bitSetC xor bitSetB = " + bitSetC);   
	        
	        System.out.println(bitSetB.cardinality());
	    }
}
