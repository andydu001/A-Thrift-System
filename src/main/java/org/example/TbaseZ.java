package org.example;

import org.apache.thrift.TBase;

import org.apache.thrift.TException;

import org.apache.thrift.TFieldIdEnum;

import org.apache.thrift.protocol.*;

public class TbaseZ implements  TBase {

    TbaseZ() {

    }


    @Override
    public TFieldIdEnum fieldForId(int fieldId) {

        return null;
    }

    @Override
    public boolean isSet(TFieldIdEnum field) {

        return true;
    }

    @Override
    public Object getFieldValue(TFieldIdEnum field) {

        return null;
    }


    @Override
    public void setFieldValue(TFieldIdEnum field, Object value) {

        // FIXME: 1/29/2026
    }

    @Override
    public TBase deepCopy() {
        return new TbaseZ();
    }

    @Override
    public void clear() {

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }



    @Override
    public void write(TProtocol oprot) throws TException {


        //  oprot.writeI16((short) 8);
        // oprot.writeMessageEnd();

        //oprot.writeI16((short) 8);


        oprot.writeStruct(new TStruct("Example"), new TProtocol.WriteCallback<Void>() {
            @Override
            public void call(Void e) throws TException {
               // new ADServlet((TJSONProtocol) oprot);
                oprot.writeString("test");

                oprot.writeDouble(4.8);

                oprot.writeString("test");

                oprot.writeDouble(4.8);


            }
        });


   //     new ADServlet((TJSONProtocol) oprot);


        // oprot.writeStructBegin(new TStruct("R"));

/*        oprot.writeStructBegin(new TStruct("R"));



        oprot.writeStructEnd();*/
    }

    @Override
    public void read(TProtocol iprot) throws TException {

        // System.out.println(iprot.readI16());

        System.out.println("I just read a byte:"+iprot.readStruct(new TProtocol.ReadCallback<TStruct, Object>() {
            @Override
            public Object accept(TStruct tStruct) throws TException {

                iprot.readString();
                iprot.readDouble();

                iprot.readString();
                iprot.readDouble();

                return tStruct;
            }
        }));


    }

    public static TbaseZ getInstance() {

        return new TbaseZ();
    }
}