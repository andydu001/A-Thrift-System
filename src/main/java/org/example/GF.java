package org.example;

import org.apache.thrift.transport.THttpClient;

import org.apache.thrift.transport.TIOStreamTransport;

import org.apache.thrift.transport.TTransportException;

import java.io.FileOutputStream;

public class GF extends TIOStreamTransport {

    public GF(FileOutputStream is) throws TTransportException {
        super(is);
        System.out.println(knownMessageSize);

    }

    public GF(THttpClient th) throws TTransportException {
        super();

        System.out.println(knownMessageSize);

    }
}
