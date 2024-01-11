package Day05.multilevelinheritancedemo;

class MultiLevelInhertanceDemo {
	public static void main(String[] args) {
		City obj=new City();
		//obj.countryName="India"; //private members can't accessible
		
		obj.setCityName("Mumbai");
		obj.setPlaces("Gateway of India");
		obj.setArea(34555.77f);
		obj.setStateName("Maharashtra");
		obj.setFestival("Diwali");
		obj.setLanguage("Marathi");
		obj.setPopulation(3333000L);
		obj.setCapital("Nee Delhi");
		obj.setCountryName("India");
		
		System.out.println(obj);

	}

}
