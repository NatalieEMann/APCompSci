package APCompSci.Assignments.Assign9; 
/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * S-h-e-n-e-n-d-e-h-o-w-a--H-i-g-h--S-c-h-o-o-l--T-e-c-h-n-o-l-o-g-y--D-e-p-t
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *      FILE:       StringPracticeFrame.java
 *      DATE:       8/2013 Original
 *      AUTHOR:     mr Hanley
 *      VERSION:    3.0
 *      PURPOSE:    GUI for String Practice.  It's sick.  In a good way, yep!
 *                  Contains methods that the GUI will use to operate
 *                  12/15/2020: Changed the image loading to use ImageIO.read
 *                  instead of loading from the ClassLoader
 *                  2/25/2021:  Changed image loading again so it would work
 *                              with a jar file if needed
 *                  1/5/2022:   Updated with a checkbox for password checker
 *                  1/24/2022:  Got rid of adding http for the title and links enter site button
 *                  2/6/2022:   Added 2 websites that are not likely to change
 *                              I extended the Level1 and Level2 labels
 *                  1/10/2023:  Sophia Hopp(23) redesigned, Thanks Sophia
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class StringPractFrame extends javax.swing.JFrame implements ActionListener
{

    //----------------------------------------------------------------\\
    //---------------- I N S T A N C E  V A R I A B L E S ------------\\
    //----------------------------------------------------------------\\
    Font fo = new Font("Californian FB", Font.BOLD, 32);
    //Fonts for Pascals Triangle Pane
    Font arial32 = new Font("Arial Unicode MS", Font.PLAIN, 32);
    JButton[] exitBUTs = new JButton[6];
    StringMethods sm = new StringMethods();
    ImageIcon sadIcon;
    ImageIcon happyIcon;
    //Added 12/1/2023
    ImageIcon hanleyIcon;   //For the Easter Egg!
    AboutFrame af = new AboutFrame();

    // Creates new form StringPractFrame
    public StringPractFrame()
    {
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Windows Classic".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(StringPractFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(StringPractFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(StringPractFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(StringPractFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
        setupTitles();
        setupCoolExitButtons();
        addToTitleComboBox();
        addToLinksComboBox();
        try
        {
            InputStream instr = getClass().getClassLoader().
                    getResourceAsStream("images/td.png");
            InputStream instr2 = getClass().getClassLoader().
                    getResourceAsStream("images/tu.png");
            InputStream instr3 = getClass().getClassLoader().
                    getResourceAsStream("images/mr Hanley small.jpg");

            sadIcon = new ImageIcon(ImageIO.read(instr));
            happyIcon = new ImageIcon(ImageIO.read(instr2));
            hanleyIcon = new ImageIcon(ImageIO.read(instr3));

        } catch (IOException e)
        {
            e.printStackTrace();
        }
        af.setBounds(200, 100, 850, 600);
    }

    public void setupTitles()
    {
        // pascals \\
        pascalPAN.setBackground(new Color(71, 88, 64));
        @SuppressWarnings("unused")
        String tempTitle = "Pascals Triangle", newTitle = "";
        mainTP.setTitleAt(0, tempTitle);
        mainTP.setBackground(new Color(71, 88, 64));

        // music \\
        tempTitle = "Music";
        newTitle = "";
        mainTP.setTitleAt(1, tempTitle);
        musicPAN.setBackground(new Color(71, 88, 64));
        songTF.setBackground(new Color(56, 70, 50));

        // password \\
        tempTitle = "Password";
        mainTP.setTitleAt(2, tempTitle);
        passwdPAN.setBackground(new Color(71, 88, 64));

        // compare to \\
        tempTitle = "Compare";
        mainTP.setTitleAt(3, tempTitle);
        comparePAN.setBackground(new Color(71, 88, 64));

        // title \\
        tempTitle = "Title";
        mainTP.setTitleAt(4, tempTitle);
        titlePAN.setBackground(new Color(71, 88, 64));

        // links \\
        tempTitle = "Web Links";
        mainTP.setTitleAt(5, tempTitle);
        linksPAN.setBackground(new Color(71, 88, 64));

        level1RB.setBackground(new Color(56, 70, 50));
        level2RB.setBackground(new Color(56, 70, 50));
    }

    public void setupCoolExitButtons()
    {
        for (int i = 0; i < exitBUTs.length; i++)
        {
            exitBUTs[i] = new JButton("exit");
            exitBUTs[i].setBounds(new Rectangle(0, 785, 1530, 37));
            exitBUTs[i].setFont(fo);
            exitBUTs[i].addActionListener(this);
            exitBUTs[i].setBackground(new Color(56, 70, 50));
            exitBUTs[i].setForeground(Color.white);
        }
        pascalPAN.add(exitBUTs[0]);
        linksPAN.add(exitBUTs[1]);
        titlePAN.add(exitBUTs[2]);
        musicPAN.add(exitBUTs[3]);
        comparePAN.add(exitBUTs[4]);
        passwdPAN.add(exitBUTs[5]);
    }

    @SuppressWarnings("unchecked")
    public void addToTitleComboBox()
    {
        //Add some URL's to the ComboBox
        siteCB.addItem("https://silkyintentionaltag.khaihern.repl.co/");
        siteCB.addItem("https://www.internetsociety.org/");
        siteCB.addItem("https://www.internetsociety.org/internet/history-internet/");
        siteCB.addItem("https://www.digitaltrends.com/gaming/the-history-of-the-xbox/");
        siteCB.addItem("http://www.google.com");
        siteCB.addItem("https://cs.union.edu/~rieffelj/");
        siteCB.addItem("https://www.union.edu/english/faculty-staff/kara-doyle");
        siteCB.addItem("https://www.union.edu/english/faculty-staff/andrew-burkett");
        siteCB.addItem("https://sites.google.com/a/shenschools.org/mr-desario/");
        siteCB.addItem("https://racketlounge.com/history-of-tennis/");
    }
    
    @SuppressWarnings("unchecked")
    public void addToLinksComboBox()
    {
        //Add some URL's to the ComboBox
        siteLinksCB.addItem("https://www.internetsociety.org/");
        siteLinksCB.addItem("https://www.internetsociety.org/internet/history-internet/");
        siteLinksCB.addItem("https://www.digitaltrends.com/gaming/the-history-of-the-xbox/");
        siteLinksCB.addItem("http://www.google.com");
        siteLinksCB.addItem("https://cs.union.edu/~rieffelj/");
        siteLinksCB.addItem("https://www.union.edu/english/faculty-staff/kara-doyle");
        siteLinksCB.addItem("https://www.union.edu/english/faculty-staff/andrew-burkett");
        siteLinksCB.addItem("https://sites.google.com/a/shenschools.org/mr-desario/");
        siteLinksCB.addItem("https://racketlounge.com/history-of-tennis/");
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        for (int i = 0; i < exitBUTs.length; i++)
        {
            if (e.getSource() == exitBUTs[i])
            {
                System.exit(0);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    @SuppressWarnings("rawtypes")
    private void initComponents() {

        rightBUT = new javax.swing.JButton();
        levelBG = new javax.swing.ButtonGroup();
        mainTP = new javax.swing.JTabbedPane();
        pascalPAN = new javax.swing.JPanel();
        pasSizeTF = new javax.swing.JTextField();
        pasBUT = new javax.swing.JButton();
        pasSP = new javax.swing.JScrollPane();
        pasTA = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        musicPAN = new javax.swing.JPanel();
        songTF = new javax.swing.JTextField();
        numwordsTF = new javax.swing.JTextField();
        songLBL = new javax.swing.JLabel();
        numwordsLBL = new javax.swing.JLabel();
        numwordsBUT = new javax.swing.JButton();
        passwdPAN = new javax.swing.JPanel();
        enterpaBUT = new javax.swing.JButton();
        pwTF = new javax.swing.JPasswordField();
        pwLBL = new javax.swing.JLabel();
        passwordRequireLBL = new javax.swing.JLabel();
        result_fail_LBL = new javax.swing.JLabel();
        level1RB = new javax.swing.JRadioButton();
        level2RB = new javax.swing.JRadioButton();
        resultLBL1 = new javax.swing.JLabel();
        result_correct_LBL = new javax.swing.JLabel();
        comparePAN = new javax.swing.JPanel();
        firstWordTF = new javax.swing.JTextField();
        secondWordTF = new javax.swing.JTextField();
        resultTF = new javax.swing.JTextField();
        ctLBL = new javax.swing.JLabel();
        compareBUT = new javax.swing.JButton();
        titlePAN = new javax.swing.JPanel();
        urlLBL = new javax.swing.JLabel();
        siteCB = new javax.swing.JComboBox();
        titleTF = new javax.swing.JTextField();
        statusTF = new javax.swing.JTextField();
        htmlSP = new javax.swing.JScrollPane();
        htmlTP = new javax.swing.JTextPane();
        statusLBL = new javax.swing.JLabel();
        titleSiteLBL = new javax.swing.JLabel();
        sourceLBL = new javax.swing.JLabel();
        openBUT = new javax.swing.JButton();
        enterBUT = new javax.swing.JButton();
        linksPAN = new javax.swing.JPanel();
        openLinksBUT = new javax.swing.JButton();
        enterLinksBUT = new javax.swing.JButton();
        urlLinksLBL = new javax.swing.JLabel();
        siteLinksCB = new javax.swing.JComboBox();
        linksLBL = new javax.swing.JLabel();
        linkStatusTF = new javax.swing.JTextField();
        numLinksLBL = new javax.swing.JLabel();
        numLinksTF = new javax.swing.JTextField();
        sourceLBL1 = new javax.swing.JLabel();
        htmlSP1 = new javax.swing.JScrollPane();
        htmlLinksTP = new javax.swing.JTextPane();
        statusLBL2 = new javax.swing.JLabel();
        linksSP = new javax.swing.JScrollPane();
        linksTA = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        easterEggBUT = new javax.swing.JButton();
        titleLBL = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        mainTP.setBackground(titleLBL.getBackground());
        mainTP.setForeground(new java.awt.Color(255, 255, 255));
        mainTP.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        mainTP.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N

        pascalPAN.setBackground(titleLBL.getBackground());
        pascalPAN.setForeground(titleLBL.getBackground());
        pascalPAN.setFont(new java.awt.Font("Consolas", 1, 10)); // NOI18N
        pascalPAN.setLayout(null);

        pasSizeTF.setBackground(new java.awt.Color(56, 70, 50));
        pasSizeTF.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        pasSizeTF.setForeground(new java.awt.Color(255, 255, 255));
        pasSizeTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pasSizeTF.setText("0");
        pasSizeTF.setBorder(null);
        pascalPAN.add(pasSizeTF);
        pasSizeTF.setBounds(610, 10, 80, 30);

        pasBUT.setBackground(new java.awt.Color(179, 124, 33));
        pasBUT.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        pasBUT.setForeground(new java.awt.Color(255, 255, 255));
        pasBUT.setText("Draw");
        pasBUT.setToolTipText("");
        pasBUT.setBorder(null);
        pasBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasBUTActionPerformed(evt);
            }
        });
        pascalPAN.add(pasBUT);
        pasBUT.setBounds(460, 10, 120, 30);

        pasTA.setBackground(pasSizeTF.getBackground());
        pasTA.setColumns(20);
        pasTA.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        pasTA.setForeground(new java.awt.Color(255, 255, 255));
        pasTA.setRows(5);
        pasSP.setViewportView(pasTA);

        pascalPAN.add(pasSP);
        pasSP.setBounds(10, 70, 1290, 550);

        jCheckBox1.setBackground(new java.awt.Color(71, 88, 64));
        jCheckBox1.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jCheckBox1.setForeground(java.awt.Color.white);
        jCheckBox1.setText("Try for Perfect Spacing");
        pascalPAN.add(jCheckBox1);
        jCheckBox1.setBounds(710, 10, 210, 26);

        mainTP.addTab("P*a*s*c*a*l*s*T*r*i*a*n*g*l*e", pascalPAN);

        musicPAN.setBackground(titleLBL.getBackground());
        musicPAN.setLayout(null);

        songTF.setBackground(pasSizeTF.getBackground());
        songTF.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        songTF.setForeground(new java.awt.Color(255, 255, 255));
        songTF.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        songTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songTFActionPerformed(evt);
            }
        });
        musicPAN.add(songTF);
        songTF.setBounds(410, 160, 670, 30);

        numwordsTF.setBackground(pasSizeTF.getBackground());
        numwordsTF.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        numwordsTF.setForeground(new java.awt.Color(255, 255, 255));
        numwordsTF.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        musicPAN.add(numwordsTF);
        numwordsTF.setBounds(410, 250, 100, 30);

        songLBL.setFont(new java.awt.Font("Californian FB", 1, 36)); // NOI18N
        songLBL.setForeground(new java.awt.Color(255, 255, 255));
        songLBL.setText("Enter Song Name");
        musicPAN.add(songLBL);
        songLBL.setBounds(130, 150, 340, 50);

        numwordsLBL.setFont(new java.awt.Font("Californian FB", 1, 36)); // NOI18N
        numwordsLBL.setForeground(new java.awt.Color(255, 255, 255));
        numwordsLBL.setText("Number Words");
        musicPAN.add(numwordsLBL);
        numwordsLBL.setBounds(130, 210, 260, 110);

        numwordsBUT.setBackground(pasBUT.getBackground());
        numwordsBUT.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        numwordsBUT.setForeground(new java.awt.Color(255, 255, 255));
        numwordsBUT.setText("Count Words");
        numwordsBUT.setBorder(null);
        numwordsBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numwordsBUTActionPerformed(evt);
            }
        });
        musicPAN.add(numwordsBUT);
        numwordsBUT.setBounds(490, 400, 270, 80);

        mainTP.addTab("Music", musicPAN);

        passwdPAN.setBackground(titleLBL.getBackground());
        passwdPAN.setForeground(new java.awt.Color(255, 255, 255));
        passwdPAN.setLayout(null);

        enterpaBUT.setBackground(pasBUT.getBackground());
        enterpaBUT.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        enterpaBUT.setForeground(new java.awt.Color(255, 255, 255));
        enterpaBUT.setText("Enter Password");
        enterpaBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpaBUTActionPerformed(evt);
            }
        });
        passwdPAN.add(enterpaBUT);
        enterpaBUT.setBounds(430, 350, 230, 70);

        pwTF.setBackground(pasSizeTF.getBackground());
        pwTF.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        pwTF.setForeground(new java.awt.Color(255, 255, 255));
        pwTF.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pwTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwtfFocusGained(evt);
            }
        });
        pwTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwTFActionPerformed(evt);
            }
        });
        passwdPAN.add(pwTF);
        pwTF.setBounds(400, 240, 300, 70);

        pwLBL.setFont(new java.awt.Font("Californian FB", 0, 48)); // NOI18N
        pwLBL.setForeground(new java.awt.Color(255, 255, 255));
        pwLBL.setText("Enter Password");
        pwLBL.setToolTipText("");
        passwdPAN.add(pwLBL);
        pwLBL.setBounds(390, 160, 350, 80);

        passwordRequireLBL.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        passwordRequireLBL.setForeground(new java.awt.Color(255, 255, 255));
        passwordRequireLBL.setText("Password must be >= 6 symbols and at least one non-letter");
        passwdPAN.add(passwordRequireLBL);
        passwordRequireLBL.setBounds(310, 10, 660, 40);
        passwdPAN.add(result_fail_LBL);
        result_fail_LBL.setBounds(102, 180, 270, 250);

        levelBG.add(level1RB);
        level1RB.setFont(new java.awt.Font("Californian FB", 0, 18)); // NOI18N
        level1RB.setForeground(new java.awt.Color(255, 255, 255));
        level1RB.setSelected(true);
        level1RB.setText("Level 1");
        level1RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level1RBActionPerformed(evt);
            }
        });
        passwdPAN.add(level1RB);
        level1RB.setBounds(520, 60, 130, 26);

        levelBG.add(level2RB);
        level2RB.setFont(new java.awt.Font("Californian FB", 0, 18)); // NOI18N
        level2RB.setForeground(new java.awt.Color(255, 255, 255));
        level2RB.setText("Level 2");
        level2RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level2RBActionPerformed(evt);
            }
        });
        passwdPAN.add(level2RB);
        level2RB.setBounds(520, 120, 130, 26);
        passwdPAN.add(resultLBL1);
        resultLBL1.setBounds(690, 340, 232, 217);
        passwdPAN.add(result_correct_LBL);
        result_correct_LBL.setBounds(732, 180, 270, 250);

        mainTP.addTab("Password", passwdPAN);

        comparePAN.setBackground(titleLBL.getBackground());
        comparePAN.setLayout(null);

        firstWordTF.setBackground(pasSizeTF.getBackground());
        firstWordTF.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        firstWordTF.setForeground(new java.awt.Color(255, 255, 255));
        firstWordTF.setText("A");
        firstWordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstWordTFActionPerformed(evt);
            }
        });
        comparePAN.add(firstWordTF);
        firstWordTF.setBounds(480, 110, 260, 30);

        secondWordTF.setBackground(pasSizeTF.getBackground());
        secondWordTF.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        secondWordTF.setForeground(new java.awt.Color(255, 255, 255));
        secondWordTF.setText("B");
        comparePAN.add(secondWordTF);
        secondWordTF.setBounds(480, 230, 260, 30);

        resultTF.setEditable(false);
        resultTF.setBackground(pasSizeTF.getBackground());
        resultTF.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        resultTF.setForeground(new java.awt.Color(255, 255, 255));
        resultTF.setBorder(null);
        resultTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultTFActionPerformed(evt);
            }
        });
        comparePAN.add(resultTF);
        resultTF.setBounds(560, 300, 80, 30);

        ctLBL.setFont(new java.awt.Font("Californian FB", 1, 48)); // NOI18N
        ctLBL.setForeground(new java.awt.Color(255, 255, 255));
        ctLBL.setText("compareTo");
        comparePAN.add(ctLBL);
        ctLBL.setBounds(490, 140, 330, 100);

        compareBUT.setBackground(pasBUT.getBackground());
        compareBUT.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        compareBUT.setForeground(new java.awt.Color(255, 255, 255));
        compareBUT.setText("compareTo");
        compareBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compareBUTActionPerformed(evt);
            }
        });
        comparePAN.add(compareBUT);
        compareBUT.setBounds(520, 370, 160, 80);

        mainTP.addTab("Compare To", comparePAN);

        titlePAN.setBackground(titleLBL.getBackground());
        titlePAN.setLayout(null);

        urlLBL.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        urlLBL.setForeground(new java.awt.Color(255, 255, 255));
        urlLBL.setText("URL");
        titlePAN.add(urlLBL);
        urlLBL.setBounds(20, 60, 40, 30);

        siteCB.setBackground(pasSizeTF.getBackground());
        siteCB.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        siteCB.setForeground(new java.awt.Color(255, 255, 255));
        siteCB.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        titlePAN.add(siteCB);
        siteCB.setBounds(20, 90, 1100, 20);

        titleTF.setBackground(pasSizeTF.getBackground());
        titleTF.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        titleTF.setForeground(new java.awt.Color(255, 255, 255));
        titleTF.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        titlePAN.add(titleTF);
        titleTF.setBounds(20, 180, 1100, 30);

        statusTF.setBackground(pasSizeTF.getBackground());
        statusTF.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        statusTF.setForeground(new java.awt.Color(255, 255, 255));
        statusTF.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        titlePAN.add(statusTF);
        statusTF.setBounds(20, 130, 1100, 20);

        htmlTP.setBackground(pasSizeTF.getBackground());
        htmlTP.setBorder(null);
        htmlTP.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        htmlTP.setForeground(new java.awt.Color(255, 255, 255));
        htmlSP.setViewportView(htmlTP);

        titlePAN.add(htmlSP);
        htmlSP.setBounds(20, 230, 1100, 380);

        statusLBL.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        statusLBL.setForeground(new java.awt.Color(255, 255, 255));
        statusLBL.setText("Status");
        titlePAN.add(statusLBL);
        statusLBL.setBounds(20, 110, 160, 20);

        titleSiteLBL.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        titleSiteLBL.setForeground(new java.awt.Color(255, 255, 255));
        titleSiteLBL.setText("HTML Title");
        titlePAN.add(titleSiteLBL);
        titleSiteLBL.setBounds(20, 154, 160, 20);

        sourceLBL.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        sourceLBL.setForeground(new java.awt.Color(255, 255, 255));
        sourceLBL.setText("Page Source");
        titlePAN.add(sourceLBL);
        sourceLBL.setBounds(20, 210, 160, 22);

        openBUT.setBackground(pasBUT.getBackground());
        openBUT.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        openBUT.setForeground(new java.awt.Color(255, 255, 255));
        openBUT.setText("Open Site");
        openBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBUTActionPerformed(evt);
            }
        });
        titlePAN.add(openBUT);
        openBUT.setBounds(200, 20, 180, 30);

        enterBUT.setBackground(pasBUT.getBackground());
        enterBUT.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        enterBUT.setForeground(new java.awt.Color(255, 255, 255));
        enterBUT.setText("Enter Site");
        enterBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBUTActionPerformed(evt);
            }
        });
        titlePAN.add(enterBUT);
        enterBUT.setBounds(400, 20, 160, 30);

        mainTP.addTab("Title", titlePAN);

        linksPAN.setBackground(titleLBL.getBackground());
        linksPAN.setLayout(null);

        openLinksBUT.setBackground(pasBUT.getBackground());
        openLinksBUT.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        openLinksBUT.setForeground(new java.awt.Color(255, 255, 255));
        openLinksBUT.setText("Open Site");
        openLinksBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openLinksBUTActionPerformed(evt);
            }
        });
        linksPAN.add(openLinksBUT);
        openLinksBUT.setBounds(260, 20, 120, 30);

        enterLinksBUT.setBackground(pasBUT.getBackground());
        enterLinksBUT.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        enterLinksBUT.setForeground(new java.awt.Color(255, 255, 255));
        enterLinksBUT.setText("Enter Site");
        enterLinksBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterLinksBUTActionPerformed(evt);
            }
        });
        linksPAN.add(enterLinksBUT);
        enterLinksBUT.setBounds(400, 20, 120, 30);

        urlLinksLBL.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        urlLinksLBL.setForeground(new java.awt.Color(255, 255, 255));
        urlLinksLBL.setText("URL");
        linksPAN.add(urlLinksLBL);
        urlLinksLBL.setBounds(20, 70, 160, 20);

        siteLinksCB.setBackground(pasSizeTF.getBackground());
        siteLinksCB.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        siteLinksCB.setForeground(new java.awt.Color(255, 255, 255));
        siteLinksCB.setBorder(null);
        linksPAN.add(siteLinksCB);
        siteLinksCB.setBounds(20, 90, 1010, 20);

        linksLBL.setFont(new java.awt.Font("Californian FB", 1, 12)); // NOI18N
        linksLBL.setForeground(new java.awt.Color(255, 255, 255));
        linksLBL.setText("Links");
        linksPAN.add(linksLBL);
        linksLBL.setBounds(20, 170, 160, 14);

        linkStatusTF.setBackground(pasSizeTF.getBackground());
        linkStatusTF.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        linkStatusTF.setForeground(new java.awt.Color(255, 255, 255));
        linkStatusTF.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        linksPAN.add(linkStatusTF);
        linkStatusTF.setBounds(20, 130, 180, 30);

        numLinksLBL.setFont(new java.awt.Font("Californian FB", 1, 12)); // NOI18N
        numLinksLBL.setForeground(new java.awt.Color(255, 255, 255));
        numLinksLBL.setText("# HyperlInks");
        linksPAN.add(numLinksLBL);
        numLinksLBL.setBounds(220, 110, 160, 14);

        numLinksTF.setBackground(pasSizeTF.getBackground());
        numLinksTF.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        numLinksTF.setForeground(new java.awt.Color(255, 255, 255));
        numLinksTF.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        linksPAN.add(numLinksTF);
        numLinksTF.setBounds(220, 130, 100, 30);

        sourceLBL1.setFont(new java.awt.Font("Californian FB", 1, 12)); // NOI18N
        sourceLBL1.setForeground(new java.awt.Color(255, 255, 255));
        sourceLBL1.setText("Page Source");
        linksPAN.add(sourceLBL1);
        sourceLBL1.setBounds(10, 400, 160, 14);

        htmlLinksTP.setBackground(pasSizeTF.getBackground());
        htmlLinksTP.setBorder(null);
        htmlLinksTP.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        htmlLinksTP.setForeground(new java.awt.Color(255, 255, 255));
        htmlSP1.setViewportView(htmlLinksTP);

        linksPAN.add(htmlSP1);
        htmlSP1.setBounds(10, 420, 1230, 190);

        statusLBL2.setFont(new java.awt.Font("Californian FB", 1, 12)); // NOI18N
        statusLBL2.setForeground(new java.awt.Color(255, 255, 255));
        statusLBL2.setText("Status");
        linksPAN.add(statusLBL2);
        statusLBL2.setBounds(20, 110, 160, 14);

        linksTA.setBackground(pasSizeTF.getBackground());
        linksTA.setColumns(20);
        linksTA.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        linksTA.setForeground(new java.awt.Color(255, 255, 255));
        linksTA.setRows(5);
        linksTA.setBorder(null);
        linksSP.setViewportView(linksTA);

        linksPAN.add(linksSP);
        linksSP.setBounds(10, 190, 1230, 200);

        mainTP.addTab("Links", linksPAN);

        getContentPane().add(mainTP);
        mainTP.setBounds(30, 70, 1480, 670);

        jPanel1.setBackground(new Color(71,88,64));
        jPanel1.setLayout(null);

        easterEggBUT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mr Hanley Small.jpg"))); // NOI18N
        easterEggBUT.setBorderPainted(false);
        easterEggBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easterEggBUTActionPerformed(evt);
            }
        });
        jPanel1.add(easterEggBUT);
        easterEggBUT.setBounds(980, 10, 45, 50);

        titleLBL.setBackground(new java.awt.Color(71, 88, 64));
        titleLBL.setFont(new java.awt.Font("Californian FB", 1, 48)); // NOI18N
        titleLBL.setForeground(new java.awt.Color(255, 255, 255));
        titleLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLBL.setText("String Practice");
        titleLBL.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(titleLBL);
        titleLBL.setBounds(500, 10, 410, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1470, 830);

        jButton1.setText("jButton1");
        getContentPane().add(jButton1);
        jButton1.setBounds(960, 5, 80, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pasBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasBUTActionPerformed
        int num = Integer.parseInt(pasSizeTF.getText());

        //int numdigits = 
        if (num < 3 || num > 100)
        {
            JOptionPane.showMessageDialog(null, "Out of Range", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else
        {
            String triangle = sm.pascalsTri(num);
            //Set the font size according to the size of the triangle
//            if(num < 8){
//                pasTA.setFont(arial32);
//            }
            pasTA.setText(triangle);
        }
    }//GEN-LAST:event_pasBUTActionPerformed

    private void openBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openBUTActionPerformed
        //Grab the web site we are trying to open
        int which = siteCB.getSelectedIndex();
        //Now grab the string
        String url = (String) siteCB.getItemAt(which);
        String text = null;
        try
        {
            text = sm.openURL(url);
            statusTF.setText("Connected");
        } catch (Exception ex)
        {
            statusTF.setText(ex.toString());
        }
        String title = sm.findTitle(text);
        titleTF.setText(title);
        htmlTP.setText(text);
        htmlTP.setCaretPosition(0);
    }//GEN-LAST:event_openBUTActionPerformed

    @SuppressWarnings("unchecked")
    private void enterBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBUTActionPerformed
        String newSite = JOptionPane.showInputDialog(null,
                "Please enter in site ");
        if (newSite != null)
        {
            siteCB.addItem(newSite);
            siteCB.setSelectedIndex(siteCB.getItemCount() - 1);
        }
    }//GEN-LAST:event_enterBUTActionPerformed

    private void openLinksBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openLinksBUTActionPerformed
        /**
         * ***************************************************************
         * # 4
         * G E T L I N K S S T U F F
         *
         ****************************************************************
         */
        //Grab the web site we are trying to open
        int which = siteLinksCB.getSelectedIndex();
        //Now grab the string
        String url = (String) siteLinksCB.getItemAt(which);
        String text = null;
        try
        {
            text = sm.openURL(url);
            linkStatusTF.setText("Connected");
        } catch (Exception ex)
        {
            linkStatusTF.setText(ex.toString());
        }
        String[] links = sm.findLinks(text);
        //Set the number on the for the linksTF
        numLinksTF.setText(links.length + "");
        //Clear the old links
        linksTA.setText("");
        for (String elem : links)
        {
            linksTA.append(elem + "\n");
        }
        htmlLinksTP.setText(text);
        htmlLinksTP.setCaretPosition(0);
        linksTA.setCaretPosition(0);
    }//GEN-LAST:event_openLinksBUTActionPerformed

    @SuppressWarnings("unchecked")
    private void enterLinksBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterLinksBUTActionPerformed
        String newSite = JOptionPane.showInputDialog(null,
                "Please enter in site ");
        if (newSite != null)
        {
            siteLinksCB.addItem(newSite);
            siteLinksCB.setSelectedIndex(siteLinksCB.getItemCount() - 1);
        }
    }//GEN-LAST:event_enterLinksBUTActionPerformed

    private void numwordsBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numwordsBUTActionPerformed
        String songText = songTF.getText();
        if (songText.trim().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Empty Song", "ERROR!",
                    JOptionPane.ERROR_MESSAGE);
        } else
        {
            int count = sm.numWords(songText);
            numwordsTF.setText(count + "");
        }

    }//GEN-LAST:event_numwordsBUTActionPerformed

    @SuppressWarnings("deprecation")
    private void enterpaBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpaBUTActionPerformed
        String pw = pwTF.getText().trim();

        int lvl = 1;
        if (level2RB.isSelected())
        {
            lvl = 2;
        }
        if (sm.passwordVerify(pw, lvl))
        {
            result_correct_LBL.setIcon(happyIcon);
            result_fail_LBL.setIcon(null);
        } else
        {
            result_fail_LBL.setIcon(sadIcon);
            result_correct_LBL.setIcon(null);
        }

    }//GEN-LAST:event_enterpaBUTActionPerformed

    private void compareBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compareBUTActionPerformed
        int a = firstWordTF.getText().compareTo(secondWordTF.getText());

        resultTF.setText(String.valueOf(a));
    }//GEN-LAST:event_compareBUTActionPerformed

    private void songTFActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_songTFActionPerformed
    {//GEN-HEADEREND:event_songTFActionPerformed
    }//GEN-LAST:event_songTFActionPerformed

    private void resultTFActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_resultTFActionPerformed
    {//GEN-HEADEREND:event_resultTFActionPerformed
    }//GEN-LAST:event_resultTFActionPerformed

    private void firstWordTFActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_firstWordTFActionPerformed
    {//GEN-HEADEREND:event_firstWordTFActionPerformed
    }//GEN-LAST:event_firstWordTFActionPerformed

    private void easterEggBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easterEggBUTActionPerformed
        af.setVisible(true);
    }//GEN-LAST:event_easterEggBUTActionPerformed

    private void level2RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level2RBActionPerformed
        passwordRequireLBL.setText("Password must be >= 8 symbols and at least one non-letter, one uppercase and one digit");
    }//GEN-LAST:event_level2RBActionPerformed

    private void level1RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level1RBActionPerformed
        passwordRequireLBL.setText("Password must be >= 6 symbols and at least one non-letter");
    }//GEN-LAST:event_level1RBActionPerformed

    private void pwtfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwtfFocusGained
        result_fail_LBL.setIcon(null);
    }//GEN-LAST:event_pwtfFocusGained

    private void pwTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwTFActionPerformed
    }//GEN-LAST:event_pwTFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton compareBUT;
    private javax.swing.JPanel comparePAN;
    private javax.swing.JLabel ctLBL;
    private javax.swing.JButton easterEggBUT;
    private javax.swing.JButton enterBUT;
    private javax.swing.JButton enterLinksBUT;
    private javax.swing.JButton enterpaBUT;
    private javax.swing.JTextField firstWordTF;
    private javax.swing.JTextPane htmlLinksTP;
    private javax.swing.JScrollPane htmlSP;
    private javax.swing.JScrollPane htmlSP1;
    private javax.swing.JTextPane htmlTP;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton level1RB;
    private javax.swing.JRadioButton level2RB;
    private javax.swing.ButtonGroup levelBG;
    private javax.swing.JTextField linkStatusTF;
    private javax.swing.JLabel linksLBL;
    private javax.swing.JPanel linksPAN;
    private javax.swing.JScrollPane linksSP;
    private javax.swing.JTextArea linksTA;
    private javax.swing.JTabbedPane mainTP;
    private javax.swing.JPanel musicPAN;
    private javax.swing.JLabel numLinksLBL;
    private javax.swing.JTextField numLinksTF;
    private javax.swing.JButton numwordsBUT;
    private javax.swing.JLabel numwordsLBL;
    private javax.swing.JTextField numwordsTF;
    private javax.swing.JButton openBUT;
    private javax.swing.JButton openLinksBUT;
    private javax.swing.JButton pasBUT;
    private javax.swing.JScrollPane pasSP;
    private javax.swing.JTextField pasSizeTF;
    private javax.swing.JTextArea pasTA;
    private javax.swing.JPanel pascalPAN;
    private javax.swing.JPanel passwdPAN;
    private javax.swing.JLabel passwordRequireLBL;
    private javax.swing.JLabel pwLBL;
    private javax.swing.JPasswordField pwTF;
    private javax.swing.JLabel resultLBL1;
    private javax.swing.JTextField resultTF;
    private javax.swing.JLabel result_correct_LBL;
    private javax.swing.JLabel result_fail_LBL;
    @SuppressWarnings("unused")
    private javax.swing.JButton rightBUT;
    private javax.swing.JTextField secondWordTF;
    @SuppressWarnings("rawtypes")
    private javax.swing.JComboBox siteCB;
    @SuppressWarnings("rawtypes")
    private javax.swing.JComboBox siteLinksCB;
    private javax.swing.JLabel songLBL;
    private javax.swing.JTextField songTF;
    private javax.swing.JLabel sourceLBL;
    private javax.swing.JLabel sourceLBL1;
    private javax.swing.JLabel statusLBL;
    private javax.swing.JLabel statusLBL2;
    private javax.swing.JTextField statusTF;
    private javax.swing.JLabel titleLBL;
    private javax.swing.JPanel titlePAN;
    private javax.swing.JLabel titleSiteLBL;
    private javax.swing.JTextField titleTF;
    private javax.swing.JLabel urlLBL;
    private javax.swing.JLabel urlLinksLBL;
    // End of variables declaration//GEN-END:variables
}
