package ru.mixail;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.mixail.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().addAnnotatedClass(Director.class).addAnnotatedClass(Movie.class);

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.getCurrentSession();) {
            session.beginTransaction();

//            Director director = session.get(Director.class,1);
//            System.out.println(director.getMovies());

//            Movie movie = session.get(Movie.class,8);
//            System.out.println(movie.getDirector());

//            Movie newMovie = new Movie(director,"Test",1984);
//            director.getMovies().add(newMovie);
//            System.out.println(director.getMovies());

            //Добавление нового директора и нового фильма
//            Director newDirector = new Director("Michael",73);
//            Movie movieForNewDirector = new Movie(newDirector,"Hui",1943);
//            newDirector.setMovies(new ArrayList<>(Collections.singletonList(movieForNewDirector)));
//            session.save(newDirector);
//            session.save(movieForNewDirector);

            // Удаление фильмов у директора
//            Director director = session.get(Director.class,7);
//            List<Movie> movies = director.getMovies();
//
//            for (Movie movie: movies){
//                session.remove(movie);
//            }
//            director.getMovies().clear();

            session.getTransaction().commit();

        }

    }
}
