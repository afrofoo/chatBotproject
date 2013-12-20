package chatbot.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import chatbot.controller.ChatBotController;
import chatbot.model.ChatBot;
import java.awt.Color;

public class ChatbotPanel extends JPanel
{
	private ChatBotController baseController;
	private JButton submitButton;
	private JTextField userInputField;
	private SpringLayout baseLayout;
	private JScrollPane textPane;
	private ChatBot appBot;
	private JTextArea chatArea;
private int click
	public ChatbotPanel(ChatBotController baseController)
	{
		setBackground(new Color(46, 139, 87));
		this.baseController = baseController;
		this.appBot = baseController.getMyChatbot();

		submitButton = new JButton("Submitt this to the Chatbot!");
		userInputField = new JTextField(30);

		chatArea = new JTextArea(10, 30);
		textPane = new JScrollPane(chatArea);
		baseLayout = new SpringLayout();
	

		setupPanel();
		setupLayout();
		setupListeners();

		startChat();
	}

	private void startChat()
	{
		chatArea.setText(appBot.getRandomTopic());
	}
	
	private void setupPanel()
	{
		
		this.setLayout(baseLayout);
		this.add(submitButton);
		this.add(userInputField);
		this.add(textPane);
		
		

	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, userInputField, 17, SpringLayout.SOUTH, textPane);
		baseLayout.putConstraint(SpringLayout.NORTH, textPane, 17, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textPane, 102, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 17, SpringLayout.SOUTH, userInputField);
		baseLayout.putConstraint(SpringLayout.WEST, userInputField, 102, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 141, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			/**
			 * this is what happens when i click the button.
			 */
			public void actionPerformed(ActionEvent click)
			{
				clickCount++;
				
				String currentInput = userInputField.getText();
				
				chatArea.append("\n"+ appBot.getRandomTopic());
				if(clickCount % 7 == 0)
				{
					String currentInput = userInputField.getText();
					chatArea.append("/n" + currentInput);
					chatArea.append("/n" + appbot.getRandomTopic());
					
					
					if(clickCount % 7 ==0)
					{
						String currentConversation = baseController.processConversation();
						if(currentConversation.length() == 0)
						{
							chatArea.append(currentConversation);
							clickCount--;
					
						}
						else if(clickCount ) 
						
						
						
					}
				}
			}
		
		
	});
}
}



