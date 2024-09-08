package ru.mixail.model;


import jakarta.persistence.*;

@Entity
@Table(name = "test")
public class Test {
    // Если бы поле называлось user_id тогда мы воспользовались аннотацией @Column
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Для автоматической генерации id выбираем эту стратегию
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;

    public Test(){

    }

    public Test(String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}
