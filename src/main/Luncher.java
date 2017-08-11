package main;

import controller.DeveloperController;
import model.DeveloperDAO;

import java.io.IOException;

/**
 * Created by Александр on 04.08.2017.
 */
public class Luncher {
    public static void main(String[] args) throws IOException {
        DeveloperController c = new DeveloperController();

        c.readCommand();
    }
}
