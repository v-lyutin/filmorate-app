package com.filmorate.filmorateapp.model.movie;

import com.filmorate.filmorateapp.model.AbstractEntity;
import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Movie extends AbstractEntity {
    private String title;
    private Director director;
    private String description;
    private int duration;
    private LocalDate releaseDate;
}
