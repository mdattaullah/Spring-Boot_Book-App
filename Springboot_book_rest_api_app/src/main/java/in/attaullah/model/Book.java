package in.attaullah.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Book Details")
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    
    private String title;

   
    private String author;


   
    private Long isbnNumber;

    
    private Double price;

    
    private String language;
}