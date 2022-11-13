package ru.practicum.shareit.item.model;

/**
 * TODO Sprint add-controllers.
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Set;

@Data
public class Item {
    //свободна, занята
    private enum Status {
        free, busy
    }

    private Long id;            //Идентификатор вещи.
    private String name;        //Название вещи.
    private String description; //Описание вещи.
    private Long ownerId;       //ID хозяина вещи.
    private Boolean available;  //Статус для бронирования: свободна, занята.
    @JsonIgnore
    private Boolean isRequest;  //Вещь создана по запросу ищущего пользователя (True - да)?
    private Set<Long> reviews;  //ID фидбеков на вещь.
}
