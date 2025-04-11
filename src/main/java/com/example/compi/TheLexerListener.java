// Generated from C:/Users/Omar Godoy/IdeaProjects/Compi/src/main/antlr/TheLexer.g4 by ANTLR 4.13.2

    package com.example.compi;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TheLexerParser}.
 */
public interface TheLexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TheLexerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TheLexerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TheLexerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TheLexerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TheLexerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TheLexerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TheLexerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TheLexerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TheLexerParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(TheLexerParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TheLexerParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(TheLexerParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TheLexerParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(TheLexerParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TheLexerParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(TheLexerParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TheLexerParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(TheLexerParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TheLexerParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(TheLexerParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TheLexerParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(TheLexerParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TheLexerParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(TheLexerParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TheLexerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TheLexerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TheLexerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TheLexerParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TheLexerParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelExpr(TheLexerParser.RelExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TheLexerParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelExpr(TheLexerParser.RelExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toTerm}
	 * labeled alternative in {@link TheLexerParser#arithExpr}.
	 * @param ctx the parse tree
	 */
	void enterToTerm(TheLexerParser.ToTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toTerm}
	 * labeled alternative in {@link TheLexerParser#arithExpr}.
	 * @param ctx the parse tree
	 */
	void exitToTerm(TheLexerParser.ToTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link TheLexerParser#arithExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(TheLexerParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link TheLexerParser#arithExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(TheLexerParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toFactor}
	 * labeled alternative in {@link TheLexerParser#term}.
	 * @param ctx the parse tree
	 */
	void enterToFactor(TheLexerParser.ToFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toFactor}
	 * labeled alternative in {@link TheLexerParser#term}.
	 * @param ctx the parse tree
	 */
	void exitToFactor(TheLexerParser.ToFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link TheLexerParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(TheLexerParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link TheLexerParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(TheLexerParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link TheLexerParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(TheLexerParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TheLexerParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(TheLexerParser.FactorContext ctx);
}