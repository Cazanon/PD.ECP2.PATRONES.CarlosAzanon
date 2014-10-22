package factoryMethod.naturalNumber;

public class NaturalNumberEScreator extends NaturalNumberCreator {

    @Override
    public NaturalNumber createNaturalNumber(int value) {
        return new NaturalNumberES(value, new String[]{"cero", "uno", "dos", "tres", "cuatro", "cinco"});
    }

}