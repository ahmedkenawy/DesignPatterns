package com.keno.designpatterns.creational.builder;

public class Computer {
    private String processor;
    private int memory;
    private int storage;
    private String graphicsCard;

    private Computer(String processor, int memory, int storage, String graphicsCard) {
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
    }

    public static class Builder {
        private String processor = "";
        private int memory = 0;
        private int storage = 0;
        private String graphicsCard = "";

        public Builder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder setMemory(int memory) {
            this.memory = memory;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Computer build() {
            return new Computer(processor, memory, storage, graphicsCard);
        }

    }


}
