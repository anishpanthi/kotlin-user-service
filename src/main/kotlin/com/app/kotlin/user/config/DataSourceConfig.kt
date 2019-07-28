package com.app.kotlin.user.config

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

/**
 * @author Anish Panthi
 */
@Configuration
@EnableJpaRepositories(basePackages = arrayOf("com.app.kotlin.user.*"))
@EntityScan(basePackages = arrayOf("com.app.kotlin.user.*"))
class DataSourceConfig {
}
