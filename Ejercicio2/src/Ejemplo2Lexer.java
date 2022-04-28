// Generated from .\Ejemplo2.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Ejemplo2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, NUM_REAL=13, NUM_ENTERO=14, IDENT=15, OPERADOR=16, 
		BLANCO=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "LETRA", "DIGITO", "NUM_REAL", "NUM_ENTERO", 
			"IDENT", "OPERADOR", "BLANCO"
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


	public Ejemplo2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ejemplo2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23x\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\6\20L\n\20\r\20\16\20M\3\20\3\20\3\20\7\20S\n"+
		"\20\f\20\16\20V\13\20\3\21\6\21Y\n\21\r\21\16\21Z\3\22\3\22\5\22_\n\22"+
		"\3\22\3\22\3\22\7\22d\n\22\f\22\16\22g\13\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23p\n\23\3\24\6\24s\n\24\r\24\16\24t\3\24\3\24\2\2\25\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\2\35\2\37\17"+
		"!\20#\21%\22\'\23\3\2\5\4\2C\\c|\4\2>>@@\5\2\13\f\17\17\"\"\2\u0080\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\3)\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r\67\3"+
		"\2\2\2\179\3\2\2\2\21;\3\2\2\2\23>\3\2\2\2\25@\3\2\2\2\27B\3\2\2\2\31"+
		"D\3\2\2\2\33F\3\2\2\2\35H\3\2\2\2\37K\3\2\2\2!X\3\2\2\2#^\3\2\2\2%o\3"+
		"\2\2\2\'r\3\2\2\2)*\7y\2\2*+\7j\2\2+,\7k\2\2,-\7n\2\2-.\7g\2\2.\4\3\2"+
		"\2\2/\60\7*\2\2\60\6\3\2\2\2\61\62\7+\2\2\62\b\3\2\2\2\63\64\7}\2\2\64"+
		"\n\3\2\2\2\65\66\7\177\2\2\66\f\3\2\2\2\678\7?\2\28\16\3\2\2\29:\7=\2"+
		"\2:\20\3\2\2\2;<\7k\2\2<=\7h\2\2=\22\3\2\2\2>?\7-\2\2?\24\3\2\2\2@A\7"+
		"/\2\2A\26\3\2\2\2BC\7,\2\2C\30\3\2\2\2DE\7\61\2\2E\32\3\2\2\2FG\t\2\2"+
		"\2G\34\3\2\2\2HI\4\62;\2I\36\3\2\2\2JL\5\35\17\2KJ\3\2\2\2LM\3\2\2\2M"+
		"K\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\60\2\2PT\3\2\2\2QS\5\35\17\2RQ\3\2\2"+
		"\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U \3\2\2\2VT\3\2\2\2WY\5\35\17\2XW\3\2"+
		"\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\"\3\2\2\2\\_\5\33\16\2]_\7a\2\2^\\"+
		"\3\2\2\2^]\3\2\2\2_e\3\2\2\2`d\5\33\16\2ad\5\35\17\2bd\7a\2\2c`\3\2\2"+
		"\2ca\3\2\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f$\3\2\2\2ge\3\2\2"+
		"\2hi\7?\2\2ip\7?\2\2jp\t\3\2\2kl\7>\2\2lp\7?\2\2mn\7@\2\2np\7?\2\2oh\3"+
		"\2\2\2oj\3\2\2\2ok\3\2\2\2om\3\2\2\2p&\3\2\2\2qs\t\4\2\2rq\3\2\2\2st\3"+
		"\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\b\24\2\2w(\3\2\2\2\13\2MTZ^ceo"+
		"t\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}