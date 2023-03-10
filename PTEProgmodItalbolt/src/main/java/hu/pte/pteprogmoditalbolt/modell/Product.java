package hu.pte.pteprogmoditalbolt.modell;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Name;
    private String Description;
    private Integer Price;
    private String imageSrc;
    private String Type;
    private Boolean Hero = false;
    private Integer Size;
    private Integer alcoholPercent;
    private String placeOfOrigin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imgSrc) {
        this.imageSrc = imgSrc;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Boolean getHero() {
        return Hero;
    }

    public void setHero(Boolean hero) {
        Hero = hero;
    }

    public Integer getSize() {
        return Size;
    }

    public void setSize(Integer size) {
        Size = size;
    }

    public Integer getAlcoholPercent() {
        return alcoholPercent;
    }

    public void setAlcoholPercent(Integer alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }




}
