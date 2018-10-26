package com.company;

public class JackOLantern
{
    String[][] faceArray = new String [10][10];
    public JackOLantern (String[][] faceArray)
    {
        this.faceArray = faceArray;
    }
    public void edit(String replace, int row, int column)
    {
        faceArray[row][column] = replace;
    }
    public String toString()
    {
        String pic = "";
        for (int x = 0; x < faceArray.length; x++)
        {
            for (int y = 0; y < faceArray[x].length; y++)
            {
                pic = pic + faceArray[x][y];
            }
            pic = pic + "\n";
        }
        return pic;
    }
    public void fill(String str)
    {
        for (int x = 0; x < faceArray.length; x++)
        {
            for (int y = 0; y < faceArray[x].length; y++)
            {
                faceArray[x][y] = str;
            }
        }
    }
}
