package com.example.model;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDate;

public class Employee {

    @Schema(example = "4", description = "Identidicador clave primaria empleado numerico")   //indica el valor que deberian tener las propiedades
    private Long id;
    @Schema(example = "Alan", description = "Nombre completo empleado")
    private String name;
    @Schema(example = "2022-20-01", description = "Fecha de nacimiento yyyy-MM-dd")
    private LocalDate birthDate;
    @Schema(example = "34567.43", description = "Salario anual bruto del empleado")
    private double salary;
    @Schema(example ="true", description = "Situacion casado si o no empleado")
    private Boolean married;

    public Employee() {
    }

    public Employee(Long id, String name, LocalDate birthDate, double salary, Boolean married) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.salary = salary;
        this.married = married;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", salary=" + salary +
                ", married=" + married +
                '}';
    }
}
