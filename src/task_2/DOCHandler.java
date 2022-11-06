package task_2;

public class DOCHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("File opening by DOCHandler.");
    }

    @Override
    void create() {
        System.out.println("File creating by DOCHandler.");
    }

    @Override
    void change(){
        System.out.println("File changing by DOCHandler.");
    }

    @Override
    void save() {
        System.out.println("File saving by DOCHandler.");
    }
}
