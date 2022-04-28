import java.nio.file.*;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.antlr.v4.runtime.*;


public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
                       
            Ejemplo2Lexer lexer = 
                    new Ejemplo2Lexer(CharStreams.fromFileName("prueba_ejemplo2.txt"));
            
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            Ejemplo2Parser parser = new Ejemplo2Parser(tokens);

            parser.inicio();
            
            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.out.println("Errores sintacticos: " + parser.getNumberOfSyntaxErrors());    
            }
            
            System.out.println("\nAnalisis terminado!");
            
        } catch (NoSuchFileException e) {
            System.out.println("Archivo no encontrado!\n" + e.getMessage().toString());            
        } catch (Exception e1) {
            System.out.println(e1.getMessage());            
        }
    }
    
}
