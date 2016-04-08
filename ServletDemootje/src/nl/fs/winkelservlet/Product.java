package nl.fs.winkelservlet;

public class Product{
	private String name;
	private String imgURL;
	private int ID;
	
	public Product(String name, String img, int id){
		this.name = name;
		this.imgURL = img;
		this.ID = id;
	}
	
	public String getImgUrl(){
		
		return this.imgURL;
	}
	public String getName(){
		
		return this.name;
	}
	public int getID(){
		
		return this.ID;
	}
	
	
}