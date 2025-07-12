package sv.edu.udb.repository.domain;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter //Basic getter methods
@Setter //Basic setter methods
@Builder //Patter design
@NoArgsConstructor // Default constructor
@AllArgsConstructor //All attribute constructor
public class Movie{
    private Long id;
    private String name;
    private String type;
    private Integer releaseYear;
}
