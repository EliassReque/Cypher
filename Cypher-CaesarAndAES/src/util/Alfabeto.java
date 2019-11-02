
package util;
public enum Alfabeto {
    ENGLISH("ABCDEFGHIJKLMNOPQRSTUVWXYZ"),
    CUSTOM("ABCDEFGHIJKLMNÑOPQRSTUVWXYZ");
    
    private final String alfabeto;
    private Alfabeto(String alfabeto){
        this.alfabeto=alfabeto;
    }
    
    @Override
    public String toString(){
        return alfabeto;
    }
}
