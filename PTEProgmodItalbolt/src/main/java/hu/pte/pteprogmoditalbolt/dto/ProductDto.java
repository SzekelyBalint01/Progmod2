package hu.pte.pteprogmoditalbolt.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    private String Name;
    private String Description;
    private Integer Price;
    private String imageSrc;
    private String Type;
    private Boolean Hero = false;
    private Integer Size;
    private Integer alcoholPercent;
    private String placeOfOrigin;
}
