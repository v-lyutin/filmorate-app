package com.filmorate.filmorateapp.model.movie;

import com.filmorate.filmorateapp.model.AbstractEntity;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Director extends AbstractEntity {
    private String name;
    private String surname;
}
