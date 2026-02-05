package org.example;

import org.apache.thrift.TException;

import org.apache.thrift.TProcessor;

import org.apache.thrift.protocol.TProtocolFactory;

import org.apache.thrift.transport.TFileProcessor;

import org.apache.thrift.transport.TFileTransport;

import org.apache.thrift.transport.TTransport;

import java.io.FileNotFoundException;

public class HIOZ extends TFileProcessor{
    public HIOZ(TProcessor processor, TProtocolFactory protocolFactory, TFileTransport inputTransport, TTransport outputTransport) throws FileNotFoundException, TException {
        super(processor, protocolFactory, inputTransport, outputTransport);
        //processChunk();

    }
}
