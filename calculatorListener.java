// Generated from calculator.g by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calculatorParser}.
 */
public interface calculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calculatorParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(calculatorParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(calculatorParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(calculatorParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(calculatorParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(calculatorParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(calculatorParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(calculatorParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(calculatorParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link calculatorParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(calculatorParser.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link calculatorParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(calculatorParser.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link calculatorParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterVar(calculatorParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link calculatorParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitVar(calculatorParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleNumber}
	 * labeled alternative in {@link calculatorParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterDoubleNumber(calculatorParser.DoubleNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleNumber}
	 * labeled alternative in {@link calculatorParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitDoubleNumber(calculatorParser.DoubleNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivMult}
	 * labeled alternative in {@link calculatorParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterDivMult(calculatorParser.DivMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivMult}
	 * labeled alternative in {@link calculatorParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitDivMult(calculatorParser.DivMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubSum}
	 * labeled alternative in {@link calculatorParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterSubSum(calculatorParser.SubSumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubSum}
	 * labeled alternative in {@link calculatorParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitSubSum(calculatorParser.SubSumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImaginaryNumber}
	 * labeled alternative in {@link calculatorParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterImaginaryNumber(calculatorParser.ImaginaryNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImaginaryNumber}
	 * labeled alternative in {@link calculatorParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitImaginaryNumber(calculatorParser.ImaginaryNumberContext ctx);
}