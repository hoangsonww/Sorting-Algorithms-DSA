# Art Museum Sorting Application

## Overview
This Java application is designed to manage and manipulate the artwork database of the Cleveland Museum of Art. It supports fundamental functionalities such as adding artworks to the database, sorting artworks based on various attributes (e.g., height, price, width, name, artistName), and generating random lists of artworks. The application utilizes advanced sorting algorithms, including Merge Sort, to efficiently organize the artworks.

## Features
- Add new artwork entries to the museum's database.
- Sort the artworks based on specified attributes in ascending or descending order.
- Generate random lists of artwork for display or analysis.
- Find artworks by a specific artist.
- Implement a specialized random sort that organizes artworks into categories based on multiple attributes.

## Prerequisites
- Java Development Kit (JDK) 11 or higher.

## Setup and Installation
1. Ensure Java is installed on your system. You can download JDK from the [Oracle website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
2. Clone this repository to your local machine using `git clone <repository-url>`.
3. Compile the Java files from your terminal or command prompt:
    ```bash
    javac ArtMuseum.java Art.java
    ```
4. Run the application:
    ```bash
    java ArtMuseum
    ```
5. There is also a comprehensive testing file, created with JUnit. Feel free to run it to test through the program:
   ```bash
   java Tester
   ```

## Usage
### Adding Artworks
To add artworks to the database, you'll need to instantiate `Art` objects and add them to an `ArtMuseum` instance using the `add` method.

### Sorting Artworks
You can sort the museum's artwork database by invoking the `sort` method on an `ArtMuseum` instance, specifying the attribute to sort by (e.g., `height`, `price`, `width`, `name`, `artistName`) and the direction of the sort (`positive` for ascending, `negative` for descending).

### Generating Random Art Lists
Invoke the `randomizeArts` method on an `ArtMuseum` instance, specifying the number of random artworks to generate.

### Finding Artworks by Artist
Use the `findArts` method to retrieve all artworks by a specific artist from the museum's database.

## Contributing
Contributions to the project are welcome. Please fork the repository, make your changes, and submit a pull request with a detailed description of your additions or changes.

---

Created with ❤️ by [Son Nguyen](https://github.com/hoangsonww) in 2023.