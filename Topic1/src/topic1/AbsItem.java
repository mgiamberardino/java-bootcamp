/**
 * 
 */
package topic1;


/**
 * @author Mau Giam
 *
 */
public abstract class AbsItem implements IItem {

	protected String code;
	protected String name;
	
	/**
	 * @param code
	 * @param name
	 */
	public AbsItem(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	
	/**
	 * Empty Constructor
	 */
	public AbsItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}


	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
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
	
}
