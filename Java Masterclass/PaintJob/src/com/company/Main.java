package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
    }
    public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets)
    {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)
        {
            return -1;
        }
        else
        {
            int numOfBuckets;
            double tempBuckets;
            double areaOfWall = width * height;
            tempBuckets = Math.ceil(areaOfWall / areaPerBucket);
            numOfBuckets = (int) (tempBuckets - extraBuckets);
            return numOfBuckets;
        }
    }
    public static int getBucketCount(double width,double height,double areaPerBucket)
    {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0)
        {
            return -1;
        }
        else
        {
            int numOfBuckets;
            double temp;
            double wallArea = width * height;
            numOfBuckets = (int) Math.ceil(wallArea / areaPerBucket);
            return numOfBuckets;
        }
    }
    public static int getBucketCount(double area,double areaPerBucket)
    {
        if(area <= 0|| areaPerBucket <= 0)
        {
            return -1;
        }
        else
        {
            int numOfBuckets;
            numOfBuckets = (int) Math.ceil(area / areaPerBucket);
            return numOfBuckets;
        }
    }
}
