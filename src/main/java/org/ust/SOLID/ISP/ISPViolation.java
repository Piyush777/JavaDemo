package org.ust.SOLID.ISP;

public class ISPViolation {
    static class Document{

    }

    interface Printer{
        void print(Document document);
        void scan(Document document);
        void fax(Document document);
    }

    static class OldFashionedPrinter implements Printer{

        @Override
        public void print(Document document) {
            System.out.println("Printing document..");
        }

        @Override
        public void scan(Document document) {
            throw new UnsupportedOperationException("Scan not supported");
        }

        @Override
        public void fax(Document document) {
            throw new UnsupportedOperationException("Fax not supported");
        }
    }

    public static void main(String[] args) {
        Printer printer = new OldFashionedPrinter();
        Document document = new Document();
        printer.print(document);
        printer.fax(document);
        printer.scan(document);

    }
}
