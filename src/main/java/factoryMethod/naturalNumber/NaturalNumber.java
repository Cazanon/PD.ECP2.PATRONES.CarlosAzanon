package factoryMethod.naturalNumber;

public abstract class NaturalNumber {

    private int value;
    private String[] textValue;
    
    public NaturalNumber(int value,String[] textValue){
        this.value=value;
        this.textValue=textValue;
    }
    
    public int getValue(){
        return value;
    }
    
    public void setValue(int value){
        assert value>=0;
        this.value=value;
    }
    
    public String getTextValue() {
        if (this.value < textValue.length) {
            return this.textValue[this.value];
        } else {
            return "???";
        }
    }
    
    public void setTextValue(String[] textValue) {
        for(int i=0;i<textValue.length;i++) {
            this.textValue[i] = textValue[i];
        }
    }

    public void add(int value) {
        this.setValue(this.value + value);
    }


}
