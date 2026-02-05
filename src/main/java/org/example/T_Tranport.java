/*
The general go-to subclass for a thrift TTransport
written by Andy Duverneau
1/31/2026    4:56pm
 */

package org.example;

import org.apache.thrift.TConfiguration;

import org.apache.thrift.transport.*;

import org.apache.thrift.transport.layered.TFramedTransport;

import java.io.IOException;

import java.util.Arrays;

public class T_Tranport {

    private static TTransport transport; // field transport
    T_Tranport(TTransport transport) throws TTransportException, IOException {

        T_Tranport.transport = transport;

        //Figured the instances

        if (T_Tranport.transport instanceof TFileTransport tFileTransport) {

            System.out.println("TFile transport: " + tFileTransport.isOpen());

        } else if (T_Tranport.transport instanceof TZlibTransport zlibTransport) {

            System.out.println("TZlib transport: " + zlibTransport.isOpen());

        } else if (T_Tranport.transport instanceof TSocket tSocket) {

        }else if (T_Tranport.transport instanceof ADTnon nonblockingTransport) {

            td(new ADTnon(new TConfiguration()));

            System.out.println("TNonbloc transport: " + nonblockingTransport.isOpen());

        } else if (T_Tranport.transport instanceof TSaslClientTransport saslClientTransport) {

            System.out.println("TSaslc transport: " + saslClientTransport.isOpen());

        } else if (T_Tranport.transport instanceof TIOStreamTransport tioStreamTransport) {

            System.out.println("TIOS transport: " + tioStreamTransport.isOpen());

        } else if (T_Tranport.transport instanceof TFramedTransport framedTransport) {

            System.out.println("Tframe transport: " + Arrays.toString(framedTransport.getBuffer()));

        } else {

            System.out.println("Unknown instance");
        }

    }

    public static TTransport getTransport() { // method get a transport

        return transport;
    }

    public void setTransport(TTransport transport) { //method set a transport

        T_Tranport.transport = transport;
    }

    void td(TNonblockingTransport tNonblockingTransport) throws IOException {

        System.out.println("TNBT: "+tNonblockingTransport.startConnect());
    }

}
