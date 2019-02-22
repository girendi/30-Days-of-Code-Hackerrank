/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day6_LetsReview;

import java.util.*;

/**
 *
 * @author Gideon Panjaitan
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        scan.nextLine();
        String text; 
        char[] charArray;
        
        for (int i = 0; i < n; i++) {
            text = scan.nextLine();
            charArray = text.toCharArray();

            for (int j = 0; j < charArray.length; j++) {
                if (j % 2 == 0) {
                    System.out.print(charArray[j]);
                }
            }

            System.out.print(" ");

            for (int j = 0; j < charArray.length; j++) {
                if (j % 2 != 0) {
                    System.out.print(charArray[j]);
                }
            }

            System.out.println();
        }

        scan.close();
    }
}
