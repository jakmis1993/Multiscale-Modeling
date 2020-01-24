package GrainGrowth;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

public class MainInterface extends javax.swing.JFrame {

    //Width of the board
    static int sizeX = DefaultBoard.rowsConst;
    
    // Height of the board
    static int sizeY = DefaultBoard.columnsConst;              
//    double dT = 0;
    Grain boardGrain[][];
    boolean simulationRun;
    Thread thread;
    HandlerClass handler = new HandlerClass();
    private Board array;
    private int numberOfIteration;
    ArrayList<Integer> chosenGrainsArray = new ArrayList();

    public MainInterface() {
        numberOfIteration = 0;
        array = new Board(sizeX, sizeY);                                        //generating defaultboard
        boardGrain = new Grain[sizeX][sizeY];
        for (int i = 0; i < sizeX; i++) {                                       //creating calls
            for (int j = 0; j < sizeY; j++) {
                boardGrain[i][j] = new Grain();             
            }
        }
        
        initComponents();
        
//        ConditionsComboBox.setVisible(false);
//        jLabel10.setVisible(false);
//        recrystallizationSlider.setVisible(false);
//        recrystalButton.setVisible(false);
//        jLabel11.setVisible(false);
//        
//        this.jLabel14.setVisible(false);
//        this.jPanel5.setVisible(false);
//        this.jPanel7.setVisible(false);
//        this.jPanel8.setVisible(false);
        
        /// Sets numberr of grians
//        jLabel9.setText("" + array.getCountGrainsCristal());    
        canvas.addMouseListener(handler);
        canvas.addMouseMotionListener(handler);
//        jLabel11.setText(recrystallizationSlider.getValue() + " %");
    }
    
//    private void generateNewBoard() {
//        // genarate board x/y
//
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        xLabelSize = new javax.swing.JLabel();
        YLabelSize = new javax.swing.JLabel();
        countXText = new javax.swing.JTextField();
        countYText = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        colorPanel = new javax.swing.JPanel();
        colorValueLabel = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        ringSizeField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        amountRingsField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        MonteCarloToogleButton = new javax.swing.JToggleButton();
        StartButton = new javax.swing.JButton();
        StopButton = new javax.swing.JButton();
        NeighborhoodComboBox = new javax.swing.JComboBox();
        ConditionsComboBox = new javax.swing.JComboBox();
        GenerateButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        NeighborhoodLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        recrystalButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        recrystallizationSlider = new javax.swing.JSlider();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        randomSeedsCountText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inclusionsAmount = new javax.swing.JTextField();
        inclusionsSize = new javax.swing.JTextField();
        inclusionShapeComboBox = new javax.swing.JComboBox<>();
        addInclusionsButton = new javax.swing.JButton();
        radiusLabel = new javax.swing.JLabel();
        radiusText = new javax.swing.JTextField();
        canvas = new GrainGrowth.Canvas();
        growBoundariesuButton = new javax.swing.JButton();
        selectedGrainsList = new javax.swing.JLabel();
        gbPercentField = new javax.swing.JLabel();
        clearBoundariesCheckbox = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        dualPhaseButton = new javax.swing.JButton();
        substructureButton = new javax.swing.JButton();
        gbSizeInput = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        BCsButton = new javax.swing.JToggleButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        probabilityInput = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        ExportMenu = new javax.swing.JMenu();
        ToBitmapExport = new javax.swing.JMenuItem();
        ToTextFileExport = new javax.swing.JMenuItem();
        showGrainsBorders = new javax.swing.JRadioButtonMenuItem();
        ImportMenu = new javax.swing.JMenu();
        FromBitmapImport = new javax.swing.JMenuItem();
        FromTextFileImport = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(950, 650));
        setMinimumSize(new java.awt.Dimension(950, 650));
        setPreferredSize(new java.awt.Dimension(950, 650));
        setSize(new java.awt.Dimension(950, 650));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(950, 750));
        jPanel1.setMinimumSize(new java.awt.Dimension(950, 750));
        jPanel1.setPreferredSize(new java.awt.Dimension(1150, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setLayout(new java.awt.GridBagLayout());

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSeparator2.setMinimumSize(new java.awt.Dimension(1, 20));
        jSeparator2.setPreferredSize(new java.awt.Dimension(1, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel9.add(jSeparator2, gridBagConstraints);

        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSeparator1.setMinimumSize(new java.awt.Dimension(1, 20));
        jSeparator1.setPreferredSize(new java.awt.Dimension(1, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel9.add(jSeparator1, gridBagConstraints);

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 690, -1, -1));

        jPanel2.setLayout(new java.awt.GridBagLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        xLabelSize.setText("Rows:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel6.add(xLabelSize, gridBagConstraints);

        YLabelSize.setText("Columns:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        jPanel6.add(YLabelSize, gridBagConstraints);

        countXText.setText("500");
        countXText.setToolTipText("");
        countXText.setMinimumSize(new java.awt.Dimension(40, 22));
        countXText.setPreferredSize(new java.awt.Dimension(40, 22));
        countXText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countXTextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel6.add(countXText, gridBagConstraints);

        countYText.setText("500");
        countYText.setMinimumSize(new java.awt.Dimension(40, 22));
        countYText.setPreferredSize(new java.awt.Dimension(40, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        jPanel6.add(countYText, gridBagConstraints);

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jPanel5.setLayout(new java.awt.GridBagLayout());
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 400, -1, -1));

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        idLabel.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel4.add(idLabel, gridBagConstraints);

        colorPanel.setMinimumSize(new java.awt.Dimension(70, 25));
        colorPanel.setPreferredSize(new java.awt.Dimension(70, 25));
        colorPanel.setLayout(new java.awt.GridBagLayout());

        colorValueLabel.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        colorValueLabel.setText("(0,0,0)");
        colorPanel.add(colorValueLabel, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel4.add(colorPanel, gridBagConstraints);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 110, -1, -1));

        jPanel7.setLayout(new java.awt.GridBagLayout());

        ringSizeField.setText("5");
        ringSizeField.setMinimumSize(new java.awt.Dimension(40, 22));
        ringSizeField.setName(""); // NOI18N
        ringSizeField.setPreferredSize(new java.awt.Dimension(40, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 5, 5);
        jPanel7.add(ringSizeField, gridBagConstraints);

        jLabel4.setText("Promień:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 5);
        jPanel7.add(jLabel4, gridBagConstraints);

        amountRingsField.setText("5");
        amountRingsField.setMinimumSize(new java.awt.Dimension(40, 22));
        amountRingsField.setPreferredSize(new java.awt.Dimension(40, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 5);
        jPanel7.add(amountRingsField, gridBagConstraints);

        jLabel5.setText("Ilość pkt:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 2, 5);
        jPanel7.add(jLabel5, gridBagConstraints);

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 640, -1, -1));

        jPanel8.setLayout(new java.awt.GridBagLayout());
        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        MonteCarloToogleButton.setText("Monte Carlo");
        MonteCarloToogleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonteCarloToogleButtonActionPerformed(evt);
            }
        });
        jPanel1.add(MonteCarloToogleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 20, 150, 140));

        StartButton.setText("Start");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });
        jPanel1.add(StartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 140, 50));

        StopButton.setText("Stop");
        StopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopButtonActionPerformed(evt);
            }
        });
        jPanel1.add(StopButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 140, 50));

        NeighborhoodComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Moore", "von Neumann'a", "Extended Moore" }));
        NeighborhoodComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                NeighborhoodComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        NeighborhoodComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NeighborhoodComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(NeighborhoodComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 155, 120, 30));

        ConditionsComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Losowe", "Stała odległość", "Stała ilość ziaren" }));
        ConditionsComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                ConditionsComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        ConditionsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConditionsComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(ConditionsComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 710, 160, 30));

        GenerateButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        GenerateButton.setText("Bild");
        GenerateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(GenerateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 140, 50));

        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 140, 50));

        NeighborhoodLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NeighborhoodLabel.setForeground(new java.awt.Color(255, 255, 255));
        NeighborhoodLabel.setText("Kind of Neighborhood:");
        jPanel1.add(NeighborhoodLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 115, 170, 50));

        jLabel14.setText("Conditions");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 330, -1, -1));

        recrystalButton.setText("Rekrystalizacja");
        recrystalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recrystalButtonActionPerformed(evt);
            }
        });
        jPanel10.add(recrystalButton);

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 700, 230, 40));

        jLabel10.setText("Recristalize: ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 720, -1, -1));

        recrystallizationSlider.setMinimumSize(new java.awt.Dimension(100, 16));
        recrystallizationSlider.setPreferredSize(new java.awt.Dimension(100, 16));
        recrystallizationSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                recrystallizationSliderStateChanged(evt);
            }
        });
        jPanel1.add(recrystallizationSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 360, -1, -1));

        jLabel11.setText("0 %");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 360, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Number of Grains:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        randomSeedsCountText.setText("10");
        randomSeedsCountText.setMinimumSize(new java.awt.Dimension(40, 22));
        randomSeedsCountText.setPreferredSize(new java.awt.Dimension(40, 22));
        jPanel1.add(randomSeedsCountText, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 97, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Size of the Board:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, -1));

        jLabel2.setText("Color:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        jLabel6.setText("Size:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 485, -1, -1));

        inclusionsAmount.setText("10");
        inclusionsAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inclusionsAmountActionPerformed(evt);
            }
        });
        jPanel1.add(inclusionsAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 217, 40, -1));

        inclusionsSize.setText("5");
        inclusionsSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inclusionsSizeActionPerformed(evt);
            }
        });
        jPanel1.add(inclusionsSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 40, -1));

        inclusionShapeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "square", "circular" }));
        inclusionShapeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inclusionShapeComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(inclusionShapeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 282, 80, 30));

        addInclusionsButton.setText("Add Inclusions");
        addInclusionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInclusionsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addInclusionsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 120, 50));

        radiusLabel.setText("Promień:");
        jPanel1.add(radiusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 710, -1, 22));

        radiusText.setText("10");
        radiusText.setMinimumSize(new java.awt.Dimension(40, 22));
        radiusText.setPreferredSize(new java.awt.Dimension(40, 22));
        radiusText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiusTextActionPerformed(evt);
            }
        });
        jPanel1.add(radiusText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 710, -1, -1));

        canvas.setDoubleBuffered(true);
        canvas.setPreferredSize(new java.awt.Dimension(620, 500));
        jPanel1.add(canvas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 590, 500));

        growBoundariesuButton.setText("Grow boundaries");
        growBoundariesuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                growBoundariesuButtonActionPerformed(evt);
            }
        });
        jPanel1.add(growBoundariesuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, -1, -1));

        selectedGrainsList.setText("Selected grains: []");
        jPanel1.add(selectedGrainsList, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 92, 320, 50));

        gbPercentField.setText("GB[%]: 0");
        jPanel1.add(gbPercentField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, -1, -1));

        clearBoundariesCheckbox.setBackground(new java.awt.Color(0, 153, 153));
        clearBoundariesCheckbox.setSelected(true);
        clearBoundariesCheckbox.setText("Clear boundaries");
        jPanel1.add(clearBoundariesCheckbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 555, -1, -1));

        jLabel7.setText("Extended Moore probability:");
        jPanel3.add(jLabel7);

        jPanel11.add(jPanel3);

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 700, 240, 40));

        dualPhaseButton.setText("DualPhase");
        dualPhaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dualPhaseButtonActionPerformed(evt);
            }
        });
        jPanel1.add(dualPhaseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 425, -1, -1));

        substructureButton.setText("Substructure");
        substructureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                substructureButtonActionPerformed(evt);
            }
        });
        jPanel1.add(substructureButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 395, -1, 20));

        gbSizeInput.setText("1");
        gbSizeInput.setMinimumSize(new java.awt.Dimension(100, 26));
        gbSizeInput.setPreferredSize(new java.awt.Dimension(50, 26));
        gbSizeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gbSizeInputActionPerformed(evt);
            }
        });
        jPanel1.add(gbSizeInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        jLabel12.setText("Iteration: 0");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        jLabel8.setText("Number of nucleation:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("0");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 108, 20, 20));

        jLabel16.setText("Size:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 253, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Extended Moore probability:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, -1, -1));

        jLabel18.setText("Amount:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel19.setText("inclusions shape");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 720, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Grain properties:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 87, -1, -1));

        BCsButton.setBackground(new java.awt.Color(153, 153, 153));
        BCsButton.setText("Perdiodic BC");
        BCsButton.setBorderPainted(false);
        BCsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BCsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Inclusions: ");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 195, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Enable Periodic Condition:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Enable Structure:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel24.setText("Type:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 287, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Boundaries:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        probabilityInput.setText("50");
        probabilityInput.setMinimumSize(new java.awt.Dimension(100, 26));
        probabilityInput.setPreferredSize(new java.awt.Dimension(50, 26));
        jPanel1.add(probabilityInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 585, -1, -1));

        jLabel13.setText("Size");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 350, -1, -1));

        jLabel15.setText("ID:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 110, -1, -1));

        getContentPane().add(jPanel1, new java.awt.GridBagConstraints());

        ExportMenu.setText("Export");

        ToBitmapExport.setText("To bitmap");
        ToBitmapExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToBitmapExportActionPerformed(evt);
            }
        });
        ExportMenu.add(ToBitmapExport);

        ToTextFileExport.setText("To text file");
        ToTextFileExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToTextFileExportActionPerformed(evt);
            }
        });
        ExportMenu.add(ToTextFileExport);

        showGrainsBorders.setSelected(true);
        showGrainsBorders.setText("Show grains boarders");
        ExportMenu.add(showGrainsBorders);

        jMenuBar1.add(ExportMenu);

        ImportMenu.setText("Import");
        ImportMenu.setToolTipText("");

        FromBitmapImport.setText("From Bitmap");
        FromBitmapImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FromBitmapImportActionPerformed(evt);
            }
        });
        ImportMenu.add(FromBitmapImport);

        FromTextFileImport.setText("From TextFile");
        FromTextFileImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FromTextFileImportActionPerformed(evt);
            }
        });
        ImportMenu.add(FromTextFileImport);

        jMenuBar1.add(ImportMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private BufferedImage map( int sizeX, int sizeY, boolean showBoundary){
        // naniesienie pliku na plansze X/Y
    final BufferedImage res = new BufferedImage( sizeX, sizeY, BufferedImage.TYPE_INT_RGB );
            for(int j=0;j<MainInterface.sizeY;j++){
            for(int i=0;i<MainInterface.sizeX;i++){
                if(boardGrain[i][j].getId() == 0 || (boardGrain[i][j].isBoundary()) && showBoundary ){
                    res.setRGB(i,j, Color.BLACK.getRGB() );
                }else{
                    int R = boardGrain[i][j].getRColorParameter();
                    int G = boardGrain[i][j].getGColorParameter();
                    int B = boardGrain[i][j].getBColorParameter();
                    int grain = boardGrain[i][j].getId();
              
                    res.setRGB(i,j, new Color(R,G,B).getRGB() );
                }
            } 
        }
        return res;
    }
    
    private static void saveBMPImage( final BufferedImage bi, final String path ){
        try {
            RenderedImage rendImage = bi;
            ImageIO.write(rendImage, "bmp", new File(path));
        } catch ( IOException e) {
            e.printStackTrace();
        }
    }

    private void ToBitmapExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToBitmapExportActionPerformed
        BufferedImage image = map(sizeX, sizeY, showGrainsBorders.isSelected());
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");   
        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            saveBMPImage(image, fileToSave.getAbsolutePath() + ".bmp" );
        }
    }//GEN-LAST:event_ToBitmapExportActionPerformed

    private void recrystallizationSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_recrystallizationSliderStateChanged
//        jLabel11.setText(recrystallizationSlider.getValue() + " %");
//        array.setRecrystalPercent(recrystallizationSlider.getValue());
    }//GEN-LAST:event_recrystallizationSliderStateChanged

    private void recrystalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recrystalButtonActionPerformed
        //numberOfIteration = 0;
//        jLabel12.setText("Iteration: " + numberOfIteration);
//        if (thread != null) {
//            thread.stop();
//        }
//
//        thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                startRecristalizationSimulation();
//            }
//        });
//        thread.start();
    }//GEN-LAST:event_recrystalButtonActionPerformed

    private void BCsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCsButtonActionPerformed
        array.changePeriodic();
//        monteCarlo.changePerio();
    }//GEN-LAST:event_BCsButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        numberOfIteration = 0;
        jLabel12.setText("Iteration: " + numberOfIteration);
        boardGrain = array.clear(clearBoundariesCheckbox.isSelected(), true);
        chosenGrainsArray = new ArrayList<>();
        selectedGrainsList.setText("Selected grains list: " + chosenGrainsArray);
         gbPercentField.setText("GB[%]: 0");
        canvas.setGrains(boardGrain);
        canvas.repaint();
        jLabel9.setText("" + array.getCountGrainsCristal());
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void GenerateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateButtonActionPerformed
        sizeX = Integer.parseInt(countXText.getText());
        sizeY = Integer.parseInt(countYText.getText());

        canvas.resizeBoard(Integer.parseInt(countXText.getText()), Integer.parseInt(countYText.getText()));
        canvas.setPreferredSize(new java.awt.Dimension(Integer.parseInt(countXText.getText()), Integer.parseInt(countYText.getText())));
        canvas.setSize(Integer.parseInt(countXText.getText()), Integer.parseInt(countYText.getText()));
        canvas.setMaximumSize(new java.awt.Dimension(Integer.parseInt(countXText.getText()), Integer.parseInt(countYText.getText())));
        canvas.setMinimumSize(new java.awt.Dimension(Integer.parseInt(countXText.getText()), Integer.parseInt(countYText.getText())));
       
        if (boardGrain[0].length != sizeX || boardGrain[1].length != sizeY) {
            array = new Board(sizeX, sizeY);
            boardGrain = new Grain[sizeX][sizeY];
            for (int i = 0; i < sizeX; i++) {
                for (int j = 0; j < sizeY; j++) {
                    boardGrain[i][j] = new Grain();            
                }
            }
        }
        
        boardGrain = array.clear(clearBoundariesCheckbox.isSelected(), false);     
        boardGrain = array.randomBoard(chosenGrainsArray,
            1,              
            Integer.parseInt(randomSeedsCountText.getText()));          
        canvas.setGrains(boardGrain);                                  
        canvas.repaint();                                              
        jLabel9.setText("" + array.getCountGrainsCristal());
    }//GEN-LAST:event_GenerateButtonActionPerformed

    private void ConditionsComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_ConditionsComboBoxPopupMenuWillBecomeInvisible
//        switch (ConditionsComboBox.getSelectedIndex()) {
//            case 0:
//            this.jPanel5.setVisible(false);
//            this.jPanel6.setVisible(false);
//            this.jPanel7.setVisible(false);
//            break;
//            case 2:
//            this.jPanel5.setVisible(true);
//            this.jPanel6.setVisible(false);
//            this.jPanel7.setVisible(false);
//            break;
//            case 1:
//            this.jPanel5.setVisible(false);
//            this.jPanel6.setVisible(true);
//            this.jPanel7.setVisible(false);
//            break;
//            case 3:
//            this.jPanel5.setVisible(false);
//            this.jPanel6.setVisible(false);
//            this.jPanel7.setVisible(true);
//            break;
//            default:
//            break;
//        }
    }//GEN-LAST:event_ConditionsComboBoxPopupMenuWillBecomeInvisible

    private void NeighborhoodComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NeighborhoodComboBoxActionPerformed

    }//GEN-LAST:event_NeighborhoodComboBoxActionPerformed

    private void NeighborhoodComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_NeighborhoodComboBoxPopupMenuWillBecomeInvisible
//        switch (NeighborhoodComboBox.getSelectedIndex()) {
//            case 7:
//            this.jPanel8.setVisible(true);
//            break;
//            default:
//            this.jPanel8.setVisible(false);
//            break;
//        }
    }//GEN-LAST:event_NeighborhoodComboBoxPopupMenuWillBecomeInvisible

    private void StopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopButtonActionPerformed
        if (thread != null) {
            thread.stop();
        }
    }//GEN-LAST:event_StopButtonActionPerformed

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        //numberOfIteration = 0;
        jLabel12.setText("Iteration: " + numberOfIteration);
        if (thread != null) {          
            thread.stop();
        }
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                startSimulation();
            }
        });
        thread.start();
    }//GEN-LAST:event_StartButtonActionPerformed

    private void MonteCarloToogleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonteCarloToogleButtonActionPerformed
//        isMonteCarlo = !isMonteCarlo;
//        this.jPanel5.setVisible(isMonteCarlo);
    }//GEN-LAST:event_MonteCarloToogleButtonActionPerformed
    
    private void FromBitmapImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FromBitmapImportActionPerformed
        try {
            //openFile; 
            HashSet<Color> treeSet = new HashSet<>();
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Specify a file to import");   
            int userSelection = fileChooser.showSaveDialog(this);
           
            File bmpFile = new File(fileChooser.getSelectedFile().getAbsolutePath());
            BufferedImage image = ImageIO.read(bmpFile);
            if(image.getHeight()== sizeY && image.getWidth() == sizeX);
            {
                for(int y=0;y<sizeY;y++){
                    for(int x=0;x<sizeX;x++){
                        int clr=  image.getRGB(x,y); 
                        int  red   = (clr & 0x00ff0000) >> 16;
                        int  green = (clr & 0x0000ff00) >> 8;
                        int  blue  =  clr & 0x000000ff;
                        boardGrain[x][y].setRGB(red, green, blue);
                        if( red == 255 && blue == 255 && green == 255) {
                            boardGrain[x][y].setId(-1);
                            continue;
                        }
                        treeSet.add(new Color(red,green,blue));
                    }
                }
            }
            
            HashMap<Color, Integer> colorMapping = new HashMap<Color, Integer>();
            int uniq_id = 1;
            Color white = new Color(255,255,255);
            for(Color cl : treeSet)
            {
                if(cl == white)
                {
                    System.err.println("Colour is White");
                    colorMapping.put(cl, -1);
                }
                else
                {
                    colorMapping.put(cl, uniq_id);
                    uniq_id++;
                }
            }
            for(int y=0;y<sizeY;y++){
                for(int x=0;x<sizeX;x++){
                    if (boardGrain[x][y].getId() != -1)
                        boardGrain[x][y].setId(colorMapping.get(new Color(boardGrain[x][y].getRColorParameter(),boardGrain[x][y].getGColorParameter(),boardGrain[x][y].getBColorParameter()))); 
                    }
            }
            boardGrain = array.edge();
            canvas.setGrains(boardGrain);
            canvas.repaint();
        } catch (IOException ex) {
            Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_FromBitmapImportActionPerformed

    private void ToTextFileExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToTextFileExportActionPerformed
        PrintWriter writer = null;
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Specify a text file to save");            
            int userSelection = fileChooser.showSaveDialog(this);
            
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToOpen = fileChooser.getSelectedFile();
                writer = new PrintWriter(fileToOpen, "UTF-8");
                
                for (int y = 0; y < sizeY; y++) {                    
                    for (int x = 0; x < sizeX; x++) {
                        writer.println(boardGrain[x][y].getId() + ","
                                + x + "," + y + ","
                                + boardGrain[x][y].getRColorParameter() + ","
                                + boardGrain[x][y].getGColorParameter() + ","
                                + boardGrain[x][y].getBColorParameter());
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            writer.close();
        }
    }//GEN-LAST:event_ToTextFileExportActionPerformed

    private void FromTextFileImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FromTextFileImportActionPerformed

            try {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Specify a file to Open");
                int userSelection = fileChooser.showSaveDialog(this);

                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    File fileToOpen = fileChooser.getSelectedFile();
                    BufferedReader in = new BufferedReader(new FileReader(fileToOpen));
                    while (true) {
                        String line = in.readLine();
                        if (line == null) {
                            break;
                        }
                        String[] propperties = line.split(",");
                        int id = Integer.parseInt(propperties[0]);
                        int x = Integer.parseInt(propperties[1]);
                        int y = Integer.parseInt(propperties[2]);
                        int R = Integer.parseInt(propperties[3]);
                        int G = Integer.parseInt(propperties[4]);
                        int B = Integer.parseInt(propperties[5]);
                        boardGrain[x][y].setId(id);
                        boardGrain[x][y].setRGB(R, G, B);
                    }
                }
        } catch (HeadlessException headlessException) {
        } catch (FileNotFoundException fileNotFoundException) {
        } catch (IOException ex) {
                    Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
            boardGrain = array.edge();
            canvas.setGrains(boardGrain);
            canvas.repaint();
    }//GEN-LAST:event_FromTextFileImportActionPerformed

    private void inclusionsAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inclusionsAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inclusionsAmountActionPerformed

    private void inclusionsSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inclusionsSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inclusionsSizeActionPerformed

    private void inclusionShapeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inclusionShapeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inclusionShapeComboBoxActionPerformed

    private void addInclusionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInclusionsButtonActionPerformed
        if (simulationRun) {
            return;
        }
          
        int size = Integer.parseInt(inclusionsSize.getText());
        int amount = Integer.parseInt(inclusionsAmount.getText());
        int shape = inclusionShapeComboBox.getSelectedIndex();
        int x0 = 0;
        int y0 = 0;
        Random rand = new Random();
       
        ArrayList<Grain> grainList = array.getGrainsOnBorder();

        for(int attempt = 0; attempt< amount; attempt++)
        {
            if(array.isEdgeGenerated()){
                int randomGrainIndex = rand.nextInt(grainList.size());
                Grain randomGrain = grainList.get(randomGrainIndex);  
                x0 = randomGrain.getX();
                y0 = randomGrain.getY();
            }
            else {
                x0 = rand.nextInt(sizeX);
                y0 = rand.nextInt(sizeY);
            }
            
            if (shape == 0) { // if inclusion is square
                int a = (int)((size/1.44)/2);    // a /sqr 2  -  center of the sqr
                for(int stepX = -a; stepX <a; stepX++) { // center -x x
                    for(int stepY = -a; stepY <a; stepY++) { // center -y  y
                        if(x0+stepX < sizeX && x0+stepX > 0 && y0+stepY < sizeY && y0+stepY >0 ) { // check scope of square
                            boardGrain[x0+stepX][y0+stepY].setId(-1);
                            boardGrain[x0+stepX][y0+stepY].setRGB(255,255,255);
                        }
                    }
                }
            }
            else {
                for(int y=-size; y<=size; y++)
                    for(int x=-size; x<=size; x++)
                        if(x*x+y*y <= size*size && x0+x < sizeX && x0+x>0 && y0+y < sizeY && y0+y>0) 
                            boardGrain[x0+x][y0+y].setId(-1);
            }       
        }
        boardGrain = array.edge();
        canvas.setGrains(boardGrain);
        canvas.repaint();
        
    }//GEN-LAST:event_addInclusionsButtonActionPerformed

    private void radiusTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiusTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiusTextActionPerformed

    private void countXTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countXTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countXTextActionPerformed

    private void growBoundariesuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_growBoundariesuButtonActionPerformed
       boardGrain = array.growBoundaries(Integer.parseInt(gbSizeInput.getText()) + 1, chosenGrainsArray);
       canvas.setGrains(boardGrain);
       canvas.repaint();
       gbPercentField.setText(array.getGbPercent());
    }//GEN-LAST:event_growBoundariesuButtonActionPerformed

    private void gbSizeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gbSizeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gbSizeInputActionPerformed

    private void dualPhaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dualPhaseButtonActionPerformed
        boardGrain = array.dualPhaseIdChange(chosenGrainsArray);
        canvas.setGrains(boardGrain);
        canvas.repaint();
        chosenGrainsArray.clear();
        selectedGrainsList.setText("Selected grains list: " + chosenGrainsArray);
    }//GEN-LAST:event_dualPhaseButtonActionPerformed

    private void substructureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_substructureButtonActionPerformed
        boardGrain = array.removeAllGrainsExceptSelected(chosenGrainsArray);
        canvas.setGrains(boardGrain);
        canvas.repaint();
        //selectedGrainList.clear();
        //selectedGrainsList.setText("Selected grains list: " + selectedGrainList);
    }//GEN-LAST:event_substructureButtonActionPerformed

    private void ConditionsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConditionsComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConditionsComboBoxActionPerformed

    private void startSimulation() {
        simulationRun = true;

        while (simulationRun) {
            numberOfIteration++;
            jLabel12.setText("Iteration: " + numberOfIteration);
            boardGrain = array.calculate(NeighborhoodComboBox.getSelectedIndex(),
                Integer.parseInt(radiusText.getText()),
                Integer.parseInt(probabilityInput.getText()),
                chosenGrainsArray
            );
            
            simulationRun = array.ammountOfNotEmptyCells() != (sizeX * sizeY);
                            canvas.setGrains(boardGrain);
            canvas.repaint();

            if (!simulationRun) {
                boardGrain = array.edge();
                jLabel9.setText("" + array.getCountGrainsCristal());

                thread.stop();
            }
        }
    }

    private void startRecristalizationSimulation() {
    }

    private void addGrainToListOnMouseClick(int x, int y) {
        if (!chosenGrainsArray.contains(boardGrain[x][y].getId()) && !simulationRun
                && boardGrain[x][y].getId() != 0 && boardGrain[x][y].getId() != -1) {
            chosenGrainsArray.add(boardGrain[x][y].getId());
            selectedGrainsList.setText("Selected grains list: " + chosenGrainsArray);
            System.err.println(chosenGrainsArray);
        } else if (chosenGrainsArray.contains(boardGrain[x][y].getId()) && !simulationRun
                && boardGrain[x][y].getId() != 0 && boardGrain[x][y].getId() != -1) {
            chosenGrainsArray.remove(chosenGrainsArray.indexOf(boardGrain[x][y].getId()));
            selectedGrainsList.setText("Selected grains list: " + chosenGrainsArray);
        }

    }
        
    public class HandlerClass implements MouseListener, MouseMotionListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            addGrainToListOnMouseClick(e.getX(), e.getY());
        }

        int xPres, yPres;

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

        @Override
        public void mouseDragged(MouseEvent e) {
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            mauseM(e.getX(), e.getY());
        }

    }

    private void mauseM(int i, int j) {
        if (i < sizeX && j < sizeY) {
            int R = boardGrain[i][j].getRColorParameter();
            int G = boardGrain[i][j].getGColorParameter();
            int B = boardGrain[i][j].getBColorParameter();
            idLabel.setText("" + boardGrain[i][j].getId());
            colorValueLabel.setText("(" + R + "," + G + "," + B + ")" + "     " + boardGrain[i][j].isBoundary());
            colorPanel.setBackground(new Color(R, G, B));
        }
    }

    private void mouseC(int x, int y) {
        if (x < sizeX && y < sizeY) {
            int xp = (int) Math.floor(x / (DefaultBoard.rowsConst / sizeX));
            int yp = (int) Math.floor(y / (DefaultBoard.columnsConst / sizeY));
            boardGrain = array.addGrain(xp, yp);
            canvas.setGrains(boardGrain);
            canvas.repaint();
            jLabel9.setText("" + array.getCountGrainsCristal());
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BCsButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JComboBox ConditionsComboBox;
    private javax.swing.JMenu ExportMenu;
    private javax.swing.JMenuItem FromBitmapImport;
    private javax.swing.JMenuItem FromTextFileImport;
    private javax.swing.JButton GenerateButton;
    private javax.swing.JMenu ImportMenu;
    private javax.swing.JToggleButton MonteCarloToogleButton;
    private javax.swing.JComboBox NeighborhoodComboBox;
    private javax.swing.JLabel NeighborhoodLabel;
    private javax.swing.JButton StartButton;
    private javax.swing.JButton StopButton;
    private javax.swing.JMenuItem ToBitmapExport;
    private javax.swing.JMenuItem ToTextFileExport;
    private javax.swing.JLabel YLabelSize;
    private javax.swing.JButton addInclusionsButton;
    private javax.swing.JTextField amountRingsField;
    private GrainGrowth.Canvas canvas;
    private javax.swing.JCheckBox clearBoundariesCheckbox;
    private javax.swing.JPanel colorPanel;
    private javax.swing.JLabel colorValueLabel;
    private javax.swing.JTextField countXText;
    private javax.swing.JTextField countYText;
    private javax.swing.JButton dualPhaseButton;
    private javax.swing.JLabel gbPercentField;
    private javax.swing.JTextField gbSizeInput;
    private javax.swing.JButton growBoundariesuButton;
    private javax.swing.JLabel idLabel;
    private javax.swing.JComboBox<String> inclusionShapeComboBox;
    private javax.swing.JTextField inclusionsAmount;
    private javax.swing.JTextField inclusionsSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField probabilityInput;
    private javax.swing.JLabel radiusLabel;
    private javax.swing.JTextField radiusText;
    private javax.swing.JTextField randomSeedsCountText;
    private javax.swing.JButton recrystalButton;
    private javax.swing.JSlider recrystallizationSlider;
    private javax.swing.JTextField ringSizeField;
    private javax.swing.JLabel selectedGrainsList;
    private javax.swing.JRadioButtonMenuItem showGrainsBorders;
    private javax.swing.JButton substructureButton;
    private javax.swing.JLabel xLabelSize;
    // End of variables declaration//GEN-END:variables
}
