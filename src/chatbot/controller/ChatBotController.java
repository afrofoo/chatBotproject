package chatbot.controller;

import chatbot.model.ChatBot;
import chatbot.view.ChatBotView;
import chatbot.view.ChatbotFrame;
/**
 * Controller class for the Chatbot Project.
 * @author jfun3832
 *
 */
public class ChatBotController
{
	/**
	 * Instance of the view object for the project
	 */

	//private ChatBotView myView;
	private ChatBot myChatbot;
	private ChatbotFrame appFrame;
	

	public ChatBotController()
	{
	//	myView = new ChatBotView();
		myChatbot = new ChatBot();
	}
	
	public ChatBot getMyChatbot()
	{
		 return myChatbot;
	}

	public void start()
	{
		appFrame = new ChatbotFrame(this);
	}
	private String conversationHelper(ArraList<String> conversationList)
	{
		String currentConversation = "";
		if(conversationList.size() > 0)
		{
			currentConversationPiece = conversationList.remove(0);
		}
		return currentConversation;
	}
	public String processConversation()
	{
		 String currentConversation = "";
		 
		 currentConversation = conversationHelper(myChatbot.topicConversation());
		 
		 return currentConversation;
		 
		 public String processMeme(String currentInput))
		 {
			 String memeResponse ="you dont like memes?";
			 if(myChatbot.memeChecker(currentInput))
			 {
				 memeResponse = currentInput + " is a cool meme";
				 
			 }
			 return memeResponse; 
		 }
	}
}
