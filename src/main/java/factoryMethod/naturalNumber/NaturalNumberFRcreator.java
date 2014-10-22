package factoryMethod.naturalNumber;

public class NaturalNumberFRcreator extends NaturalNumberCreator {

    @Override
    public NaturalNumber createNaturalNumber(int value) {
        return new NaturalNumberFR(value, new String[]{"zéro", "un", "deux", "trois", "quatre", "cinq"});
    }

}