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
/*

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lear year");
        int out = scanner.nextInt();

        if(out >= 1900 && out <= 3000)
        {
            if (out % 4 == 0 && out % 100 != 0 || out % 400 == 0)
            {
                System.out.println("Leap");
            }
            else {
                System.out.println("Regular");
            }
        }
*//*

        System.out.println(File.separator);


        System.out.println(Contact.class.getFields().length);
        System.out.println("****************************************************");
        boolean[] tstParams = new boolean[]{true, false, true};
        inverseFlags(tstParams);
        System.out.println(Arrays.toString(tstParams));

        // String to be scanned to find the pattern.
        String fileName = "This order was placed for QT3000! OK?";

        String input = "";
        String pattern = "^.*\\w*((?i)" + input + "(?-i))\\w*.*$";
        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(fileName);

        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
        } else {
            System.out.println("NO MATCH");
        }
*/
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

    public static void inverseFlags(boolean[] params) {
        for (int i = 0; i < params.length; i++) {
            params[i] = !params[i];
        }
    }
}
