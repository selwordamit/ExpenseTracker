package org.example.expensetracker.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int expenseType;
    private String date;
    private double amount;
    private String category;
    private String account;
    private String note;
    @Version
    private Integer version;

}
