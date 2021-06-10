package com.springcore.springExpLang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springExpLang/config.xml");
		Demo demo = context.getBean("demo", Demo.class);

		System.out.println(demo);

		// we can also use spring Expression parser class for parsing the expression
//		SpelExpressionParser expressionParser = new SpelExpressionParser();
//		Expression expression = expressionParser.parseExpression("47+32");
//		System.out.println(expression.getValue());

	}

}
