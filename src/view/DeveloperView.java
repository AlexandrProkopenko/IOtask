package view;

import model.Developer;

/**
 * Created by Александр on 04.08.2017.
 */
public class DeveloperView {

   public void show(Developer dev){
        System.out.println("Имя разработчика: " + dev.getName());
        System.out.println("Возраст: " + dev.getAge());
        System.out.println("Пол: " + (dev.getIsMan()? "мужчина":"женщина"));
    }

    public void showCommands(){
        System.out.println("Доступные комманды:");
        System.out.println("new, read, delete, update, exit");

    }

    public void devCrt(){
        System.out.println("Создайте разработчика!");
    }

    public void enterCommand(){
        System.out.println("Введите команду!");
    }
    public void enterInt(){
        System.out.println("Введите число!");
    }

    public void enterName(){
        System.out.println("Введите имя разработчика");
    }

   public void enterAge(){
        System.out.println("Введите возраст разработичика");
    }

    public void enterMan(){
        System.out.println("Разработчик мужчина?");
    }

   public void developerCreated(){
        System.out.println("Разработчик создан");
    }

    public void developerDeleted(){
        System.out.println("Разработчик удален, для продолжения создайте нового!");
    }
    public void noCommand(){
        System.out.println("Такой команды нет, повторите ввод!");
    }

    public void dataUpdated(){
        System.out.println("Данные обновлены!");
    }

}
