/*
This is an abstract communication service
written by Andy Duverneau
1/30/2026  12:02 pm
 */

package org.example;

import org.apache.thrift.TException;

import org.apache.thrift.TServiceClient;

import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TStruct;

public class TGuide extends TServiceClient {

    private String namee;

    public TGuide(TProtocol prot, String name) throws TException {

        super(prot);

        this.namee =name; // field name

        TbaseZ tbaseZ = new TbaseZ();

        sendBase( this.namee, tbaseZ); //sending protocal


        new ADServlet(name);

        receiveBase(tbaseZ,null); // recieving protocal
    }
    public String getNamee() { // get the method name
        return namee;
    }

    public void setNamee(String namee) { // set the method name
        this.namee = namee;
    }

}
