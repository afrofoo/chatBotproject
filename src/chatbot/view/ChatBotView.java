package chatbot.view;

import chatbot.model.ChatBot;

import javax.swing.JOptionPane;

public class ChatBotView
{
	private ChatBot myChatbot;
	public ChatBotView()
	{
		myChatbot = new ChatBot();
	}
	
	
	

	public void showApp()
	{
		String answer = "keep going";
		while (!answer.equals("no"))
			
		{
			answer = getInput();
			useInput(answer);
		}
		myChatbot.topicConversation();
	}

	
	
	
	private String getInput()
	{
		String userInput = "";

		userInput = JOptionPane.showInputDialog("Do you want to talk?");

		return userInput;
	}

	private void useInput(String currentInput)
	{
		//JOptionPane.showConfirmDialog(null, "seriously?");
		if(myChatbot.memeChecker(currentInput))
		{
			JOptionPane.showMessageDialog(null, "you like memes huh?");
		}
		if(myChatbot.movieChecker(currentInput))
		{
			JOptionPane.showMessageDialog(null, "whatever goes here...........");
		}
	}
}
