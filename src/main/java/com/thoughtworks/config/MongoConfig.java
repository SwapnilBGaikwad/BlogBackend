package com.thoughtworks.config;

import com.mongodb.Mongo;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration {

    @Override
    public String getDatabaseName() {
        return "blog-api";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new Mongo();
    }

}
