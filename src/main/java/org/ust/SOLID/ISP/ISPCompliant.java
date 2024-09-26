package org.ust.SOLID.ISP;

import javax.print.Doc;

public class ISPCompliant {

    static class Document{}

    interface Printable{
        void print(Document document);
    }

    interface Scannable{
        void scan(Document document);
    }

    interface Faxable{
        void fax(Document document);
    }

    static class OldFashionedPrinter implements Printable{
        @Override
        public void print(Document document) {
            System.out.println("Printing document from old printer");
        }

    }

    static class MorderPrinter implements Printable,Scannable,Faxable{
        @Override
        public void print(Document document){
            System.out.println("Printing document from mordern printer");
        }

        @Override
        public void fax(Document document) {
            System.out.println("Faxing document from mordern printer");
        }

        @Override
        public void scan(Document document) {
            System.out.println("Scanning document from mordern printer");
        }
    }

    public static void main(String[] args) {

        Document document = new Document();

        OldFashionedPrinter oldFashionedPrinter = new OldFashionedPrinter();
        oldFashionedPrinter.print(document);

        MorderPrinter  morderPrinter = new MorderPrinter();
        morderPrinter.fax(document);
        morderPrinter.scan(document);
        morderPrinter.print(document);
    }
}
