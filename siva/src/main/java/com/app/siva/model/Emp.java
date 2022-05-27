package com.app.siva.model;


import lombok.*;

import javax.persistence.*;
import  java.util.HashMap;
import java.util.List;


@Entity
@Table(name = "test1")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Emp {
    private @Id @GeneratedValue Long empId;
    private String empName;
    private String empRole;
}


