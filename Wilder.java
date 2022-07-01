class Wilder {

    // Attribut de class
    private String firstname;
    private Boolean aware;

    // Constructor
    public Wilder(String firstname) {
        this.firstname = firstname;
    }

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    // Getters
    public String getName() {
        return this.firstname;
    }

    public Boolean isAwareOrNot() {
        return this.aware;
    }

    // Setters
    public void setName(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(Boolean aware) {
        this.aware = aware;
    }

    // Methode
    public String whoAmI() {
        if (Boolean.toString(this.isAwareOrNot()) == "true") {
            return "Je m'appelle " + this.firstname + " et je suis aware !";
        } else {
            return "Je m'appelle " + this.firstname + " et je ne suis pas aware !";
        }
    }

}