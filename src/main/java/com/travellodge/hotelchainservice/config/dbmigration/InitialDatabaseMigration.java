package com.travellodge.hotelchainservice.config.dbmigration;

import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.travellodge.hotelchainservice.domain.Room;
import com.travellodge.hotelchainservice.domain.User;
import org.bson.Document;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.ArrayList;
import java.util.Arrays;

@ChangeLog(order = "001")
public class InitialDatabaseMigration {

    @ChangeSet(order = "001", id = "addHotels", author = "testAuthor")
    public void addHotels(MongoDatabase db) {
        MongoCollection<Document> hotelCollection = db.getCollection("hotel");
        Document doc = new Document("_id", "L1").append("name","Travelodge London Wembley")
                .append("location","London")
                .append("_class","com.travellodge.hotelchainservice.domain.Hotel");
        Document doc2 = new Document("_id", "L2").append("name","Travelodge London City")
                .append("location","London")
                .append("_class","com.travellodge.hotelchainservice.domain.Hotel");
        Document doc3 = new Document("_id", "C1").append("name","Travelodge Cambridge Central")
                .append("location","Cambridge")
                .append("_class","com.travellodge.hotelchainservice.domain.Hotel");
        Document doc4 = new Document("_id", "C2").append("name","Cambridge Orchard Park")
                .append("location","Cambridge")
                .append("_class","com.travellodge.hotelchainservice.domain.Hotel");

        hotelCollection.insertOne(doc);
        hotelCollection.insertOne(doc2);
        hotelCollection.insertOne(doc3);
        hotelCollection.insertOne(doc4);
    }

    @ChangeSet(order = "002", id = "addRoomTypes", author = "testAuthor")
    public void addRoomTypes(MongoDatabase db) {
        MongoCollection<Document> hotelCollection = db.getCollection("room");

        Document kroom1 = new Document().append("roomNo", "22");
        Document kroom2 = new Document().append("roomNo", "23");
        Document kroom3 = new Document().append("roomNo", "24");
        Document qroom1 = new Document().append("roomNo", "14");
        Document qroom2 = new Document().append("roomNo", "15");
        Document qroom3 = new Document().append("roomNo", "16");

        Document doc = new Document("_id", "RL1R1")
                .append("roomCode","Travelodge London Wembley")
                .append("hotelId","L1")
                .append("maxOccupancy", 2)
                .append("minOccupancy", 1)
                .append("bedType", "King")
                .append("bedCount", 1)
                .append("description","Travelodge London Wembley luxury room with Kig size bed and wifi facilities")
                .append("rent", 145.00)
                .append("rooms", Arrays.asList(kroom1, kroom2, kroom3))
                .append("_class","com.travellodge.hotelchainservice.domain.RoomType");
        Document doc2 = new Document("_id", "RL1R2")
                .append("roomCode","Travelodge London Wembley")
                .append("hotelId","L1")
                .append("maxOccupancy", 1)
                .append("minOccupancy", 1)
                .append("bedType", "Queen")
                .append("bedCount", 1)
                .append("description","Travelodge London Wembley luxury room with Kig size bed and wifi facilities")
                .append("rent", 125.00)
                .append("rooms", Arrays.asList(qroom1, qroom2, qroom3))
                .append("_class","com.travellodge.hotelchainservice.domain.RoomType");

        hotelCollection.insertOne(doc);
        hotelCollection.insertOne(doc2);
    }

}
