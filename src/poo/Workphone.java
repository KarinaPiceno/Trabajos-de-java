package poo;

public class Workphone extends Telephone{
    protected int countryCode;
    private int extension;
    public static final int MIN_CODE_LENGTH = 0;
    public static final int MAX_CODE_LENGTH = 1000;

    public Workphone (String wNumber, int extension, int countryCode){
        super(wNumber);
        if (countryCode>= MIN_CODE_LENGTH && countryCode<=MAX_CODE_LENGTH && extension>=0){
            this.extension = extension;
            this.countryCode = countryCode;
        } else throw new IllegalArgumentException("Código o extensión fuera de rango");
    }
    public Workphone (Telephone telephone, int extension, int countryCode){
        super(telephone);
        if (countryCode>= MIN_CODE_LENGTH && countryCode<=MAX_CODE_LENGTH && extension>=0){
            this.extension = extension;
            this.countryCode = countryCode;
        } else throw new IllegalArgumentException("Código o extensión fuera de rango");
    }
    public int getExtension() {
        return extension;

    }
    public int getCountryCode() {
        return countryCode;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o.getClass() != this.getClass()) {
            return false;
        }
        Workphone c = (Workphone) o;
        return  Integer.compare(extension , c.extension) == 0 
                && Integer.compare(countryCode, c.countryCode) ==0 && Workphone.super.equals(c);        
    }
    @Override
    public String toString(){
        if (countryCode==0){
            if (extension != 0 ){
                return super.toString() + ", Ext. " + extension;
            } else return super.toString();
        } else if (extension == 0){
            return "+" + countryCode + " " + super.toString();
        } else return "+" + countryCode + " " + super.toString() + ", Ext. " + extension;
    }
    public static void main(String[] args) {
        Telephone t1 = new Telephone("442", "1095118");
        Telephone t2 = new Telephone("3312162475");
        Workphone w1 = new Workphone(t1, 0, 52);
        Workphone w2 = new Workphone("3312162475", 0, 0);
        Workphone w3 = new Workphone("3312162432", 15, 0);
        System.out.println(t1.toString()+ "\n" + t2.toString() + "\n" + w1.toString() + "\n" + w2.toString() + "\n" + w3.toString());

    }
}
