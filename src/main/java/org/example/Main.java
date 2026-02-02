package org.example;

import org.apache.thrift.TException;

import org.apache.thrift.TFieldIdEnum;

import org.apache.thrift.TMultiplexedProcessor;

import org.apache.thrift.meta_data.FieldMetaData;

import org.apache.thrift.meta_data.FieldValueMetaData;

import org.apache.thrift.partial.ThriftMetadata;

import org.apache.thrift.protocol.TBinaryProtocol;

import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TStruct;
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


        //TNonblockingServerSocket tNonblockingServerSocket = new TNonblockingServerSocket(new InetSocketAddress("localhost",2332));

        //tNonblockingServerSocket.accept().open();
        //TSocket tSocket = new TSocket("us",22);


        //tSocket.open();

        //tSocket.write("New Waves".getBytes());


        InputStream inputStream = new FileInputStream("C:\\Users\\andyd\\OneDrive\\Documents\\etd.txt");


        //  tSocket.write(inputStream.readAllBytes());

        //   System.out.println("Andy:"+tSocket.isOpen());

        //  THsHaServer.Args args1 = new THsHaServer.Args(new TNonblockingServerSocket(9988));

        // args1.outputTransportFactory(new TSaslServerTransport.Factory().getTransport(new TIOStreamTransport()))

        //args1.inputProtocolFactory(new TBinaryProtocol.Factory());

        //  new GRTH(args1);

        new ADTYPE();

        // TTransport tf =  new GF(new FileOutputStream("C:\\Users\\andyd\\OneDrive\\Documents\\Ac.txt"));

        //  T_Tranport t_tranport =  new T_Tranport(new GF(new FileOutputStream("C:\\Users\\andyd\\OneDrive\\Documents\\Ac.txt")));
        // new T_Tranport(new TIOStreamTransport(new ADStream(new DataOutputStream(new FileOutputStream("C:\\Users\\andyd\\OneDrive\\Documents\\cote.java"))).getOutputStream()));
        //T_Tranport t_tranport = new T_Tranport(new ADTnon(new TConfiguration()));
        // T_Tranport t_tranport =  new T_Tranport(new TFileTransport( "C:\\Users\\andyd\\OneDrive\\Documents\\Ac.txt",false));



        ADStream adStream = new ADStream(new DataInputStream(new FileInputStream("C:\\Users\\andyd\\OneDrive\\Documents\\Example.thrift")));

        ADStream adStreamOut = new ADStream(new DataOutputStream(new FileOutputStream("C:\\Users\\andyd\\OneDrive\\Documents\\Example.thrift")));

        //  new T_Tranport(new TIOStreamTransport( fileInputStream , null));
       // System.out.println(Arrays.toString(adStream.getInputStream().readAllBytes()));

        TIOStreamTransport tioStreamTransport = new TIOStreamTransport(adStream.getInputStream(), adStreamOut.getOutputStream());//,adStreamOut.getOutputStream());

        new T_Tranport(tioStreamTransport);

        // ADRprotocol adRprotocol = new ADRprotocol(T_Tranport.getTransport());

        //  adRprotocol.writeString(")WO");

        //  System.out.println("SDE  "+tDeserializer.partialDeserializeObject("ASDD".getBytes()));

      /*  TSocket tSocket = new TSocket("users.cs.umb.edu",22);


        tS*///ocket.open();
        // tSocket.write("YHHJJ".getBytes());

/*
        Scanner scanner = new Scanner(tSocket.getSocket().getInputStream());
        while(scanner.hasNextLine()){


            System.out.println(scanner.nextLine());
        }*/

        // new T_Tranport(tSocket);

        TB tjsonProtocol= new TB(T_Tranport.getTransport());//new TBinaryProtocol(new AutoExpandingBufferReadTransport(new TConfiguration(),8));


        //Scanner scanner = new Scanner(tSocket.getSocket().getInputStream());


        //  tBinaryProtocol.writeString(scanner.tokens().toString());


        // tBinaryProtocol.writeString("Andy");

        //  args1.inputTransportFactory( transportFactory);

        // new GRTH(args1);

        //  args1.inputTransportFactory(new TTransportFactory());
/*        tjsonProtocol.writeStruct(new TStruct("Example"), new TProtocol.WriteCallback<Void>() {
            @Override
            public void call(Void e) throws TException {
                // new ADServlet((TJSONProtocol) oprot);
                tjsonProtocol.writeString("test");

                tjsonProtocol.writeDouble(4.8);

                tjsonProtocol.writeString("test");

                tjsonProtocol.writeDouble(4.8);


            }
        });*/
     //   new ADServlet(tjsonProtocol);

        new TGuide(tjsonProtocol,"A");


        TFileTransport transport =    new TFileTransport("C:\\Users\\andyd\\source\\repos\\ConsoleApplicationCAav\\ConsoleApplicationCAav.cpp",true);

        transport.open();

        new HIOZ(new TMultiplexedProcessor(),new TBinaryProtocol.Factory(),transport ,new TIOStreamTransport(new FileOutputStream("C:\\Users\\andyd\\source\\repos\\ConsoleApplicationCAav\\ConsoleApplicationCAav.cpp")));

    }
}