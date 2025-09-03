package Platinum_Codes.BackTracking;

import java.util.ArrayList;

public class RatInMaze {
    //static boolean flag;
    static int finalcount;
    static int totalways;
    public static void main(String[] args) {
        int n=5,m=6;
        int[][] maze={
                {1,1,0,1,0,1},
                {1,0,0,1,0,1},
                {1,1,0,0,1,0},
                {1,1,1,0,0,0},
                {1,0,1,1,1,1}
        };
        int count=0;
        StringBuilder sb=new StringBuilder();
        int ways=0;
        ArrayList<String> res=new ArrayList<>();
        RatinMaze(maze,0,0,n,m,count,sb,res);
//        System.out.println(finalcount);
        for(String s:res){
            System.out.println(s);
        }
    }
    static void RatinMaze(int [][] arr,int row,int col,int n,int m,int count,StringBuilder sb,ArrayList<String> res){
        if(row==n-1 && col==m-1){
//            flag=true;
//            finalcount=count;
//            totalways++;
//            System.out.println(sb.toString());
//            System.out.println();
            res.add(sb.toString());
            return;
        }
        if(row+1!=n && arr[row+1][col]==1){
            // RatinMaze(arr,row+1,col,n,m);
            sb.append("D");
            RatinMaze(arr,row+1,col,n,m,count+1,sb,res);
            sb.deleteCharAt(sb.length()-1);
        }
        if(col+1!=m && arr[row][col+1]==1){
            // RatinMaze(arr,row+1,col,n,m);
            sb.append("R");
            RatinMaze(arr,row,col+1,n,m,count+1,sb,res);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}
