import java.util.Random;
import java.util.ArrayList;
import java.util.List;

/**
 * A class that represents and functions as an art museum. It can manage the database of the Cleveland Museum of Art's
 * artworks and support some of its fundamental functionalities such as art sorting and randomizing.
 *
 * @author David Nguyen
 * @since 04/16/2023
 * @version 1.0
 */
public class ArtMuseum {

    // A field that stores the name of the museum
    private String nameOfMuseum;

    // A field that stores the list of the artwork objects for the museum
    private List<Art> listOfArtworks;

    /**
     * A constructor that creates an arts museum and initialize all the necessary fields.
     *
     * @param museumName The specified name of the arts museum.
     */
    public ArtMuseum(String museumName) {
        // Initialize the 'museumName' attribute
        this.nameOfMuseum = museumName;
        // Initialize the 'artCollection' attribute
        this.listOfArtworks = new ArrayList<Art>();
    }

    /**
     * A method that adds an Art object to the arts museum.
     *
     * @param art The Art object to be added to the museum
     * @return True or False depending on whether the new art has been successfully added to the museum or not. Note that
     * if the Art object to be added is NULL, it will not be added and the method will return FALSE.
     */
    public boolean add(Art art) {
        // A variable that stores whether the addition of the Art object is successful or not
        boolean addSuccess = false;
        /*
         * If the given Art object is null, return false and not add the null object to the database because we want to
         * avoid potential NullPointerExceptions when accessing our database later on:
         */
        if (art == null) {
            // Sets addSuccess to false
            addSuccess = false;
            // Returns false to stop the method
            return addSuccess;
        }
        // Otherwise, addSuccess remains false
        else {
            ;
        }
        // If the addition of the new Art object to the database of the museum is successful, set addSuccess to true
        if (this.listOfArtworks.add(art) == true) {
            addSuccess = true;
        }
        // Otherwise, addSuccess remains false
        else {
            ;
        }
        // Return true or false depending on whether the Art object has been successfully added or not
        return addSuccess;
    }

    /**
     * A method that sorts the current collection of arts in ascending order if direction ≥ 0, or in descending order if
     * direction < 0, based on the attribute input into the function (height, price, width, names, OR artistName).
     * For your information, this function utilizes MERGE SORT in order to sort the Art objects.
     * Notice that "attribute" parameter must be in the list of height, price, width, names, OR artistName, else it will
     * throw an IllegalArgumentException. Also, if given names or artists' names, this method will sort the artworks by
     * the first character of the specified names, regardless of last or first names.
     *
     * @param attribute Any attribute to sort the Art objects with.
     * @param direction Any direction (positive or negative only) to sort the Art objects with (in ascending or descending
     *                  order, respectively.)
     * @return A sorted list of the arts or an empty list if there is currently no art in the database.
     * @throws IllegalArgumentException If the attribute specified is NOT height, price, width, names, OR artistName.
     */
    public List<Art> sort(String attribute, int direction) {
        /*
         * Check if the given attribute is in the valid list of: height, price, width, names, OR artistName.
         * If not, throw an IllegalArgumentException.
         */
        if (!attribute.equals("height") && !attribute.equals("price") && !attribute.equals("width")
                && !attribute.equals("name") && !attribute.equals("artistName")) {
            throw new IllegalArgumentException("The specified attribute is NOT an attribute our artworks have!");
        }
        // Otherwise, let the method continues as normal.
        else {
            ;
        }
        // Variable that stores a temporary sorted list
        List<Art> listOfArtsToBeSorted = new ArrayList<Art>(this.listOfArtworks);
        // Variable that stores the result of the merge sort operation
        List<Art> sortedListOfArts = performMergeSort(listOfArtsToBeSorted, attribute, direction);
        // Simply return the result of the merge sort operation
        return sortedListOfArts;
    }

    /**
     * A method that finds and returns all arts whose 'artistName' attribute is the same as input artist's name.
     * If an artist has multiple arts in the database, a list of all those arts will be returned. On the other hand, if
     * an artist has no arts in the database, an empty list will be returned.
     *
     * @param artistName The specified artist's name to find the Art objects with.
     * @return A list of all matched Art objects with the same 'artistName' attribute as input name, or an empty list if
     * there is no matched Art object.
     */
    public List<Art> findArts(String artistName) {
        // A variable that stores the list of all artworks with the same artist's name as the given artist's name
        List<Art> listOfArtsWithGivenName = new ArrayList<Art>();
        /*
         * A loop that iterates through the list of artworks to find the artworks with the same artist's name as the given
         * artist's name.
         */
        for (int index = 0; index < this.listOfArtworks.size(); index = index + 1) {
            // A variable that stores the current artwork at the current index
            Art everyArt = this.listOfArtworks.get(index);
            // A variable that stores the name of the artist of the current artwork
            String tempArtistName = everyArt.getArtistName();
            /*
             * If the temporary name is the same as the specified artist's name, add the artwork to the list of arts to
             * be returned later on
             */
            if (tempArtistName.equals(artistName)) {
                listOfArtsWithGivenName.add(everyArt);
            }
            // Otherwise, do nothing and let the loop continues as usual
            else {
                ;
            }
        }
        // Return the list of all artworks with the same artist's name as the given artist's name
        return listOfArtsWithGivenName;
    }

    /**
     * A method that randomly generates and returns a list of n Art objects, n is specified with the method call.
     * This method generates random Art objects that are independent of the arts list currently stored in the museum.
     * It will return a list of size n of Art that have unique memory addresses, so all Art objects should differ from each other.
     * (No duplicate Art objects.)
     *
     * @param n The specified integer to generates and randomizes Art objects with.
     * @return A list of randomly-generated Art objects.
     */
    public List<Art> randomizeArts(int n) {
        // Variable that stores the list of randomly generated arts
        List<Art> randomArtsList = new ArrayList<Art>();
        // If n is <= 0, returns an empty list of arts
        if (n <= 0) {
            return randomArtsList;
        }
        // Otherwise, let the method continue as normal
        else {
            ;
        }
        // Variable that stores the random object that will help generate random Art objects later on
        Random random = new Random();
        // Loop that iterates until the specified n to generate random art objects with
        for (int index = 0; index < n; index = index + 1) {
            // Variable that stores the generated random height which should be between 1 and 500
            int generatedRandomHeight = random.nextInt(500) + 1;
            // Variable that stores the generated random width for the art which should be between 1 and 500
            int generatedRandomWidth = random.nextInt(500) + 1;
            // Variable that stores the generated random price for the art which should be between 1 and 999999 dollars
            int generatedRandomPrice = random.nextInt(999999) + 1;
            // Variable that stores the generated random name between "ARandomArt1" and "RandomArt9999"
            String generatedRandomArtName = "ARandomArt" + (random.nextInt(9999) + 1);
            // Variable that stores the generated random artist name between ARandomArtist1 and ARandomArtist999
            String generatedRandomArtistName = "ARandomArtist" + (random.nextInt(999) + 1);
            // Variable that stores the newly generated random artwork
            Art generatedRandomArt = new Art(generatedRandomHeight, generatedRandomPrice, generatedRandomWidth,
                    generatedRandomArtName, generatedRandomArtistName);
            // Add that newly generated random artwork to the list of random arts
            randomArtsList.add(generatedRandomArt);
        }
        // Return the list of randomly generated arts
        return randomArtsList;
    }

    /**
     * A method that sort the given list of arts in the following order: the first 1/5 of the arts are sorted
     * based on height, the second 1/5 of the arts are sorted based on price, the third 1/5 of arts are sorted based on
     * width, the fourth 1/5 of arts are sorted based on name, and the last, remaining 1/5 are sorted based on artistName.
     *
     * @param arts Any specified list of arts to perform randomSort on.
     * @return The sorted list of art based on the above order.
     */
    public List<Art> randomSort(List<Art> arts) {
        // A variable that stores the size of the given arts list so that computations on it can be performed later
        int sizeOfGivenArtsList = arts.size();
        /*
         * If the given arts list has 5 or fewer than 5 elements, each grouping will now have only 1 element. Hence,
         * the output list will be technically the same as the input list, as no further sorts can be done with such
         * groupings (no other elements in grouping to sort with.)
         */
        if (sizeOfGivenArtsList <= 5) {
            // In this case, simply return the input list of arts
            return arts;
        }
        // Let the method continue as normal if otherwise:
        else {
            ;
        }
        // A variable that stores 1/5 of the given arts list
        int oneFifthOfGivenArtsList = sizeOfGivenArtsList / 5;
        /*
         * A list that stores a copy of the input list so that sublists can be extracted from it easily later on (and
         * to avoid the modification of the input list
         */
        List<Art> copyOfGivenListOfArts = new ArrayList<Art>(arts);
        // A list that stores the output list of this method
        List<Art> randomlySortedListOfArts = new ArrayList<Art>(arts);
        // A variable that stores the first 1/5 of the given list of arts (unsorted)
        List<Art> firstOneFifth = copyOfGivenListOfArts.subList(0, oneFifthOfGivenArtsList);
        // A variable that stores the first 1/5 of the given list of arts that are sorted based on height
        List<Art> firstOneFifthSorted = sortGivenList(firstOneFifth, "height", 1);
        // A variable that stores the second 1/5 of the given list of arts (unsorted)
        List<Art> secondOneFifth = copyOfGivenListOfArts.subList(oneFifthOfGivenArtsList, oneFifthOfGivenArtsList * 2);
        // A variable that stores the second 1/5 of the given list of arts that are sorted based on price
        List<Art> secondOneFifthSorted = sortGivenList(secondOneFifth, "price", 1);
        // A variable that stores the third 1/5 of the given list of arts (unsorted)
        List<Art> thirdOneFifth = copyOfGivenListOfArts.subList(oneFifthOfGivenArtsList * 2, oneFifthOfGivenArtsList * 3);
        // A variable that stores the third 1/5 of the given list of arts that are sorted based on width
        List<Art> thirdOneFifthSorted = sortGivenList(thirdOneFifth, "width", 1);
        // A variable that stores the fourth 1/5 of the given list of arts (unsorted)
        List<Art> fourthOneFifth = copyOfGivenListOfArts.subList(oneFifthOfGivenArtsList * 3, oneFifthOfGivenArtsList * 4);
        // A variable that stores the fourth 1/5 of the given list of arts that are sorted based on names
        List<Art> fourthOneFifthSorted = sortGivenList(fourthOneFifth, "name", 1);
        // A variable that stores the remaining of the given list of arts (unsorted)
        List<Art> lastOneFifthOrRemainingOfList = copyOfGivenListOfArts.subList(oneFifthOfGivenArtsList * 4, sizeOfGivenArtsList);
        // A variable that stores the remaining of the given list of arts that are sorted based on artists' names
        List<Art> lastOneFifthOrRemainingOfListSorted = sortGivenList(lastOneFifthOrRemainingOfList, "artistName", 1);
        // A loop that adds every Art objects from the sorted first 1/5 of the input list (based on heights)
        for (int index = 0; index < firstOneFifthSorted.size(); index = index + 1) {
            // Manually add every Art object from the beginning until 1/5 of the list
            randomlySortedListOfArts.set(index, firstOneFifthSorted.get(index));
        }
        // A loop that adds every Art objects from the sorted second 1/5 of the input list (based on prices)
        for (int index = 0; index < secondOneFifthSorted.size(); index = index + 1) {
            // Manually add every Art object from 1/5 of the list until 2/5 of the list
            randomlySortedListOfArts.set((oneFifthOfGivenArtsList) + index, secondOneFifthSorted.get(index));
        }
        // A loop that adds every Art objects from the sorted third 1/5 of the input list (based on widths)
        for (int index = 0; index < thirdOneFifthSorted.size(); index = index + 1) {
            // Manually add every Art object from 2/5 of the list until 3/5 of the list
            randomlySortedListOfArts.set((oneFifthOfGivenArtsList * 2) + index, thirdOneFifthSorted.get(index));
        }
        // A loop that adds every Art objects from the sorted fourth 1/5 of the input list (based on names)
        for (int index = 0; index < fourthOneFifthSorted.size(); index = index + 1) {
            // Manually add every Art object from 3/5 of the list until 4/5 of the list
            randomlySortedListOfArts.set((oneFifthOfGivenArtsList * 3) + index, fourthOneFifthSorted.get(index));
        }
        // A loop that adds every Art objects from the sorted remaining part of the input list (based on artist names)
        for (int index = 0; index < lastOneFifthOrRemainingOfListSorted.size(); index = index + 1) {
            // Manually add every Art object from 4/5 of the list until the end of the list
            randomlySortedListOfArts.set((oneFifthOfGivenArtsList * 4) + index, lastOneFifthOrRemainingOfListSorted.get(index));
        }
        /*
         * Now that all sublists have been "merged" into one final list, simply return it (the randomly sorted list of
         * Art objects):
         */
        return randomlySortedListOfArts;
    }

    /**
     * A helper method that helps sort any given list by specified direction and attribute. It utilizes MERGE SORT and
     * takes advantage of the Merge Sort helper methods below (performMergeSort and mergeAndSortDividedLists).
     *
     * @param listOfArtworks Any list of artworks to be sorted.
     * @param attribute      Any attribute to sort the Art objects with.
     * @param direction      Any direction (positive or negative only) to sort the Art objects with (in ascending or descending
     *                       order, respectively.)
     * @return A sorted list of the arts or an empty list if there is currently no art in the database.
     */
    private List<Art> sortGivenList(List<Art> listOfArtworks, String attribute, int direction) {
        /*
         * Check if the given attribute is in the valid list of: height, price, width, names, OR artistName.
         * If not, throw an IllegalArgumentException.
         */
        if (!attribute.equals("height") && !attribute.equals("price") && !attribute.equals("width")
                && !attribute.equals("name") && !attribute.equals("artistName")) {
            throw new IllegalArgumentException("The specified attribute is NOT an attribute our artworks have!");
        }
        // Otherwise, let the method continues as normal.
        else {
            ;
        }
        // Variable that stores a temporary sorted list
        List<Art> listOfArtsToBeSorted = new ArrayList<Art>(listOfArtworks);
        // Variable that stores the result of the merge sort operation
        List<Art> sortedListOfArts = performMergeSort(listOfArtsToBeSorted, attribute, direction);
        // Simply returns the result of the merge sort operation
        return sortedListOfArts;
    }

    /**
     * A helper method that helps perform a merge sort on the given list of artworks based on the specified attribute
     * and direction (ascending or descending.) Specifically, this method will recursively divide the given list into
     * smaller left and right sublists, and then sort and merge the sublists using another helper method below.
     *
     * @param listOfArtworks Any list of artworks to be sorted using merge sort.
     * @param attribute      Any attribute to sort the Art objects with.
     * @param direction      Any direction (positive or negative only) to sort the Art objects with (in ascending or descending
     *                       order, respectively.)
     * @return A sorted list of the arts or an empty list if there is currently no art in the database.
     */
    private List<Art> performMergeSort(List<Art> listOfArtworks, String attribute, int direction) {
        // Variable to keep track of the size of the given list of arts to be sorted
        int sizeOfGivenListOfArts = listOfArtworks.size();
        // Base case for recursion: If the size is 0 or lower, stop the recursive method and return the current list of arts
        if (sizeOfGivenListOfArts <= 1) {
            return listOfArtworks;
        }
        // Otherwise, let the recursion continue
        else {
            ;
        }
        // Variable that keeps track of the middle index of the given list and its sublists for partitioning
        int middlePartitionIndex = sizeOfGivenListOfArts / 2;
        /*
         * Recursively divides the given list into smaller sublist based on the given attribute and direction
         * Stores the left sublist of the current list:
         */
        List<Art> leftSublist = performMergeSort(listOfArtworks.subList(0, middlePartitionIndex), attribute, direction);
        // Stores track of the right sublist of the current list
        List<Art> rightSublist = performMergeSort(listOfArtworks.subList(middlePartitionIndex, sizeOfGivenListOfArts),
                attribute, direction);
        // Now merge the sorted sublists altogether using the given attribute and direction
        List<Art> mergedAndSortedList = mergeAndSortDividedSubArrays(leftSublist, rightSublist, attribute, direction);
        // Returns the merged and sorted lists to become a complete list at the end of the recursive calls
        return mergedAndSortedList;
    }

    /**
     * A helper method that helps merge and sort the newly divided sublists and lists from the above based on the
     * specified attribute and direction.
     *
     * @param leftSublist The left sublist to be merged and sorted.
     * @param rightSublist The right sublist to be merged and sorted.
     * @param attribute Any attribute to sort the Art objects with.
     * @param direction Any direction (positive or negative only) to sort the Art objects with (in ascending or descending
     *                  order, respectively.)
     * @return The merged, sorted list from the two given "left" and "right" sublists.
     * @throws IllegalArgumentException If the given attribute is NOT height, price, width, names, OR artistName.
     */
    private List<Art> mergeAndSortDividedSubArrays(List<Art> leftSublist, List<Art> rightSublist, String attribute, int direction) {
        // Variable that stores the merged and sorted list to be returned later
        List<Art> mergedAndSortedArtList = new ArrayList<Art>();
        // Variable that stores and keeps track of the index of the left sublist
        int leftSublistIndex = 0;
        // Variable that stores and keeps track of the index of the right sublist
        int rightSublistIndex = 0;
        /*
         * A loop that iterates through the two sublists to add the artworks in these lists together in a larger sublist
         * in a sorted manner, based on the artworks' attributes and specified direction:
         */
        while (leftSublistIndex < leftSublist.size() && rightSublistIndex < rightSublist.size()) {
            // Keeps track of the temporary art from the left sublist
            Art tempArtFromLeftSublist = leftSublist.get(leftSublistIndex);
            // Keeps track of the temporary art from the right sublist
            Art tempArtFromRightSublist = rightSublist.get(rightSublistIndex);
            // Variable that stores the result of the temporary comparisons for sorting
            int resultOfComparisonForSorting = 0;
            // Switch-Case statement to modify the behavior of the method based on the attribute specified above:
            switch (attribute) {
                // If the given attribute is "height", compare the artwork's heights with each other
                case "height":
                    resultOfComparisonForSorting = Integer.compare(tempArtFromLeftSublist.getHeight(), tempArtFromRightSublist.getHeight());
                    break;
                // If the given attribute is "price", compare the artwork's price with each other
                case "price":
                    resultOfComparisonForSorting = Integer.compare(tempArtFromLeftSublist.getPrice(), tempArtFromRightSublist.getPrice());
                    break;
                // If the given attribute is "width", compare the artwork's width with each other
                case "width":
                    resultOfComparisonForSorting = Integer.compare(tempArtFromLeftSublist.getWidth(), tempArtFromRightSublist.getWidth());
                    break;
                // If the given attribute is "name", compare the artwork's name with each other
                case "name":
                    resultOfComparisonForSorting = tempArtFromLeftSublist.getName().compareTo(tempArtFromRightSublist.getName());
                    break;
                // If the given attribute is "artistName", compare the artwork's artistName with each other
                case "artistName":
                    resultOfComparisonForSorting = tempArtFromLeftSublist.getArtistName().compareTo(tempArtFromRightSublist.getArtistName());
                    break;
                /*
                 * If the specified attribute is not of the above five attributes, throw an IllegalArgumentException, as
                 * it is invalid and is, therefore, illegal:
                 */
                default:
                    throw new IllegalArgumentException("The given attribute is NOT valid: " + attribute);
            }
            /*
             * If the given direction is negative, then add a negative sign to the result of the comparisons above
             * in order to indicate descending-order sorting.
             */
            if (direction < 0) {
                resultOfComparisonForSorting = -(resultOfComparisonForSorting);
            }
            /*
             * If the given direction is positive, then there is no need to do anything else to the comparisons' result
             * (The method will now sort the list in non-decreasing order.)
             */
            else if (direction >= 0) {
                resultOfComparisonForSorting = resultOfComparisonForSorting;
            }
            /*
             * If the result from the above comparison is 0 or lower, add the current artwork from the left sublist to
             * the list of merged and sorted artworks. Also increment the index of the left sublist to prepare for the
             * insertion of a new element.
             */
            if (resultOfComparisonForSorting <= 0) {
                mergedAndSortedArtList.add(tempArtFromLeftSublist);
                leftSublistIndex = leftSublistIndex + 1;
            }
            /*
             * If the result from the above comparison is greater than 0, add the current artwork from the right sublist
             * to the list of merged and sorted artworks. Also increment the index of the right sublist to prepare for
             * the insertion of a new element.
             */
            else {
                mergedAndSortedArtList.add(tempArtFromRightSublist);
                rightSublistIndex = rightSublistIndex + 1;
            }
        }
        /*
         * Now that the two sublists are sorted, merge them together by adding each of their elements to the final list
         * Start by adding the elements of the left sublist to the final list
         */
        while (leftSublistIndex < leftSublist.size()) {
            // Variable that keeps track of the artwork from the left sublist to be added to the final list
            Art artFromLeftSublist = leftSublist.get(leftSublistIndex);
            // Add it to the final list
            mergedAndSortedArtList.add(artFromLeftSublist);
            // Increment the variable that keeps track of the index of the left sublist by 1
            leftSublistIndex = leftSublistIndex + 1;
        }
        // Then add the elements (artworks) of the right sublist to the final list
        while (rightSublistIndex < rightSublist.size()) {
            // Variable that keeps track of the artwork from the right sublist to be added to the final list
            Art artFromRightSublist = rightSublist.get(rightSublistIndex);
            // Add it to the final list
            mergedAndSortedArtList.add(artFromRightSublist);
            // Increment the variable that keeps track of the index of the right sublist by 1
            rightSublistIndex = rightSublistIndex + 1;
        }
        // Return the merged and sorted list of artworks as they are now successfully sorted
        return mergedAndSortedArtList;
    }

}