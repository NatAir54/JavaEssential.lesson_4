package task_2;

public class MainApp {
    public static void main(String[] args) throws Exception {
        File file = new File("Book.doc");

        String fileType = "";

        // returns the last occurrence of character "."
        int index = file.getFileName().lastIndexOf('.');

        if (index > 0) {
            // returns the string after character '.'
            fileType = file.getFileName().substring(index + 1);
        }


        if (fileType.equals("doc")) {
            System.out.println("File format: ." + fileType);

            // создаем экземпл€р DOCHandler, приведенный к базовому классу AbstractHandler
            AbstractHandler docHandler = new DOCHandler();
            docHandler.open();
            docHandler.create();
            docHandler.change();
            docHandler.save();
        }
        else if (fileType.equals("txt")) {
            System.out.println("File format: ." + fileType);

            // создаем экземпл€р TXTHandler, приведенный к базовому классу AbstractHandler
            AbstractHandler txtHandler = new TXTHandler();
            txtHandler.open();
            txtHandler.create();
            txtHandler.change();
            txtHandler.save();
        }
        else if (fileType.equals("xml")) {
            System.out.println("File format: ." + fileType);

            // создаем экземпл€р XMLHandler, приведенный к базовому классу AbstractHandler
            AbstractHandler xmlHandler = new XMLHandler();
            xmlHandler.open();
            xmlHandler.create();
            xmlHandler.change();
            xmlHandler.save();
        }
        else {
            System.out.println("Please save the file with one of these extensions: .doc, .txt, .xml ");
        }


    }
}

class File {
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

}
