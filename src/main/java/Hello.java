package main.java;

public class Hello {
    public static void main(String[] args) {
        // System.out.println("new dawn, new day");
        weave(solid(11, 11));
    }

    public static void weave(String[][] rug) {
        // Method to print 2D emoji arrays.
        for (String[] rug1 : rug) {
            for (String rug11 : rug1) {
                System.out.print(rug11);
            }
            // Break the line at the end of every row.
            System.out.println("");
        }
    }

    public static String[][] solid(int width, int height) {
        String[][] rug = new String[width][height];

        for (String[] rug1 : rug) {
            for (int j = 0; j < rug1.length; j++) {
                rug1[j] = "🥓";
            }
        }

        return rug;
    }
    
}

