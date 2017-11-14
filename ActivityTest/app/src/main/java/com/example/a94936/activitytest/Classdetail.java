package com.example.a94936.activitytest;

/**
 * Created by 94936 on 2017/11/4.
 */
public class Classdetail {
    /*private int id;
    private String croomnumber;
    private String time;
    private String state;
    public int getId(){
        return id;
    }
    public void setId (int id)
    {
        this.id=id;
    }
    public String getCroomnumber(){
        return croomnumber ;
    }
    public void setCroomnumber (){
        this.croomnumber =croomnumber ;
    }
    public String getTime  (){
        return time;
    }
    public void setTime (){
        this.time=time;
    }
    public String getstate(){
        return state ;
    }
    public void setState (){
        this.state =state;
    }*/
    public static int[][] classdetail;

    public static void init() {
        int i, j, size = 200;

        classdetail = new int[size][6];

        for (i = 100; i <= 110; i++) {
            for (j = 1; j <=5; j++) {
                classdetail[i][j] = 0;
            }
        }

    }

    public static void edit(int m, int n) {
        int a, b;
        for (a = 100; a <= 110; a++) {
            for (b = 1; b <= 5; b++) {
                if (a == m && b == n) {
                    classdetail[a][b] = 1;
                }
            }
        }
    }

    public static int query(int m, int n) {
        int a, b;
        for (a = 100; a <= 110; a++) {
            for (b = 1; b <= 5; b++) {
                if (a == m && b == n) {
                    return classdetail[a][b];
                }
            }
        }
        return -1;
    }
}
