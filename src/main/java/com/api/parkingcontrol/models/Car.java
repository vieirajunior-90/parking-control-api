package com.api.parkingcontrol.models;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "TB_CAR")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Car implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @NonNull
    @Column(nullable = false, unique = true, length = 7)
    private String licensePlate;

    @NonNull
    @Column(nullable = false, length = 70)
    private String brand;

    @NonNull
    @Column(nullable = false, length = 70)
    private String model;

    @NonNull
    @Column(nullable = false, length = 70)
    private String color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Car car = (Car) o;
        return id != null && Objects.equals(id, car.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
