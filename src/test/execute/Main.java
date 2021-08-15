package test.execute;


import test.execute.inputController.CrudRealization;
import test.execute.inputController.RepositoryCrud;
import test.execute.menu.ExecuteCrud;
import test.execute.menu.Menu;

public class Main {

    public static void main(String[] args) {

        RepositoryCrud crud = CrudRealization.getInstance();
        crud.setFileName(args[0]);
        ExecuteCrud executeCrud = ExecuteCrud.getInstance(crud);
        Menu menuOption = new Menu(executeCrud);
        menuOption.execute();

    }

    public static void inverseFlags(boolean[] params) {
        for (int i = 0; i < params.length; i++) {
            params[i] = !params[i];
        }
    }
}
