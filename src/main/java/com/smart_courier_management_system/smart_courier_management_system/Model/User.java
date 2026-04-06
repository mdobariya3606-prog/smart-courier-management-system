package com.smart_courier_management_system.smart_courier_management_system.Model;

import com.smart_courier_management_system.smart_courier_management_system.Enum.UserEnum;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user_info")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private UserEnum userType;

    @ManyToMany
    @JoinTable(
            name = "courier_assignment",
            joinColumns =   @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "courier_id")
    )
    List<Package> packages = new ArrayList<>();
}
