package com.asygnata.it.catalogue.model;



public class ComputerModel {
    private String inventoryNumber;
    private String model;
    private String memory;
    private String storage;
    private String os;

    public ComputerModel(String inventoryNumber, String model, String memory, String storage, String os) {
        this.inventoryNumber = inventoryNumber;
        this.model = model;
        this.memory = memory;
        this.storage = storage;
        this.os = os;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
