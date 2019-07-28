package com.app.kotlin.user.repository

import com.app.kotlin.user.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

/**
 * @author Anish Panthi
 */
interface UserRepository : CrudRepository<User, Long>, JpaRepository<User, Long>{
}
