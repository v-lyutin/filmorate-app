package com.filmorate.filmorateapp.model.movie;

import com.filmorate.filmorateapp.model.AbstractEntity;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Genre extends AbstractEntity {
    private String name;
}
