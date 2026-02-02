/*

A general purpose stream
written by Andy Duverneau
1/22/2026  1:22 am
 */

package org.example;

import java.io.*;

import java.util.Scanner;

import java.util.zip.ZipInputStream;

import java.util.zip.ZipOutputStream;

public class ADStream {

    private OutputStream outputStream; //field outputStr

    private InputStream inputStream;  // field inputStr

    ADStream(InputStream inputStream) throws IOException {  // inputStr construct

        this.inputStream = inputStream;

        //Figured the instances
        if(this.inputStream instanceof FileInputStream fileInputStream){



         /*   Scanner scanner = new Scanner(fileInputStream);
             while (scanner.hasNextLine()){

                 System.out.println(scanner.nextLine());

             }*/


/*            if(fileInputStream.getChannel().isOpen()){


                int len =   fileInputStream.readAllBytes().length;
                System.out.println(len);
                for (int i = 1; i < len; i++) {

                    System.out.println(fileInputStream.readAllBytes());
                }
            }
            else{

                System.out.println("This channel is not open.");
            }*/
            System.out.println("---");

        } else if ( this.inputStream instanceof DataInputStream dataInputStream) {

            Scanner scanner = new Scanner(dataInputStream);


            //  System.out.println(scanner.tokens().sequential().iterator().next().charAt(0));
/*
            int lenf = scanner.next().length();


            for (int i = 0; i < lenf; i++) {
                while (scanner.hasNext()) {

                    if (scanner.next().charAt(i) == '[' || scanner.nextLine().charAt(i) == ']' || scanner.nextLine().charAt(i) == ',') {

                        System.out.println("k");

                    }
                }


            }*/

      //  }


     } else if (this.inputStream instanceof ZipInputStream zipInputStream){

            System.out.println("---");

        } else {

            System.out.println("Unknown instance");
        }
    }

    ADStream(OutputStream outputStream){ // outputStr construct

        this.outputStream = outputStream;

        //Figured the instances
        if(this.outputStream instanceof FileOutputStream fileOutputStream){

            System.out.println("---");

        } else if (this.outputStream instanceof DataOutputStream dataOutputStream){

            System.out.println("---");

        } else if (this.outputStream instanceof ZipOutputStream zipOutputStream){

            System.out.println("---");

        } else {

            System.out.println("Unknown instance");
        }
    }
    public InputStream getInputStream() { // method get an inputStr

        return inputStream;
    }

    public void setInputStream(InputStream inputStream) { // method set an IntputStr

        this.inputStream = inputStream;
    }

    public OutputStream getOutputStream() { // method get an outputStr

        return outputStream;
    }

    public void setOutputStream(OutputStream outputStream) { // method set an outputStr

        this.outputStream = outputStream;
    }

}
