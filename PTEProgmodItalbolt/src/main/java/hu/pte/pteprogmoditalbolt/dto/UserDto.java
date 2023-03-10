package hu.pte.pteprogmoditalbolt.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String name;
    private String phoneNumber;
    private String email;
    private String zip;
    private String city;
    private String street;

}
