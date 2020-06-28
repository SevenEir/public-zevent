package com.fatec.zevent.model;

import lombok.*;

import javax.persistence.*;

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

    @Column(name = "name")
    private String name;

    @Column(name = "category")
    private String category;

    @Column(name = "type")
    private String type;

    @Column(name="`desc`")
    private String desc;

    @Column(name = "init_date")
    private String initDate;

    @Column(name = "finish_date")
    private String finishDate;

    @Column(name = "value")
    private int value;

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
