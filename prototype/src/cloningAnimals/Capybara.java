package cloningAnimals;

import java.math.BigInteger;
import java.security.SecureRandom;

public class Capybara extends Animal {
    private String dna;

    public Capybara() {
        SecureRandom random = new SecureRandom();
        this.dna = new BigInteger(130, random).toString(32);
    }

    @Override
    public Animal clone() {
        Capybara c = new Capybara();
        c.setDna(this.dna);
        return c;
    }

    public void setDna(String dna) {
        this.dna = dna;
    }

    public String getDna() {
        return dna;
    }
}
