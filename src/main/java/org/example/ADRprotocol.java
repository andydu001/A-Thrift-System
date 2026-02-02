package org.example;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TJSONProtocol;
import org.apache.thrift.transport.TTransport;


public class ADRprotocol extends TJSONProtocol {
    public ADRprotocol(TTransport trans) throws TException {
        super(trans);


        writeString("ASS");
    }
}
