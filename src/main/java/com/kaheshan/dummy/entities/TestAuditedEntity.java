package com.kaheshan.dummy.entities;
/*
    Author: Peyman Dodangeh,
    Date : 10/4/2020,
    Time : 5:11 PM
*/

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

//@EntityListeners(AuditListener.class)
@Entity
@Getter
@Setter
@NoArgsConstructor
public class TestAuditedEntity {


    //https://www.baeldung.com/jpa-entity-lifecycle-events

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic()
    @Column(name = "operation")
    private String operation;

    @Column(name = "timestamp")
    private long timestamp;


//    @Column(name = "created_date", nullable = false, updatable = false)
//    @CreatedDate
//    private long createdDate;
//
//    @Column(name = "modified_date")
//    @LastModifiedDate
//    private long modifiedDate;

    //...

    // standard setters and getters for the new properties

    //...

    @PrePersist
    public void onPrePersist() {
        audit("INSERT");
    }

    @PreUpdate
    public void onPreUpdate() {
        audit("UPDATE");
    }

    @PreRemove
    public void onPreRemove() {
        audit("DELETE");
    }

    private void audit(String operation) {
        setOperation(operation);
        setTimestamp((new Date()).getTime());
    }



//    public class AuditListener {
//
//        @PrePersist
//        @PreUpdate
//        @PreRemove
//        private void beforeAnyOperation(Object object) { ... }
//
//    }

}
