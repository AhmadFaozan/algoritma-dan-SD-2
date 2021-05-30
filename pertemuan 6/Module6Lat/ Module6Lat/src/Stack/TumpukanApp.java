
package Stack;

public class TumpukanApp {
    public static void main(String [] args){
        Tumpukan tumpukan=new Tumpukan(10);
        tumpukan.push(50);
        tumpukan.baca();                 
        System.out.println();
        tumpukan.push(100);
        tumpukan.baca();
        System.out.println();
        long data1=tumpukan.pop();
        tumpukan.baca();
        System.out.println("");
        tumpukan.push(60);
        tumpukan.baca();
        System.out.println();
        tumpukan.push(80);
        tumpukan.baca();
        System.out.println();
        long nilai2=tumpukan.pop();
        tumpukan.baca();
        System.out.println("");
        long nilaitop = tumpukan.pop();
        System.out.println("nilai top = "+nilaitop);
        System.out.println("");
        System.out.println();
        System.out.println(" Ahmad Faozan");
        
    }
    
}
