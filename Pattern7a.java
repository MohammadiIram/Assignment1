package com.company;

class Pattern7a {



        public static void main(String args[])
        {
            int row = 1, column = 1;
            int n;
            do {
                n = 5;
                do {
                    System.out.print("");
                    n--;

                } while (n >= row);
                column = 1;
                do {
                    System.out.print("*" + " ");
                    column++;
                } while (column <= row);


                System.out.println(" ");
                row++;
            } while (row <= 5);
        }
    }


