

import java.io.*;
import java.util.*;



class Session2_exp1 {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a[] = new int[10];
        System.out.println("Enter 10  Numbers : ");
        for(int i=0 ; i < 10 ; i++) {   
            a[i]=Integer.parseInt(br.readLine());
        }
        int temp=0;
        for(int i=0;i<10;i++){
            for(int j=0 ; j<10-1-i ; j++ ){
                if(a[j]>a[j+1]){

                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j]=temp;

                }
            }
        }

        for(int i = 0 ; i<10 ; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("Enter any Number to Check if it is present in the Array ==> ");
        int x = Integer.parseInt(br.readLine());
        int l,h,mid;
        l=0 ;h=10 ;
        while(l<=h){
        mid = (l+h)/2;
        //System.out.println("Mid : "+mid+"X : "+x);
        if(a[mid]==x){
            System.out.println("Element Found On Position "+mid);
            return;
        }
        else if(a[mid]>x){
            h=mid-1;
            l=0;
        }
        else if(a[mid]<x){
            l=mid+1;
            h=10; 
        }
        else{
            System.out.println("Element Not Found");
        }
    }
    }
}
