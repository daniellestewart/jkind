package jkind.lustre;


public class IfThenElseExpr extends Expr {
	final public Expr cond;
	final public Expr thenExpr;
	final public Expr elseExpr;
	
	public IfThenElseExpr(Expr cond, Expr thenExpr, Expr elseExpr) {
		this.cond = cond;
		this.thenExpr = thenExpr;
		this.elseExpr = elseExpr;
	}

	@Override
	public <T> T accept(ExprVisitor<T> visitor) {
		return visitor.visit(this);
	}
}