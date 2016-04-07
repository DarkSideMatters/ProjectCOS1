/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Mircea
 */
public class Building {
    String name;
    String address;
    int pno;
    String size;
    
    public Building(){}

    public Building(String name, String address, int pno, String size) {
        this.name = name;
        this.address = address;
        this.pno = pno;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPno() {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Building{" + "name=" + name + ", address=" + address + ", pno=" + pno + ", size=" + size + '}';
    }
    
    
}
