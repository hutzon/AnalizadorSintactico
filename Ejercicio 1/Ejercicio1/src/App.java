import java.nio.file.*;
import org.antlr.v4.runtime.*;


public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
                       
            Ejemplo1Lexer lexer = 
                    new Ejemplo1Lexer(CharStreams.fromFileName("prueba_ejemplo1.txt"));
            
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            Ejemplo1Parser parser = new Ejemplo1Parser(tokens);
            
            parser.instrucciones();
            
            System.out.println("\nAnalisis terminado!");
            
        } catch (NoSuchFileException e) {
            System.out.println("Archivo no encontrado! " 
                    + e.getMessage());            
        } catch (Exception e1) {
            System.out.println(e1.getMessage());            
        }
        
    }
    
}