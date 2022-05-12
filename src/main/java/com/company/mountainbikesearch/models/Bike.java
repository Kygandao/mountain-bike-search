package com.company.mountainbikesearch.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "bike")
public class Bike {

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

    //Notes for any other info on bike
    @OneToMany(mappedBy = "bikeId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Note> notes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getFrameMaterial() {
        return frameMaterial;
    }

    public void setFrameMaterial(String frameMaterial) {
        this.frameMaterial = frameMaterial;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSuspensionType() {
        return suspensionType;
    }

    public void setSuspensionType(String suspensionType) {
        this.suspensionType = suspensionType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getTopTube() {
        return topTube;
    }

    public void setTopTube(Integer topTube) {
        this.topTube = topTube;
    }

    public Integer getSeatTube() {
        return seatTube;
    }

    public void setSeatTube(Integer seatTube) {
        this.seatTube = seatTube;
    }

    public Integer getStack() {
        return stack;
    }

    public void setStack(Integer stack) {
        this.stack = stack;
    }

    public Integer getReach() {
        return reach;
    }

    public void setReach(Integer reach) {
        this.reach = reach;
    }

    public Integer getStandoverHeight() {
        return standoverHeight;
    }

    public void setStandoverHeight(Integer standoverHeight) {
        this.standoverHeight = standoverHeight;
    }

    public double getHeadTubeAngle() {
        return headTubeAngle;
    }

    public void setHeadTubeAngle(double headTubeAngle) {
        this.headTubeAngle = headTubeAngle;
    }

    public double getSeatTubeAngle() {
        return seatTubeAngle;
    }

    public void setSeatTubeAngle(double seatTubeAngle) {
        this.seatTubeAngle = seatTubeAngle;
    }

    public Integer getChainstayLength() {
        return chainstayLength;
    }

    public void setChainstayLength(Integer chainstayLength) {
        this.chainstayLength = chainstayLength;
    }

    public Integer getBottomBracketHeight() {
        return bottomBracketHeight;
    }

    public void setBottomBracketHeight(Integer bottomBracketHeight) {
        this.bottomBracketHeight = bottomBracketHeight;
    }

    public Integer getBottomBracketDrop() {
        return bottomBracketDrop;
    }

    public void setBottomBracketDrop(Integer bottomBracketDrop) {
        this.bottomBracketDrop = bottomBracketDrop;
    }

    public Integer getHeadTubeLength() {
        return headTubeLength;
    }

    public void setHeadTubeLength(Integer headTubeLength) {
        this.headTubeLength = headTubeLength;
    }

    public Integer getWheelbase() {
        return wheelbase;
    }

    public void setWheelbase(Integer wheelbase) {
        this.wheelbase = wheelbase;
    }

    public String getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(String wheelSize) {
        this.wheelSize = wheelSize;
    }

    public Set<Note> getNotes() {
        return notes;
    }

    public void setNotes(Set<Note> notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bike bike = (Bike) o;
        return Double.compare(bike.headTubeAngle, headTubeAngle) == 0 && Double.compare(bike.seatTubeAngle, seatTubeAngle) == 0 && Objects.equals(id, bike.id) && Objects.equals(manufacturer, bike.manufacturer) && Objects.equals(model, bike.model) && Objects.equals(year, bike.year) && Objects.equals(frameMaterial, bike.frameMaterial) && Objects.equals(category, bike.category) && Objects.equals(suspensionType, bike.suspensionType) && Objects.equals(size, bike.size) && Objects.equals(topTube, bike.topTube) && Objects.equals(seatTube, bike.seatTube) && Objects.equals(stack, bike.stack) && Objects.equals(reach, bike.reach) && Objects.equals(standoverHeight, bike.standoverHeight) && Objects.equals(chainstayLength, bike.chainstayLength) && Objects.equals(bottomBracketHeight, bike.bottomBracketHeight) && Objects.equals(bottomBracketDrop, bike.bottomBracketDrop) && Objects.equals(headTubeLength, bike.headTubeLength) && Objects.equals(wheelbase, bike.wheelbase) && Objects.equals(wheelSize, bike.wheelSize) && Objects.equals(notes, bike.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, manufacturer, model, year, frameMaterial, category, suspensionType, size, topTube, seatTube, stack, reach, standoverHeight, headTubeAngle, seatTubeAngle, chainstayLength, bottomBracketHeight, bottomBracketDrop, headTubeLength, wheelbase, wheelSize, notes);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", frameMaterial='" + frameMaterial + '\'' +
                ", category='" + category + '\'' +
                ", suspensionType='" + suspensionType + '\'' +
                ", size='" + size + '\'' +
                ", topTube=" + topTube +
                ", seatTube=" + seatTube +
                ", stack=" + stack +
                ", reach=" + reach +
                ", standoverHeight=" + standoverHeight +
                ", headTubeAngle=" + headTubeAngle +
                ", seatTubeAngle=" + seatTubeAngle +
                ", chainstayLength=" + chainstayLength +
                ", bottomBracketHeight=" + bottomBracketHeight +
                ", bottomBracketDrop=" + bottomBracketDrop +
                ", headTubeLength=" + headTubeLength +
                ", wheelbase=" + wheelbase +
                ", wheelSize='" + wheelSize + '\'' +
                ", notes=" + notes +
                '}';
    }
}
