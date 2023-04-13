package Builder;

public class PlantBuilder {
	
	private int id;
	private int age ;
	private int size;
	private String color;
	private String ScientificName;
	private String climate;
	private String lighPreference;
	private String lightPreference;
	

	
	
public PlantBuilder setId(int id) {		
		this.id = id	;
		return this;	
}
	
public PlantBuilder setAge(int Age) {		
		this.age = Age;
		return this;	
}	

public PlantBuilder setSize(int size) {		
	this.size = size;
	return this;
}

public PlantBuilder setScientificName(String ScientificName) {		
	this.ScientificName = ScientificName;
	return this;
}

public PlantBuilder setClimate(String climate) {		
	this.climate = climate;
	return this;
}

public PlantBuilder setColor(String color) {		
	this.color = color;
	return this;
}

public PlantBuilder setlightPreference(String lighPreference) {		
	this.lighPreference = lighPreference;
	return this;
}




public Plant build() {
	
	Plant plant = new Plant();
	
	plant.setId(this.id);
	plant.setAge(this.age);
	plant.setSize(this.size);
	plant.setClimate(this.climate);
	plant.setScientificName(this.ScientificName);
	
	plant.setColor(this.color);
	plant.setlightPreference(this.lightPreference);
	
	return plant;
}
	
}
