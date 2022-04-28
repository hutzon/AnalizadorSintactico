// Generated from .\Ejemplo2.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Ejemplo2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, NUM_REAL=13, NUM_ENTERO=14, IDENT=15, OPERADOR=16, 
		BLANCO=17;
	public static final int
		RULE_inicio = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_inst_asig = 3, 
		RULE_inst_if = 4, RULE_expresion = 5, RULE_operacion = 6, RULE_sumando = 7, 
		RULE_operador = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "instrucciones", "instruccion", "inst_asig", "inst_if", "expresion", 
			"operacion", "sumando", "operador"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'", "'('", "')'", "'{'", "'}'", "'='", "';'", "'if'", "'+'", 
			"'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "NUM_REAL", "NUM_ENTERO", "IDENT", "OPERADOR", "BLANCO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Ejemplo2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Ejemplo2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ejemplo2Listener ) ((Ejemplo2Listener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ejemplo2Listener ) ((Ejemplo2Listener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__0);
			setState(19);
			match(T__1);
			setState(20);
			expresion();
			setState(21);
			match(T__2);
			setState(22);
			match(T__3);
			setState(23);
			instrucciones();
			setState(24);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstruccionesContext extends ParserRuleContext {
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ejemplo2Listener ) ((Ejemplo2Listener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ejemplo2Listener ) ((Ejemplo2Listener)listener).exitInstrucciones(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==IDENT) {
				{
				{
				setState(26);
				instruccion();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstruccionContext extends ParserRuleContext {
		public Inst_asigContext inst_asig() {
			return getRuleContext(Inst_asigContext.class,0);
		}
		public Inst_ifContext inst_if() {
			return getRuleContext(Inst_ifContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ejemplo2Listener ) ((Ejemplo2Listener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ejemplo2Listener ) ((Ejemplo2Listener)listener).exitInstruccion(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				inst_asig();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				inst_if();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inst_asigContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Ejemplo2Parser.IDENT, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Inst_asigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ejemplo2Listener ) ((Ejemplo2Listener)listener).enterInst_asig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ejemplo2Listener ) ((Ejemplo2Listener)listener).exitInst_asig(this);
		}
	}

	public final Inst_asigContext inst_asig() throws RecognitionException {
		Inst_asigContext _localctx = new Inst_asigContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_inst_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(IDENT);
			setState(37);
			match(T__5);
			setState(38);
			expresion();
			setState(39);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inst_ifContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public Inst_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ejemplo2Listener ) ((Ejemplo2Listener)listener).enterInst_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ejemplo2Listener ) ((Ejemplo2Listener)listener).exitInst_if(this);
		}
	}

	public final Inst_ifContext inst_if() throws RecognitionException {
		Inst_ifContext _localctx = new Inst_ifContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_inst_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__7);
			setState(42);
			match(T__1);
			setState(43);
			expresion();
			setState(44);
			match(T__2);
			setState(45);
			match(T__3);
			setState(46);
			instrucciones();
			setState(47);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresionContext extends ParserRuleContext {
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public List<TerminalNode> OPERADOR() { return getTokens(Ejemplo2Parser.OPERADOR); }
		public TerminalNode OPERADOR(int i) {
			return getToken(Ejemplo2Parser.OPERADOR, i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ejemplo2Listener ) ((Ejemplo2Listener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ejemplo2Listener ) ((Ejemplo2Listener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			operacion();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERADOR) {
				{
				{
				setState(50);
				match(OPERADOR);
				setState(51);
				operacion();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperacionContext extends ParserRuleContext {
		public List<SumandoContext> sumando() {
			return getRuleContexts(SumandoContext.class);
		}
		public SumandoContext sumando(int i) {
			return getRuleContext(SumandoContext.class,i);
		}
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ejemplo2Listener ) ((Ejemplo2Listener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ejemplo2Listener ) ((Ejemplo2Listener)listener).exitOperacion(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			sumando();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__9) {
				{
				{
				setState(58);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(59);
				sumando();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumandoContext extends ParserRuleContext {
		public List<OperadorContext> operador() {
			return getRuleContexts(OperadorContext.class);
		}
		public OperadorContext operador(int i) {
			return getRuleContext(OperadorContext.class,i);
		}
		public SumandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ejemplo2Listener ) ((Ejemplo2Listener)listener).enterSumando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ejemplo2Listener ) ((Ejemplo2Listener)listener).exitSumando(this);
		}
	}

	public final SumandoContext sumando() throws RecognitionException {
		SumandoContext _localctx = new SumandoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sumando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			operador();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==T__11) {
				{
				{
				setState(66);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(67);
				operador();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Ejemplo2Parser.IDENT, 0); }
		public TerminalNode NUM_ENTERO() { return getToken(Ejemplo2Parser.NUM_ENTERO, 0); }
		public TerminalNode NUM_REAL() { return getToken(Ejemplo2Parser.NUM_REAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ejemplo2Listener ) ((Ejemplo2Listener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ejemplo2Listener ) ((Ejemplo2Listener)listener).exitOperador(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operador);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(IDENT);
				}
				break;
			case NUM_ENTERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(NUM_ENTERO);
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				match(NUM_REAL);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				match(T__1);
				setState(77);
				expresion();
				setState(78);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23U\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\4\3\4\5\4%\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\67"+
		"\n\7\f\7\16\7:\13\7\3\b\3\b\3\b\7\b?\n\b\f\b\16\bB\13\b\3\t\3\t\3\t\7"+
		"\tG\n\t\f\t\16\tJ\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nS\n\n\3\n\2\2\13"+
		"\2\4\6\b\n\f\16\20\22\2\4\3\2\13\f\3\2\r\16\2S\2\24\3\2\2\2\4\37\3\2\2"+
		"\2\6$\3\2\2\2\b&\3\2\2\2\n+\3\2\2\2\f\63\3\2\2\2\16;\3\2\2\2\20C\3\2\2"+
		"\2\22R\3\2\2\2\24\25\7\3\2\2\25\26\7\4\2\2\26\27\5\f\7\2\27\30\7\5\2\2"+
		"\30\31\7\6\2\2\31\32\5\4\3\2\32\33\7\7\2\2\33\3\3\2\2\2\34\36\5\6\4\2"+
		"\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \5\3\2\2\2!\37\3"+
		"\2\2\2\"%\5\b\5\2#%\5\n\6\2$\"\3\2\2\2$#\3\2\2\2%\7\3\2\2\2&\'\7\21\2"+
		"\2\'(\7\b\2\2()\5\f\7\2)*\7\t\2\2*\t\3\2\2\2+,\7\n\2\2,-\7\4\2\2-.\5\f"+
		"\7\2./\7\5\2\2/\60\7\6\2\2\60\61\5\4\3\2\61\62\7\7\2\2\62\13\3\2\2\2\63"+
		"8\5\16\b\2\64\65\7\22\2\2\65\67\5\16\b\2\66\64\3\2\2\2\67:\3\2\2\28\66"+
		"\3\2\2\289\3\2\2\29\r\3\2\2\2:8\3\2\2\2;@\5\20\t\2<=\t\2\2\2=?\5\20\t"+
		"\2><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\17\3\2\2\2B@\3\2\2\2CH\5\22"+
		"\n\2DE\t\3\2\2EG\5\22\n\2FD\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\21"+
		"\3\2\2\2JH\3\2\2\2KS\7\21\2\2LS\7\20\2\2MS\7\17\2\2NO\7\4\2\2OP\5\f\7"+
		"\2PQ\7\5\2\2QS\3\2\2\2RK\3\2\2\2RL\3\2\2\2RM\3\2\2\2RN\3\2\2\2S\23\3\2"+
		"\2\2\b\37$8@HR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}