/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

/**
 *
 * @author USER
 */


import java.util.ArrayList;

public interface InterfaceService <T>{
    
    void add(T t);
    void delete(T t);
    T readById(int id);
    ArrayList<T>readAll();
    void update(T t);
}
