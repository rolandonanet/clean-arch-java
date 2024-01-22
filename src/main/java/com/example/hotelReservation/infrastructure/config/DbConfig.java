//package com.example.hotelReservation.infrastructure.config;
//
//import jakarta.persistence.EntityManagerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//
//import javax.sql.DataSource;
//
//
//@Configuration
//@EnableJpaRepositories("com.example.hotelReservation.infrastructure.persistence.jpa.*")
//@EntityScan("com.example.hotelReservation.infrastructure.persistence.entity.*")
//@ComponentScan(basePackages = "com.example.hotelReservation.infrastructure.persistence.jpa.*")
//public class DbConfig {
//
//    @Value("${spring.datasource.url}")
//    private String dataSourceUrl;
//
//    @Value("${spring.datasource.driver-class-name}")
//    private String dataSourceDriverClassName;
//
//    @Value("${spring.datasource.username}")
//    private String dataSourceUsername;
//
//    @Value("${spring.datasource.password}")
//    private String dataSourcePassword;
//
//    @Bean
//    public DataSource dataSource() {
//        return DataSourceBuilder.create()
//                .url(dataSourceUrl)
//                .driverClassName(dataSourceDriverClassName)
//                .username(dataSourceUsername)
//                .password(dataSourcePassword)
//                .build();
//    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
//        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//        em.setDataSource(dataSource);
//        em.setPackagesToScan("com.example.hotelReservation.infrastructure.persistence.entity");
//        em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//        return em;
//    }
//
//    @Bean
//    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
//        JpaTransactionManager transactionManager = new JpaTransactionManager();
//        transactionManager.setEntityManagerFactory(entityManagerFactory);
//        return transactionManager;
//    }
//}
