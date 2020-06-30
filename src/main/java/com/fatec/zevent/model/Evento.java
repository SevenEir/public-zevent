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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getInitDate() {
        return initDate;
    }

    public void setInitDate(String initDate) {
        this.initDate = initDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }


}
