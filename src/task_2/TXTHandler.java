package task_2;

public class TXTHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("File opening by TXTHandler.");
    }

    @Override
    void create() {
        System.out.println("File creating by TXTHandler.");
    }

    @Override
    void change(){
        System.out.println("File changing by TXTHandler.");
    }

    @Override
    void save() {
        System.out.println("File saving by TXTHandler.");
    }

}
