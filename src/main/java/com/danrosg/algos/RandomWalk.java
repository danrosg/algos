package com.danrosg.algos;


import java.util.Random;

public class RandomWalk {


    /* The Random Generator Function is expected to produce numbers between 1 and  4 */
    /* The output is encoded like this:
            1) (0,1)
            2) (0,-1)
            3) (1,0)
            4) (-1,0)
     */

    public static int CustomRandom()
    {
        Random rand=new Random();
        int n= rand.nextInt(4)+1;
        return n;

    }


    public static int random_walk_area(int x, int y, int n){

        int currentX=x;
        int currentY=y;
        int maxX =x, minX = x;
        int maxY=y , minY =y;

        /* The code uses 4 variables to track the edges of the minimal rectangle surrounding all the movements */
        /* Each kind of movement can expand the rectangle only in one dimension and direction, hence we only need to check the
           corresponding edge coordinate in each kind of movement
         */

        for (int i=0;i<n;i++)
        {

            int movement=CustomRandom();

            switch (movement){

                case 1: currentY++;
                    if(currentY>maxY)
                        maxY=currentY;
                    break;
                case 2: currentY--;
                    if(currentY<minY)
                        minY=currentY;
                    break;
                case 3: currentX++;
                    if(currentX>maxX)
                        maxX=currentX;
                    break;
                case 4: currentX--;
                    if(currentX<minX)
                        minX=currentX;

            }

            System.out.println("Movement: " +movement +" New position: ("+ currentX +","+ currentY+")");
        }

        System.out.println("Edge rectangle ("+minX+","+minY+") - ("+maxX+","+maxY+")");

        //Once the edge coordinates of the surrounding rectangle have been determined the area is calculated by the product of the absolute differences

        return Math.abs(maxX-minX) * Math.abs(maxY-minY);
    }



    /*
    public static void main(String[] args) {

        System.out.println(Main.random_walk_area(1,1,100));

    }

    */



}
