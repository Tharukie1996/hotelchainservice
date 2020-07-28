package com.travellodge.hotelchainservice.config;

import com.github.mongobee.Mongobee;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import javax.inject.Inject;

@Configuration
public class DatabaseConfiguration {

    private final MongoProperties mongoProperties;
    private final MongoTemplate mongoTemplate;

    @Inject
    public DatabaseConfiguration(MongoProperties mongoProperties, MongoTemplate mongoTemplate) {
        this.mongoProperties = mongoProperties;
        this.mongoTemplate = mongoTemplate;
    }

    @Bean
    public Mongobee mongobee() {
        final Mongobee mongobee = new Mongobee(mongoProperties.getUri());
        mongobee.setDbName(mongoProperties.getDatabase());
        mongobee.setChangeLogsScanPackage("com.travellodge.hotelchainservice.config.dbmigration");
        mongobee.setEnabled(true);
        return mongobee;
    }
}
