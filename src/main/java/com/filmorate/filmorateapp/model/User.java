package com.filmorate.filmorateapp.model;

import lombok.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class User extends AbstractEntity {
    private String name;
    private String login;
    private String email;
    private LocalDate birthday;
    @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
    private Set<Long> friends = new HashSet<>();

    public void addFriend(Long userId) {
        friends.add(userId);
    }

    public void removeFriend(Long userId) {
        friends.remove(userId);
    }

    public Set<Long> getFriends() {
        return new HashSet<>(friends);
    }

    public Boolean containsFriend(Long userId) {
        return friends.contains(userId);
    }
}
