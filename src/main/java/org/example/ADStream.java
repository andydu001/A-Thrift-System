/*

A general purpose stream
written by Andy Duverneau
1/22/2026  1:22 am
 */

package org.example;

import java.io.*;

import java.util.zip.ZipInputStream;

import java.util.zip.ZipOutputStream;

public class ADStream {

    private OutputStream outputStream; //field outputStr

    private InputStream inputStream;  // field inputStr

    ADStream(InputStream inputStream) throws IOException {  // inputStr construct

        this.inputStream = inputStream;

        //Figured the instances
        if(this.inputStream instanceof FileInputStream fileInputStream){

            System.out.println("---");

        } else if ( this.inputStream instanceof DataInputStream dataInputStream) {


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
