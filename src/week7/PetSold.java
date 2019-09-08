package week7;

public class PetSold extends ItemSold {
    private boolean isVaccinated;
    private boolean isNeutered;
    private boolean isHousebroken;

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public boolean isNeutered() {
        return isNeutered;
    }

    public void setNeutered(boolean neutered) {
        isNeutered = neutered;
    }

    public boolean isHousebroken() {
        return isHousebroken;
    }

    public void setHousebroken(boolean housebroken) {
        isHousebroken = housebroken;
    }


}
