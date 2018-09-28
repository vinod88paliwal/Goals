package com.collectios.basics;

public enum Currency implements Runnable{
    PENNY(1) {
            @Override
            public String color() {
                    return "copper";
            }
    }, NICKLE(5) {
            @Override
            public String color() {
                    return "bronze";
            }
    }, DIME(10) {
            @Override
            public String color() {
                    return "silver";
            }
    }, QUARTER(25) {
            @Override
            public String color() {
                    return "silver";
            }
    };
	
	
    private int value;
    public abstract String color();
  
    private Currency(int value) {
            this.value = value;
    }
    @Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
    
    public static void main(String[] args) {

    	System.out.println("Color: " + Currency.DIME.color());
    }
}      
