public class Test {
    public static void main(String[] args) {
        System.out.println("--- Word Document Creator ---");
        DocumentFactory wordFactory = new WordDocumentFactory();
        wordFactory.openDocument();
        wordFactory.closeDocument();

        System.out.println("\n--- PDF Document Creator ---");
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        pdfFactory.openDocument();
        pdfFactory.closeDocument();

        System.out.println("\n--- Excel Document Creator ---");
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        excelFactory.openDocument();
        excelFactory.closeDocument();
    }
}
