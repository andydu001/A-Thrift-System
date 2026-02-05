package org.example;

import org.apache.thrift.TException;

import org.apache.thrift.protocol.TJSONProtocol;

import org.apache.thrift.transport.TTransport;

import java.nio.charset.StandardCharsets;

public class TB extends TJSONProtocol {


    public TB(TTransport trans) throws TException {
        super(trans);

    }


}
