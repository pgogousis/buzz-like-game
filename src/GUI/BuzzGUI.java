/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import game_package.Game;
import game_package.Player;
import java.awt.Image;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import questions_package.Question;
import questions_package.ImageQuestion;
import rounds_package.Round;

/**
 *
 * @author gogopavl
 */
public class BuzzGUI extends javax.swing.JFrame {
    
    private static Game buzzGame;
    private int NUMBER_OF_ROUNDS = 0;
    private final int QUESTIONS_PER_ROUND = Game.getNUMBER_OF_QUESTIONS_PER_ROUND();
    private int roundCounter = 0;
    private int questionCounter = 0;
    private ArrayList<Round> roundsList;
    private ArrayList<Question> questionsList;
    private HashSet<String> imageQuestionTypes = new HashSet<String>();
    

    /**
     * Creates new form BuzzGUI
     */
    public BuzzGUI() {
        initComponents();       
        buzzGame = new Game(); // create instance
        this.label_NumberOfRounds.setText("Insert # of rounds (1-"+buzzGame.getMaxNumberOfRounds()+"):");
        imageQuestionTypes.add("Cinema");
        imageQuestionTypes.add("Music"); 
        
    }
    public void setQuestionLabels(){
        if(questionCounter == QUESTIONS_PER_ROUND){
            roundCounter ++;
            System.out.println("RoundCounter: "+roundCounter);        
            if(roundCounter == NUMBER_OF_ROUNDS){
                //EXIT
               JOptionPane.showMessageDialog(rootPane, "GAME FINISHED!");    
               System.exit(0);
            }else{
                questionsList = roundsList.get(roundCounter).getRoundQuestions();
                questionCounter = 0;            
            }
        }
        Question currentQuestion = questionsList.get(questionCounter);
        System.out.println(currentQuestion.getType());
        if(imageQuestionTypes.contains(currentQuestion.getType())){
            ImageQuestion currentImageQuestion = (ImageQuestion) questionsList.get(questionCounter);
            
            String sentence = currentQuestion.getSentence();
        
            this.label_RoundType.setText(roundsList.get(roundCounter).getRoundType());

            ImageIcon img = new ImageIcon("questions/"+currentImageQuestion.getImageName());

            this.label_ImageContainer.setIcon(img);
            this.label_QuestionSentence.setText(sentence);
            this.radioButton_First.setText(currentImageQuestion.getPossibleAnswers()[0]);
            this.radioButton_Second.setText(currentImageQuestion.getPossibleAnswers()[1]);
            this.radioButton_Third.setText(currentImageQuestion.getPossibleAnswers()[2]);
            this.radioButton_Fourth.setText(currentImageQuestion.getPossibleAnswers()[3]);
        }
        else{
            String sentence = currentQuestion.getSentence();
            
            this.label_QuestionSentence.setText(sentence);
            this.label_ImageContainer.setIcon(null);

            this.radioButton_First.setText(currentQuestion.getPossibleAnswers()[0]);
            this.radioButton_Second.setText(currentQuestion.getPossibleAnswers()[1]);
            this.radioButton_Third.setText(currentQuestion.getPossibleAnswers()[2]);
            this.radioButton_Fourth.setText(currentQuestion.getPossibleAnswers()[3]);
        
        }   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_SinglePlayer = new javax.swing.ButtonGroup();
        Menu = new javax.swing.JPanel();
        button_NewGame = new javax.swing.JButton();
        button_Exit = new javax.swing.JButton();
        label_Welcome = new javax.swing.JLabel();
        NewGame = new javax.swing.JPanel();
        label_NumberOfPlayers = new javax.swing.JLabel();
        comboBox_NumberOfPlayers = new javax.swing.JComboBox<>();
        button_Proceed = new javax.swing.JButton();
        button_NewGame_Back = new javax.swing.JButton();
        SinglePlayerName = new javax.swing.JPanel();
        label_SingleName = new javax.swing.JLabel();
        textField_SingleName = new javax.swing.JTextField();
        button_SinglePlay = new javax.swing.JButton();
        button_SinglePlay_Back = new javax.swing.JButton();
        label_NumberOfRounds = new javax.swing.JLabel();
        textField_NumberOfRounds = new javax.swing.JTextField();
        MultiPlayerNames = new javax.swing.JPanel();
        label_MultiName1 = new javax.swing.JLabel();
        label_MultiName2 = new javax.swing.JLabel();
        textField_MultiName1 = new javax.swing.JTextField();
        textField_MultiName2 = new javax.swing.JTextField();
        button_MultiPlay = new javax.swing.JButton();
        button_MultiPlay_Back = new javax.swing.JButton();
        SinglePlayerGame = new javax.swing.JPanel();
        label_RoundType = new javax.swing.JLabel();
        label_ImageContainer = new javax.swing.JLabel();
        label_QuestionSentence = new javax.swing.JLabel();
        radioButton_First = new javax.swing.JRadioButton();
        radioButton_Second = new javax.swing.JRadioButton();
        radioButton_Third = new javax.swing.JRadioButton();
        radioButton_Fourth = new javax.swing.JRadioButton();
        button_SinglePlayerSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        Menu.setBackground(new java.awt.Color(153, 204, 255));

        button_NewGame.setText("New Game");
        button_NewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_NewGameActionPerformed(evt);
            }
        });

        button_Exit.setText("Exit");
        button_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ExitActionPerformed(evt);
            }
        });

        label_Welcome.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        label_Welcome.setForeground(new java.awt.Color(255, 255, 255));
        label_Welcome.setText("Welcome to JavaBuzz!");
        label_Welcome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button_NewGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(215, 215, 215))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                        .addComponent(label_Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addComponent(label_Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(button_NewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );

        getContentPane().add(Menu, "panel_Menu");

        NewGame.setBackground(new java.awt.Color(255, 153, 255));

        label_NumberOfPlayers.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        label_NumberOfPlayers.setForeground(new java.awt.Color(255, 255, 255));
        label_NumberOfPlayers.setText("Select # of players");

        comboBox_NumberOfPlayers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single Game", "2 Players" }));

        button_Proceed.setText("Proceed");
        button_Proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ProceedActionPerformed(evt);
            }
        });

        button_NewGame_Back.setText("Back");
        button_NewGame_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_NewGame_BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NewGameLayout = new javax.swing.GroupLayout(NewGame);
        NewGame.setLayout(NewGameLayout);
        NewGameLayout.setHorizontalGroup(
            NewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewGameLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(NewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewGameLayout.createSequentialGroup()
                        .addComponent(label_NumberOfPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewGameLayout.createSequentialGroup()
                        .addGroup(NewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button_NewGame_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(NewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(button_Proceed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboBox_NumberOfPlayers, 0, 181, Short.MAX_VALUE)))
                        .addGap(246, 246, 246))))
        );
        NewGameLayout.setVerticalGroup(
            NewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewGameLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(label_NumberOfPlayers)
                .addGap(39, 39, 39)
                .addComponent(comboBox_NumberOfPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(button_Proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_NewGame_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        getContentPane().add(NewGame, "panel_NewGame");

        SinglePlayerName.setBackground(new java.awt.Color(255, 204, 51));

        label_SingleName.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        label_SingleName.setForeground(new java.awt.Color(255, 255, 255));
        label_SingleName.setText("Enter your name:");
        label_SingleName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        button_SinglePlay.setText("Play!");
        button_SinglePlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_SinglePlayActionPerformed(evt);
            }
        });

        button_SinglePlay_Back.setText("Back");
        button_SinglePlay_Back.setToolTipText("");
        button_SinglePlay_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_SinglePlay_BackActionPerformed(evt);
            }
        });

        label_NumberOfRounds.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        label_NumberOfRounds.setForeground(new java.awt.Color(255, 255, 255));
        label_NumberOfRounds.setText("Insert # of rounds:");
        label_NumberOfRounds.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout SinglePlayerNameLayout = new javax.swing.GroupLayout(SinglePlayerName);
        SinglePlayerName.setLayout(SinglePlayerNameLayout);
        SinglePlayerNameLayout.setHorizontalGroup(
            SinglePlayerNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SinglePlayerNameLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(SinglePlayerNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SinglePlayerNameLayout.createSequentialGroup()
                        .addComponent(button_SinglePlay, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(button_SinglePlay_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(SinglePlayerNameLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(SinglePlayerNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField_SingleName, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_SingleName, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96))))
            .addGroup(SinglePlayerNameLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(textField_NumberOfRounds, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SinglePlayerNameLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(label_NumberOfRounds, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        SinglePlayerNameLayout.setVerticalGroup(
            SinglePlayerNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SinglePlayerNameLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(label_SingleName)
                .addGap(35, 35, 35)
                .addComponent(textField_SingleName, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(label_NumberOfRounds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(textField_NumberOfRounds, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(SinglePlayerNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_SinglePlay, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_SinglePlay_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        getContentPane().add(SinglePlayerName, "panel_SinglePlayerName");

        MultiPlayerNames.setBackground(new java.awt.Color(255, 204, 51));

        label_MultiName1.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        label_MultiName1.setForeground(new java.awt.Color(255, 255, 255));
        label_MultiName1.setText("Player 1 name:");

        label_MultiName2.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        label_MultiName2.setForeground(new java.awt.Color(255, 255, 255));
        label_MultiName2.setText("Player 2 name:");

        button_MultiPlay.setText("Play!");
        button_MultiPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_MultiPlayActionPerformed(evt);
            }
        });

        button_MultiPlay_Back.setText("Back");
        button_MultiPlay_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_MultiPlay_BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MultiPlayerNamesLayout = new javax.swing.GroupLayout(MultiPlayerNames);
        MultiPlayerNames.setLayout(MultiPlayerNamesLayout);
        MultiPlayerNamesLayout.setHorizontalGroup(
            MultiPlayerNamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MultiPlayerNamesLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(button_MultiPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_MultiPlay_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MultiPlayerNamesLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(MultiPlayerNamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MultiPlayerNamesLayout.createSequentialGroup()
                        .addGroup(MultiPlayerNamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_MultiName2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_MultiName1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MultiPlayerNamesLayout.createSequentialGroup()
                        .addComponent(textField_MultiName2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))
                    .addGroup(MultiPlayerNamesLayout.createSequentialGroup()
                        .addComponent(textField_MultiName1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );
        MultiPlayerNamesLayout.setVerticalGroup(
            MultiPlayerNamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MultiPlayerNamesLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(label_MultiName1)
                .addGap(18, 18, 18)
                .addComponent(textField_MultiName1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(label_MultiName2)
                .addGap(18, 18, 18)
                .addComponent(textField_MultiName2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(MultiPlayerNamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_MultiPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_MultiPlay_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        getContentPane().add(MultiPlayerNames, "panel_MultiPlayerNames");

        SinglePlayerGame.setBackground(new java.awt.Color(0, 153, 153));

        label_RoundType.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        label_RoundType.setForeground(new java.awt.Color(255, 255, 255));
        label_RoundType.setText("Είδος γύρου");

        label_ImageContainer.setMaximumSize(new java.awt.Dimension(300, 300));
        label_ImageContainer.setMinimumSize(new java.awt.Dimension(300, 300));

        label_QuestionSentence.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        label_QuestionSentence.setForeground(new java.awt.Color(255, 255, 255));
        label_QuestionSentence.setText("question sentence");

        radioButton_First.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup_SinglePlayer.add(radioButton_First);
        radioButton_First.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        radioButton_First.setForeground(new java.awt.Color(255, 255, 255));
        radioButton_First.setText("answer 1");

        radioButton_Second.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup_SinglePlayer.add(radioButton_Second);
        radioButton_Second.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        radioButton_Second.setForeground(new java.awt.Color(255, 255, 255));
        radioButton_Second.setText("answer 2");

        radioButton_Third.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup_SinglePlayer.add(radioButton_Third);
        radioButton_Third.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        radioButton_Third.setForeground(new java.awt.Color(255, 255, 255));
        radioButton_Third.setText("answer 3");

        radioButton_Fourth.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup_SinglePlayer.add(radioButton_Fourth);
        radioButton_Fourth.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        radioButton_Fourth.setForeground(new java.awt.Color(255, 255, 255));
        radioButton_Fourth.setText("answer 4");

        button_SinglePlayerSubmit.setText("Submit");
        button_SinglePlayerSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_SinglePlayerSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SinglePlayerGameLayout = new javax.swing.GroupLayout(SinglePlayerGame);
        SinglePlayerGame.setLayout(SinglePlayerGameLayout);
        SinglePlayerGameLayout.setHorizontalGroup(
            SinglePlayerGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SinglePlayerGameLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(SinglePlayerGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SinglePlayerGameLayout.createSequentialGroup()
                        .addGroup(SinglePlayerGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SinglePlayerGameLayout.createSequentialGroup()
                                .addComponent(button_SinglePlayerSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SinglePlayerGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(SinglePlayerGameLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(SinglePlayerGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(radioButton_First, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(radioButton_Second, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(radioButton_Third, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(radioButton_Fourth, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(label_QuestionSentence, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SinglePlayerGameLayout.createSequentialGroup()
                        .addComponent(label_RoundType, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SinglePlayerGameLayout.createSequentialGroup()
                        .addComponent(label_ImageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))))
        );
        SinglePlayerGameLayout.setVerticalGroup(
            SinglePlayerGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SinglePlayerGameLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(label_RoundType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(label_ImageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_QuestionSentence, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioButton_First)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioButton_Second)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioButton_Third)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioButton_Fourth)
                .addGap(18, 18, 18)
                .addComponent(button_SinglePlayerSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        getContentPane().add(SinglePlayerGame, "panel_SinglePlayerGame");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_NewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_NewGameActionPerformed
        // TODO add your handling code here:
        NewGame.setVisible(true);
        Menu.setVisible(false);
    }//GEN-LAST:event_button_NewGameActionPerformed

    private void button_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        dispose();
    }//GEN-LAST:event_button_ExitActionPerformed

    private void button_ProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ProceedActionPerformed
        // TODO add your handling code here:
        if(comboBox_NumberOfPlayers.getSelectedIndex() == 0){
            this.SinglePlayerName.setVisible(true);
            this.NewGame.setVisible(false);
            buzzGame.setNumberOfPlayers(1);
        }
        else if(comboBox_NumberOfPlayers.getSelectedIndex() == 1){
            this.MultiPlayerNames.setVisible(true);
            this.NewGame.setVisible(false);
            buzzGame.setNumberOfPlayers(2);
            
        }
    }//GEN-LAST:event_button_ProceedActionPerformed

    private void button_MultiPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_MultiPlayActionPerformed
        // TODO add your handling code here:
        String player1Name = this.textField_MultiName1.getText();
        this.label_MultiName1.setText(player1Name);
        String player2Name = this.textField_MultiName2.getText();
        this.label_MultiName2.setText(player2Name);
    }//GEN-LAST:event_button_MultiPlayActionPerformed

    private void button_SinglePlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_SinglePlayActionPerformed
        // TODO add your handling code here:
        String playerName = this.textField_SingleName.getText();
        Player p = new Player(playerName, 0);
        buzzGame.addPlayer(p);
        
        int numberOfRounds = Integer.parseInt(this.textField_NumberOfRounds.getText());
        
        if(!Game.validateInput(String.valueOf(numberOfRounds), buzzGame.getMaxNumberOfRounds())){
            JOptionPane.showMessageDialog(rootPane, "Please insert a valid number of rounds!");
        }
        else{
            buzzGame.setNumberOfRounds(numberOfRounds); // should not be here!
            NUMBER_OF_ROUNDS = buzzGame.getNumberOfRounds();
            buzzGame.gameSetup();
            roundsList = buzzGame.getRounds();
            questionsList = roundsList.get(roundCounter).getRoundQuestions();
            setQuestionLabels();
            this.SinglePlayerGame.setVisible(true);
            this.SinglePlayerName.setVisible(false);     
        }
        
        
        //this.label_SingleName.setText(playerName);
        
    }//GEN-LAST:event_button_SinglePlayActionPerformed

    private void button_NewGame_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_NewGame_BackActionPerformed
        // TODO add your handling code here:
        this.Menu.setVisible(true);
        this.NewGame.setVisible(false);
    }//GEN-LAST:event_button_NewGame_BackActionPerformed

    private void button_SinglePlay_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_SinglePlay_BackActionPerformed
        // TODO add your handling code here:
        this.NewGame.setVisible(true);
        this.SinglePlayerName.setVisible(false);
    }//GEN-LAST:event_button_SinglePlay_BackActionPerformed

    private void button_MultiPlay_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_MultiPlay_BackActionPerformed
        // TODO add your handling code here:
        this.NewGame.setVisible(true);
        this.MultiPlayerNames.setVisible(false);
    }//GEN-LAST:event_button_MultiPlay_BackActionPerformed

    private void button_SinglePlayerSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_SinglePlayerSubmitActionPerformed
        // TODO add your handling code here:
        //evaluate answer!!!
        questionCounter++;
        setQuestionLabels();
        this.buttonGroup_SinglePlayer.clearSelection();
    }//GEN-LAST:event_button_SinglePlayerSubmitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuzzGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuzzGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuzzGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuzzGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuzzGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel MultiPlayerNames;
    private javax.swing.JPanel NewGame;
    private javax.swing.JPanel SinglePlayerGame;
    private javax.swing.JPanel SinglePlayerName;
    private javax.swing.ButtonGroup buttonGroup_SinglePlayer;
    private javax.swing.JButton button_Exit;
    private javax.swing.JButton button_MultiPlay;
    private javax.swing.JButton button_MultiPlay_Back;
    private javax.swing.JButton button_NewGame;
    private javax.swing.JButton button_NewGame_Back;
    private javax.swing.JButton button_Proceed;
    private javax.swing.JButton button_SinglePlay;
    private javax.swing.JButton button_SinglePlay_Back;
    private javax.swing.JButton button_SinglePlayerSubmit;
    private javax.swing.JComboBox<String> comboBox_NumberOfPlayers;
    private javax.swing.JLabel label_ImageContainer;
    private javax.swing.JLabel label_MultiName1;
    private javax.swing.JLabel label_MultiName2;
    private javax.swing.JLabel label_NumberOfPlayers;
    private javax.swing.JLabel label_NumberOfRounds;
    private javax.swing.JLabel label_QuestionSentence;
    private javax.swing.JLabel label_RoundType;
    private javax.swing.JLabel label_SingleName;
    private javax.swing.JLabel label_Welcome;
    private javax.swing.JRadioButton radioButton_First;
    private javax.swing.JRadioButton radioButton_Fourth;
    private javax.swing.JRadioButton radioButton_Second;
    private javax.swing.JRadioButton radioButton_Third;
    private javax.swing.JTextField textField_MultiName1;
    private javax.swing.JTextField textField_MultiName2;
    private javax.swing.JTextField textField_NumberOfRounds;
    private javax.swing.JTextField textField_SingleName;
    // End of variables declaration//GEN-END:variables
}
