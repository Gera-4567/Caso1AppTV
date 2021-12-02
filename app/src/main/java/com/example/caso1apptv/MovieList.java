package com.example.caso1apptv;

import java.util.ArrayList;
import java.util.List;

public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            "Futbol Soccer",
            "Tips",
            "Animaciones",
            "Noticias",
            "Fichajes",
            "Resultados",
    };

    private static List<Movie> list;
    private static long count = 0;

    public static List<Movie> getList() {
        if (list == null) {
            list = setupMovies();
        }
        return list;
    }

    public static List<Movie> setupMovies() {
        list = new ArrayList<>();
        String title[] = {
                "Vive  el futbol",
                "Centros",
                "Pases",
                "Regates",
                "Futbol Total"
        };

        String description = "Disfruta del deporte rey";
        String studio[] = {
                "Sección 1", "Sección 2", "Sección 3", "Sección 4", "Sección 5"
        };
        String videoUrl[] = {
                "https://static.videezy.com/system/resources/previews/000/044/400/original/Dynamic_Soccer.mp4",
                "https://static.videezy.com/system/resources/previews/000/000/360/original/MAH00003.mp4",
                "https://static.videezy.com/system/resources/previews/000/040/161/original/10Z_IMG_1696.mp4",
                "https://static.videezy.com/system/resources/previews/000/055/876/original/Sport-news-intro-.mp4",
                "https://static.videezy.com/system/resources/previews/000/050/726/original/2016_08_15_SoccerField.mp4"
        };
        String bgImageUrl[] = {
                "https://s03.s3c.es/imag/_v0/770x420/e/0/6/600x400_balon-de-futbol.jpg",
                "https://www.living4football.club/wp-content/uploads/2021/01/beckham_4.jpg",
                "https://static01.nyt.com/images/2020/09/25/sports/25soccer-nationalWEB1/merlin_177451008_91c7b66d-3c8a-4963-896e-54280f374b6d-superJumbo.jpg",
                "https://images2.minutemediacdn.com/image/upload/c_fill,w_912,h_516,f_auto,q_auto,g_auto/shape/cover/sport/paris-saint-germain-v-angers-sco-ligue-1-5dd3cb5b8a147a7251000016.jpg",
                "https://us.123rf.com/450wm/stuartphoto/stuartphoto1702/stuartphoto170200006/71848286-f%C3%BAtbol-de-los-n%C3%BAmeros-de-f%C3%BAtbol-muestra-los-resultados-del-f%C3%BAtbol-3d-ilustraci%C3%B3n.jpg?ver=6",
        };
        String cardImageUrl[] = {
                "https://s03.s3c.es/imag/_v0/770x420/e/0/6/600x400_balon-de-futbol.jpg",
                "https://www.living4football.club/wp-content/uploads/2021/01/beckham_4.jpg",
                "https://static01.nyt.com/images/2020/09/25/sports/25soccer-nationalWEB1/merlin_177451008_91c7b66d-3c8a-4963-896e-54280f374b6d-superJumbo.jpg",
                "https://images2.minutemediacdn.com/image/upload/c_fill,w_912,h_516,f_auto,q_auto,g_auto/shape/cover/sport/paris-saint-germain-v-angers-sco-ligue-1-5dd3cb5b8a147a7251000016.jpg",
                "https://us.123rf.com/450wm/stuartphoto/stuartphoto1702/stuartphoto170200006/71848286-f%C3%BAtbol-de-los-n%C3%BAmeros-de-f%C3%BAtbol-muestra-los-resultados-del-f%C3%BAtbol-3d-ilustraci%C3%B3n.jpg?ver=6"
        };

        for (int index = 0; index < title.length; ++index) {
            list.add(
                    buildMovieInfo(
                            title[index],
                            description,
                            studio[index],
                            videoUrl[index],
                            cardImageUrl[index],
                            bgImageUrl[index]));
        }

        return list;
    }

    private static Movie buildMovieInfo(
            String title,
            String description,
            String studio,
            String videoUrl,
            String cardImageUrl,
            String backgroundImageUrl) {
        Movie movie = new Movie();
        movie.setId(count++);
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(backgroundImageUrl);
        movie.setVideoUrl(videoUrl);
        return movie;
    }
}