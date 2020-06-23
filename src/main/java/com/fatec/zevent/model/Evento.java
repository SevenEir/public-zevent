package com.fatec.zevent.model;

import com.fatec.zevent.model.enumeration.CategoryEnum;
import com.fatec.zevent.model.enumeration.EventTypeEnum;
import lombok.*;

import javax.persistence.*;

// @Document(collection = "events")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Evento")
@Table(name = "Evento")
public class Evento implements Checkable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    //@NotNull(message = "Event's name must not be null")
    @Column(name = "name")
    private String name;

    //@NotNull(message = "Event's category must not be null")
    @Column(name = "category")
    private String category;

    //@NotNull(message = "Event's type must not be null")
    @Column(name = "type")
    private String type;

    //@NotNull(message = "Event's desc must not be null")
    @Column(name="`desc`")
    private String desc;

    //@NotNull(message = "Event's initDate must not be null")
    @Column(name = "init_date")
    private String initDate;

    //@NotNull(message = "Event's finishDate must not be null")
    @Column(name = "finish_date")
    private String finishDate;

    //@NotNull(message = "Event's value must not be null")
    @Column(name = "value")
    private int value;

    //@NotNull(message = "Event's seats must not be null")
    //@Range(min = 1)
    @Column(name = "seats")
    private int seats;

    //@NotNull(message = "Event's organization must not be null")
    //private Organization organization;

    //@NotNull(message = "Event's address must not be null")
    //private Address address;

    //@NotNull(message = "Event's image url must not be null")
    //private String imageUrl;

    //private EventStatusEnum status = EventStatusEnum.OPEN;
    //private String responsibleId = "";
    //private List<Activity> activities = new ArrayList<>();
    //private List<Stand> stands = new ArrayList<>();
    //private List<ActivityType> activityTypes = new ArrayList<>();
    //private List<Comment> comments = new ArrayList<>();
    //private List<String> guestsIds = new ArrayList<>();

}
