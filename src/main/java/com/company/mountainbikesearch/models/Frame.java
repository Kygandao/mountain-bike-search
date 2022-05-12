package com.company.mountainbikesearch.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "frame")
public class Frame {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String manufacturer;
    private String model;
    private String year;
    private String frameMaterial;
    private String category;
    private String suspensionType;
    // ^ general info ^
    // v geometry numbers v
    private String size;
    private Integer topTube;
    private Integer seatTube;
    private Integer stack;
    private Integer reach;
    private Integer standoverHeight;
    private double headTubeAngle;
    private double seatTubeAngle;
    private Integer chainstayLength;
    private Integer bottomBracketHeight;
    private Integer bottomBracketDrop;
    private Integer headTubeLength;
    private Integer wheelbase;
    private String wheelSize;

}
