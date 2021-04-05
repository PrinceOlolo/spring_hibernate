package hiber.model;
import javax.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="series")
    private Integer series;
    @Column(name="models")
    private String model;

    @Override
    public String toString (){
        return ("   model: " + getModel() + "  series:" + getSeries() );

    }

    public Car() {

    }

    public Car(String model, Integer series) {
        this.series = series;
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public Integer getSeries() {
        return series;
    }

}
