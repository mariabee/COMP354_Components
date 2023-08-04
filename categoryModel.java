import java.util.ArrayList;
public class categoryModel 
{
	int Id;
	String name;
	String description;
	ArrayList<categoryModel> category; 
	ArrayList<String> Items;
	
	
	categoryModel(String name, int Id, String description)
	{
		this.name= name;
		this.Id=Id;
		this.description=description;
		
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		Id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	void addItem(ArrayList<categoryModel> category,ArrayList<String> Items)
	{
		
	}
	
	boolean isIn(ArrayList<categoryModel> category,ArrayList<String> Item)
	{
		if (category.contains(Item))
			return true;
		return false;
	}
	boolean isempty(ArrayList<categoryModel> category)
	{
		if (category.isEmpty())
			return true;
		return false;
	}
	void clear(ArrayList<categoryModel> category)
	{
		category.clear();
	}

}
