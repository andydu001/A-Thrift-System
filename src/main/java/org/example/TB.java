package org.example;

import org.apache.thrift.protocol.TJSONProtocol;

import org.apache.thrift.transport.TTransport;

public class TB extends TJSONProtocol {


    public TB(TTransport trans) {
        super(trans);
    }

}
