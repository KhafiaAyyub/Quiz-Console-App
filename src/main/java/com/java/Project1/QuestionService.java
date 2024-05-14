package com.java.Project1;

import java.util.Scanner;

public class QuestionService {

	Question[] questions =  new Question[5];
	String selection[] = new String[5]; //array of five values

	//create constructor
	public QuestionService() {
		questions[0] =  new Question(1,"what is the language?","Java","Cpp", "Python","Cshap","Java");
		questions[1] =  new Question(2,"size of int","2","6", "8","4","4");
		questions[2] =  new Question(3,"size of Double","2","6", "8","10","8");
		questions[3] =  new Question(4,"size of boolean","1","2", "8","4","1");
		questions[4] =  new Question(5,"size of char","2","4", "1","6","2");
	}



	public void playQuiz() {
//		System.out.println(questions);

		//we need to print each element 
		//we will get null pointer exception

		int i=0;
		for(Question q : questions) {
			
//			System.out.println(q.getQuestion());
			System.out.println("Question no.: " +q.getId());
			System.out.println(q.getQuestion());
			System.out.println("a) "+q.getOpt1());
			System.out.println("b) "+q.getOpt2());
			System.out.println("c) "+q.getOpt3());
			System.out.println("d) "+q.getOpt4());
			System.out.println("Answer:- ");
			
			Scanner sc = new Scanner(System.in);
			selection[i] = sc.nextLine();  //selection - whatever user select
			i++;
		}
		System.out.println("-----------------------------");
		System.out.println("Your Answers:- ");

		
		//forEach loop for printing the options
		for(String s: selection) {  //from selection
			System.out.println(s);
		}

	}
	
	
	public void printScore() {
		int score = 0;
		
		for(int i=0;i<questions.length;i++) {
			
			//go through each question 
			Question que = questions[i];
			
			//what a user has selected
			String actualAnswer = que.getAnswer();
			
			//what user entered for each question
			String userAnswer = selection[i];
			
			if(actualAnswer.equals(userAnswer)) {
				score++;
			}
			
		}
		System.out.println("-----------------------------");
		System.out.println("Your score is:- " + score + "/5");
	}

}