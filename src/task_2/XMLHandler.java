package task_2;

public class XMLHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("File opening by XMLHandler.");
    }

    @Override
    void create() {
        System.out.println("File creating by XMLHandler.");
    }

    @Override
    void change(){
        System.out.println("File changing by XMLHandler.");
    }

    @Override
    void save() {
        System.out.println("File saving by XMLHandler.");
    }
}
