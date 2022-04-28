// Generated from .\Ejemplo1.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Ejemplo1Parser}.
 */
public interface Ejemplo1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Ejemplo1Parser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(Ejemplo1Parser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ejemplo1Parser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(Ejemplo1Parser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ejemplo1Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(Ejemplo1Parser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ejemplo1Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(Ejemplo1Parser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ejemplo1Parser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mult(Ejemplo1Parser.Expr_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ejemplo1Parser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mult(Ejemplo1Parser.Expr_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ejemplo1Parser#expr_base}.
	 * @param ctx the parse tree
	 */
	void enterExpr_base(Ejemplo1Parser.Expr_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ejemplo1Parser#expr_base}.
	 * @param ctx the parse tree
	 */
	void exitExpr_base(Ejemplo1Parser.Expr_baseContext ctx);
}