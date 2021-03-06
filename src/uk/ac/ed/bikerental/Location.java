package uk.ac.ed.bikerental;

/**
 * This class is used to encapsulate post code and address as its {@link String} attributes.
 */

public class Location {

/**
 * This is post code.    
 */
    private String postcode;
    
/**
 * This is address.    
 */
    
    private String address;
    
/**
 * Creates new object Location with post code and address as {@link String} attributes.
 *   
 * @param postcode stores post code of the location as {@link String}
 *        <b>Note:</b> postcode.length() must be >=6
 * @param address stores address of the location as {@link String}
 */ 
    public Location(String postcode, String address) {
        assert postcode.length() >= 6;
        this.postcode = postcode;
        this.address = address;
    }
    
/**
 * Compares the first two characters of the this.postcode to other.getPostcode()
 * and returns true if they are equal else returns false.
 *     
 * @param other is the second Location to perform comparison with.
 * @return boolean depending on equality of the first two characters of the post codes.
 */
    public boolean isNearTo(Location other) {
       
       if (postcode.charAt(0)!=other.getPostcode().charAt(0)) {
           return false;
       }
       
       if (postcode.charAt(1)!=other.getPostcode().charAt(1)) {
           return false;
       }
        
        return true;
    }
    
    /**
     * @return this.postcode as {@link String}
     */
    public String getPostcode() {
        return this.postcode;
    }
    
    /**
     * @return this.address as {@link String}
     */
    public String getAddress() {
        return this.address;
    }
    
    

}
