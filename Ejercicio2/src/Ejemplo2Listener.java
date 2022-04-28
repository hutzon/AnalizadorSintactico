// Generated from .\Ejemplo2.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Ejemplo2Parser}.
 */
public interface Ejemplo2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Ejemplo2Parser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(Ejemplo2Parser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ejemplo2Parser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(Ejemplo2Parser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ejemplo2Parser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(Ejemplo2Parser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ejemplo2Parser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(Ejemplo2Parser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ejemplo2Parser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(Ejemplo2Parser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ejemplo2Parser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(Ejemplo2Parser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ejemplo2Parser#inst_asig}.
	 * @param ctx the parse tree
	 */
	void enterInst_asig(Ejemplo2Parser.Inst_asigContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ejemplo2Parser#inst_asig}.
	 * @param ctx the parse tree
	 */
	void exitInst_asig(Ejemplo2Parser.Inst_asigContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ejemplo2Parser#inst_if}.
	 * @param ctx the parse tree
	 */
	void enterInst_if(Ejemplo2Parser.Inst_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ejemplo2Parser#inst_if}.
	 * @param ctx the parse tree
	 */
	void exitInst_if(Ejemplo2Parser.Inst_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ejemplo2Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(Ejemplo2Parser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ejemplo2Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(Ejemplo2Parser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ejemplo2Parser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(Ejemplo2Parser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ejemplo2Parser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(Ejemplo2Parser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ejemplo2Parser#sumando}.
	 * @param ctx the parse tree
	 */
	void enterSumando(Ejemplo2Parser.SumandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ejemplo2Parser#sumando}.
	 * @param ctx the parse tree
	 */
	void exitSumando(Ejemplo2Parser.SumandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ejemplo2Parser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(Ejemplo2Parser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ejemplo2Parser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(Ejemplo2Parser.OperadorContext ctx);
}