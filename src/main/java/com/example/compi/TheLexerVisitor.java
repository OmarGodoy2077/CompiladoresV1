// Generated from C:/Users/Omar Godoy/IdeaProjects/Compi/src/main/antlr/TheLexer.g4 by ANTLR 4.13.2

    package com.example.compi;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TheLexerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TheLexerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TheLexerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TheLexerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TheLexerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TheLexerParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TheLexerParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(TheLexerParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TheLexerParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(TheLexerParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TheLexerParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(TheLexerParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TheLexerParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(TheLexerParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TheLexerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(TheLexerParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TheLexerParser#relExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpr(TheLexerParser.RelExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toTerm}
	 * labeled alternative in {@link TheLexerParser#arithExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToTerm(TheLexerParser.ToTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link TheLexerParser#arithExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(TheLexerParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toFactor}
	 * labeled alternative in {@link TheLexerParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToFactor(TheLexerParser.ToFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link TheLexerParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(TheLexerParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link TheLexerParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(TheLexerParser.FactorContext ctx);
}