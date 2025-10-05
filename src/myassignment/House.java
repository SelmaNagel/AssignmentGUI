package myassignment;
public class House {
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private String surnameOfOwners;

    // empty constructor
    public House() {
        this.numberOfBedrooms = 0;
        this.numberOfBathrooms = 0;
        this.surnameOfOwners = null;
    }

    // constructor to take data
    public House(String surname, int bedrooms, int bathrooms) {
        this.surnameOfOwners = surname;
        this.numberOfBedrooms = bedrooms;
        this.numberOfBathrooms = bathrooms;
    }

    // Getters and Setters
    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public String getSurnameOfOwners() {
        return surnameOfOwners;
    }

    public void setSurnameOfOwners(String surnameOfOwners) {
        this.surnameOfOwners = surnameOfOwners;
    }
    //method for console
    public void printDetails() {
        System.out.print("Owners: " + this.surnameOfOwners);
        System.out.print(" Number of bedrooms: " + this.numberOfBedrooms);
        System.out.println(" Number of bathrooms: " + this.numberOfBathrooms);
    }
}