package com.app.kotlin.user.domain

import javax.persistence.*
import javax.validation.constraints.NotBlank

/**
 * @author Anish Panthi
 */
@Entity
@Table(name = "USER")
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 1L,

        @get: NotBlank
        @Column(name = "First_Name")
        var firstName: String = "",

        @get: NotBlank
        @Column(name = "Last_Name")
        var lastName: String = "",

        @get: NotBlank
        @Column(name = "Email")
        var email: String = "",

        @Column(name = "Contact")
        var contact: String = ""
)
