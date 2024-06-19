package com.lld.design_pattern.creational.builder;

public class House {
	  private int windows;
	    private int doors;
	    private boolean hasRoof;
	    private boolean hasGarage;
	    private boolean hasSwimmingPool;

	    
	    private House(HouseBuilder builder) {
	        this.windows = builder.windows;
	        this.doors = builder.doors;
	        this.hasRoof = builder.hasRoof;
	        this.hasGarage = builder.hasGarage;
	        this.hasSwimmingPool = builder.hasSwimmingPool;
	    }
	    
	    public static class HouseBuilder {
	        private int windows;
	        private int doors;
	        private boolean hasRoof;
	        private boolean hasGarage;
	        private boolean hasSwimmingPool;

	        public HouseBuilder setWindows(int windows) {
	            this.windows = windows;
	            return this;
	        }

	        public HouseBuilder setDoors(int doors) {
	            this.doors = doors;
	            return this;
	        }

	        public HouseBuilder setRoof(boolean hasRoof) {
	            this.hasRoof = hasRoof;
	            return this;
	        }

	        public HouseBuilder setGarage(boolean hasGarage) {
	            this.hasGarage = hasGarage;
	            return this;
	        }

	        public HouseBuilder setSwimmingPool(boolean hasSwimmingPool) {
	            this.hasSwimmingPool = hasSwimmingPool;
	            // returning this will give you the current object and you can call the object level method one by one
	            return this;
	        }

	        public House build() {
	            return new House(this);
	        }
	    }
	    @Override
	    public String toString() {
	        return "House{" +
	                "windows=" + windows +
	                ", doors=" + doors +
	                ", hasRoof=" + hasRoof +
	                ", hasGarage=" + hasGarage +
	                ", hasSwimmingPool=" + hasSwimmingPool +
	                '}';
	    }
}
