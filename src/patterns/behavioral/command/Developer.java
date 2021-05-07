package patterns.behavioral.command;

public class Developer {
    Command select;
    Command update;
    Command insert;
    Command delete;

    public Developer(Command select, Command update, Command insert, Command delete) {
        this.select = select;
        this.update = update;
        this.insert = insert;
        this.delete = delete;
    }

    public void insertRecord(){
        insert.execute();
    }
    public void selectRecord(){
        select.execute();
    }
    public void updateRecord(){
        update.execute();
    }
    public void deleteRecord(){
        delete.execute();
    }
}
