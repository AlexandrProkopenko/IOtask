package controller;

import model.DeveloperDAO;
import view.DeveloperView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static model.DeveloperDAO.*;

/**
 * Created by Александр on 04.08.2017.
 */
public class DeveloperController {

    DeveloperView view = new DeveloperView();

    public void readCommand() throws IOException {
        view.showCommands();
        if (!exist) {
            view.devCrt();
        }
        else
            view.enterCommand();

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        DeveloperDAO dao = new DeveloperDAO();


        while (true){
            command = br.readLine();
            dao.comExe();
        }

    }



}
