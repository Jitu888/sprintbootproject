package com.techlife.sprintbootproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "product")
public class Product {
    @Id
    private Integer id;
    private String regionName;
    private String regionCode;
    private String regionStatus;
    private List<String> availableInRegion;
    private List<Object> countries;
}
