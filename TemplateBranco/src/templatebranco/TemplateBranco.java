//programa teste hello world
package templatebranco;

/**
 *
 * @author lucas.pedroso
 */
public class TemplateBranco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strl = "Atividade em Aula";
       int a = 1;
       int b = 2;
       int c = 3;
       int d = 4;
       
       int F1 = a+b;
       int F2 = a+c;
       int F3 = a+d;
       
       int G1 = b+a;
       int G2 = b+c;
       int G3 = b+d;
       
       int H1 = c+a;
       int H2 = c+b;
       int H3 = c+d;
       
       int I1 = d+a;
       int I2 = d+b;
       int I3 = d+c;
       
   System.out.println(strl);
    System.out.println("1+2 = " + F1);
    System.out.println("1+3 = " + F2);
    System.out.println("1+4 = " + F3);
    
    System.out.println(" 2+1 = " + G1);
    System.out.println(" 2+3 = "  + G2);
    System.out.println(" 2+4 = "  + G3);
    
    System.out.println("  3+1 = "  + H1);
    System.out.println("  3+2 = "  + H2);
    System.out.println("  3+4 = "  + H3);
    
    System.out.println("   4+1 = "  + I1);
    System.out.println("   4+2 = "  + I2);
    System.out.println("   4+3 = "  + I3);
    }}

