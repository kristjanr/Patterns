package cloningAnimals;

public class Sheep extends Animal {

    public long getDna() {
        return dna;
    }

    private long dna;

    public Sheep() {
        this.dna = Math.round(Math.random());
    }

    @Override
    public Sheep clone() {
        Sheep sheep = new Sheep();
        sheep.setDna(this.dna);
        return sheep;
    }

    public void setDna(long dna) {
        this.dna = dna;
    }

}

