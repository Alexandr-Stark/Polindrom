package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String pol = "О, лета тело!";
        String buffpol = pol;
        boolean isPoli = true;

        pol = pol.replaceAll("[?:!.,;—– ]","").toUpperCase();
        //System.out.println(pol);

        if(buffpol.equals(""))
        {
            System.out.println("Polindrom is not detected!");
        }
        else
        {
            for (int i = 0; i < pol.length(); i++)
            {

                if (pol.charAt(i) != pol.charAt(pol.length() - i - 1)) {
                    isPoli = false;
                    break;
                }
            }
            System.out.println("This string: " + "'" +  buffpol + "'" + ", is polindrom - " + isPoli + ".");
        }
    }
}
