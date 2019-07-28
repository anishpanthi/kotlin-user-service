//package com.app.kotlin.user.service
//
//import com.app.kotlin.user.domain.User
//import com.app.kotlin.user.repository.UserRepository
//import lombok.extern.slf4j.Slf4j
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.stereotype.Service
//
///**
// * @author Anish Panthi
// */
//@Service
//@Slf4j
//class UserService {
//
//    val users: MutableList<User> = ArrayList()
//
//    @Autowired
//    lateinit var userRepository: UserRepository
//
//    fun findById(id: Long): User? {
//        return userRepository.findAllById(id)
//    }
//}
