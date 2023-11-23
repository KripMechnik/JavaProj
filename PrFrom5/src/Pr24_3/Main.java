package Pr24_3;

public class Main {
    public static void main(String[] args) {
        ICreateDocument textDocumentFactory = new CreateTextDocument();
        IDocument document = textDocumentFactory.createNew();

        document.open();
        document.edit();
        document.save();
        document.close();
    }
}
