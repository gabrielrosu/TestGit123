package curs10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileProcessor {


    /**
     * Writes a new txt file
     */
    public void writeFile() {

        try {
            FileWriter myFileWriter = new FileWriter("filename.txt");
            myFileWriter.write("Textul meu in fisier!\n");
            myFileWriter.close();
            System.out.println("Succesfully wrote to file!");

        }catch(IOException err) {

            System.out.println("An error occured!");
            err.printStackTrace();
        }
    }

    /**
     * reads from txt file
     *
     */
    public void readFile() {

        try {

            File objFile =  new File("filename.txt");
            Scanner myReader = new Scanner(objFile);

            while(myReader.hasNextLine()) {
                String text = myReader.nextLine();
                System.out.println(text);
            }
            myReader.close();


        }catch(FileNotFoundException e) {
            System.out.println("Nu am gasit fisierul");
            e.printStackTrace();

        }

    }


    /**
     * append text to file
     */
    public void appendTextToFile() {

        try {
            FileWriter myWriter =  new FileWriter("filename.txt", true);
            myWriter.write("new line\n");
            //	myWriter.close();

        }catch(IOException e) {
            System.out.println("An error occured!");
            e.printStackTrace();

        }

    }
    /**
     * delete the file
     */
    public void deleteFile() {

        try {
            File myFile = new File("filename.txt");
            myFile.delete();
            System.out.println("Deleted file :" + myFile.getName());


        }catch (Exception e) {
            System.out.println("Could not delete the file!");
        }


    }





}