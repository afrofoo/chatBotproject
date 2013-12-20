package chatbot.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ChatBot
{
	private ArrayList<String> myMemes;
	private ArrayList<String> myMovies;
	private ArrayList<String> randomList;

	public ChatBot()
	{
		myMemes = new ArrayList<String>();
		myMovies = new ArrayList<String>();
		randomList = new ArrayList<String>();

		fillTheMemeList();
		fillTheMovieList();
		fillTheRandomList();
	}

	private void fillTheRandomList()
	{
		randomList.add("hi");
		randomList.add("what up");
		randomList.add("cool");
		randomList.add("how are you");
		randomList.add("thats good");
	}
	
	public String getRandomTopic()
	{
		String randomTopic = "";
		
		double myRandom = Math.random();
		int myRandomListPosition = (int)(myRandom*randomList.size());
		randomTopic = randomList.get(myRandomListPosition);
		
		return randomTopic;
	}
	private void fillTheMemeList()
	{
		myMemes.add("nicolas cage");
		myMemes.add("arrow to the knee");
		myMemes.add("one does not simply");
		myMemes.add("y u no");
	}
	public void topicConversation()
	{
		//must have at least 3 JOptionPane.showInputDialog statements about a single topic of your choosing
		JOptionPane.showInputDialog("how are you");
		JOptionPane.showInputDialog("thats a cool movie");
		JOptionPane.showInputDialog("are you hungry");
		
	}


	private void fillTheMovieList()
	{
		myMovies.add("Bolt");
		myMovies.add("The Incredibles");
		myMovies.add("UP");
		myMovies.add("Despicable Me 2");
		myMovies.add("Iron Man 3");
	}
	
	public boolean memeChecker(String currentInput)
	{
		boolean hasMeme = false;
		// loop over all the items in the list, if the input matches a meme,
		// change hasMeme to true

		if (currentInput != null)
		{
			for (String currentPhrase : myMemes)
			{
				if (currentPhrase.equalsIgnoreCase(currentInput))
				{
					hasMeme = true;
				}
			}
		}
		return hasMeme;
	}
	
	public boolean movieChecker(String currentInput)
	{
		boolean hasMovie = false;
		// loop over all the items in the list, if the input matches a meme,
		// change hasMeme to true

		if (currentInput != null)
		{
			for (String currentPhrase : myMovies)
			{
				if (currentPhrase.equalsIgnoreCase(currentInput))
				{
					hasMovie = true;
				}
			}
		}
		return hasMovie;
	}
}
