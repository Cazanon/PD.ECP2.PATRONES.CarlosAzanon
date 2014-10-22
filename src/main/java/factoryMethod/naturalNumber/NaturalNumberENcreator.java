package factoryMethod.naturalNumber;

public class NaturalNumberENcreator extends NaturalNumberCreator {

    @Override
    public NaturalNumber createNaturalNumber(int value) {
        return new NaturalNumberEN(value, new String[]{"zero", "one", "two", "three", "four", "five"});
    }

}