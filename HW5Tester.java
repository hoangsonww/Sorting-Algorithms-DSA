import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * A class that functions as an automated tester for all classes and methods for Homework 5.
 *
 * @author David Nguyen
 * @since 04/16/2023
 * @version 1.0
 */
public class HW5Tester {

    // Field that represents a test museum of the ArtMuseum type
    private ArtMuseum museum1;

    /**
     * Sets up the tests for various methods
     */
    @Before
    public void setUpAndTestAdd() {
        museum1 = new ArtMuseum("The Cleveland Museum of Art");
        museum1.add(new Art(50, 1000, 40, "Mona Lisa", "Leonardo da Vinci"));
        museum1.add(new Art(60, 800, 30, "The Starry Night", "Vincent van Gogh"));
        museum1.add(new Art(40, 1200, 35, "The Persistence of Memory", "Salvador Dali"));
        museum1.add(new Art(45, 700, 25, "The Scream", "Edvard Munch"));
        museum1.add(new Art(50, 1000, 30, "Primavera", "Sandro Botticelli"));
    }

    /**
     * Test the sort() method - by height in ascending order
     */
    @Test
    public void testSortByHeightAscending() {
        List<Art> sortedByHeightAscending = museum1.sort("height", 1);
        assertEquals("The Persistence of Memory", sortedByHeightAscending.get(0).getName());
        assertEquals("The Scream", sortedByHeightAscending.get(1).getName());
        assertEquals("Mona Lisa", sortedByHeightAscending.get(2).getName());
        assertEquals("Primavera", sortedByHeightAscending.get(3).getName());
        assertEquals("The Starry Night", sortedByHeightAscending.get(4).getName());
    }

    /**
     * Test the sort() method - by height in descending order
     */
    @Test
    public void testSortByHeightDescending() {
        List<Art> sortedByHeightDescending = museum1.sort("height", -1);
        assertEquals("The Starry Night", sortedByHeightDescending.get(0).getName());
        assertEquals("Mona Lisa", sortedByHeightDescending.get(1).getName());
        assertEquals("Primavera", sortedByHeightDescending.get(2).getName());
        assertEquals("The Scream", sortedByHeightDescending.get(3).getName());
        assertEquals("The Persistence of Memory", sortedByHeightDescending.get(4).getName());
    }

    /**
     * Test the sort() method - by price in ascending order
     */
    @Test
    public void testSortByPriceAscending() {
        List<Art> sortedByPriceAscending = museum1.sort("price", 1);
        assertEquals("The Scream", sortedByPriceAscending.get(0).getName());
        assertEquals("The Starry Night", sortedByPriceAscending.get(1).getName());
        assertEquals("Mona Lisa", sortedByPriceAscending.get(2).getName());
        assertEquals("Primavera", sortedByPriceAscending.get(3).getName());
        assertEquals("The Persistence of Memory", sortedByPriceAscending.get(4).getName());
    }

    /**
     * Test the sort() method - by price in descending order
     */
    @Test
    public void testSortByPriceDescending() {
        List<Art> sortedByPriceDescending = museum1.sort("price", -1);
        assertEquals("The Persistence of Memory", sortedByPriceDescending.get(0).getName());
        assertEquals("Mona Lisa", sortedByPriceDescending.get(1).getName());
        assertEquals("Primavera", sortedByPriceDescending.get(2).getName());
        assertEquals("The Starry Night", sortedByPriceDescending.get(3).getName());
        assertEquals("The Scream", sortedByPriceDescending.get(4).getName());
    }

    /**
     * Test the sort() method - by width in ascending order
     */
    @Test
    public void testSortByWidthAscending() {
        List<Art> sortedByWidthAscending = museum1.sort("width", 1);
        assertEquals("The Scream", sortedByWidthAscending.get(0).getName());
        assertEquals("The Starry Night", sortedByWidthAscending.get(1).getName());
        assertEquals("Primavera", sortedByWidthAscending.get(2).getName());
        assertEquals("The Persistence of Memory", sortedByWidthAscending.get(3).getName());
        assertEquals("Mona Lisa", sortedByWidthAscending.get(4).getName());
    }

    /**
     * Test the sort() method - by width in descending order
     */
    @Test
    public void testSortByWidthDescending() {
        List<Art> sortedByWidthDescending = museum1.sort("width", -1);
        assertEquals("Mona Lisa", sortedByWidthDescending.get(0).getName());
        assertEquals("The Persistence of Memory", sortedByWidthDescending.get(1).getName());
        assertEquals("The Starry Night", sortedByWidthDescending.get(2).getName());
        assertEquals("Primavera", sortedByWidthDescending.get(3).getName());
        assertEquals("The Scream", sortedByWidthDescending.get(4).getName());
    }

    /**
     * Test the sort() method - by name in ascending order
     */
    @Test
    public void testSortByNameAscending() {
        List<Art> sortedByNameAscending = museum1.sort("name", 1);
        assertEquals("Mona Lisa", sortedByNameAscending.get(0).getName());
        assertEquals("Primavera", sortedByNameAscending.get(1).getName());
        assertEquals("The Persistence of Memory", sortedByNameAscending.get(2).getName());
        assertEquals("The Scream", sortedByNameAscending.get(3).getName());
        assertEquals("The Starry Night", sortedByNameAscending.get(4).getName());
    }

    /**
     * Test the sort() method - by name in descending order
     */
    @Test
    public void testSortByNameDescending() {
        List<Art> sortedByNameDescending = museum1.sort("name", -1);
        assertEquals("The Starry Night", sortedByNameDescending.get(0).getName());
        assertEquals("The Scream", sortedByNameDescending.get(1).getName());
        assertEquals("The Persistence of Memory", sortedByNameDescending.get(2).getName());
        assertEquals("Primavera", sortedByNameDescending.get(3).getName());
        assertEquals("Mona Lisa", sortedByNameDescending.get(4).getName());
    }

    /**
     * Test the sort() method - by artist's name in ascending order
     */
    @Test
    public void testSortByArtistNameAscending() {
        List<Art> sortedByArtistName = museum1.sort("artistName", 1);
        assertEquals("Edvard Munch", sortedByArtistName.get(0).getArtistName());
        assertEquals("Leonardo da Vinci", sortedByArtistName.get(1).getArtistName());
        assertEquals("Salvador Dali", sortedByArtistName.get(2).getArtistName());
        assertEquals("Sandro Botticelli", sortedByArtistName.get(3).getArtistName());
        assertEquals("Vincent van Gogh", sortedByArtistName.get(4).getArtistName());
    }

    /**
     * Test the sort() method - by artist's name in descending order
     */
    @Test
    public void testSortByArtistNameDescending() {
        List<Art> sortedByArtistName = museum1.sort("artistName", -1);
        assertEquals("Vincent van Gogh", sortedByArtistName.get(0).getArtistName());
        assertEquals("Sandro Botticelli", sortedByArtistName.get(1).getArtistName());
        assertEquals("Salvador Dali", sortedByArtistName.get(2).getArtistName());
        assertEquals("Leonardo da Vinci", sortedByArtistName.get(3).getArtistName());
        assertEquals("Edvard Munch", sortedByArtistName.get(4).getArtistName());
    }

    /**
     * Test if the sort() method will throw an exception
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSortIllegalArgument() {
        museum1.sort("invalidAttribute", -1);
    }

    // Field that represents another test ArtMuseum object for extra test
    private ArtMuseum museum;

    /**
     * Sets up the ArtMuseum object for the testing of findArts() method
     */
    @Before
    public void setUpForFindArtsTests() {
        museum = new ArtMuseum("Cleveland Museum of Art");
        museum.add(new Art(50, 1000, 40, "Mona Lisa", "Leonardo da Vinci"));
        museum.add(new Art(60, 800, 30, "The Starry Night", "Vincent van Gogh"));
        museum.add(new Art(40, 1200, 35, "The Persistence of Memory", "Salvador Dali"));
        museum.add(new Art(45, 700, 25, "The Bedroom", "Vincent van Gogh"));
        museum.add(new Art(55, 900, 45, "Sunflowers", "Vincent van Gogh"));
    }

    /**
     * Testing the findArts() method
     */
    @Test
    public void testFindArts() {
        // CASE 1: Test if the given artist has more than 1 artwork in the museum
        List<Art> foundArts = museum.findArts("Vincent van Gogh");
        List<String> expectedArtNames = new ArrayList<String>();
        expectedArtNames.add("The Starry Night");
        expectedArtNames.add("Sunflowers");
        expectedArtNames.add("The Bedroom");
        assertEquals(expectedArtNames.size(), foundArts.size());
        for (Art art : foundArts) {
            assertTrue(expectedArtNames.contains(art.getName()));
        }
        // CASE 2: Test if the given artist has 0 artworks in the museum
        List<Art> notFoundArts = museum.findArts("Nonexistent Artist");
        assertTrue(notFoundArts.isEmpty());
        // CASE 3: Test if the given artist has 0 artworks in the museum
        List<Art> emptyArtistNameArts = museum.findArts("");
        assertTrue(emptyArtistNameArts.isEmpty());
        List<String> expectedArtNames1 = new ArrayList<String>();
        // CASE 4: Test if the given artist has exactly 1 artwork in the museum
        List<Art> foundArts1 = museum.findArts("Leonardo da Vinci");
        expectedArtNames1.add("Mona Lisa");
        assertEquals(expectedArtNames1.size(), foundArts1.size());
        for (Art art : foundArts1) {
            assertTrue(expectedArtNames1.contains(art.getName()));
        }
    }

    /**
     * Extra testing the findArts() method:
     */
    @Test
    public void extraTestFindArts() {
        ArtMuseum artMuseum = new ArtMuseum("BRUH BRUH BRUH BRUH");
        artMuseum.add(new Art(60, 60, 60, "hmm", "Artist1"));
        artMuseum.add(new Art(60, 60, 60, "hmm", "Artist1"));
        artMuseum.add(new Art(60, 60, 60, "hmm", "Artist3"));
        artMuseum.add(new Art(60, 60, 60, "hmm", "Artist3"));
        artMuseum.add(new Art(60, 60, 60, "hmm", "Artist3"));
        artMuseum.add(new Art(60, 60, 60, "hmm", "Artist4"));
        // Test for artistName not found
        List<Art> arts = artMuseum.findArts("Unknown Artist");
        assertNotNull(arts);
        assertEquals(0, arts.size());
        // Test for artistName found
        arts = artMuseum.findArts("Artist1");
        assertNotNull(arts);
        assertEquals(2, arts.size());
        // Test for case sensitivity
        arts = artMuseum.findArts("artist2");
        assertNotNull(arts);
        assertEquals(0, arts.size());
        // Test for matching artistName in a list with multiple Arts
        arts = artMuseum.findArts("Artist3");
        assertNotNull(arts);
        assertEquals(3, arts.size());
        // Test for matching artistName with only one Art object
        arts = artMuseum.findArts("Artist4");
        assertNotNull(arts);
        assertEquals(1, arts.size());
        // Test for input artistName being null
        arts = artMuseum.findArts(null);
        assertNotNull(arts);
        assertEquals(0, arts.size());
    }

    /**
     * Test the various (sort, findArts, randomizeArts, randomSort) methods with an empty museum:
     */
    @Test
    public void testMethodsWithEmptyMuseum() {
        ArtMuseum emptyMuseum = new ArtMuseum("Empty Museum");
        List<Art> emptySortedArts = emptyMuseum.sort("height", 1);
        assertTrue(emptySortedArts.isEmpty());
        List<Art> emptyFoundArts = emptyMuseum.findArts("Leonardo da Vinci");
        assertTrue(emptyFoundArts.isEmpty());
        List<Art> emptyRandomizedArts = emptyMuseum.randomizeArts(0);
        assertTrue(emptyRandomizedArts.isEmpty());
        List<Art> emptyRandomizedArts1 = emptyMuseum.randomizeArts(-1);
        assertTrue(emptyRandomizedArts1.isEmpty());
        List<Art> randomlySortedEmpty = emptyMuseum.randomSort(new ArrayList<Art>());
        assertTrue(randomlySortedEmpty.isEmpty());
    }

    /**
     * Test the randomizeArts() method:
     */
    @Test
    public void testRandomizeArts() {
        List<Art> randomArts = museum1.randomizeArts(6);
        assertEquals(6, randomArts.size());
        assertNotNull(randomArts.get(0));
        assertNotNull(randomArts.get(1));
        assertNotNull(randomArts.get(2));
        assertNotNull(randomArts.get(3));
        assertNotNull(randomArts.get(4));
        assertNotNull(randomArts.get(5));
    }

    /**
     * Extra testing the randomizeArts() method:
     */
    @Test
    public void extraTestRandomizeArts() {
        // CASE 1: Test randomizing arts with positive n
        List<Art> randomArts = museum1.randomizeArts(5);
        assertEquals(5, randomArts.size());
        // Test the uniqueness of the newly, randomly generated art names and artist names
        Set<String> randomNames = new HashSet<String>();
        Set<String> randomArtistNames = new HashSet<String>();
        for (Art art : randomArts) {
            randomNames.add(art.getName());
            randomArtistNames.add(art.getArtistName());
        }
        assertEquals(5, randomNames.size());
        assertEquals(5, randomArtistNames.size());
        // CASE 2: Test randomizing arts with n = 0
        List<Art> emptyRandomArts = museum1.randomizeArts(0);
        assertTrue(emptyRandomArts.isEmpty());
        // CASE 3: Test randomizing arts with negative n
        List<Art> negativeRandomArts = museum1.randomizeArts(-5);
        assertTrue(negativeRandomArts.isEmpty());
    }

    /**
     * Test the randomSort() method
     */
    @Test
    public void testRandomSort() {
        ArtMuseum museum2 = new ArtMuseum("CLE CLE CLE");
        Art art1 = new Art(60, 50, 40, "name1", "artist1");
        Art art2 = new Art(50, 50, 40, "name2", "artist1");
        Art art3 = new Art(60, 50, 40, "name3", "artist1");
        Art art4 = new Art(60, 40, 40, "name4", "artist1");
        Art art5 = new Art(60, 50, 40, "name5", "artist1");
        Art art6 = new Art(60, 50, 20, "name6", "artist1");
        Art art7 = new Art(60, 50, 40, "name7", "artist1");
        Art art8 = new Art(60, 50, 40, "name8", "artist1");
        Art art9 = new Art(60, 50, 40, "name9", "artist2");
        Art art10 = new Art(60, 50, 40, "name10", "artist1");
        Art art11 = new Art(60, 50, 40, "name11", "artist3");
        Art art12 = new Art(60, 50, 40, "name12", "artist4");
        // Case 1: Test the case where the given list of arts has fewer than 5 Art objects:
        List<Art> testFewerThan5 = new ArrayList<>();
        testFewerThan5.add(art1);
        testFewerThan5.add(art2);
        testFewerThan5.add(art3);
        List<Art> sortedListFewerThan5 = museum2.randomSort(testFewerThan5);
        assertEquals(art1, sortedListFewerThan5.get(0));
        assertEquals(art2, sortedListFewerThan5.get(1));
        assertEquals(art3, sortedListFewerThan5.get(2));
        // Case 2: Test the case where the given list has more than 5 Art objects but is divisible by 5:
        List<Art> testMoreThan5Divisible = new ArrayList<Art>();
        testMoreThan5Divisible.add(art1);
        testMoreThan5Divisible.add(art2);
        testMoreThan5Divisible.add(art3);
        testMoreThan5Divisible.add(art4);
        testMoreThan5Divisible.add(art5);
        testMoreThan5Divisible.add(art6);
        testMoreThan5Divisible.add(art7);
        testMoreThan5Divisible.add(art8);
        testMoreThan5Divisible.add(art9);
        testMoreThan5Divisible.add(art10);
        List<Art> sortedListMoreThan5Divisible = museum2.randomSort(testMoreThan5Divisible);
        assertEquals(art2, sortedListMoreThan5Divisible.get(0));
        assertEquals(art1, sortedListMoreThan5Divisible.get(1));
        assertEquals(art4, sortedListMoreThan5Divisible.get(2));
        assertEquals(art3, sortedListMoreThan5Divisible.get(3));
        assertEquals(art6, sortedListMoreThan5Divisible.get(4));
        assertEquals(art5, sortedListMoreThan5Divisible.get(5));
        assertEquals(art7, sortedListMoreThan5Divisible.get(6));
        assertEquals(art8, sortedListMoreThan5Divisible.get(7));
        assertEquals(art10, sortedListMoreThan5Divisible.get(8));
        assertEquals(art9, sortedListMoreThan5Divisible.get(9));
        // Case 3: Test the case where the given list has more than 5 Art objects but is NOT divisible by 5:
        List<Art> testMoreThan5NotDivisible = new ArrayList<Art>();
        testMoreThan5NotDivisible.add(art1);
        testMoreThan5NotDivisible.add(art2);
        testMoreThan5NotDivisible.add(art3);
        testMoreThan5NotDivisible.add(art4);
        testMoreThan5NotDivisible.add(art5);
        testMoreThan5NotDivisible.add(art6);
        testMoreThan5NotDivisible.add(art7);
        testMoreThan5NotDivisible.add(art8);
        testMoreThan5NotDivisible.add(art9);
        testMoreThan5NotDivisible.add(art10);
        testMoreThan5NotDivisible.add(art11);
        testMoreThan5NotDivisible.add(art12);
        List<Art> sortedListMoreThan5NotDivisible = museum2.randomSort(testMoreThan5NotDivisible);
        assertEquals(art2, sortedListMoreThan5NotDivisible.get(0));
        assertEquals(art1, sortedListMoreThan5NotDivisible.get(1));
        assertEquals(art4, sortedListMoreThan5NotDivisible.get(2));
        assertEquals(art3, sortedListMoreThan5NotDivisible.get(3));
        assertEquals(art6, sortedListMoreThan5NotDivisible.get(4));
        assertEquals(art5, sortedListMoreThan5NotDivisible.get(5));
        assertEquals(art7, sortedListMoreThan5NotDivisible.get(6));
        assertEquals(art8, sortedListMoreThan5NotDivisible.get(7));
        assertEquals(art10, sortedListMoreThan5NotDivisible.get(8));
        assertEquals(art9, sortedListMoreThan5NotDivisible.get(9));
        assertEquals(art11, sortedListMoreThan5NotDivisible.get(10));
        assertEquals(art12, sortedListMoreThan5NotDivisible.get(11));
    }

    // EXTRA TESTING THE RANDOMSORT() METHOD:

    // A field that stores a temporary museum for the extra testing of the randomSort() method:
    ArtMuseum museum3 = new ArtMuseum("CLE CLE CLE");

    /**
     * Sets up the museum for the extra testing of randomSort()
     */
    @Before
    public void setUp() {
        museum3 = new ArtMuseum("Cleveland Museum of Art");
    }

    /**
     * Test the randomSort() method with an empty list of Art objects
     */
    @Test
    public void testEmptyRandomSort() {
        List<Art> arts = new ArrayList<Art>();
        List<Art> randomlySorted = museum3.randomSort(arts);
        assertEquals(new ArrayList<Art>(), randomlySorted);
    }

    /**
     * Test the randomSort() method with fewer than 5 Art objects
     */
    @Test
    public void testRandomSortLessThan5() {
        List<Art> arts = new ArrayList<Art>();
        arts.add(new Art(10, 5000, 20, "Artwork 1", "Artist A"));
        arts.add(new Art(20, 2000, 30, "Artwork 2", "Artist B"));
        List<Art> sortedArts = museum3.randomSort(arts);
        assertEquals(2, sortedArts.size());
        assertEquals("Artwork 1", sortedArts.get(0).getName());
        assertEquals("Artwork 2", sortedArts.get(1).getName());
    }

    /**
     * Test the randomSort() method with exactly 5 Art objects
     */
    @Test
    public void testRandomSortExactly5() {
        List<Art> arts = new ArrayList<Art>();
        arts.add(new Art(10, 5000, 20, "Artwork 1", "Artist A"));
        arts.add(new Art(20, 2000, 30, "Artwork 2", "Artist B"));
        arts.add(new Art(30, 3000, 10, "Artwork 3", "Artist C"));
        arts.add(new Art(40, 1000, 40, "Artwork 4", "Artist A"));
        arts.add(new Art(50, 4000, 50, "Artwork 5", "Artist B"));
        List<Art> sortedArts = museum3.randomSort(arts);
        assertEquals(5, sortedArts.size());
        assertEquals("Artwork 1", sortedArts.get(0).getName());
        assertEquals("Artwork 2", sortedArts.get(1).getName());
        assertEquals("Artwork 3", sortedArts.get(2).getName());
        assertEquals("Artwork 4", sortedArts.get(3).getName());
        assertEquals("Artwork 5", sortedArts.get(4).getName());
    }

    /**
     * Test the randomSort() method with more than 5 Art objects
     */
    @Test
    public void testRandomSortMoreThan5() {
        List<Art> arts = new ArrayList<Art>();
        arts.add(new Art(10, 5000, 20, "Artwork 1", "Artist A"));
        arts.add(new Art(20, 2000, 30, "Artwork 2", "Artist B"));
        arts.add(new Art(30, 3000, 10, "Artwork 3", "Artist C"));
        arts.add(new Art(40, 1000, 40, "Artwork 4", "Artist A"));
        arts.add(new Art(50, 4000, 50, "Artwork 5", "Artist B"));
        arts.add(new Art(60, 6000, 60, "Artwork 6", "Artist C"));
        List<Art> sortedArts = museum3.randomSort(arts);
        assertEquals(6, sortedArts.size());
        assertEquals("Artwork 1", sortedArts.get(0).getName());
        assertEquals("Artwork 2", sortedArts.get(1).getName());
        assertEquals("Artwork 3", sortedArts.get(2).getName());
        assertEquals("Artwork 4", sortedArts.get(3).getName());
        assertEquals("Artwork 5", sortedArts.get(4).getName());
    }

    /**
     * Test the randomSort() method with a large list of 21 Art objects
     */
    @Test
    public void testRandomSort_largeList() {
        List<Art> arts = new ArrayList<>();
        for (int i = 1; i <= 21; i++) {
            arts.add(new Art(i, i * 1000, i * 10, "Artwork " + i, "Artist " + i));
        }
        List<Art> sortedArts = museum3.randomSort(arts);
        assertEquals(21, sortedArts.size());
        assertEquals("Artwork 1", sortedArts.get(0).getName());
        assertEquals("Artwork 2", sortedArts.get(1).getName());
        assertEquals("Artwork 3", sortedArts.get(2).getName());
        assertEquals("Artwork 4", sortedArts.get(3).getName());
        assertEquals("Artwork 5", sortedArts.get(4).getName());
        assertEquals("Artwork 6", sortedArts.get(5).getName());
        assertEquals("Artwork 7", sortedArts.get(6).getName());
        assertEquals("Artwork 8", sortedArts.get(7).getName());
        assertEquals("Artwork 9", sortedArts.get(8).getName());
        assertEquals("Artwork 10", sortedArts.get(9).getName());
        assertEquals("Artwork 11", sortedArts.get(10).getName());
        assertEquals("Artwork 12", sortedArts.get(11).getName());
        assertEquals("Artwork 13", sortedArts.get(12).getName());
        assertEquals("Artwork 14", sortedArts.get(13).getName());
        assertEquals("Artwork 15", sortedArts.get(14).getName());
        assertEquals("Artwork 16", sortedArts.get(15).getName());
        assertEquals("Artwork 17", sortedArts.get(16).getName());
        assertEquals("Artwork 18", sortedArts.get(17).getName());
        assertEquals("Artwork 19", sortedArts.get(18).getName());
        assertEquals("Artwork 20", sortedArts.get(19).getName());
        assertEquals("Artwork 21", sortedArts.get(20).getName());
    }

    // EXTRA TESTING THE ADD() METHOD:

    // Field that represents another test museum for the extra test of add()
    private ArtMuseum museum5 = new ArtMuseum("Test Museum #2");

    /**
     * Performs an extra test on the add() method:
     */
    @Test
    public void extraTestAdd() {
        Art art1 = new Art(30, 2000, 40, "Art1", "ArtistA");
        Art art2 = new Art(20, 1000, 50, "Art2", "ArtistB");
        Art art3 = null;
        // CASE 1: Test adding a valid Art object
        assertTrue(museum5.add(art1));
        // CASE 2: Test adding another valid Art object
        assertTrue(museum5.add(art2));
        // CASE 3: Test adding a null Art object (should return false)
        assertFalse(museum5.add(art3));
        assertFalse(museum5.add(null));
    }

    /**
     * Extra testing the randomizeArts() method (yes, once more!):
     */
    @Test
    public void anotherExtraTestOfRandomizeArts() {
        ArtMuseum museum2 = new ArtMuseum("BRUH");
        // Case 1: Test for n <= 0
        List<Art> arts = museum2.randomizeArts(-1);
        assertEquals(0, arts.size());
        // Case 2: Test for n = 0
        arts = museum2.randomizeArts(0);
        assertEquals(0, arts.size());
        // Case 3: Test for n = 1
        arts = museum2.randomizeArts(1);
        assertEquals(1, arts.size());
        assertTrue(arts.get(0) instanceof Art);
        // Case 4: Test for n > 1
        arts = museum2.randomizeArts(5);
        assertEquals(5, arts.size());
        // Case 5 (Extra): Test that each Art object is unique
        for (int i = 0; i < arts.size(); i++) {
            for (int j = i + 1; j < arts.size(); j++) {
                assertNotSame(arts.get(i), arts.get(j));
            }
        }
        // Case 6 (Extra): Test that each Art object has unique attributes
        for (Art art : arts) {
            assertNotNull(art.getName());
            assertNotNull(art.getArtistName());
            assertNotEquals(0, art.getPrice());
            assertNotEquals(0, art.getWidth());
            assertNotEquals(0, art.getHeight());
        }
        /*
         * Case 7 (Extra): Test that the database list is not modified and that the new, random list is independent of
         * the database list:
         */
        List<Art> artsInDatabase = new ArrayList<Art>();
        Art art1 = new Art(60, 50, 80, "Bruh1", "NoName1");
        Art art2 = new Art(60, 50, 90, "Bruh2", "NoName2");
        // Since there is no public getter for the database of ArtMuseum available, we'll have to create a new list that
        // contains the same Art objects that points to the same memory locations as the database of ArtMuseum:
        artsInDatabase.add(art1);
        artsInDatabase.add(art2);
        museum2.add(art2);
        museum2.add(art1);
        List<Art> newArts = museum2.randomizeArts(2);
        assertNotSame(artsInDatabase, newArts);
        assertEquals(artsInDatabase.size(),newArts.size());
    }

    // TESTING THE METHODS OF THE ART CLASS:

    /**
     * Test the setHeight() method of Art:
     */
    @Test
    public void testSetHeightOfArt() {
        Art art = new Art(50, 1000, 40, "Mona Lisa", "Leonardo da Vinci");
        art.setHeight(60);
        assertEquals(60, art.getHeight());
    }

    /**
     * Test the setPrice() method of Art:
     */
    @Test
    public void testSetPriceOfArt() {
        Art art = new Art(50, 1000, 40, "Mona Lisa", "Leonardo da Vinci");
        art.setPrice(1200);
        assertEquals(1200, art.getPrice());
    }

    /**
     * Test the setWidth() method of Art:
     */
    @Test
    public void testSetWidthOfArt() {
        Art art = new Art(50, 1000, 40, "Mona Lisa", "Leonardo da Vinci");
        art.setWidth(50);
        assertEquals(50, art.getWidth());
    }

    /**
     * Test the setName() method of Art:
     */
    @Test
    public void testSetNameOfArt() {
        Art art = new Art(50, 1000, 40, "Mona Lisa", "Leonardo da Vinci");
        art.setName("");
        assertEquals("", art.getName());
    }

    /**
     * Test the setArtistName() method of Art:
     */
    @Test
    public void testSetNameOfArtist() {
        Art art = new Art(50, 1000, 40, "Mona Lisa", "Leonardo da Vinci");
        art.setArtistName("");
        assertEquals("", art.getArtistName());
    }

}