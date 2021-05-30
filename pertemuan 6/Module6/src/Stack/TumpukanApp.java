
package Stack;

public class TumpukanApp {
    public static void main(String [] args){
        Tumpukan tumpukan=new Tumpukan(10);
        tumpukan.push( 45 );
        tumpukan.baca();                 
        System.out.print("");
        System.out.println();
        tumpukan.push(56 );
        tumpukan.baca();
        System.out.println();
        tumpukan.push(67);
        tumpukan.baca();
        System.out.println();
        long nilai1=tumpukan.pop();
        System.out.println("nilai1= "+nilai1);
        System.out.println("");
        tumpukan.push(83);
        tumpukan.baca();
        System.out.println();
        tumpukan.push(27);
        tumpukan.baca();
        System.out.println();
        long nilai2=tumpukan.pop();
        System.out.println("nilai2= "+nilai2);
        System.out.println("");
        long nilai3 = tumpukan.pop();
        System.out.println("nilai3= "+nilai3);
        System.out.println("");
        tumpukan.baca();
        
    }
    
}
