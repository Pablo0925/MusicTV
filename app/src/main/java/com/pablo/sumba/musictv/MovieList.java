package com.pablo.sumba.musictv;

import java.util.ArrayList;
import java.util.List;

public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            "Favoritos",
            "Pop Latino",
            "Reggeaton",
            "Nacional",
            "Clasicos",
            "Rock",
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
                "Nanpa Básico ....",
                "Maluma - Borro Casette",
                "Ojos marrones",
                "Julio Jaramillo - Nuestro Juramento",
                "Clasicos del Rock"
        };

        String description = "Extracto de una de las canciones del artista Colombiano Nanpa Básico";
        String studio[] = {
                "Musica Latina", "Studio Vevo", "Studio Vevo ", "Studio ", "Studio "
        };
        String videoUrl[] = {
                "https://s31.aconvert.com/convert/p3r68-cdx67/4ta08-cpnsr.webm",
                "https://s5.aconvert.com/convert/p3r68-cdx67/l1d5o-zvmeg.webm",
                "https://s31.aconvert.com/convert/p3r68-cdx67/siu0d-im0zf.webm",
                "https://s33.aconvert.com/convert/p3r68-cdx67/dm45y-kwgjx.webm",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose.mp4"
        };
        String bgImageUrl[] = {
                "https://i.ytimg.com/vi/lAbMpVDoOMo/sddefault.jpg",
                "https://i.ytimg.com/vi/Xk0wdDTTPA0/maxresdefault.jpg",
                "https://i.ytimg.com/vi/XpEEOtjsHxg/maxresdefault.jpg",
                "https://i.ytimg.com/vi/pzMKf31Ph8U/maxresdefault.jpg",
                "https://concepto.de/wp-content/uploads/2018/09/rock-subgeneros-e1536060428837.jpg",
        };
        String cardImageUrl[] = {
                "https://i.ytimg.com/vi/lAbMpVDoOMo/sddefault.jpg",
                "https://i.ytimg.com/vi/Xk0wdDTTPA0/maxresdefault.jpg",
                "https://i.ytimg.com/vi/XpEEOtjsHxg/maxresdefault.jpg",
                "https://i.ytimg.com/vi/pzMKf31Ph8U/maxresdefault.jpg",
                "https://concepto.de/wp-content/uploads/2018/09/rock-subgeneros-e1536060428837.jpg",
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