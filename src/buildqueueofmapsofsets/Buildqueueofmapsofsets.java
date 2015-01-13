/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package buildqueueofmapsofsets;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author c0641055
 */
public class Buildqueueofmapsofsets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Map>objects = new ArrayDeque<>();
        objects.add(new TreeMap<>());
       Set inputs = new HashSet<>();
       inputs.add(1);
       inputs.add(3);
       inputs.add(4);
       objects.element().put("inputs", inputs);
       
       // Map another String to another Set
        Set outputs = new HashSet<>();
        outputs.add(1);
        outputs.add(2);
        objects.element().put("outputs", outputs);
        
        // Iterate through the Map at the End
        while (!objects.isEmpty()) {
            Map m = objects.remove();
            for (Object k : m.keySet()) {
                System.out.println(k);
                System.out.println(m.get(k));
        
            }       
        
            }
    }
    
}
