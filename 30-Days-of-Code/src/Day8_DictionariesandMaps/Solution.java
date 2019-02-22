/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day8_DictionariesandMaps;

import java.util.*;
import java.io.*;
/**
 *
 * @author Gideon Panjaitan
 */
public class Solution {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (phoneBook.containsKey(s)){
                System.out.println(s + "=" + phoneBook.get(s));
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
