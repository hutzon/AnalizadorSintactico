// Generated from .\Ejemplo1.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Ejemplo1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, BLANCO=8, NUM_REAL=9, 
		NUM_ENTERO=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "NUEVA_LINEA", 
			"BLANCO", "DIGITO", "NUM_REAL", "NUM_ENTERO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "BLANCO", "NUM_REAL", 
			"NUM_ENTERO"
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


	public Ejemplo1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ejemplo1.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fH\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\6\n/\n\n\r\n\16\n\60\3\n\3\n\3\13\3\13\3\f"+
		"\6\f8\n\f\r\f\16\f9\3\f\3\f\3\f\7\f?\n\f\f\f\16\fB\13\f\3\r\6\rE\n\r\r"+
		"\r\16\rF\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23\n\25\2\27\13\31"+
		"\f\3\2\3\4\2\13\13\"\"\2J\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\23\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7\37\3\2\2\2\t!\3\2\2\2\13#\3\2"+
		"\2\2\r%\3\2\2\2\17\'\3\2\2\2\21)\3\2\2\2\23.\3\2\2\2\25\64\3\2\2\2\27"+
		"\67\3\2\2\2\31D\3\2\2\2\33\34\7=\2\2\34\4\3\2\2\2\35\36\7-\2\2\36\6\3"+
		"\2\2\2\37 \7/\2\2 \b\3\2\2\2!\"\7,\2\2\"\n\3\2\2\2#$\7\61\2\2$\f\3\2\2"+
		"\2%&\7*\2\2&\16\3\2\2\2\'(\7+\2\2(\20\3\2\2\2)*\7\17\2\2*+\7\f\2\2+\22"+
		"\3\2\2\2,/\t\2\2\2-/\5\21\t\2.,\3\2\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2"+
		"\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\b\n\2\2\63\24\3\2\2\2\64\65\4\62"+
		";\2\65\26\3\2\2\2\668\5\25\13\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:"+
		"\3\2\2\2:;\3\2\2\2;<\7\60\2\2<@\3\2\2\2=?\5\25\13\2>=\3\2\2\2?B\3\2\2"+
		"\2@>\3\2\2\2@A\3\2\2\2A\30\3\2\2\2B@\3\2\2\2CE\5\25\13\2DC\3\2\2\2EF\3"+
		"\2\2\2FD\3\2\2\2FG\3\2\2\2G\32\3\2\2\2\b\2.\609@F\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}