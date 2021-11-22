package by.innowisegroup.session.entity;

import javax.persistence.*;

@Entity
public class Farm {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "table_generator")
    @TableGenerator(name = "table_generator", table = "first_table", allocationSize = 1)
    private Long id;

    private String name;
    private String place;

    public Farm(){}

    public Farm(String name, String place) {
        this.name = name;
        this.place = place;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
