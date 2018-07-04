import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*; 

public class MyListenner extends calculatorBaseListener {

	ParseTreeProperty<Double> values = new ParseTreeProperty<>();
	ParseTreeProperty<String> val = new ParseTreeProperty<>();
	Map<String, Double> declarations = new HashMap<>();

	@Override public void exitPrint(calculatorParser.PrintContext ctx) { 
			System.out.println(values.get(ctx.operation()));
	}

	@Override public void exitDeclaration(calculatorParser.DeclarationContext ctx) { 
           declarations.put(ctx.VAR().getText(), values.get(ctx.operation()));
          
	}

	@Override public void exitDivMult(calculatorParser.DivMultContext ctx) {
		if (ctx.op.getText().equals("*"))
			values.put(ctx, values.get(ctx.operation(0)) * values.get(ctx.operation(1)));
		if(ctx.op.getText().equals("/"))
			values.put(ctx, values.get(ctx.operation(0)) / values.get(ctx.operation(1))); 
	 }

	 @Override public void exitSubSum(calculatorParser.SubSumContext ctx) { 
	 		if (ctx.op.getText().equals("+"))
				values.put(ctx, values.get(ctx.operation(0)) + values.get(ctx.operation(1)));
			if(ctx.op.getText().equals("-"))
				values.put(ctx, values.get(ctx.operation(0)) - values.get(ctx.operation(1))); 
	 }

	 @Override public void exitParentesis(calculatorParser.ParentesisContext ctx) {
	 	values.put(ctx, values.get(ctx.operation()));
	 }

	 @Override public void exitDoubleNumber(calculatorParser.DoubleNumberContext ctx) { 
	 	values.put(ctx, Double.parseDouble(ctx.INT().getText()));
	 }

	@Override public void exitImaginaryNumber(calculatorParser.ImaginaryNumberContext ctx) { 
	
	}

	@Override public void exitVar(calculatorParser.VarContext ctx) {
		values.put(ctx, declarations.get(ctx.VAR().getText()));
	}


}