package com.company;

public class Runner
{
    public static void main(String[] args)
    {
        String[][] face = {{"O ", "O ", "O ", "O ", "O ", "O ", "O ", "O ", "O ", "O "},{"O ", "O ", "O ", "O ", "O ", "O ", "O ", "O ", "O ", "O "},{"O ", "O ", "O ", "O ", "O ", "O ", "O ", "O ", "O ", "O "},{"O ", "O ", "O ", "O ", "O ", "O ", "O ", "O ", "O ", "O "},{"O ", "O ", "O ", "O ", "O ", "O ", "O ", "O ", "O ", "O "},{"O ", "O ", "O ", "O ", "O ", "O ", "O ", "O ", "O ", "O "},{"O ", "O ", "O ", "O ", "O ", "O ", "O ", "O ", "O ", "O "},{"O ", "O ", "O ", "O ", "O ", "O ", "O ", "O ", "O ", "O "},};
        JackOLantern lantern = new JackOLantern(face);
        //Eyes
        lantern.edit("- ", 1, 1);
        lantern.edit("- ", 1, 2);
        lantern.edit("- ", 2, 1);
        lantern.edit("- ", 2, 2);
        lantern.edit("- ", 1, 7);
        lantern.edit("- ", 1, 8);
        lantern.edit("- ", 2, 7);
        lantern.edit("- ", 2, 8);
        //Nose
        lantern.edit("+ ", 3, 4);
        lantern.edit("+ ", 3, 5);
        lantern.edit("+ ", 4, 4);
        lantern.edit("+ ", 4, 5);
        //Mouth
        lantern.edit("~ ", 6, 1);
        lantern.edit("~ ", 6, 2);
        lantern.edit("~ ", 6, 3);
        lantern.edit("~ ", 6, 4);
        lantern.edit("~ ", 6, 5);
        lantern.edit("~ ", 6, 6);
        lantern.edit("~ ", 6, 7);
        lantern.edit("~ ", 6, 8);
        lantern.toString();
        System.out.println(lantern);
    }
}
