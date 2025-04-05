package com.example.compi;// Generated from C:/Users/Omar Godoy/IdeaProjects/Compi/src/main/antlr/Lex4er5.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Lex4er5Parser}.
 */
public interface Lex4er5Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Lex4er5Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Lex4er5Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lex4er5Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Lex4er5Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lex4er5Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Lex4er5Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lex4er5Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Lex4er5Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lex4er5Parser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(Lex4er5Parser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lex4er5Parser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(Lex4er5Parser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lex4er5Parser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(Lex4er5Parser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lex4er5Parser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(Lex4er5Parser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lex4er5Parser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(Lex4er5Parser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lex4er5Parser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(Lex4er5Parser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lex4er5Parser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(Lex4er5Parser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lex4er5Parser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(Lex4er5Parser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lex4er5Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Lex4er5Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lex4er5Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Lex4er5Parser.ExprContext ctx);
}