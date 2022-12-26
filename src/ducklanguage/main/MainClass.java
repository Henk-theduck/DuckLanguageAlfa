package ducklanguage.main;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import ducklanguage.parser.DuckLangLexer;
import ducklanguage.parser.DuckLangParser;

public class MainClass {
	
	public static void main(String[] args) {
		try {
			
			DuckLangLexer lexer;
			DuckLangParser parser;
			
			lexer = new DuckLangLexer(CharStreams.fromFileName("src/input.duck"));
			
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			
			parser = new DuckLangParser(tokenStream);
			
			parser.prog();
			
			System.out.println("Compilation Successful");
			
		}catch (Exception ex) {
			System.err.println("Error :: "+ ex.getMessage());
		}
	}

}
