package mx.cperez.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {

     @Value("${url.mongo}")
     private String urlMongo;

    @Value("${db.mongo}")
    private String databaseMongo;

    @Override
    protected String getDatabaseName() {
        return databaseMongo;
    }

    @Override
    public MongoClient mongoClient (){
        var connectionString = new ConnectionString(urlMongo);
        var mongoClientSettings = MongoClientSettings
                .builder()
                .applyConnectionString(connectionString)
                .build();
        return this.createMongoClient(mongoClientSettings);
    }
}
