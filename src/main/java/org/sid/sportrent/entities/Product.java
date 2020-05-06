package org.sid.sportrent.entities;

import lombok.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@CrossOrigin("*")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Product implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String name ;
    private String photo ;
    private String description ;
    private String period ;
    private String State ;
    private double currentPrice ;
    private boolean promotion ;
    private boolean selected ; //dans la page d acceuil on ne peut avoir que les produits selectionne par le webmaster
    private boolean available ; // ce qui existe en stock
    private String photoName ; //on stock les images dans un dossier URL
    @ManyToOne
    private Category category ;




    public long getId() {
        return id;
    }

    public String getPeriod(Product p) {
        return period;
    }

    public void setPeriode(String periode) {
        this.period = periode;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCurrentPrice(int i) {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public boolean isPromotion() {
        return promotion;
    }

    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public String getPhotoName() {
        return photoName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getState() {
        return State;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }


}
