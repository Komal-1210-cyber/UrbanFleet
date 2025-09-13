package com.urbanfleet.model;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Setter
@Getter
@ToString
public class Resident
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank(message = "Oops!! First name is missing")
    private String fname;
    @NotBlank(message = "Oops!! Last name is missing")
    private String lname;
    @NotBlank(message = "Oops!! Flat No. is missing")
    private String flatno;
    @NotNull(message = "Oops!! Mobile No. is missing")
    private long mobileno;
    @NotBlank(message = "Oops!! Email is missing")
    private String email;
    @NotNull(message = "Oops!! Resident Type is missing")
    public enum RType
    {
        TENANT, OWNER
    }
    @Enumerated(EnumType.STRING)
    private RType rtype;
    @OneToMany(mappedBy = "resident", cascade=CascadeType.ALL)
    @JsonManagedReference
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Vehicle> vehicallist;
}
