package org.example;

import org.apache.thrift.TException;

import org.apache.thrift.TFieldIdEnum;

import org.apache.thrift.TMultiplexedProcessor;

import org.apache.thrift.meta_data.FieldMetaData;

import org.apache.thrift.meta_data.FieldValueMetaData;

import org.apache.thrift.partial.ThriftMetadata;

import org.apache.thrift.protocol.TBinaryProtocol;

import org.apache.thrift.protocol.TType;

import org.apache.thrift.transport.TFileTransport;

import org.apache.thrift.transport.TIOStreamTransport;

import org.springframework.web.client.RestClient;

import org.springframework.web.util.DefaultUriBuilderFactory;

import java.io.*;

import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, TException {


        ThriftMetadata.ThriftObject thriftObject = null;

        TFieldIdEnum field = new TFieldIdEnum() {
            @Override
            public short getThriftFieldId() {
                return 0;
            }

            @Override
            public String getFieldName() {
                return null;
            }
        };

        FieldMetaData data = new FieldMetaData("A","ss".getBytes()[0], new FieldValueMetaData(TType.MAP));


        new ANDPatial(thriftObject, field, data);


        String baseUrl = "https://andywill.com";

        DefaultUriBuilderFactory factory = new DefaultUriBuilderFactory(baseUrl);

        RestClient client = RestClient.builder().uriBuilderFactory(factory).defaultApiVersion("2.0").build();

        new WEBSE(client);

        new ADTYPE();


        ADStream adStream = new ADStream(new DataInputStream(new FileInputStream("C:\\Users\\andyd\\OneDrive\\Documents\\Example.thrift")));

        ADStream adStreamOut = new ADStream(new DataOutputStream(new FileOutputStream("C:\\Users\\andyd\\OneDrive\\Documents\\Example.thrift")));


        TIOStreamTransport tioStreamTransport = new TIOStreamTransport(adStream.getInputStream(), adStreamOut.getOutputStream());//,adStreamOut.getOutputStream());

        new T_Tranport(tioStreamTransport);


        TB tjsonProtocol= new TB(T_Tranport.getTransport());//new TBinaryProtocol(new AutoExpandingBufferReadTransport(new TConfiguration(),8));


        new TGuide(tjsonProtocol,"A");


        TFileTransport transport =    new TFileTransport("C:\\Users\\andyd\\source\\repos\\ConsoleApplicationCAav\\ConsoleApplicationCAav.cpp",true);

        transport.open();

        new HIOZ(new TMultiplexedProcessor(),new TBinaryProtocol.Factory(),transport ,new TIOStreamTransport(new FileOutputStream("C:\\Users\\andyd\\source\\repos\\ConsoleApplicationCAav\\ConsoleApplicationCAav.cpp")));

    }
}