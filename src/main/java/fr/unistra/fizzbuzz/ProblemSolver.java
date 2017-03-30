package fr.unistra.fizzbuzz;

public class ProblemSolver {
	private Int2String converter;
	private Displayer displayer;

	public ProblemSolver(Int2String converter, Displayer displayer) {
		this.converter = converter;
		this.displayer = displayer;
	}

	public void solve(int max) {
		if (max < 1) throw new RuntimeException("Give me something > 0!");
		for(int c=1; c<=max; c++) {
			String result = converter.convert(c);
			displayer.display(result);
		}
	}
}
