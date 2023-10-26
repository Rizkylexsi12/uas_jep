package com.exa.api.entity
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Table
import jakarta.persistence.GenerationType
import jakarta.validation.constraints.NotNull
import jakarta.persistence.Column

@Entity
@Table(name = "categories")
class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id
    @NotNull
    @Column(nullable = false)
    String name
}
