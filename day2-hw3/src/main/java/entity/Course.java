package entity;

import java.math.BigDecimal;

public class Course {
    private Integer id;
    private String name;
    private BigDecimal price;
    private Category category;
    private Lecturer lecturer;

    public Course() {
    }

    public Course(Integer id, String name, BigDecimal price, Category category, Lecturer lecturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.lecturer = lecturer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
