package Day05.multilevelinheritancedemo;

// to demonstrate multilevel inheritance- parent class 
class Country {
    //data members
    private String countryName;
    private long population;
    private String capital;

    //getters and setters
    public String getCountryName(){
        return countryName;
    } 
    public void setCountryName(String countryName){
        this.countryName = countryName;
    }
    public long getPopulation(){
        return population;
    }
    public void setPopulation(long population)
    {
        this.population = population;
    }
    public String getCapital(){
        return capital;
    }
    public void setCapital(String capital){
        this.capital = capital;
    }
    //object class method
    @Override
    public String toString(){
        return "Country [ countryName= "+ countryName + ", population= "+population+", capital= "+capital+"]";

    }
}
