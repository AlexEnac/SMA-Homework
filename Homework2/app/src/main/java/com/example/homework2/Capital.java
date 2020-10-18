package com.example.homework2;

public class Capital {
    private String capitalCity;
    private String capitalCountry;

    public Capital(String capitalCity, String capitalCountry) {
        this.capitalCity = capitalCity;
        this.capitalCountry = capitalCountry;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public String getCapitalCountry() {
        return capitalCountry;
    }

    public void setCapitalCountry(String capitalCountry) {
        this.capitalCountry = capitalCountry;
    }
}
