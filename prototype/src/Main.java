import cloningAnimals.Capybara;
import cloningAnimals.Client;
import cloningAnimals.Sheep;

public class Main {
    public static void main(String[] args) {
        Client madDoctorsAnimalCloningLab = new Client();
        Sheep theOneBeforeDolly = new Sheep();
        Sheep dolly = (Sheep) madDoctorsAnimalCloningLab.cloneAnAnimal(theOneBeforeDolly);

        Capybara theOriginalCapybara = new Capybara();
        Capybara aClonedCapybara = (Capybara) madDoctorsAnimalCloningLab.cloneAnAnimal(theOriginalCapybara);

        // Check if different objects
        System.out.println(!theOneBeforeDolly.equals(dolly));
        System.out.println(!theOriginalCapybara.equals(aClonedCapybara));

        // Check if is a clone - has exactly the same contents
        System.out.println(theOneBeforeDolly.getDna() == dolly.getDna());
        System.out.println(theOriginalCapybara.getDna().equals(aClonedCapybara.getDna()));
    }
}
