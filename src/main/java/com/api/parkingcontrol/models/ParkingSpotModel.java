package com.api.parkingcontrol.models;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "TB_PARKING_SPOT")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class ParkingSpotModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NonNull
    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;

    @NonNull
    @Column(nullable = false)
    private LocalDateTime registrationDate;

    @NonNull
    @Column(nullable = false, length = 130)
    private String responsibleName;

    @NonNull
    @Column(nullable = false, length = 30)
    private String apartment;

    @NonNull
    @Column(nullable = false, length = 30)
    private String block;

    @OneToOne(mappedBy = "parkingSpotModel")
    @ToString.Exclude
    private CarModel carModel;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ParkingSpotModel that = (ParkingSpotModel) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
