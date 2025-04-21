package poo;

public class Telephone {
    private String areaCode;
    protected String localNumber;
    public static final int MIN_CODE_LENGTH = 2;
    public static final int MAX_CODE_LENGTH = 3;
    
    public Telephone (Telephone telephone){
        this.areaCode = telephone.areaCode;
        this.localNumber = telephone.localNumber;
    }
    public Telephone (String nCompleto){
        areaCode = nCompleto.substring(0, 2);
        localNumber = nCompleto.substring(2);
    }
    public Telephone (String aCode, String lNumber){
        if (aCode.length()>=MIN_CODE_LENGTH && aCode.length()<= MAX_CODE_LENGTH){
            areaCode = aCode;
            localNumber = lNumber;
        } else throw new IllegalArgumentException("El código de área se encuentra fuera de rango");
    }
    public String getAreaCode() {
        return areaCode;
    }
    public String getLocalNumber() {
        return localNumber;
    }
    public String getWholeNumber(){
        return areaCode +   localNumber;
    }
    @Override
    public String toString() {
        if (areaCode.length()==2){
            return "(" + areaCode +") " + localNumber.substring(0, 4) + "-" + localNumber.substring(4) ;
        } else {
            return "(" + areaCode +") " + localNumber.substring(0, 3) + "-" + localNumber.substring(3) ;
        }

    }
     @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (o.getClass() != this.getClass()) {
                return false;
            }
            Telephone c = (Telephone) o;
            return areaCode.equals(c.areaCode)
                    && localNumber.equals(c.localNumber);        
        }
    
    
}
