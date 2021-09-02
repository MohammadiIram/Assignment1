package com.company;

 class Pattern7b {

        public static void main(String[] args) {
            // write your code here
            int r=1, c=1;
            int n;
            do{
                n=5;
                do{
                    System.out.print("");
                    n--;
                }while(n>=r);
                c=1;
                do{
                    System.out.print(c+" ");
                    c++;
                }while (c<=r);
                System.out.println(" ");
                r++;
            }while (r<=5);
        }
    }




