package org.sid.sportrent.entities;
import lombok.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data
@CrossOrigin("*")
@NoArgsConstructor @AllArgsConstructor @ToString
public class Category implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String photo ;
    private String name ;
    private String description ;
    @OneToMany(mappedBy = "category")

    private Collection<Product> products ;



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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public Collection<Product> getProducts() {
        return products;
    }

    public void setProducts(Collection<Product> products) {
        this.products = products;
    }
}
