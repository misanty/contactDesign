package test.execute;


import test.execute.inputController.CrudRealization;
import test.execute.inputController.RepositoryCrud;
import test.execute.menu.ExecuteCrud;
import test.execute.menu.Menu;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        RepositoryCrud crud = CrudRealization.getInstance();
        ExecuteCrud executeCrud = ExecuteCrud.getInstance(crud);
        Menu menuOption = new Menu(executeCrud);
        menuOption.execute();
System.out.println(File.separator);

        // String to be scanned to find the pattern.
        String fileName = "This order was placed for QT3000! OK?";

        String input = "";
        String pattern = "^.*\\w*((?i)"+input+"(?-i))\\w*.*$";
        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(fileName);

        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
        }else {
            System.out.println("NO MATCH");
        }

        //   MenuOption menuOption = new MenuOption()
//menuOptionExecution.initialize(5).run();

       /* for (var e:menuOptionExecution
             ) {

        }*/

/*

        List<Contact> contacts = new ArrayList<>();
        Contact p = new Person();
        p.setName("Jale");
        p.changeFieldValue("surname","Hale");
        contacts.add(p);
        Contact o = new Organization();
        o.changeFieldValue("","Organize Sanayi");
        o.changeFieldValue("address","uzun köprü");
        contacts.add(o);

        for (var element: contacts) {
            System.out.println(element.getInfo());
        }

*/


    }
}
