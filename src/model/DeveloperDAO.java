package model;


import view.DeveloperView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Александр on 04.08.2017.
 */
public class DeveloperDAO{

    public static boolean        exist      = false;
    public static String         command;
    Developer                    dev1       = new Developer();
    InputStreamReader            is         = new InputStreamReader(System.in);
    BufferedReader               br         = new BufferedReader(is);
    DeveloperView                view       = new DeveloperView();


    void create() throws IOException {


        exist = true;
        view.enterName();
        String name = br.readLine();
        view.enterAge();
        int age=-1;
        do {
            try {
               age = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                view.enterInt();
            }
        }while (age == -1);
        view.enterMan();
        boolean isMan = br.readLine().equals("y") ?  true : false;
        dev1 =  new Developer(age,name, isMan);
        view.developerCreated();
    }

    void update() throws IOException {
        if (exist) {
            view.enterName();
            dev1.name = br.readLine();
            view.enterAge();
            int temp = dev1.age;
            do {
                try {
                    dev1.age = Integer.parseInt(br.readLine());
                } catch (Exception e) {
                    view.enterInt();
                }
            }while (dev1.age == temp);

            view.enterMan();
            dev1.isMan = br.readLine().equals("да") ? true : false;
            view.dataUpdated();
        }else view.devCrt();

    }

    void read(){
    if (exist) view.show(dev1);
    else view.devCrt();
    }

    void delete(){
        if (exist) {
            dev1 = null;
            exist = false;
            view.developerDeleted();
        }
        else view.devCrt();
    }


   public void comExe() throws IOException {
        switch  (command){
            case "new":
                create();
                break;

            case "update":
                update();
                break;

            case "read":
                read();
                break;

            case "delete":
                delete();
                break;

            case "exit":
                br.close();
                System.exit(0);
                break;
            default:
                view.noCommand();
                view.showCommands();
                break;


        }
    }

}
