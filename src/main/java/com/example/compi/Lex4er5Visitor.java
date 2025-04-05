package com.example.compi;// Generated from C:/Users/Omar Godoy/IdeaProjects/Compi/src/main/antlr/Lex4er5.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Lex4er5Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Lex4er5Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Lex4er5Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Lex4er5Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lex4er5Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Lex4er5Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lex4er5Parser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(Lex4er5Parser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lex4er5Parser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(Lex4er5Parser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lex4er5Parser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(Lex4er5Parser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lex4er5Parser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(Lex4er5Parser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lex4er5Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Lex4er5Parser.ExprContext ctx);
}