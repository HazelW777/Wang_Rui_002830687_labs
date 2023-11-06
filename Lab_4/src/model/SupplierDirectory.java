/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author 40121
 */
public class SupplierDirectory {
    
    private ArrayList<Supplier> supplierLsit;

    public SupplierDirectory() {
        supplierLsit = new ArrayList<Supplier>();
    }
    
    public ArrayList<Supplier> getSupplierList(){
        return supplierLsit;
    }
    
    public Supplier addSupplier(){
        Supplier s = new Supplier();
        supplierLsit.add(s);
        return s;
    }

    public void removeSupplier(Supplier s){
        supplierLsit.remove(s);
    }
    
    public Supplier searchSupplier(String keyWord){
        for(Supplier s : supplierLsit){
            if(keyWord.equals(s.getSupplyName())){
                return s;
            }
        }
        return null;
    }
}
