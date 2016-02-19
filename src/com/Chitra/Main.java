package com.Chitra;



import java.io.*;
import java.net.URL;


public class Main
{

    public static void main(String[] args) throws Exception
    {
        URL location = Main.class.getProtectionDomain().getCodeSource().getLocation();
        //System.out.println(location);
        File NewFolder = new File("data");
        BufferedWriter output = null;


// if the directory does not exist, create it
        if (!NewFolder.exists())
        {
            System.out.println("creating directory: " + location);
            boolean result = false;

            try
            {
                NewFolder.mkdir();
                result = true;
                if (result)
                {
                    System.out.println("DIR created");
                }
                // a variable defined to get the file separator property with system.getproperty .
                String fileSeparator = System.getProperty("file.separator");
                // creating a file with a relative path that works on unix/Windows
                File test = new File("data" +fileSeparator + "Test.txt");
                //creating new writer object to write into a file
                FileWriter fw = new FileWriter(test);
                fw.write("Hello\n");
                fw.write("Bye");
                fw.close();

            } catch (IOException e)
            {
                e.printStackTrace();
            } finally
            {
                if (output != null) output.close();
            }


        }
    }
}




