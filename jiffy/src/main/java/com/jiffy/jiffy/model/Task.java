package com.jiffy.jiffy.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tasks")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String status; // Assigned, In Progress, Completed

    @ManyToOne
@JoinColumn(name = "assigned_to", nullable = true)
private User assignedTo;

}
