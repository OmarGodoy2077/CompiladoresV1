package com.example.compi;// Generated from C:/Users/Omar Godoy/IdeaProjects/Compi/src/main/antlr/Lex4er5.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Lex4er5Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;

	public static final int KEYWORDS = 1; // O cualquier número de token apropiado
	public static final int ID = 2;

	public static final int FLOAT = 4;
	public static final int OPERATOR = 5;

	public static final int COMPARISON = 7;

	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENTIFIER=1, INT_CONST=2, IF=3, ELSE=4, FOR=5, PRINT=6, INT=7, BFHJK=8, 
		PLUS=9, MINUS=10, MULT=11, DIV=12, ASSIGN=13, GE=14, LE=15, GT=16, LT=17, 
		EQ=18, NEQ=19, LBRACE=20, RBRACE=21, LPAREN=22, RPAREN=23, SEMI=24, WS=25, 
		ERROR=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IDENTIFIER", "INT_CONST", "IF", "ELSE", "FOR", "PRINT", "INT", "BFHJK", 
			"PLUS", "MINUS", "MULT", "DIV", "ASSIGN", "GE", "LE", "GT", "LT", "EQ", 
			"NEQ", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "SEMI", "WS", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'if'", "'else'", "'for'", "'print'", "'int'", "'bfhjk'", 
			"'+'", "'-'", "'*'", "'/'", "':='", "'>='", "'<='", "'>'", "'<'", "'='", 
			"'<>'", "'{'", "'}'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENTIFIER", "INT_CONST", "IF", "ELSE", "FOR", "PRINT", "INT", 
			"BFHJK", "PLUS", "MINUS", "MULT", "DIV", "ASSIGN", "GE", "LE", "GT", 
			"LT", "EQ", "NEQ", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "SEMI", "WS", 
			"ERROR"
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


	public Lex4er5Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lex4er5.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			IDENTIFIER_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			INT_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			ERROR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void IDENTIFIER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 if (getText().length() > 15) notifyErrorListeners("Error: Identificador demasiado largo en línea " + getLine());
			break;
		}
	}

	private void notifyErrorListeners(String message) {
		ANTLRErrorListener listener = getErrorListenerDispatch();
		listener.syntaxError(this, null, getLine(), getCharPositionInLine(), message, null);
	}

	private void INT_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			        if (Integer.parseInt(getText()) > 100) notifyErrorListeners("Error: Constante fuera de rango en línea " + getLine());

			break;
		}
	}
	private void ERROR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 notifyErrorListeners("Error: Símbolo no reconocido '" + getText() + "' en línea " + getLine()); 
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u001a\u008f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0005\u00008\b\u0000\n\u0000\f\u0000;\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0004\u0001@\b\u0001\u000b\u0001\f\u0001A\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0004\u0018\u0087\b\u0018\u000b\u0018\f\u0018"+
		"\u0088\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0000"+
		"\u0000\u001a\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a\u0001\u0000\u0004\u0003\u0000AZ__az\u0004"+
		"\u000009AZ__az\u0001\u000009\u0003\u0000\t\n\r\r  \u0091\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00015"+
		"\u0001\u0000\u0000\u0000\u0003?\u0001\u0000\u0000\u0000\u0005E\u0001\u0000"+
		"\u0000\u0000\u0007H\u0001\u0000\u0000\u0000\tM\u0001\u0000\u0000\u0000"+
		"\u000bQ\u0001\u0000\u0000\u0000\rW\u0001\u0000\u0000\u0000\u000f[\u0001"+
		"\u0000\u0000\u0000\u0011a\u0001\u0000\u0000\u0000\u0013c\u0001\u0000\u0000"+
		"\u0000\u0015e\u0001\u0000\u0000\u0000\u0017g\u0001\u0000\u0000\u0000\u0019"+
		"i\u0001\u0000\u0000\u0000\u001bl\u0001\u0000\u0000\u0000\u001do\u0001"+
		"\u0000\u0000\u0000\u001fr\u0001\u0000\u0000\u0000!t\u0001\u0000\u0000"+
		"\u0000#v\u0001\u0000\u0000\u0000%x\u0001\u0000\u0000\u0000\'{\u0001\u0000"+
		"\u0000\u0000)}\u0001\u0000\u0000\u0000+\u007f\u0001\u0000\u0000\u0000"+
		"-\u0081\u0001\u0000\u0000\u0000/\u0083\u0001\u0000\u0000\u00001\u0086"+
		"\u0001\u0000\u0000\u00003\u008c\u0001\u0000\u0000\u000059\u0007\u0000"+
		"\u0000\u000068\u0007\u0001\u0000\u000076\u0001\u0000\u0000\u00008;\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0006\u0000\u0000"+
		"\u0000=\u0002\u0001\u0000\u0000\u0000>@\u0007\u0002\u0000\u0000?>\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0006\u0001\u0001"+
		"\u0000D\u0004\u0001\u0000\u0000\u0000EF\u0005i\u0000\u0000FG\u0005f\u0000"+
		"\u0000G\u0006\u0001\u0000\u0000\u0000HI\u0005e\u0000\u0000IJ\u0005l\u0000"+
		"\u0000JK\u0005s\u0000\u0000KL\u0005e\u0000\u0000L\b\u0001\u0000\u0000"+
		"\u0000MN\u0005f\u0000\u0000NO\u0005o\u0000\u0000OP\u0005r\u0000\u0000"+
		"P\n\u0001\u0000\u0000\u0000QR\u0005p\u0000\u0000RS\u0005r\u0000\u0000"+
		"ST\u0005i\u0000\u0000TU\u0005n\u0000\u0000UV\u0005t\u0000\u0000V\f\u0001"+
		"\u0000\u0000\u0000WX\u0005i\u0000\u0000XY\u0005n\u0000\u0000YZ\u0005t"+
		"\u0000\u0000Z\u000e\u0001\u0000\u0000\u0000[\\\u0005b\u0000\u0000\\]\u0005"+
		"f\u0000\u0000]^\u0005h\u0000\u0000^_\u0005j\u0000\u0000_`\u0005k\u0000"+
		"\u0000`\u0010\u0001\u0000\u0000\u0000ab\u0005+\u0000\u0000b\u0012\u0001"+
		"\u0000\u0000\u0000cd\u0005-\u0000\u0000d\u0014\u0001\u0000\u0000\u0000"+
		"ef\u0005*\u0000\u0000f\u0016\u0001\u0000\u0000\u0000gh\u0005/\u0000\u0000"+
		"h\u0018\u0001\u0000\u0000\u0000ij\u0005:\u0000\u0000jk\u0005=\u0000\u0000"+
		"k\u001a\u0001\u0000\u0000\u0000lm\u0005>\u0000\u0000mn\u0005=\u0000\u0000"+
		"n\u001c\u0001\u0000\u0000\u0000op\u0005<\u0000\u0000pq\u0005=\u0000\u0000"+
		"q\u001e\u0001\u0000\u0000\u0000rs\u0005>\u0000\u0000s \u0001\u0000\u0000"+
		"\u0000tu\u0005<\u0000\u0000u\"\u0001\u0000\u0000\u0000vw\u0005=\u0000"+
		"\u0000w$\u0001\u0000\u0000\u0000xy\u0005<\u0000\u0000yz\u0005>\u0000\u0000"+
		"z&\u0001\u0000\u0000\u0000{|\u0005{\u0000\u0000|(\u0001\u0000\u0000\u0000"+
		"}~\u0005}\u0000\u0000~*\u0001\u0000\u0000\u0000\u007f\u0080\u0005(\u0000"+
		"\u0000\u0080,\u0001\u0000\u0000\u0000\u0081\u0082\u0005)\u0000\u0000\u0082"+
		".\u0001\u0000\u0000\u0000\u0083\u0084\u0005;\u0000\u0000\u00840\u0001"+
		"\u0000\u0000\u0000\u0085\u0087\u0007\u0003\u0000\u0000\u0086\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0006\u0018\u0002\u0000\u008b2\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\t\u0000\u0000\u0000\u008d\u008e\u0006\u0019\u0003"+
		"\u0000\u008e4\u0001\u0000\u0000\u0000\u0004\u00009A\u0088\u0004\u0001"+
		"\u0000\u0000\u0001\u0001\u0001\u0006\u0000\u0000\u0001\u0019\u0002";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}