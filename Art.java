/**
 * A class that represents and functions as an Art object
 *
 * @author David Nguyen
 * @since 04/16/2023
 * @version 1.0
 */
public class Art {

    // A field that stores the height of the artwork object
    private int height;

    // A field that stores the price of the artwork object
    private int price;

    // A field that stores the width of the artwork object
    private int width;

    // A field that stores the name of the artwork object
    private String name;

    // A field that stores the artist's name of the artwork object
    private String artistName;

    /**
     * A constructor that creates an Art object with the specified height, price, width, name, and artist's name
     * attributes and initializes all the necessary fields.
     *
     * @param height Specified height of the Art object
     * @param price Specified price of the Art object
     * @param width Specified width of the Art object
     * @param name Specified name of the Art object
     * @param artistName Specified artist's name of the Art object
     */
    public Art(int height, int price, int width, String name, String artistName) {
        // Initializes the 'height' field
        this.height = height;
        // Initializes the 'price' field
        this.price = price;
        // Initializes the 'width' field
        this.width = width;
        // Initializes the 'name' field
        this.name = name;
        // Initializes the 'artistName' field
        this.artistName = artistName;
    }

    /**
     * Getter method for the height attribute of the Art object.
     *
     * @return The height of the Art object
     */
    protected int getHeight() {
        return this.height;
    }

    /**
     * Getter method for the price attribute of the Art object.
     *
     * @return The price of the Art object
     */
    protected int getPrice() {
        return this.price;
    }

    /**
     * Getter method for the width attribute of the Art object.
     *
     * @return The width of the Art object
     */
    protected int getWidth() {
        return this.width;
    }

    /**
     * Getter method for the artist's name attribute of the Art object.
     *
     * @return The artist's name of the Art object
     */
    protected String getArtistName() {
        return this.artistName;
    }

    /**
     * Getter method for the name attribute of the Art object.
     *
     * @return The name of the Art object
     */
    protected String getName() {
        return this.name;
    }

    /**
     * Setter method for the height attribute of the Art object.
     *
     * @param height The new, specified height of the Art object
     */
    protected void setHeight(int height) {
        this.height = height;
    }

    /**
     * Setter method for the width attribute of the Art object.
     *
     * @param width The new, specified width of the Art object
     */
    protected void setWidth(int width) {
        this.width = width;
    }

    /**
     * Setter method for the name attribute of the Art object.
     *
     * @param name The new, specified name of the Art object
     */
    protected void setName(String name) {
        this.name = name;
    }

    /**
     * Setter method for the price attribute of the Art object.
     *
     * @param price The new, specified price of the Art object
     */
    protected void setPrice(int price) {
        this.price = price;
    }

    /**
     * Setter method for the artistName attribute of the Art object.
     *
     * @param artistName The new, specified artistName of the Art object
     */
    protected void setArtistName(String artistName) {
        this.artistName = artistName;
    }

}