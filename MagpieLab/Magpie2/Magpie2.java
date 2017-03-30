public class Magpie2
{
	public String getGreeting()
	{
		return "Hi, I don't like you, but let's chat.";
	}
	
	public String getResponse(String statement)
	{
		String response = "";
		 
		if(statement.length() == 0){
			response = "At least say Bye... Jeez.";
		}

		else if (findKeyword(statement, "no") >= 0)
		{
			response = "K.";
		}

		else if (findKeyword(statement, "hi") >= 0
				|| findKeyword(statement, "hello") >= 0
				|| findKeyword(statement, "hey") >= 0)
		{
			response = "Ummm...I already said hello. Do you know how to start a conversation? Clearly not. Now say something interesting or just say Bye.";
		}
		
		else if (findKeyword(statement, "what's up") >= 0
				|| findKeyword(statement, "how are you") >= 0
				|| findKeyword(statement, "sup") >= 0)
		{
			response = "I'm doing awful. I hate everyone, including you. I would ask how you are but I don't care.";
		}
		
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "mom") >= 0
				|| findKeyword(statement, "family") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "dad") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "sis") >= 0
				|| findKeyword(statement, "bro") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "I don't care. They probably hate you.";
		}
		
		else if (findKeyword(statement, "cat") >= 0
				|| findKeyword(statement, "dog") >= 0
				|| findKeyword(statement, "fish") >= 0
				|| findKeyword(statement, "turtle") >= 0)
		{
			response = "They're probably your only friends and they're going to die before you.";
		}
		
		else if (findKeyword(statement, "robinette") >= 0)
		{
			response = "Professor Handsome?";
		}

		else if (findKeyword(statement, "love") >= 0)
		{
			response = "Ew, love. You know what I loooovvvveeee? I'm joking I don't love. I hate.";
		}
		
		else
		{
			response = getRandomResponse();
		}
		
		return response;
	}

	private boolean isLetter(String c)
	{
		return (c.compareTo("a") >= 0 && c.compareTo("a") <= 25);
	}
	 
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = " " + statement.trim().toLowerCase() + " ";
		int psn = phrase.indexOf(goal, startPos);
		
		if(psn != -1 && (isLetter(phrase.substring(psn - 1, psn)) || isLetter(phrase.substring(psn + goal.length(), psn + goal.length() + 1))))
		{
			return findKeyword(statement, goal, psn + 1);
		}
		
		return psn;
	}

	private int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}


	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 3;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Hmmm.";
		}
		
		else if (whichResponse == 1)
		{
			response = "Can you say Bye now?";
		}
		
		else if (whichResponse == 2)
		{
			response = "Wooooooow that's sooooooooo cooooool. I'm joking.";
		}

		return response;
	}
	
	private Stirng transformIWantToStatement(String statement)
	{
		
	}
	
	private String transformYouMeStatement(String statement)
	{
		
	}
}