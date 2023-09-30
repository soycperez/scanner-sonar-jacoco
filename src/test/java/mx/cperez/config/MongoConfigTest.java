package mx.cperez.config;

import com.mongodb.client.MongoClient;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.mock.web.MockServletConfig;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MockServletConfig.class)
@Import(MongoConfig.class)
class MongoConfigTest {

    @Autowired
    private MongoConfig mongoConfig;

    @Test
    void getDatabaseName() {
        String mongodatabaseName = mongoConfig.getDatabaseName();
        assertNotNull(mongodatabaseName);
        assertEquals("maxdatafiles", mongodatabaseName);
    }

    @Test
    void mongoClient() {
        MongoClient mongoClient = mongoConfig.mongoClient();
        assertNotNull(mongoClient);
    }
}