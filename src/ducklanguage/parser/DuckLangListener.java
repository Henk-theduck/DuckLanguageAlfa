// Generated from DuckLang.g4 by ANTLR 4.7.1
package ducklanguage.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DuckLangParser}.
 */
public interface DuckLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DuckLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(DuckLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuckLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(DuckLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link DuckLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DuckLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuckLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DuckLangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DuckLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(DuckLangParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuckLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(DuckLangParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DuckLangParser#cmdread}.
	 * @param ctx the parse tree
	 */
	void enterCmdread(DuckLangParser.CmdreadContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuckLangParser#cmdread}.
	 * @param ctx the parse tree
	 */
	void exitCmdread(DuckLangParser.CmdreadContext ctx);
	/**
	 * Enter a parse tree produced by {@link DuckLangParser#cmdwrite}.
	 * @param ctx the parse tree
	 */
	void enterCmdwrite(DuckLangParser.CmdwriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuckLangParser#cmdwrite}.
	 * @param ctx the parse tree
	 */
	void exitCmdwrite(DuckLangParser.CmdwriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link DuckLangParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdattrib(DuckLangParser.CmdattribContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuckLangParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdattrib(DuckLangParser.CmdattribContext ctx);
	/**
	 * Enter a parse tree produced by {@link DuckLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(DuckLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuckLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DuckLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DuckLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(DuckLangParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link DuckLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(DuckLangParser.TermContext ctx);
}