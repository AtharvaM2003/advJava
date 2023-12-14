import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDBExample {
    public static void main(String[] args) {
        // Connect to MongoDB (default host and port)
        MongoClient mongoClient = new MongoClient("localhost", 27017);

        // Access the database
        MongoDatabase database = mongoClient.getDatabase("mydb");

        // Access the collection
        MongoCollection<Document> collection = database.getCollection("mycollection");

        // Create a new document
        Document document = new Document()
                .append("name", "John Doe")
                .append("age", 30)
                .append("email", "johndoe@example.com");

        // Insert the document
        collection.insertOne(document);

        // Retrieve the document
        Document retrievedDocument = collection.find().first();
        System.out.println(retrievedDocument.toJson());

        // Close the MongoDB client
        mongoClient.close();
    }
}
