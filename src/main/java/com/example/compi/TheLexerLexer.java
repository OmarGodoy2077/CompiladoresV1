// Generated from C:/Users/Omar Godoy/IdeaProjects/Compi/src/main/antlr/TheLexer.g4 by ANTLR 4.13.2

    package com.example.compi;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TheLexerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, FOR=3, PRINT=4, INT=5, IDENTIFIER=6, INT_CONST=7, STRING=8, 
		PLUS=9, MINUS=10, MULT=11, DIV=12, ASSIGN=13, GE=14, LE=15, GT=16, LT=17, 
		EQ=18, NEQ=19, LBRACE=20, RBRACE=21, LPAREN=22, RPAREN=23, SEMI=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "FOR", "PRINT", "INT", "IDENTIFIER", "INT_CONST", "STRING", 
			"PLUS", "MINUS", "MULT", "DIV", "ASSIGN", "GE", "LE", "GT", "LT", "EQ", 
			"NEQ", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "SEMI", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'for'", "'print'", "'int'", null, null, null, 
			"'+'", "'-'", "'*'", "'/'", "':='", "'>='", "'<='", "'>'", "'<'", "'='", 
			"'<>'", "'{'", "'}'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "FOR", "PRINT", "INT", "IDENTIFIER", "INT_CONST", 
			"STRING", "PLUS", "MINUS", "MULT", "DIV", "ASSIGN", "GE", "LE", "GT", 
			"LT", "EQ", "NEQ", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "SEMI", "WS"
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


	public TheLexerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TheLexer.g4"; }

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
		case 5:
			IDENTIFIER_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			INT_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void IDENTIFIER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			        if (getText().length() > 15)
			            throw new RuntimeException("Error: Identificador demasiado largo en línea " + getLine());
			    
			break;
		}
	}
	private void INT_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			        if (Integer.parseInt(getText()) > 100)
			            throw new RuntimeException("Error: Constante fuera de rango en línea " + getLine());
			    
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0019\u008f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0005\u0005L\b\u0005\n\u0005\f\u0005O\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006T\b\u0006\u000b\u0006"+
		"\f\u0006U\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007^\b\u0007\n\u0007\f\u0007a\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0004\u0018\u008a\b\u0018"+
		"\u000b\u0018\f\u0018\u008b\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u0019\u0001\u0000\u0005\u0003\u0000AZ__az\u0004\u000009AZ__az"+
		"\u0001\u000009\u0002\u0000\"\"\\\\\u0003\u0000\t\n\r\r  \u0093\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00013\u0001\u0000\u0000\u0000\u0003"+
		"6\u0001\u0000\u0000\u0000\u0005;\u0001\u0000\u0000\u0000\u0007?\u0001"+
		"\u0000\u0000\u0000\tE\u0001\u0000\u0000\u0000\u000bI\u0001\u0000\u0000"+
		"\u0000\rS\u0001\u0000\u0000\u0000\u000fY\u0001\u0000\u0000\u0000\u0011"+
		"d\u0001\u0000\u0000\u0000\u0013f\u0001\u0000\u0000\u0000\u0015h\u0001"+
		"\u0000\u0000\u0000\u0017j\u0001\u0000\u0000\u0000\u0019l\u0001\u0000\u0000"+
		"\u0000\u001bo\u0001\u0000\u0000\u0000\u001dr\u0001\u0000\u0000\u0000\u001f"+
		"u\u0001\u0000\u0000\u0000!w\u0001\u0000\u0000\u0000#y\u0001\u0000\u0000"+
		"\u0000%{\u0001\u0000\u0000\u0000\'~\u0001\u0000\u0000\u0000)\u0080\u0001"+
		"\u0000\u0000\u0000+\u0082\u0001\u0000\u0000\u0000-\u0084\u0001\u0000\u0000"+
		"\u0000/\u0086\u0001\u0000\u0000\u00001\u0089\u0001\u0000\u0000\u00003"+
		"4\u0005i\u0000\u000045\u0005f\u0000\u00005\u0002\u0001\u0000\u0000\u0000"+
		"67\u0005e\u0000\u000078\u0005l\u0000\u000089\u0005s\u0000\u00009:\u0005"+
		"e\u0000\u0000:\u0004\u0001\u0000\u0000\u0000;<\u0005f\u0000\u0000<=\u0005"+
		"o\u0000\u0000=>\u0005r\u0000\u0000>\u0006\u0001\u0000\u0000\u0000?@\u0005"+
		"p\u0000\u0000@A\u0005r\u0000\u0000AB\u0005i\u0000\u0000BC\u0005n\u0000"+
		"\u0000CD\u0005t\u0000\u0000D\b\u0001\u0000\u0000\u0000EF\u0005i\u0000"+
		"\u0000FG\u0005n\u0000\u0000GH\u0005t\u0000\u0000H\n\u0001\u0000\u0000"+
		"\u0000IM\u0007\u0000\u0000\u0000JL\u0007\u0001\u0000\u0000KJ\u0001\u0000"+
		"\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"PQ\u0006\u0005\u0000\u0000Q\f\u0001\u0000\u0000\u0000RT\u0007\u0002\u0000"+
		"\u0000SR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001\u0000"+
		"\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0006"+
		"\u0006\u0001\u0000X\u000e\u0001\u0000\u0000\u0000Y_\u0005\"\u0000\u0000"+
		"Z^\b\u0003\u0000\u0000[\\\u0005\\\u0000\u0000\\^\t\u0000\u0000\u0000]"+
		"Z\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000bc\u0005\"\u0000\u0000c\u0010\u0001"+
		"\u0000\u0000\u0000de\u0005+\u0000\u0000e\u0012\u0001\u0000\u0000\u0000"+
		"fg\u0005-\u0000\u0000g\u0014\u0001\u0000\u0000\u0000hi\u0005*\u0000\u0000"+
		"i\u0016\u0001\u0000\u0000\u0000jk\u0005/\u0000\u0000k\u0018\u0001\u0000"+
		"\u0000\u0000lm\u0005:\u0000\u0000mn\u0005=\u0000\u0000n\u001a\u0001\u0000"+
		"\u0000\u0000op\u0005>\u0000\u0000pq\u0005=\u0000\u0000q\u001c\u0001\u0000"+
		"\u0000\u0000rs\u0005<\u0000\u0000st\u0005=\u0000\u0000t\u001e\u0001\u0000"+
		"\u0000\u0000uv\u0005>\u0000\u0000v \u0001\u0000\u0000\u0000wx\u0005<\u0000"+
		"\u0000x\"\u0001\u0000\u0000\u0000yz\u0005=\u0000\u0000z$\u0001\u0000\u0000"+
		"\u0000{|\u0005<\u0000\u0000|}\u0005>\u0000\u0000}&\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005{\u0000\u0000\u007f(\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005}\u0000\u0000\u0081*\u0001\u0000\u0000\u0000\u0082\u0083\u0005("+
		"\u0000\u0000\u0083,\u0001\u0000\u0000\u0000\u0084\u0085\u0005)\u0000\u0000"+
		"\u0085.\u0001\u0000\u0000\u0000\u0086\u0087\u0005;\u0000\u0000\u00870"+
		"\u0001\u0000\u0000\u0000\u0088\u008a\u0007\u0004\u0000\u0000\u0089\u0088"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0006\u0018\u0002\u0000\u008e2\u0001"+
		"\u0000\u0000\u0000\u0006\u0000MU]_\u008b\u0003\u0001\u0005\u0000\u0001"+
		"\u0006\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}