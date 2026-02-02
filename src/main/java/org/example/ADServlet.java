package org.example;

import org.apache.thrift.ProcessFunction;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TJSONProtocol;

public class ADServlet extends ProcessFunction{

    ADServlet(TJSONProtocol protocol) throws TException {
        super("main");

        //   System.out.println("I just read a byte:"+protocol.readString());
        //  System.out.println("I just read a byte"+protocol.readI32());



        process(3,protocol,null,null);



       //  System.out.println("I just read:"+protocol.readString());

        //    System.out.println("I just read a byte"+protocol.readByte());

/*if(protocol.readString().getBytes()[0] == TType.STRING || protocol.readByte()
        == TType.BYTE ||protocol.readByte() == TType.VOID || protocol.readByte() == TType.MAP ||protocol.readByte() == TType.ENUM || protocol.readByte()
        == TType.I16 ||protocol.readByte() == TType.I32 || protocol.readByte() == TType.I64 || protocol.readByte() == TType.UUID || protocol.readByte()
        == TType.DOUBLE ||protocol.readByte() == TType.LIST || protocol.readByte() == TType.SET || protocol.readByte() == TType.STOP || protocol.readByte()
        == TType.STRUCT){

        System.out.println("I just read a byte"+protocol);

        }*/

    }

    @Override
    protected boolean isOneway() {

        System.out.println("It's not one");

        return true;
    }

    @Override
    public TBase getResult(Object iface, TBase args) throws TException {

        System.out.println("It's not one way");

/*
        System.out.println("It's not one way");

        TbaseZ tbaseZ = new TbaseZ();

        try {
            new T_Tranport(new TIOStreamTransport(new ADStream(new DataOutputStream(new FileOutputStream("C:\\Users\\andyd\\OneDrive\\Documents\\cote.java"))).getOutputStream()));


            TJSONProtocol tjsonProtocol = new TJSONProtocol(T_Tranport.getTransport());

            tjsonProtocol.writeString("SO");

            tbaseZ.write(tjsonProtocol);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


        return args;
    }

    @Override
    public TBase getEmptyArgsInstance() {

      //  System.out.println("It's not oneooooooooooooo");

        return TbaseZ.getInstance();
    }

}
