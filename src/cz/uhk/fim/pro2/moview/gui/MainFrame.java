package cz.uhk.fim.pro2.moview.gui;

import cz.uhk.fim.pro2.moview.model.*;
import cz.uhk.fim.pro2.moview.utils.DataHandler;
import cz.uhk.fim.pro2.moview.utils.ImageHandler;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class MainFrame extends JFrame {


    public MainFrame(){

    }


    private void initFrame(){
        setTitle("Moview");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize((int) (screenSize.width * 0.75), (int) (screenSize.height *0.75));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }

    private void InitTestData(){
        java.util.List<Genre> genres = new ArrayList<>(4);
        genres.add(new Genre("Sci-Fi"));
        genres.add(new Genre("Sci-Fi"));
        genres.add(new Genre("Sci-Fi"));
        genres.add(new Genre("Sci-Fi"));

        List<Actor> actors = new ArrayList<>(3);
        actors.add(new Actor("Mark Hammil"));
        actors.add(new Actor("Harrison Ford"));
        actors.add(new Actor("Sci-Fi"));

        List<Rating> ratings = new ArrayList<>(3);
        ratings.add(new Rating("Mark Hammil","10"));
        ratings.add(new Rating("Harrison Ford","10"));
        ratings.add(new Rating("Sci-Fi","10"));

        Movie m1 = new Movie(
                "Star Wars - ep. 4",
                1977,
                DataHandler.getDateFromString("25 May 1997"),
                121,
                genres,
                "George Lucas",
                "George Lucas",
                actors,
                "...",
                "English",
                ImageHandler.getImageFromUrl("https://m.media-amazon.com/images/M/MV5BNzVlY2MwMjktM2E4OS00Y2Y3LWE3ZjctYzhkZGM3YzA1ZWM2XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg"),
                ratings,
                MovieType.MOVIE
        );

        System.out.println(m1);
    }
}
