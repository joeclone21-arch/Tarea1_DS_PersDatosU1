/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.productos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pr_id", nullable = false)
    private Integer id;

    @Column(name = "pr_codigo", nullable = false, length = 20)
    private String codigo;

    @Column(name = "pr_nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "pr_departamento", nullable = false, length = 50)
    private String departamento;

    @Column(name = "pr_categoria", nullable = false, length = 50)
    private String categoria;

    @Column(name = "pr_subcategoria", length = 50)
    private String subcategoria;

    @Column(name = "pr_talla", length = 10)
    private String talla;

    @Column(name = "pr_cantidad")
    private Integer cantidad;

    @Column(name = "pr_precio")
    private Double precio;

    // --- CONSTRUCTOR VACIO PUBLICO PARA HIBERNATE ---
    public Producto() {
    }

    // --- CONSTRUCTOR PARA CREAR OBJETOS ---
    public Producto(String codigo, String nombre, String departamento, String categoria, String subcategoria, String talla, Integer cantidad, Double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.departamento = departamento;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
        this.talla = talla;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // --- GETTERS Y SETTERS ---
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}