    
 

import java.util.*;

import java.lang.*;

import java.io.*;

 


public class Main {

public static void main (String[] args) throws java.lang.Exception {



Scanner sc = new Scanner(System.in);

System.out.println("Enter how many students");

int n = sc.nextInt();

int a[] = new int[100];

int b[] = new int[100];

int total[] = new int[100];

for(int j =1;j<=n;j++) {

    int sum  = 0;

    System.out.println("Enter the student"+j+"Scores");

      for(int i =1;i<=4;i++)  {

           System.out.println("Exam #"+i+"Score");

           a[i] = sc.nextInt();

           System.out.println("Assigment #"+i+"Score");

           b[i] = sc.nextInt();

           sum = a[i]+b[i]+sum;

        }

        total[j] = sum;

       

}

for(int i =1;i<=n;i++) {

    System.out.println(total[i]);

    if(total[i]>=450)   {

        System.out.println("A");

    }

    else{

        if(total[i]>=400)  {

            System.out.println("B");

        }

        else  {

            if(total[i]>=350)   {

                System.out.println("C");

            }

            else    {

                if(total[i]>=300)     {

                    System.out.println("D");

                }

                else    {

                    System.out.println("F");

                }

            }

        }

    }

}

}

}
